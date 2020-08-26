package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsAdunitsGetadcode extends StandardParameters {
  /**
    * Account which contains the ad client.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ad client with contains the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.native
  /**
    * Ad unit to get the code for.
    */
  var adUnitId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Host custom channel to attach to the ad code.
    */
  var hostCustomChannelId: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceAccountsAdunitsGetadcode {
  @scala.inline
  def apply(): ParamsResourceAccountsAdunitsGetadcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsGetadcode]
  }
  @scala.inline
  implicit class ParamsResourceAccountsAdunitsGetadcodeOps[Self <: ParamsResourceAccountsAdunitsGetadcode] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setHostCustomChannelIdVarargs(value: String*): Self = this.set("hostCustomChannelId", js.Array(value :_*))
    @scala.inline
    def setHostCustomChannelId(value: js.Array[String]): Self = this.set("hostCustomChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostCustomChannelId: Self = this.set("hostCustomChannelId", js.undefined)
  }
  
}

