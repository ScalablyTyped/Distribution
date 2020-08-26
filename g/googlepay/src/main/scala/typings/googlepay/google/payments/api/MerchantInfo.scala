package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about the merchant.
  */
@js.native
trait MerchantInfo extends js.Object {
  /**
    * The ID of the merchant account with Google Pay.
    *
    * You can find this ID on {@link
    * https://payments.developers.google.com} once you have registered for
    * the Google Pay API.
    *
    * This field should only be set when you integrate on web on the
    * production environment.
    */
  var merchantId: String = js.native
  /**
    * A user visible merchant name.
    *
    * This name may be shown to the user in Google Pay to describe who the
    * user made a transaction with.
    *
    * This field is optional. If not set, the Business name in your Google
    * Pay Developer Profile will be used.
    */
  var merchantName: js.UndefOr[String] = js.native
  /**
    * The info of the software used by merchants to integrate with GPay.
    *
    * This field is optional and its values may be set by software
    * providers to identify the software the merchant is using.
    */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.native
}

object MerchantInfo {
  @scala.inline
  def apply(merchantId: String): MerchantInfo = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantInfo]
  }
  @scala.inline
  implicit class MerchantInfoOps[Self <: MerchantInfo] (val x: Self) extends AnyVal {
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchantName(value: String): Self = this.set("merchantName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantName: Self = this.set("merchantName", js.undefined)
    @scala.inline
    def setSoftwareInfo(value: SoftwareInfo): Self = this.set("softwareInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareInfo: Self = this.set("softwareInfo", js.undefined)
  }
  
}

