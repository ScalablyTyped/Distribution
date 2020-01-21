package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customize service error responses.  For example, list any service specific
  * protobuf types that can appear in error detail lists of error responses.
  * Example:      custom_error:       types:       - google.foo.v1.CustomError
  * - google.foo.v1.AnotherError
  */
@js.native
trait SchemaCustomError extends js.Object {
  /**
    * The list of custom error rules that apply to individual API messages.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaCustomErrorRule]] = js.native
  /**
    * The list of custom error detail types, e.g.
    * &#39;google.foo.v1.CustomError&#39;.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCustomError {
  @scala.inline
  def apply(rules: js.Array[SchemaCustomErrorRule] = null, types: js.Array[String] = null): SchemaCustomError = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomError]
  }
}

