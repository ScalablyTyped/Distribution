package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
/*=============================微信支付================================*/
trait IchooseWXPay extends BaseParams {
   // 支付签名时间戳，注意微信jssdk中的所有使用timestamp字段均为小写。但最新版的支付后台生成签名使用的timeStamp字段名需大写其中的S字符
  var nonceStr: java.lang.String
   // 支付签名随机串，不长于 32 位
  var `package`: java.lang.String
   // 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
  var paySign: java.lang.String
   // 统一支付接口返回的prepay_id参数值，提交格式如：prepay_id=***）
  var signType: java.lang.String
  var timestamp: scala.Double
   // 支付签名
  // 支付成功后的回调函数
  @JSName("success")
  def success_MIchooseWXPay(res: js.Any): scala.Unit
}

object IchooseWXPay {
  @scala.inline
  def apply(
    nonceStr: java.lang.String,
    `package`: java.lang.String,
    paySign: java.lang.String,
    signType: java.lang.String,
    success: js.Function1[js.Any, scala.Unit],
    timestamp: scala.Double,
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IchooseWXPay = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr, paySign = paySign, signType = signType, success = success, timestamp = timestamp)
    __obj.updateDynamic("package")(`package`)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IchooseWXPay]
  }
}

