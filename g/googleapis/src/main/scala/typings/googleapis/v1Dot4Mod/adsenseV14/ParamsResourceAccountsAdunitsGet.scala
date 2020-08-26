package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsAdunitsGet extends StandardParameters {
  /**
    * Account to which the ad client belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ad client for which to get the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.native
  /**
    * Ad unit to retrieve.
    */
  var adUnitId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
}

object ParamsResourceAccountsAdunitsGet {
  @scala.inline
  def apply(): ParamsResourceAccountsAdunitsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsGet]
  }
  @scala.inline
  implicit class ParamsResourceAccountsAdunitsGetOps[Self <: ParamsResourceAccountsAdunitsGet] (val x: Self) extends AnyVal {
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
    def setAdClientId(value: String): Self = this.set("adClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdClientId: Self = this.set("adClientId", js.undefined)
    @scala.inline
    def setAdUnitId(value: String): Self = this.set("adUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdUnitId: Self = this.set("adUnitId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
  }
  
}

