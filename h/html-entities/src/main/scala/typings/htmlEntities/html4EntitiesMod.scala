package typings.htmlEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html4EntitiesMod {
  
  @JSImport("html-entities/lib/html4-entities", "Html4Entities")
  @js.native
  class Html4Entities () extends StObject {
    
    def decode(str: String): String = js.native
    
    def encode(str: String): String = js.native
    
    def encodeNonASCII(str: String): String = js.native
    
    def encodeNonUTF(str: String): String = js.native
  }
  /* static members */
  object Html4Entities {
    
    @JSImport("html-entities/lib/html4-entities", "Html4Entities.decode")
    @js.native
    def decode(str: String): String = js.native
    
    @JSImport("html-entities/lib/html4-entities", "Html4Entities.encode")
    @js.native
    def encode(str: String): String = js.native
    
    @JSImport("html-entities/lib/html4-entities", "Html4Entities.encodeNonASCII")
    @js.native
    def encodeNonASCII(str: String): String = js.native
    
    @JSImport("html-entities/lib/html4-entities", "Html4Entities.encodeNonUTF")
    @js.native
    def encodeNonUTF(str: String): String = js.native
  }
}
