package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestPermissionsRequest extends js.Object {
  /**
    * The set of permissions to check for the &#39;resource&#39;. Permissions
    * with wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTestPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): SchemaTestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestPermissionsRequest]
  }
}

