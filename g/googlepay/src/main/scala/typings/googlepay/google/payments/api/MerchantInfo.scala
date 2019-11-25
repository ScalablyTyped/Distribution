package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantInfo extends js.Object {
  var merchantId: String
  var merchantName: js.UndefOr[String] = js.undefined
  var merchantOrigin: js.UndefOr[String] = js.undefined
}

object MerchantInfo {
  @scala.inline
  def apply(merchantId: String, merchantName: String = null, merchantOrigin: String = null): MerchantInfo = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    if (merchantName != null) __obj.updateDynamic("merchantName")(merchantName.asInstanceOf[js.Any])
    if (merchantOrigin != null) __obj.updateDynamic("merchantOrigin")(merchantOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantInfo]
  }
}

