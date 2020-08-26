package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCreativesList extends StandardParameters {
  /**
    * When specified, only creatives for the given account ids are returned.
    */
  var accountId: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * When specified, only creatives for the given buyer creative ids are
    * returned.
    */
  var buyerCreativeId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of entries returned on one result page. If not set, the
    * default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A continuation token, used to page through ad clients. To retrieve the
    * next page, set this parameter to the value of "nextPageToken" from the
    * previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * When specified, only creatives having the given status are returned.
    */
  var statusFilter: js.UndefOr[String] = js.native
}

object ParamsResourceCreativesList {
  @scala.inline
  def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  @scala.inline
  implicit class ParamsResourceCreativesListOps[Self <: ParamsResourceCreativesList] (val x: Self) extends AnyVal {
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
    def setAccountIdVarargs(value: Double*): Self = this.set("accountId", js.Array(value :_*))
    @scala.inline
    def setAccountId(value: js.Array[Double]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBuyerCreativeIdVarargs(value: String*): Self = this.set("buyerCreativeId", js.Array(value :_*))
    @scala.inline
    def setBuyerCreativeId(value: js.Array[String]): Self = this.set("buyerCreativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerCreativeId: Self = this.set("buyerCreativeId", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStatusFilter(value: String): Self = this.set("statusFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusFilter: Self = this.set("statusFilter", js.undefined)
  }
  
}

