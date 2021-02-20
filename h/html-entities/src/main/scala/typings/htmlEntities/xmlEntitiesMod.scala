package typings.htmlEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("html-entities/lib/xml-entities", "XmlEntities.decode")
    @js.native
    def decode(str: String): String = js.native
    
    @JSImport("html-entities/lib/xml-entities", "XmlEntities.encode")
    @js.native
    def encode(str: String): String = js.native
    
    @JSImport("html-entities/lib/xml-entities", "XmlEntities.encodeNonASCII")
    @js.native
    def encodeNonASCII(str: String): String = js.native
    
    @JSImport("html-entities/lib/xml-entities", "XmlEntities.encodeNonUTF")
    @js.native
    def encodeNonUTF(str: String): String = js.native
  }
}
