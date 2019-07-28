package typings.googlepay.googleNs.paymentsNs.apiNs

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
    val __obj = js.Dynamic.literal(merchantId = merchantId)
    if (merchantName != null) __obj.updateDynamic("merchantName")(merchantName)
    if (merchantOrigin != null) __obj.updateDynamic("merchantOrigin")(merchantOrigin)
    __obj.asInstanceOf[MerchantInfo]
  }
}

