package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager subaccount.
  */
@js.native
trait SchemaSubaccount extends js.Object {
  /**
    * ID of the account that contains this subaccount. This is a read-only
    * field that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * IDs of the available user role permissions for this subaccount.
    */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of this subaccount. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#subaccount&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this subaccount. This is a required field. Must be less than 128
    * characters long and be unique among subaccounts of the same account.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaSubaccount {
  @scala.inline
  def apply(
    accountId: String = null,
    availablePermissionIds: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null
  ): SchemaSubaccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (availablePermissionIds != null) __obj.updateDynamic("availablePermissionIds")(availablePermissionIds.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubaccount]
  }
}

