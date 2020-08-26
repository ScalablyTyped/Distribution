package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePretargetingconfigPatch extends StandardParameters {
  /**
    * The account id to update the pretargeting config for.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The specific id of the configuration to update.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPretargetingConfig] = js.native
}

object ParamsResourcePretargetingconfigPatch {
  @scala.inline
  def apply(): ParamsResourcePretargetingconfigPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePretargetingconfigPatch]
  }
  @scala.inline
  implicit class ParamsResourcePretargetingconfigPatchOps[Self <: ParamsResourcePretargetingconfigPatch] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaPretargetingConfig): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

