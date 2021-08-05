package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMessage extends StObject {
  
  var customMessage: js.UndefOr[String] = js.undefined
  
  var toAccount: js.UndefOr[Boolean] = js.undefined
  
  var transferReason: js.UndefOr[String] = js.undefined
}
object CustomMessage {
  
  inline def apply(): CustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMessage]
  }
  
  extension [Self <: CustomMessage](x: Self) {
    
    inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    inline def setToAccount(value: Boolean): Self = StObject.set(x, "toAccount", value.asInstanceOf[js.Any])
    
    inline def setToAccountUndefined: Self = StObject.set(x, "toAccount", js.undefined)
    
    inline def setTransferReason(value: String): Self = StObject.set(x, "transferReason", value.asInstanceOf[js.Any])
    
    inline def setTransferReasonUndefined: Self = StObject.set(x, "transferReason", js.undefined)
  }
}
