package typings.atHyperlorisTyson

import typings.atHyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access
import typings.atHyperlorisTyson.distTypesReflectTypeTokenMod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/reflect/jsonPropertyMetadata", JSImport.Namespace)
@js.native
object distTypesReflectJsonPropertyMetadataMod extends js.Object {
  @js.native
  class JsonPropertyMetadata protected () extends js.Object {
    def this(name: String, `type`: js.Array[_], access: Access, required: Boolean, ignoreType: Boolean) = this()
    def this(name: String, `type`: ClassType[_], access: Access, required: Boolean, ignoreType: Boolean) = this()
    var access: Access = js.native
    var ignoreType: Boolean = js.native
    var name: String = js.native
    var required: Boolean = js.native
    var `type`: ClassType[_] | js.Array[_] = js.native
  }
  
}

