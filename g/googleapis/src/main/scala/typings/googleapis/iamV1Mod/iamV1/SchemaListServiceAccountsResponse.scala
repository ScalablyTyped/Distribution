package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account list response.
  */
@js.native
trait SchemaListServiceAccountsResponse extends js.Object {
  /**
    * The list of matching service accounts.
    */
  var accounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  /**
    * To retrieve the next page of results, set
    * ListServiceAccountsRequest.page_token to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListServiceAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[SchemaServiceAccount] = null, nextPageToken: String = null): SchemaListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServiceAccountsResponse]
  }
}

