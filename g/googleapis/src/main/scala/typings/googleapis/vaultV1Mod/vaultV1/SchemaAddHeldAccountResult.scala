package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A status detailing the status of each account creation, and the
  * HeldAccount, if successful.
  */
@js.native
trait SchemaAddHeldAccountResult extends js.Object {
  /**
    * If present, this account was successfully created.
    */
  var account: js.UndefOr[SchemaHeldAccount] = js.native
  /**
    * This represents the success status. If failed, check message.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaAddHeldAccountResult {
  @scala.inline
  def apply(account: SchemaHeldAccount = null, status: SchemaStatus = null): SchemaAddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddHeldAccountResult]
  }
}

