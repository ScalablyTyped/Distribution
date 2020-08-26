package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for TestIamPermissions method.
  */
@js.native
trait SchemaTestIamPermissionsResponse extends js.Object {
  /**
    * A subset of TestPermissionsRequest.permissions that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTestIamPermissionsResponse {
  @scala.inline
  def apply(): SchemaTestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestIamPermissionsResponse]
  }
  @scala.inline
  implicit class SchemaTestIamPermissionsResponseOps[Self <: SchemaTestIamPermissionsResponse] (val x: Self) extends AnyVal {
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

