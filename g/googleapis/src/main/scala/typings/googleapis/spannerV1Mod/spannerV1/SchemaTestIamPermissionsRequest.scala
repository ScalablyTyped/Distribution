package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `TestIamPermissions` method.
  */
@js.native
trait SchemaTestIamPermissionsRequest extends js.Object {
  /**
    * REQUIRED: The set of permissions to check for &#39;resource&#39;.
    * Permissions with wildcards (such as &#39;*&#39;, &#39;spanner.*&#39;,
    * &#39;spanner.instances.*&#39;) are not allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTestIamPermissionsRequest {
  @scala.inline
  def apply(): SchemaTestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestIamPermissionsRequest]
  }
  @scala.inline
  implicit class SchemaTestIamPermissionsRequestOps[Self <: SchemaTestIamPermissionsRequest] (val x: Self) extends AnyVal {
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

