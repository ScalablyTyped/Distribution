package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 支付操作结果对象
  * PaymentResult对象表示支付操作返回结果，用于确认支付操作成功。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentPaymentResult extends StObject {
  
  /**
    * 支付通道对象
    * 用于发起支付操作的支付通道对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var channel: js.UndefOr[PlusPaymentPaymentChannel] = js.native
  
  /**
    * 交易描述信息
    * 如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[Boolean] = js.native
  
  /**
    * 支付平台返回的原始数据
    * 如果支付平台返回key-value类型字符串，则组合成符合JSON格式的字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var rawdata: js.UndefOr[String] = js.native
  
  /**
    * 支付操作指纹信息
    * 用于向支付平台查询支付订单信息，如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var signature: js.UndefOr[String] = js.native
  
  /**
    * 交易编号信息
    * 如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var tradeno: js.UndefOr[String] = js.native
  
  /**
    * 查找支付交易信息地址
    * 用于向支付平台查询交易信息，如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var url: js.UndefOr[Boolean] = js.native
}
object PlusPaymentPaymentResult {
  
  @scala.inline
  def apply(): PlusPaymentPaymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentPaymentResult]
  }
  
  @scala.inline
  implicit class PlusPaymentPaymentResultMutableBuilder[Self <: PlusPaymentPaymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: PlusPaymentPaymentChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRawdata(value: String): Self = StObject.set(x, "rawdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawdataUndefined: Self = StObject.set(x, "rawdata", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setTradeno(value: String): Self = StObject.set(x, "tradeno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradenoUndefined: Self = StObject.set(x, "tradeno", js.undefined)
    
    @scala.inline
    def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
