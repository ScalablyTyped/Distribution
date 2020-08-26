package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAlertsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alerts are associated with. Inferred from the caller
    * identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Optional. A query string for filtering alert results. For more details,
    * see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and
    * [Supported query filter
    * fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. The sort order of the list results. If not specified results
    * may be returned in arbitrary order. You can sort the results in
    * descending order based on the creation timestamp using
    * `order_by="create_time desc"`. Currently, only sorting by `create_time
    * desc` is supported.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional. The requested page size. Server may return fewer items than
    * requested. If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. A token identifying a page of results the server should return.
    * If empty, a new iteration is started. To continue an iteration, pass in
    * the value from the previous ListAlertsResponse's next_page_token field.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceAlertsList {
  @scala.inline
  def apply(): ParamsResourceAlertsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsList]
  }
  @scala.inline
  implicit class ParamsResourceAlertsListOps[Self <: ParamsResourceAlertsList] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

