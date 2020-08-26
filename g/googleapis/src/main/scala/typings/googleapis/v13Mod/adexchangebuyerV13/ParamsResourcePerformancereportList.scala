package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePerformancereportList extends StandardParameters {
  /**
    * The account id to get the reports.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The end time of the report in ISO 8601 timestamp format using UTC.
    */
  var endDateTime: js.UndefOr[String] = js.native
  /**
    * Maximum number of entries returned on one result page. If not set, the
    * default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A continuation token, used to page through performance reports. To
    * retrieve the next page, set this parameter to the value of
    * "nextPageToken" from the previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The start time of the report in ISO 8601 timestamp format using UTC.
    */
  var startDateTime: js.UndefOr[String] = js.native
}

object ParamsResourcePerformancereportList {
  @scala.inline
  def apply(): ParamsResourcePerformancereportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePerformancereportList]
  }
  @scala.inline
  implicit class ParamsResourcePerformancereportListOps[Self <: ParamsResourcePerformancereportList] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
  }
  
}

