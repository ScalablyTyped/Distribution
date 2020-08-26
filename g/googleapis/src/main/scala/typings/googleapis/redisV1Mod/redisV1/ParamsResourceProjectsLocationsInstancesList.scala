package typings.googleapis.redisV1Mod.redisV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsInstancesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of items to return.  If not specified, a default value
    * of 1000 will be used by the service. Regardless of the page_size value,
    * the response may include a partial list and a caller should only rely on
    * response's next_page_token to determine if there are more instances left
    * to be queried.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the instance location using the form:
    * `projects/{project_id}/locations/{location_id}` where `location_id`
    * refers to a GCP region
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsInstancesList {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsInstancesListOps[Self <: ParamsResourceProjectsLocationsInstancesList] (val x: Self) extends AnyVal {
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

