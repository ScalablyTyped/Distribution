package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAlertpoliciesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If provided, this field specifies the criteria that must be met by alert
    * policies to be included in the response.For more details, see sorting and
    * filtering.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The project whose alert policies are to be listed. The format is
    * projects/[PROJECT_ID] Note that this field names the parent container in
    * which the alerting policies to be listed are stored. To retrieve a single
    * alerting policy by name, use the GetAlertPolicy operation, instead.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of fields by which to sort the result. Supports
    * the same set of field references as the filter field. Entries can be
    * prefixed with a minus sign to sort by the field in descending order.For
    * more details, see sorting and filtering.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return more results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsAlertpoliciesList {
  @scala.inline
  def apply(): ParamsResourceProjectsAlertpoliciesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAlertpoliciesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsAlertpoliciesListOps[Self <: ParamsResourceProjectsAlertpoliciesList] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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

