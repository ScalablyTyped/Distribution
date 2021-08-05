package typings.jweixin.mod

import typings.jweixin.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================微信卡券================================*/
trait IchooseCard
  extends StObject
     with BaseParams {
  
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
  
  // 卡券签名
  @JSName("success")
  def success_MIchooseCard(res: CardList): Unit
  
  // 卡券Id
  var timestamp: Double
}
object IchooseCard {
  
  inline def apply(
    cardId: String,
    cardSign: String,
    cardType: String,
    nonceStr: String,
    shopId: String,
    signType: String,
    success: CardList => Unit,
    timestamp: Double
  ): IchooseCard = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], cardSign = cardSign.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], shopId = shopId.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IchooseCard]
  }
  
  extension [Self <: IchooseCard](x: Self) {
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardSign(value: String): Self = StObject.set(x, "cardSign", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setShopId(value: String): Self = StObject.set(x, "shopId", value.asInstanceOf[js.Any])
    
    inline def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: CardList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
