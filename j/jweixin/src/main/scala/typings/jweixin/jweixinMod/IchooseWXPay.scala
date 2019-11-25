package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
/*=============================微信支付================================*/
trait IchooseWXPay extends BaseParams {
   // 支付签名时间戳，注意微信jssdk中的所有使用timestamp字段均为小写。但最新版的支付后台生成签名使用的timeStamp字段名需大写其中的S字符
  var nonceStr: String
   // 支付签名随机串，不长于 32 位
  var `package`: String
   // 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
  var paySign: String
   // 统一支付接口返回的prepay_id参数值，提交格式如：prepay_id=***）
  var signType: String
  var timestamp: Double
   // 支付签名
  // 支付成功后的回调函数
  @JSName("success")
  def success_MIchooseWXPay(res: js.Any): Unit
}

object IchooseWXPay {
  @scala.inline
  def apply(
    nonceStr: String,
    `package`: String,
    paySign: String,
    signType: String,
    success: js.Any => Unit,
    timestamp: Double,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IchooseWXPay = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IchooseWXPay]
  }
}

