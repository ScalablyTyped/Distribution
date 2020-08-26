package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IAP商品对象
  * 描述IAP商品详细信息，如标识、价格、标题、描述信息等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentIAPProduct extends js.Object {
  /**
    * 商品的描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * 商品的价格
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var price: js.UndefOr[String] = js.native
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productid: js.UndefOr[String] = js.native
  /**
    * 商品标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var title: js.UndefOr[String] = js.native
}

object PlusPaymentIAPProduct {
  @scala.inline
  def apply(): PlusPaymentIAPProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentIAPProduct]
  }
  @scala.inline
  implicit class PlusPaymentIAPProductOps[Self <: PlusPaymentIAPProduct] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setProductid(value: String): Self = this.set("productid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductid: Self = this.set("productid", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

