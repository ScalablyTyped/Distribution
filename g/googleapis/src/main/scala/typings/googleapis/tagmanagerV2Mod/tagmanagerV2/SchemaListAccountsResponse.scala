package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

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
  var account: js.UndefOr[js.Array[SchemaAccount]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAccountsResponse {
  @scala.inline
  def apply(account: js.Array[SchemaAccount] = null, nextPageToken: String = null): SchemaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAccountsResponse]
  }
}

