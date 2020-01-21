package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Accounts Response.
  */
@js.native
trait SchemaListAccountsResponse extends js.Object {
  /**
    * List of GTM Accounts that a user has access to.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.native
}

object SchemaListAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[SchemaAccount] = null): SchemaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAccountsResponse]
  }
}

