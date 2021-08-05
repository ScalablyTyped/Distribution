package typings.htmlEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlEntitiesMod {
  
  @JSImport("html-entities/lib/xml-entities", "XmlEntities")
  @js.native
  class XmlEntities () extends StObject {
    
    def decode(str: String): String = js.native
    
    def encode(str: String): String = js.native
    
    def encodeNonASCII(str: String): String = js.native
    
    def encodeNonUTF(str: String): String = js.native
  }
  /* static members */
  object XmlEntities {
    
    @JSImport("html-entities/lib/xml-entities", "XmlEntities")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeNonASCII(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeNonASCII")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeNonUTF(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeNonUTF")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
