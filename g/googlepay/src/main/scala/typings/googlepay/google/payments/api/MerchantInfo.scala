package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about the merchant.
  */
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
  var merchantId: String
  /**
    * A user visible merchant name.
    *
    * This name may be shown to the user in Google Pay to describe who the
    * user made a transaction with.
    *
    * This field is optional. If not set, the Business name in your Google
    * Pay Developer Profile will be used.
    */
  var merchantName: js.UndefOr[String] = js.undefined
  /**
    * The info of the software used by merchants to integrate with GPay.
    *
    * This field is optional and its values may be set by software
    * providers to identify the software the merchant is using.
    */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.undefined
}

object MerchantInfo {
  @scala.inline
  def apply(merchantId: String, merchantName: String = null, softwareInfo: SoftwareInfo = null): MerchantInfo = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    if (merchantName != null) __obj.updateDynamic("merchantName")(merchantName.asInstanceOf[js.Any])
    if (softwareInfo != null) __obj.updateDynamic("softwareInfo")(softwareInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantInfo]
  }
}

