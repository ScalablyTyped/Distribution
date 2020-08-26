package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccesspoliciesAccesslevelsGet extends StandardParameters {
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression Language
    * rather than as `BasicLevels`. Defaults to AS_DEFINED, where Access Levels
    * are returned as `BasicLevels` or `CustomLevels` based on how they were
    * created. If set to CEL, all Access Levels are returned as `CustomLevels`.
    * In the CEL case, `BasicLevels` are translated to equivalent
    * `CustomLevels`.
    */
  var accessLevelFormat: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Resource name for the Access Level.  Format:
    * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
    */
  var name: js.UndefOr[String] = js.native
}

object ParamsResourceAccesspoliciesAccesslevelsGet {
  @scala.inline
  def apply(): ParamsResourceAccesspoliciesAccesslevelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesAccesslevelsGet]
  }
  @scala.inline
  implicit class ParamsResourceAccesspoliciesAccesslevelsGetOps[Self <: ParamsResourceAccesspoliciesAccesslevelsGet] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

