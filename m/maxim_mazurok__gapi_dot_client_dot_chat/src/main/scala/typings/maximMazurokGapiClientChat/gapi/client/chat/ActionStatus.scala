package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionStatus extends StObject {
  
  /** The status code. */
  var statusCode: js.UndefOr[String] = js.undefined
  
  /** The message to send users about the status of their request. If unset, a generic message based on the `status_code` is sent. */
  var userFacingMessage: js.UndefOr[String] = js.undefined
}
object ActionStatus {
  
  inline def apply(): ActionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionStatus]
  }
  
  extension [Self <: ActionStatus](x: Self) {
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setUserFacingMessage(value: String): Self = StObject.set(x, "userFacingMessage", value.asInstanceOf[js.Any])
    
    inline def setUserFacingMessageUndefined: Self = StObject.set(x, "userFacingMessage", js.undefined)
  }
}
