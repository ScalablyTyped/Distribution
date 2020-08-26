package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrderreportsListtransactions extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The Google-provided ID of the disbursement (found in Wallet).
    */
  var disbursementId: js.UndefOr[String] = js.native
  /**
    * The maximum number of disbursements to return in the response, used for
    * paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The last date in which transaction occurred. In ISO 8601 format. Default:
    * current date.
    */
  var transactionEndDate: js.UndefOr[String] = js.native
  /**
    * The first date in which transaction occurred. In ISO 8601 format.
    */
  var transactionStartDate: js.UndefOr[String] = js.native
}

object ParamsResourceOrderreportsListtransactions {
  @scala.inline
  def apply(): ParamsResourceOrderreportsListtransactions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreportsListtransactions]
  }
  @scala.inline
  implicit class ParamsResourceOrderreportsListtransactionsOps[Self <: ParamsResourceOrderreportsListtransactions] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDisbursementId(value: String): Self = this.set("disbursementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementId: Self = this.set("disbursementId", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setTransactionEndDate(value: String): Self = this.set("transactionEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionEndDate: Self = this.set("transactionEndDate", js.undefined)
    @scala.inline
    def setTransactionStartDate(value: String): Self = this.set("transactionStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionStartDate: Self = this.set("transactionStartDate", js.undefined)
  }
  
}

