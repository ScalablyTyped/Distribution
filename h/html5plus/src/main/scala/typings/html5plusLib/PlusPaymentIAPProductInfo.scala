package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 购买IAP商品对象
  * 描述购买的IAP商品详细信息，如标识、数量等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
trait PlusPaymentIAPProductInfo extends js.Object {
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 商品的数量
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var quantity: js.UndefOr[java.lang.String] = js.undefined
}

object PlusPaymentIAPProductInfo {
  @scala.inline
  def apply(productIdentifier: java.lang.String = null, quantity: java.lang.String = null): PlusPaymentIAPProductInfo = {
    val __obj = js.Dynamic.literal()
    if (productIdentifier != null) __obj.updateDynamic("productIdentifier")(productIdentifier)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    __obj.asInstanceOf[PlusPaymentIAPProductInfo]
  }
}

