package typings.googleapis.computeV1Mod.computeV1

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceNodegroupsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the node group to return.
    */
  var nodeGroup: js.UndefOr[String] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.native
}

object ParamsResourceNodegroupsGet {
  @scala.inline
  def apply(): ParamsResourceNodegroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodegroupsGet]
  }
  @scala.inline
  implicit class ParamsResourceNodegroupsGetOps[Self <: ParamsResourceNodegroupsGet] (val x: Self) extends AnyVal {
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
    def setNodeGroup(value: String): Self = this.set("nodeGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroup: Self = this.set("nodeGroup", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

