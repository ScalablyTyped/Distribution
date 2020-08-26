package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceResourcesCalendarsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID for the customer's G Suite account. As an account
    * administrator, you can also use the my_customer alias to represent your
    * account's customer ID.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Field(s) to sort results by in either ascending or descending order.
    * Supported fields include resourceId, resourceName, capacity, buildingId,
    * and floorName. If no order is specified, defaults to ascending. Should be
    * of the form "field [asc|desc], field [asc|desc], ...". For example
    * buildingId, capacity desc would return results sorted first by buildingId
    * in ascending order then by capacity in descending order.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Token to specify the next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * String query used to filter results. Should be of the form "field
    * operator value" where field can be any of supported fields and operators
    * can be any of supported operations. Operators include '=' for exact match
    * and ':' for prefix match or HAS match where applicable. For prefix match,
    * the value should always be followed by a *. Supported fields include
    * generatedResourceName, name, buildingId, featureInstances.feature.name.
    * For example buildingId=US-NYC-9TH AND
    * featureInstances.feature.name:Phone.
    */
  var query: js.UndefOr[String] = js.native
}

object ParamsResourceResourcesCalendarsList {
  @scala.inline
  def apply(): ParamsResourceResourcesCalendarsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesCalendarsList]
  }
  @scala.inline
  implicit class ParamsResourceResourcesCalendarsListOps[Self <: ParamsResourceResourcesCalendarsList] (val x: Self) extends AnyVal {
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
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

