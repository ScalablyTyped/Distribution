package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconsumeAndShareCard extends BaseParams {
  
  var cardId: String = js.native
  
  var code: String = js.native
}
object IconsumeAndShareCard {
  
  @scala.inline
  def apply(cardId: String, code: String): IconsumeAndShareCard = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconsumeAndShareCard]
  }
  
  @scala.inline
  implicit class IconsumeAndShareCardMutableBuilder[Self <: IconsumeAndShareCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
