package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * Specifies which parts of the Matter to return in the response.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourceMattersGet {
  @scala.inline
  def apply(): ParamsResourceMattersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersGet]
  }
  @scala.inline
  implicit class ParamsResourceMattersGetOps[Self <: ParamsResourceMattersGet] (val x: Self) extends AnyVal {
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
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

