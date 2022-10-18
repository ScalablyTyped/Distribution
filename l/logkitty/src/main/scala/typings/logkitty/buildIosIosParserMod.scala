package typings.logkitty

import typings.logkitty.buildTypesMod.Entry
import typings.logkitty.buildTypesMod.IParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosIosParserMod {
  
  @JSImport("logkitty/build/ios/IosParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IosParser {
    
    /* CompleteClass */
    override def parseMessages(messages: js.Array[String]): js.Array[Entry] = js.native
    
    /* CompleteClass */
    override def splitMessages(data: String): js.Array[String] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("logkitty/build/ios/IosParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/ios/IosParser", "default.headerRegex")
    @js.native
    def headerRegex: js.RegExp = js.native
    inline def headerRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/IosParser", "default.timeRegex")
    @js.native
    def timeRegex: js.RegExp = js.native
    inline def timeRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeRegex")(x.asInstanceOf[js.Any])
  }
  
  trait IosParser
    extends StObject
       with IParser
  object IosParser {
    
    inline def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): IosParser = {
      val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
      __obj.asInstanceOf[IosParser]
    }
  }
}
