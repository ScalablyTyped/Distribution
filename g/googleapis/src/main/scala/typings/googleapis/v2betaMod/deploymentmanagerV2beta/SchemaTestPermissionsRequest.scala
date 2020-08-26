package typings.googleapis.v2betaMod.deploymentmanagerV2beta

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
  def apply(): SchemaTestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestPermissionsRequest]
  }
  @scala.inline
  implicit class SchemaTestPermissionsRequestOps[Self <: SchemaTestPermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
  
}

