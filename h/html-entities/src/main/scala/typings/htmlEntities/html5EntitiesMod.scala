package typings.htmlEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html5EntitiesMod {
  
  @JSImport("html-entities/lib/html5-entities", "Html5Entities")
  @js.native
  class Html5Entities () extends StObject {
    
    def decode(str: String): String = js.native
    
    def encode(str: String): String = js.native
    
    def encodeNonASCII(str: String): String = js.native
    
    def encodeNonUTF(str: String): String = js.native
  }
  /* static members */
  object Html5Entities {
    
    @JSImport("html-entities/lib/html5-entities", "Html5Entities.decode")
    @js.native
    def decode(str: String): String = js.native
    
    @JSImport("html-entities/lib/html5-entities", "Html5Entities.encode")
    @js.native
    def encode(str: String): String = js.native
    
    @JSImport("html-entities/lib/html5-entities", "Html5Entities.encodeNonASCII")
    @js.native
    def encodeNonASCII(str: String): String = js.native
    
    @JSImport("html-entities/lib/html5-entities", "Html5Entities.encodeNonUTF")
    @js.native
    def encodeNonUTF(str: String): String = js.native
  }
}
