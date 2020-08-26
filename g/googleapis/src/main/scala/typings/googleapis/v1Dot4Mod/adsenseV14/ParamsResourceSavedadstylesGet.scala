package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSavedadstylesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Saved ad style to retrieve.
    */
  var savedAdStyleId: js.UndefOr[String] = js.native
}

object ParamsResourceSavedadstylesGet {
  @scala.inline
  def apply(): ParamsResourceSavedadstylesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSavedadstylesGet]
  }
  @scala.inline
  implicit class ParamsResourceSavedadstylesGetOps[Self <: ParamsResourceSavedadstylesGet] (val x: Self) extends AnyVal {
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
    def setSavedAdStyleId(value: String): Self = this.set("savedAdStyleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedAdStyleId: Self = this.set("savedAdStyleId", js.undefined)
  }
  
}

