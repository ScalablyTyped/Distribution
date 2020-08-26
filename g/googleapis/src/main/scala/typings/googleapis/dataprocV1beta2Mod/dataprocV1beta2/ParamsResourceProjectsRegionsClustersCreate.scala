package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsRegionsClustersCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project that the cluster
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCluster] = js.native
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two CreateClusterRequest requests with the same id, then the
    * second request will be ignored and the first google.longrunning.Operation
    * created and stored in the backend is returned.It is recommended to always
    * set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsRegionsClustersCreate {
  @scala.inline
  def apply(): ParamsResourceProjectsRegionsClustersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersCreate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsRegionsClustersCreateOps[Self <: ParamsResourceProjectsRegionsClustersCreate] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaCluster): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

