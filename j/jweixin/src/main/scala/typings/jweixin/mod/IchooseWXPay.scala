package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================微信卡券================================*/
/*=============================微信支付================================*/
trait IchooseWXPay
  extends StObject
     with BaseParams {
  
  // 支付签名随机串，不长于 32 位
  @JSName("package")
  var _package: String
  
  // 支付签名时间戳，注意微信jssdk中的所有使用timestamp字段均为小写。但最新版的支付后台生成签名使用的timeStamp字段名需大写其中的S字符
  var nonceStr: String
  
  // 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
  var paySign: String
  
  // 统一支付接口返回的prepay_id参数值，提交格式如：prepay_id=***）
  var signType: String
  
  // 支付签名
  // 支付成功后的回调函数
  @JSName("success")
  def success_MIchooseWXPay(res: js.Any): Unit
  
  var timestamp: Double
}
object IchooseWXPay {
  
  @scala.inline
  def apply(
    _package: String,
    nonceStr: String,
    paySign: String,
    signType: String,
    success: js.Any => Unit,
    timestamp: Double
  ): IchooseWXPay = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[IchooseWXPay]
  }
  
  @scala.inline
  implicit class IchooseWXPayMutableBuilder[Self <: IchooseWXPay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
