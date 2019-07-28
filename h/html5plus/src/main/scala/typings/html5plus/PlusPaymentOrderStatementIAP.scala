package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IAP订单数据对象
  * 描述IAP商品订单信息，如标识、数量等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
trait PlusPaymentOrderStatementIAP extends js.Object {
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productid: js.UndefOr[String] = js.undefined
  /**
    * 商品数量
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var quantity: js.UndefOr[String] = js.undefined
  /**
    * 购买用户名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var username: js.UndefOr[String] = js.undefined
}

object PlusPaymentOrderStatementIAP {
  @scala.inline
  def apply(productid: String = null, quantity: String = null, username: String = null): PlusPaymentOrderStatementIAP = {
    val __obj = js.Dynamic.literal()
    if (productid != null) __obj.updateDynamic("productid")(productid)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[PlusPaymentOrderStatementIAP]
  }
}

