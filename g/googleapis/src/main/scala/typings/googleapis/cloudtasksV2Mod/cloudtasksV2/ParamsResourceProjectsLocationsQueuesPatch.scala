package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsQueuesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Caller-specified and required in CreateQueue, after which it becomes
    * output only.  The queue name.  The queue name must have the following
    * format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`  *
    * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens
    * (-), colons (:), or periods (.).    For more information, see
    * [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the queue's location.    The list
    * of available locations can be obtained by calling    ListLocations. For
    * more information, see https://cloud.google.com/about/locations/. *
    * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens
    * (-). The maximum length is 100 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQueue] = js.native
  /**
    * A mask used to specify which fields of the queue are being updated.  If
    * empty, then all fields will be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsQueuesPatch {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsQueuesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsQueuesPatch]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsQueuesPatchOps[Self <: ParamsResourceProjectsLocationsQueuesPatch] (val x: Self) extends AnyVal {
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
    def setRequestBody(value: SchemaQueue): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

