package typings.jweixin.jweixinMod

import typings.jweixin.Anon_CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
trait IchooseCard extends BaseParams {
   // 卡券类型
  var cardId: String
   // 签名方式，默认'SHA1'
  var cardSign: String
   // 门店Id
  var cardType: String
   // 卡券签名时间戳
  var nonceStr: String
  var shopId: String
   // 卡券签名随机串
  var signType: String
   // 卡券Id
  var timestamp: Double
   // 卡券签名
  @JSName("success")
  def success_MIchooseCard(res: Anon_CardList): Unit
}

object IchooseCard {
  @scala.inline
  def apply(
    cardId: String,
    cardSign: String,
    cardType: String,
    nonceStr: String,
    shopId: String,
    signType: String,
    success: Anon_CardList => Unit,
    timestamp: Double,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IchooseCard = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], cardSign = cardSign.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], shopId = shopId.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timestamp = timestamp.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IchooseCard]
  }
}

