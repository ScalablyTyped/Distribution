package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantInfo extends js.Object {
  var merchantId: java.lang.String
  var merchantName: js.UndefOr[java.lang.String] = js.undefined
  var merchantOrigin: js.UndefOr[java.lang.String] = js.undefined
}

object MerchantInfo {
  @scala.inline
  def apply(
    merchantId: java.lang.String,
    merchantName: java.lang.String = null,
    merchantOrigin: java.lang.String = null
  ): MerchantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("merchantId")(merchantId)
    if (merchantName != null) __obj.updateDynamic("merchantName")(merchantName)
    if (merchantOrigin != null) __obj.updateDynamic("merchantOrigin")(merchantOrigin)
    __obj.asInstanceOf[MerchantInfo]
  }
}

