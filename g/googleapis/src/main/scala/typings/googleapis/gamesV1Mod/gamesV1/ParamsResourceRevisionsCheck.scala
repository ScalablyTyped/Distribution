package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceRevisionsCheck extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The revision of the client SDK used by your application. Format:
    * [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible values of PLATFORM_TYPE are:
    * - "ANDROID" - Client is running the Android SDK.  - "IOS" - Client is
    * running the iOS SDK.  - "WEB_APP" - Client is running as a Web App.
    */
  var clientRevision: js.UndefOr[String] = js.native
}

object ParamsResourceRevisionsCheck {
  @scala.inline
  def apply(): ParamsResourceRevisionsCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRevisionsCheck]
  }
  @scala.inline
  implicit class ParamsResourceRevisionsCheckOps[Self <: ParamsResourceRevisionsCheck] (val x: Self) extends AnyVal {
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
    def setClientRevision(value: String): Self = this.set("clientRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRevision: Self = this.set("clientRevision", js.undefined)
  }
  
}

