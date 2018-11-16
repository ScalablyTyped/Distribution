package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/


trait IchooseCard extends BaseParams {
   // 卡券类型
  var cardId: java.lang.String
   // 签名方式，默认'SHA1'
  var cardSign: java.lang.String
   // 门店Id
  var cardType: java.lang.String
   // 卡券签名时间戳
  var nonceStr: java.lang.String
  var shopId: java.lang.String
   // 卡券签名随机串
  var signType: java.lang.String
   // 卡券Id
  var timestamp: scala.Double
   // 卡券签名
  @JSName("success")
  def success_MIchooseCard(res: jweixinLib.Anon_CardList): scala.Unit
}

