package typings.loremIpsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatsMod {
  
  @JSImport("lorem-ipsum/types/src/constants/formats", "FORMATS")
  @js.native
  val FORMATS: js.Array[String] = js.native
  
  @JSImport("lorem-ipsum/types/src/constants/formats", "FORMAT_HTML")
  @js.native
  val FORMAT_HTML: /* "html" */ String = js.native
  
  @JSImport("lorem-ipsum/types/src/constants/formats", "FORMAT_PLAIN")
  @js.native
  val FORMAT_PLAIN: /* "plain" */ String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.loremIpsum.loremIpsumStrings.plain
    - typings.loremIpsum.loremIpsumStrings.html
  */
  trait LoremFormat extends StObject
  object LoremFormat {
    
    inline def html: typings.loremIpsum.loremIpsumStrings.html = "html".asInstanceOf[typings.loremIpsum.loremIpsumStrings.html]
    
    inline def plain: typings.loremIpsum.loremIpsumStrings.plain = "plain".asInstanceOf[typings.loremIpsum.loremIpsumStrings.plain]
  }
}
