package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment模块管理支付功能，用于提供网页安全支付能力，支持通过Web接口进行支付操作。通过plus.payment可获取支付管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPayment extends StObject {
  
  /**
    * IAP商品对象
    * 描述IAP商品详细信息，如标识、价格、标题、描述信息等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var IAPProduct: js.UndefOr[PlusPaymentIAPProduct] = js.native
  
  /**
    * 购买IAP商品对象
    * 描述购买的IAP商品详细信息，如标识、数量等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var IAPProductInfo: js.UndefOr[PlusPaymentIAPProductInfo] = js.native
  
  /**
    * 购买IAP商品交易信息对象
    * 描述购买的IAP商品交易详细信息，如购买商品信息、交易日期、订单标识等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var IAPTransaction: js.UndefOr[PlusPaymentIAPTransaction] = js.native
  
  /**
    * IAP订单数据对象
    * 描述IAP商品订单信息，如标识、数量等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var OrderStatementIAP: js.UndefOr[PlusPaymentOrderStatementIAP] = js.native
  
  /**
    * 支付通道对象
    * PaymentChannel对象表示特定的支付通道，用于向系统请求支付操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var PaymentChannel: js.UndefOr[PlusPaymentPaymentChannel] = js.native
  
  /**
    * 支付操作结果对象
    * PaymentResult对象表示支付操作返回结果，用于确认支付操作成功。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var PaymentResult: js.UndefOr[PlusPaymentPaymentResult] = js.native
  
  /**
    * 获取支付通道
    * 在进行支付操作前需获取终端支持的支付通道列表，用于提示用户进行选择。
    *     获取支付通道成功后通过successCB回调返回支持的所有通道列表，获取支付通道列表失败则通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  def getChannels(): Unit = js.native
  def getChannels(successCB: js.Function1[/* result */ js.Array[this.type], Unit]): Unit = js.native
  def getChannels(
    successCB: js.Function1[/* result */ js.Array[this.type], Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getChannels(successCB: Unit, errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  
  /**
    * 请求支付操作
    * 调用指定的支付通道进行支付操作，其中statement包含支付操作的相关信息，支付模块将弹出支付界面供用户进行支付信息的输入确认操作。
    *     用户支付操作成功后通过successCB回调返回支付操作结果，支付操作失败则通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  def request(): Unit = js.native
  def request(channel: Unit, statement: String): Unit = js.native
  def request(
    channel: Unit,
    statement: String,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit]
  ): Unit = js.native
  def request(
    channel: Unit,
    statement: String,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def request(
    channel: Unit,
    statement: String,
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def request(
    channel: Unit,
    statement: Unit,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit]
  ): Unit = js.native
  def request(
    channel: Unit,
    statement: Unit,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def request(channel: Unit, statement: Unit, successCB: Unit, errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def request(channel: PlusPaymentPaymentChannel): Unit = js.native
  def request(channel: PlusPaymentPaymentChannel, statement: String): Unit = js.native
  def request(
    channel: PlusPaymentPaymentChannel,
    statement: String,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit]
  ): Unit = js.native
  def request(
    channel: PlusPaymentPaymentChannel,
    statement: String,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def request(
    channel: PlusPaymentPaymentChannel,
    statement: String,
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def request(
    channel: PlusPaymentPaymentChannel,
    statement: Unit,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit]
  ): Unit = js.native
  def request(
    channel: PlusPaymentPaymentChannel,
    statement: Unit,
    successCB: js.Function1[/* result */ PlusPaymentPaymentResult, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def request(
    channel: PlusPaymentPaymentChannel,
    statement: Unit,
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}
