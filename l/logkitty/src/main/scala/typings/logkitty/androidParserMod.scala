package typings.logkitty

import typings.logkitty.typesMod.Entry
import typings.logkitty.typesMod.IParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidParserMod {
  
  @JSImport("logkitty/build/android/AndroidParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AndroidParser {
    
    /* CompleteClass */
    override def parseMessages(messages: js.Array[String]): js.Array[Entry] = js.native
    
    /* CompleteClass */
    override def splitMessages(data: String): js.Array[String] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("logkitty/build/android/AndroidParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/android/AndroidParser", "default.headerRegex")
    @js.native
    def headerRegex: js.RegExp = js.native
    inline def headerRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/android/AndroidParser", "default.timeRegex")
    @js.native
    def timeRegex: js.RegExp = js.native
    inline def timeRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeRegex")(x.asInstanceOf[js.Any])
  }
  
  trait AndroidParser
    extends StObject
       with IParser
  object AndroidParser {
    
    inline def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): AndroidParser = {
      val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
      __obj.asInstanceOf[AndroidParser]
    }
  }
}
