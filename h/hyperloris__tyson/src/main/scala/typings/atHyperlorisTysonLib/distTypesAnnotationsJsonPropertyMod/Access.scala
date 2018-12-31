package typings
package atHyperlorisTysonLib.distTypesAnnotationsJsonPropertyMod

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
  sealed trait FROMJSON_ONLY
    extends atHyperlorisTysonLib.distTypesAnnotationsJsonPropertyMod.Access
  
  /**
    * Access setting that means that the property may only be used
    * for serialization: class -> json
    */
  @js.native
  sealed trait TOJSON_ONLY
    extends atHyperlorisTysonLib.distTypesAnnotationsJsonPropertyMod.Access
  
  /* "FROMJSON_ONLY" */ val FROMJSON_ONLY: FROMJSON_ONLY with java.lang.String = js.native
  /* "TOJSON_ONLY" */ val TOJSON_ONLY: TOJSON_ONLY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atHyperlorisTysonLib.distTypesAnnotationsJsonPropertyMod.Access with java.lang.String
  ] = js.native
}

