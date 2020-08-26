package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccesspoliciesAccesslevelsList extends StandardParameters {
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression language,
    * as `CustomLevels`, rather than as `BasicLevels`. Defaults to returning
    * `AccessLevels` in the format they were defined.
    */
  var accessLevelFormat: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of Access Levels to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Next page token for the next batch of Access Level instances. Defaults to
    * the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the access policy to list Access Levels from.
    * Format: `accessPolicies/{policy_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceAccesspoliciesAccesslevelsList {
  @scala.inline
  def apply(): ParamsResourceAccesspoliciesAccesslevelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesAccesslevelsList]
  }
  @scala.inline
  implicit class ParamsResourceAccesspoliciesAccesslevelsListOps[Self <: ParamsResourceAccesspoliciesAccesslevelsList] (val x: Self) extends AnyVal {
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
    def setAccessLevelFormat(value: String): Self = this.set("accessLevelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLevelFormat: Self = this.set("accessLevelFormat", js.undefined)
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

