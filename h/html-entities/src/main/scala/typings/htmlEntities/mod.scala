package typings.htmlEntities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-entities", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AllHtmlEntities ()
    extends typings.htmlEntities.html5EntitiesMod.Html5Entities
  
  @js.native
  class Html4Entities ()
    extends typings.htmlEntities.html4EntitiesMod.Html4Entities
  
  @js.native
  class Html5Entities ()
    extends typings.htmlEntities.html5EntitiesMod.Html5Entities
  
  @js.native
  class XmlEntities ()
    extends typings.htmlEntities.xmlEntitiesMod.XmlEntities
  
  /* static members */
  @js.native
  object AllHtmlEntities extends js.Object {
    def decode(str: String): String = js.native
    def encode(str: String): String = js.native
    def encodeNonASCII(str: String): String = js.native
    def encodeNonUTF(str: String): String = js.native
  }
  
  /* static members */
  @js.native
  object Html4Entities extends js.Object {
    def decode(str: String): String = js.native
    def encode(str: String): String = js.native
    def encodeNonASCII(str: String): String = js.native
    def encodeNonUTF(str: String): String = js.native
  }
  
  /* static members */
  @js.native
  object Html5Entities extends js.Object {
    def decode(str: String): String = js.native
    def encode(str: String): String = js.native
    def encodeNonASCII(str: String): String = js.native
    def encodeNonUTF(str: String): String = js.native
  }
  
  /* static members */
  @js.native
  object XmlEntities extends js.Object {
    def decode(str: String): String = js.native
    def encode(str: String): String = js.native
    def encodeNonASCII(str: String): String = js.native
    def encodeNonUTF(str: String): String = js.native
  }
  
}

