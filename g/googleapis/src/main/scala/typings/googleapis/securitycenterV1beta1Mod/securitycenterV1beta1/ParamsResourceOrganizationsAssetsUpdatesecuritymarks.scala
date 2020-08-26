package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsAssetsUpdatesecuritymarks extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The relative resource name of the SecurityMarks. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Examples: "organizations/123/assets/456/securityMarks"
    * "organizations/123/sources/456/findings/789/securityMarks".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecurityMarks] = js.native
  /**
    * The time at which the updated SecurityMarks take effect.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The FieldMask to use when updating the security marks resource.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceOrganizationsAssetsUpdatesecuritymarks {
  @scala.inline
  def apply(): ParamsResourceOrganizationsAssetsUpdatesecuritymarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsAssetsUpdatesecuritymarks]
  }
  @scala.inline
  implicit class ParamsResourceOrganizationsAssetsUpdatesecuritymarksOps[Self <: ParamsResourceOrganizationsAssetsUpdatesecuritymarks] (val x: Self) extends AnyVal {
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
    def setRequestBody(value: SchemaSecurityMarks): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

