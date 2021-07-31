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
  
  @scala.inline
  def apply(): CustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMessage]
  }
  
  @scala.inline
  implicit class CustomMessageMutableBuilder[Self <: CustomMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    @scala.inline
    def setToAccount(value: Boolean): Self = StObject.set(x, "toAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToAccountUndefined: Self = StObject.set(x, "toAccount", js.undefined)
    
    @scala.inline
    def setTransferReason(value: String): Self = StObject.set(x, "transferReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferReasonUndefined: Self = StObject.set(x, "transferReason", js.undefined)
  }
}
