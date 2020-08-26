package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrderreportsListdisbursements extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The last date which disbursements occurred. In ISO 8601 format. Default:
    * current date.
    */
  var disbursementEndDate: js.UndefOr[String] = js.native
  /**
    * The first date which disbursements occurred. In ISO 8601 format.
    */
  var disbursementStartDate: js.UndefOr[String] = js.native
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
}

object ParamsResourceOrderreportsListdisbursements {
  @scala.inline
  def apply(): ParamsResourceOrderreportsListdisbursements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreportsListdisbursements]
  }
  @scala.inline
  implicit class ParamsResourceOrderreportsListdisbursementsOps[Self <: ParamsResourceOrderreportsListdisbursements] (val x: Self) extends AnyVal {
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
    def setDisbursementEndDate(value: String): Self = this.set("disbursementEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementEndDate: Self = this.set("disbursementEndDate", js.undefined)
    @scala.inline
    def setDisbursementStartDate(value: String): Self = this.set("disbursementStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementStartDate: Self = this.set("disbursementStartDate", js.undefined)
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
  }
  
}

