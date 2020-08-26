package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently each matter only has one owner, and all others are collaborators.
  * When an account is purged, its corresponding MatterPermission resources
  * cease to exist.
  */
@js.native
trait SchemaMatterPermission extends js.Object {
  /**
    * The account id, as provided by &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/&quot;&gt;Admin
    * SDK&lt;/a&gt;.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s role in this matter.
    */
  var role: js.UndefOr[String] = js.native
}

object SchemaMatterPermission {
  @scala.inline
  def apply(): SchemaMatterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatterPermission]
  }
  @scala.inline
  implicit class SchemaMatterPermissionOps[Self <: SchemaMatterPermission] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

