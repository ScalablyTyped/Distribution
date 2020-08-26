package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 购买IAP商品交易信息对象
  * 描述购买的IAP商品交易详细信息，如购买商品信息、交易日期、订单标识等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentIAPTransaction extends js.Object {
  /**
    * 购买商品的信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var payment: js.UndefOr[String] = js.native
  /**
    * 购买商品的交易日期
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionDate: js.UndefOr[String] = js.native
  /**
    * 购买商品的交易订单标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionIdentifier: js.UndefOr[String] = js.native
  /**
    * 购买商品的交易收据
    * base64编码格式字符串数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionReceipt: js.UndefOr[String] = js.native
  /**
    * 购买商品的交易状态
    * 可取值："1"为支付成功；"2"为支付失败；"3"为支付已恢复。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionState: js.UndefOr[String] = js.native
}

object PlusPaymentIAPTransaction {
  @scala.inline
  def apply(): PlusPaymentIAPTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentIAPTransaction]
  }
  @scala.inline
  implicit class PlusPaymentIAPTransactionOps[Self <: PlusPaymentIAPTransaction] (val x: Self) extends AnyVal {
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
    def setPayment(value: String): Self = this.set("payment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment: Self = this.set("payment", js.undefined)
    @scala.inline
    def setTransactionDate(value: String): Self = this.set("transactionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionDate: Self = this.set("transactionDate", js.undefined)
    @scala.inline
    def setTransactionIdentifier(value: String): Self = this.set("transactionIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionIdentifier: Self = this.set("transactionIdentifier", js.undefined)
    @scala.inline
    def setTransactionReceipt(value: String): Self = this.set("transactionReceipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionReceipt: Self = this.set("transactionReceipt", js.undefined)
    @scala.inline
    def setTransactionState(value: String): Self = this.set("transactionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionState: Self = this.set("transactionState", js.undefined)
  }
  
}

