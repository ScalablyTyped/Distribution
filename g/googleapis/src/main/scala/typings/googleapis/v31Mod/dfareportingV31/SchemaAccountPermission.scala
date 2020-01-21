package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AccountPermissions contains information about a particular account
  * permission. Some features of Campaign Manager require an account permission
  * to be present in the account.
  */
@js.native
trait SchemaAccountPermission extends js.Object {
  /**
    * Account profiles associated with this account permission.  Possible
    * values are: - &quot;ACCOUNT_PROFILE_BASIC&quot; -
    * &quot;ACCOUNT_PROFILE_STANDARD&quot;
    */
  var accountProfiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of this account permission.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Administrative level required to enable this account permission.
    */
  var level: js.UndefOr[String] = js.native
  /**
    * Name of this account permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Permission group of this account permission.
    */
  var permissionGroupId: js.UndefOr[String] = js.native
}

object SchemaAccountPermission {
  @scala.inline
  def apply(
    accountProfiles: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    permissionGroupId: String = null
  ): SchemaAccountPermission = {
    val __obj = js.Dynamic.literal()
    if (accountProfiles != null) __obj.updateDynamic("accountProfiles")(accountProfiles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountPermission]
  }
}

