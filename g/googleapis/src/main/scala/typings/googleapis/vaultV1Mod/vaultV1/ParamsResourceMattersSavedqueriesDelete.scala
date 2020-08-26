package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersSavedqueriesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter id of the parent matter for which the saved query is to be
    * deleted.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * Id of the saved query to be deleted.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}

object ParamsResourceMattersSavedqueriesDelete {
  @scala.inline
  def apply(): ParamsResourceMattersSavedqueriesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesDelete]
  }
  @scala.inline
  implicit class ParamsResourceMattersSavedqueriesDeleteOps[Self <: ParamsResourceMattersSavedqueriesDelete] (val x: Self) extends AnyVal {
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
    def setMatterId(value: String): Self = this.set("matterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatterId: Self = this.set("matterId", js.undefined)
    @scala.inline
    def setSavedQueryId(value: String): Self = this.set("savedQueryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedQueryId: Self = this.set("savedQueryId", js.undefined)
  }
  
}

