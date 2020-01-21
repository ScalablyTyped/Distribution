package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a list of held accounts for a hold.
  */
@js.native
trait SchemaListHeldAccountsResponse extends js.Object {
  /**
    * The held accounts on a hold.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.native
}

object SchemaListHeldAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[SchemaHeldAccount] = null): SchemaListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListHeldAccountsResponse]
  }
}

