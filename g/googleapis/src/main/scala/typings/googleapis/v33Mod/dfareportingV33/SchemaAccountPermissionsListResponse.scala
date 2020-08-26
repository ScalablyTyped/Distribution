package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account Permission List Response
  */
@js.native
trait SchemaAccountPermissionsListResponse extends js.Object {
  /**
    * Account permission collection.
    */
  var accountPermissions: js.UndefOr[js.Array[SchemaAccountPermission]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountPermissionsListResponse {
  @scala.inline
  def apply(): SchemaAccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionsListResponse]
  }
  @scala.inline
  implicit class SchemaAccountPermissionsListResponseOps[Self <: SchemaAccountPermissionsListResponse] (val x: Self) extends AnyVal {
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
    def setAccountPermissionsVarargs(value: SchemaAccountPermission*): Self = this.set("accountPermissions", js.Array(value :_*))
    @scala.inline
    def setAccountPermissions(value: js.Array[SchemaAccountPermission]): Self = this.set("accountPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountPermissions: Self = this.set("accountPermissions", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

