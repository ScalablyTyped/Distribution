package typings.atHyperlorisTyson.distTypesAnnotationsJsonPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Access extends js.Object

@JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "Access")
@js.native
object Access extends js.Object {
  /**
    * Access setting that means that the property may only be used
    * for deserialization: json -> class
    */
  @js.native
  sealed trait FROMJSON_ONLY extends Access
  
  /**
    * Access setting that means that the property may only be used
    * for serialization: class -> json
    */
  @js.native
  sealed trait TOJSON_ONLY extends Access
  
  /* "FROMJSON_ONLY" */ val FROMJSON_ONLY: typings.atHyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access.FROMJSON_ONLY with String = js.native
  /* "TOJSON_ONLY" */ val TOJSON_ONLY: typings.atHyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access.TOJSON_ONLY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Access with String] = js.native
}

