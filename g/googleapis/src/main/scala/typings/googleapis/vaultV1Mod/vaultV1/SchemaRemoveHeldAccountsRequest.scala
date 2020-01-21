package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remove a list of accounts from a hold.
  */
@js.native
trait SchemaRemoveHeldAccountsRequest extends js.Object {
  /**
    * Account ids to identify HeldAccounts to remove.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRemoveHeldAccountsRequest {
  @scala.inline
  def apply(accountIds: js.Array[String] = null): SchemaRemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountIds != null) __obj.updateDynamic("accountIds")(accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRemoveHeldAccountsRequest]
  }
}

