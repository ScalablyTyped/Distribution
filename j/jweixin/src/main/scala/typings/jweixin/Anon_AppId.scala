package typings.jweixin

import typings.jweixin.jweixinMod.jsApiList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppId extends js.Object {
   // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
  var appId: String
  var debug: js.UndefOr[Boolean] = js.undefined
   // 必填，签名，见附录1
  var jsApiList: typings.jweixin.jweixinMod.jsApiList
   // 必填，生成签名的时间戳
  var nonceStr: String
   // 必填，生成签名的随机串
  var signature: String
   // 必填，公众号的唯一标识
  var timestamp: Double
}

object Anon_AppId {
  @scala.inline
  def apply(
    appId: String,
    jsApiList: jsApiList,
    nonceStr: String,
    signature: String,
    timestamp: Double,
    debug: js.UndefOr[Boolean] = js.undefined
  ): Anon_AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], jsApiList = jsApiList.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AppId]
  }
}

