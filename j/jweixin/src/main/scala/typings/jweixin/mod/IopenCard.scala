package typings.jweixin.mod

import typings.jweixin.anon.CardId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IopenCard
  extends StObject
     with BaseParams {
  
  var cardList: js.Array[CardId]
}
object IopenCard {
  
  inline def apply(cardList: js.Array[CardId]): IopenCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenCard]
  }
  
  extension [Self <: IopenCard](x: Self) {
    
    inline def setCardList(value: js.Array[CardId]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: CardId*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
