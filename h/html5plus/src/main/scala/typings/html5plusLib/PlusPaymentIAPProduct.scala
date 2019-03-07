package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IAP商品对象
  * 描述IAP商品详细信息，如标识、价格、标题、描述信息等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
trait PlusPaymentIAPProduct extends js.Object {
  /**
    * 商品的描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 商品的价格
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var price: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 商品标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlusPaymentIAPProduct {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    price: java.lang.String = null,
    productid: java.lang.String = null,
    title: java.lang.String = null
  ): PlusPaymentIAPProduct = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (price != null) __obj.updateDynamic("price")(price)
    if (productid != null) __obj.updateDynamic("productid")(productid)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusPaymentIAPProduct]
  }
}

