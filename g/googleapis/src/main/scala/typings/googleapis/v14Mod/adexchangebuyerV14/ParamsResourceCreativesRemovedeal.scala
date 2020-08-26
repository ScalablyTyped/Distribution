package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCreativesRemovedeal extends StandardParameters {
  /**
    * The id for the account that will serve this creative.
    */
  var accountId: js.UndefOr[Double] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The buyer-specific id for this creative.
    */
  var buyerCreativeId: js.UndefOr[String] = js.native
  /**
    * The id of the deal id to disassociate with this creative.
    */
  var dealId: js.UndefOr[String] = js.native
}

object ParamsResourceCreativesRemovedeal {
  @scala.inline
  def apply(): ParamsResourceCreativesRemovedeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesRemovedeal]
  }
  @scala.inline
  implicit class ParamsResourceCreativesRemovedealOps[Self <: ParamsResourceCreativesRemovedeal] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Double): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBuyerCreativeId(value: String): Self = this.set("buyerCreativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerCreativeId: Self = this.set("buyerCreativeId", js.undefined)
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
  }
  
}

