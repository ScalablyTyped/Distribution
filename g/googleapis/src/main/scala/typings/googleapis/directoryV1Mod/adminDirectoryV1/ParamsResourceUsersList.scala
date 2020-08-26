package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Comma-separated list of schema names. All fields from these schemas are
    * fetched. This should only be set when projection=custom.
    */
  var customFieldMask: js.UndefOr[String] = js.native
  /**
    * Immutable ID of the G Suite account. In case of multi-domain, to fetch
    * all users for a customer, fill this field instead of domain.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Name of the domain. Fill this field to get users from only this domain.
    * To return all users in a multi-domain fill customer field instead.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Event on which subscription is intended (if subscribing)
    */
  var event: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return. Default is 100. Max allowed is 500
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Column to use for sorting results
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * What subset of fields to fetch for this user.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Query string search. Should be of the form "". Complete documentation is
    * at
    * https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    */
  var query: js.UndefOr[String] = js.native
  /**
    * If set to true retrieves the list of deleted users. Default is false
    */
  var showDeleted: js.UndefOr[String] = js.native
  /**
    * Whether to return results in ascending or descending order.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    */
  var viewType: js.UndefOr[String] = js.native
}

object ParamsResourceUsersList {
  @scala.inline
  def apply(): ParamsResourceUsersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersList]
  }
  @scala.inline
  implicit class ParamsResourceUsersListOps[Self <: ParamsResourceUsersList] (val x: Self) extends AnyVal {
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
    def setCustomFieldMask(value: String): Self = this.set("customFieldMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFieldMask: Self = this.set("customFieldMask", js.undefined)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
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
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setShowDeleted(value: String): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setViewType(value: String): Self = this.set("viewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
  
}

