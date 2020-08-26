package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsNotificationchanneldescriptorsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The REST resource name of the parent from which to retrieve the
    * notification channel descriptors. The expected syntax is:
    * projects/[PROJECT_ID] Note that this names the parent container in which
    * to look for the descriptors; to retrieve a single descriptor by name, use
    * the GetNotificationChannelDescriptor operation, instead.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response. If not set
    * to a positive number, a reasonable value will be chosen by the service.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If non-empty, page_token must contain a value returned as the
    * next_page_token in a previous response to request the next set of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsNotificationchanneldescriptorsList {
  @scala.inline
  def apply(): ParamsResourceProjectsNotificationchanneldescriptorsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotificationchanneldescriptorsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsNotificationchanneldescriptorsListOps[Self <: ParamsResourceProjectsNotificationchanneldescriptorsList] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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

