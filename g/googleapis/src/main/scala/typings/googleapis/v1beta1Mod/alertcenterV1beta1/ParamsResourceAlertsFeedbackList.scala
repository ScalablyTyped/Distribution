package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAlertsFeedbackList extends StandardParameters {
  /**
    * Required. The alert identifier. The "-" wildcard could be used to
    * represent all alerts.
    */
  var alertId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert feedback are associated with. Inferred from the
    * caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Optional. A query string for filtering alert feedback results. For more
    * details, see [Query filters](/admin-sdk/alertcenter/guides/query-filters)
    * and [Supported query filter
    * fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
    */
  var filter: js.UndefOr[String] = js.native
}

object ParamsResourceAlertsFeedbackList {
  @scala.inline
  def apply(): ParamsResourceAlertsFeedbackList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsFeedbackList]
  }
  @scala.inline
  implicit class ParamsResourceAlertsFeedbackListOps[Self <: ParamsResourceAlertsFeedbackList] (val x: Self) extends AnyVal {
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
    def setAlertId(value: String): Self = this.set("alertId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertId: Self = this.set("alertId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

