package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 支付通道对象
  * PaymentChannel对象表示特定的支付通道，用于向系统请求支付操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentPaymentChannel extends js.Object {
  /**
    * 支付通道描述
    * 支付通道的描述信息，如“支付宝”、“微信”、“In-App Purchase”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * 支付通道标识
    * 用于标识支付通道：
    *         "alipay" - 表示支付宝；
    *         "wxpay" - 表示微信支付；
    *         "appleiap" - 表示苹果应用内支付；
    *         "qhpay" - 表示360聚合支付（仅360手助流应用环境下支持）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 支付通道服务是否安装
    * 通常特定的支付通道依赖系统安装相关的服务，此属性用于标识其服务是否安装，如果没有安装则为false，否则为true。
    *     若系统环境中没有安装相关的服务，则可能导致调用支付操作失败，这时可以调用installService方法进行安装。
    *     注意：如果支付通道不需要依赖系统安装服务，则永远返回true。例如支付宝，如果设备上未安装支付宝客户端则调用Wap页面进行支付，因此值固定返回true；
    *     而微信支付则依赖微信客户端，如果设备上未安装微信客户端则serviceReady值为false，此时应该提示用户安装微信客户端才能进行支付操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var serviceReady: js.UndefOr[Boolean] = js.native
  /**
    * 安装支付通道依赖的服务
    * 对于某些支付通道，通常特定的支付通道依赖系统安装相关的服务，调用此方法将安装其依赖的支付服务。
    *     如支付宝，则在系统中安装支付宝客户端程序。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  def installService(): Unit = js.native
  /**
    * 向IAP服务器请求支付订单
    * IAP支付在调用plus.payment.request方法支付前须先向服务器请求获取商品的详细信息，否则会支付失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  def requestOrder(): Unit = js.native
  def requestOrder(ids: js.Array[_]): Unit = js.native
  def requestOrder(ids: js.Array[_], successCB: js.Function1[/* result */ js.Array[PlusPayment], Unit]): Unit = js.native
  def requestOrder(
    ids: js.Array[_],
    successCB: js.Function1[/* result */ js.Array[PlusPayment], Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 向IAP服务器请求已经购买的非消耗性商品和订阅商品
    * 注意：不能获取已购买的消耗性商品。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  def restoreComplateRequest(): Unit = js.native
  def restoreComplateRequest(options: js.Any): Unit = js.native
  def restoreComplateRequest(options: js.Any, successCB: js.Function1[/* result */ js.Array[PlusPayment], Unit]): Unit = js.native
}

