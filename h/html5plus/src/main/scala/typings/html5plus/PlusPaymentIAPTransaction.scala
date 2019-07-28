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
trait PlusPaymentIAPTransaction extends js.Object {
  /**
    * 购买商品的信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var payment: js.UndefOr[String] = js.undefined
  /**
    * 购买商品的交易日期
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionDate: js.UndefOr[String] = js.undefined
  /**
    * 购买商品的交易订单标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionIdentifier: js.UndefOr[String] = js.undefined
  /**
    * 购买商品的交易收据
    * base64编码格式字符串数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionReceipt: js.UndefOr[String] = js.undefined
  /**
    * 购买商品的交易状态
    * 可取值："1"为支付成功；"2"为支付失败；"3"为支付已恢复。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionState: js.UndefOr[String] = js.undefined
}

object PlusPaymentIAPTransaction {
  @scala.inline
  def apply(
    payment: String = null,
    transactionDate: String = null,
    transactionIdentifier: String = null,
    transactionReceipt: String = null,
    transactionState: String = null
  ): PlusPaymentIAPTransaction = {
    val __obj = js.Dynamic.literal()
    if (payment != null) __obj.updateDynamic("payment")(payment)
    if (transactionDate != null) __obj.updateDynamic("transactionDate")(transactionDate)
    if (transactionIdentifier != null) __obj.updateDynamic("transactionIdentifier")(transactionIdentifier)
    if (transactionReceipt != null) __obj.updateDynamic("transactionReceipt")(transactionReceipt)
    if (transactionState != null) __obj.updateDynamic("transactionState")(transactionState)
    __obj.asInstanceOf[PlusPaymentIAPTransaction]
  }
}

