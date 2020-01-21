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
  def apply(accountId: String = null, role: String = null): SchemaMatterPermission = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMatterPermission]
  }
}

