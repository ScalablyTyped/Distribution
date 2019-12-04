package typings.keycloakDashJs.distKeycloakDashAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcePermission extends js.Object {
  /**
    * The id or name of a resource.
    */
  var id: String
  /**
    * An array of strings where each value is the name of a scope associated with the resource.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object ResourcePermission {
  @scala.inline
  def apply(id: String, scopes: js.Array[String] = null): ResourcePermission = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePermission]
  }
}

