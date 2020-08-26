package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestPermissionsResponse extends js.Object {
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTestPermissionsResponse {
  @scala.inline
  def apply(): SchemaTestPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestPermissionsResponse]
  }
  @scala.inline
  implicit class SchemaTestPermissionsResponseOps[Self <: SchemaTestPermissionsResponse] (val x: Self) extends AnyVal {
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

