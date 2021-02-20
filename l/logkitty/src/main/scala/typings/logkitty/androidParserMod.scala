package typings.logkitty

import typings.logkitty.typesMod.Entry
import typings.logkitty.typesMod.IParser
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidParserMod {
  
  @JSImport("logkitty/build/android/AndroidParser", JSImport.Default)
  @js.native
  class default () extends AndroidParser
  /* static members */
  object default {
    
    @JSImport("logkitty/build/android/AndroidParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/android/AndroidParser", "default.headerRegex")
    @js.native
    def headerRegex: RegExp = js.native
    @scala.inline
    def headerRegex_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/AndroidParser", "default.timeRegex")
    @js.native
    def timeRegex: RegExp = js.native
    @scala.inline
    def timeRegex_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeRegex")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AndroidParser extends IParser
  object AndroidParser {
    
    @scala.inline
    def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): AndroidParser = {
      val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
      __obj.asInstanceOf[AndroidParser]
    }
  }
}
