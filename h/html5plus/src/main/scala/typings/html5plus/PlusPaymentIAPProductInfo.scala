package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 购买IAP商品对象
  * 描述购买的IAP商品详细信息，如标识、数量等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentIAPProductInfo extends js.Object {
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productIdentifier: js.UndefOr[String] = js.native
  /**
    * 商品的数量
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var quantity: js.UndefOr[String] = js.native
}

object PlusPaymentIAPProductInfo {
  @scala.inline
  def apply(): PlusPaymentIAPProductInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentIAPProductInfo]
  }
  @scala.inline
  implicit class PlusPaymentIAPProductInfoOps[Self <: PlusPaymentIAPProductInfo] (val x: Self) extends AnyVal {
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
    def setProductIdentifier(value: String): Self = this.set("productIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductIdentifier: Self = this.set("productIdentifier", js.undefined)
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

