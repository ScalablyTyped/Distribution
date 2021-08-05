package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconsumeAndShareCard
  extends StObject
     with BaseParams {
  
  var cardId: String
  
  var code: String
}
object IconsumeAndShareCard {
  
  inline def apply(cardId: String, code: String): IconsumeAndShareCard = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconsumeAndShareCard]
  }
  
  extension [Self <: IconsumeAndShareCard](x: Self) {
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
