package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMobiledevicesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Immutable ID of the G Suite account
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return. Default is 100
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
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Search string in the format given at
    * http://support.google.com/a/bin/answer.py?answer=1408863#search
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Whether to return results in ascending or descending order. Only of use
    * when orderBy is also used
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object ParamsResourceMobiledevicesList {
  @scala.inline
  def apply(): ParamsResourceMobiledevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMobiledevicesList]
  }
  @scala.inline
  implicit class ParamsResourceMobiledevicesListOps[Self <: ParamsResourceMobiledevicesList] (val x: Self) extends AnyVal {
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
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

