package typings
package jweixinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppId extends js.Object {
   // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
  var appId: java.lang.String
  var debug: js.UndefOr[scala.Boolean] = js.undefined
   // 必填，签名，见附录1
  var jsApiList: jweixinLib.jweixinMod.wxNs.jsApiList
   // 必填，生成签名的时间戳
  var nonceStr: java.lang.String
   // 必填，生成签名的随机串
  var signature: java.lang.String
   // 必填，公众号的唯一标识
  var timestamp: scala.Double
}

