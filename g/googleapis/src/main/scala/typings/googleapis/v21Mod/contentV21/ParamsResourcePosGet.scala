package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePosGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the POS or inventory data provider.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * A store code that is unique per merchant.
    */
  var storeCode: js.UndefOr[String] = js.native
  /**
    * The ID of the target merchant.
    */
  var targetMerchantId: js.UndefOr[String] = js.native
}

object ParamsResourcePosGet {
  @scala.inline
  def apply(): ParamsResourcePosGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePosGet]
  }
  @scala.inline
  implicit class ParamsResourcePosGetOps[Self <: ParamsResourcePosGet] (val x: Self) extends AnyVal {
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
    @scala.inline
    def setTargetMerchantId(value: String): Self = this.set("targetMerchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetMerchantId: Self = this.set("targetMerchantId", js.undefined)
  }
  
}

