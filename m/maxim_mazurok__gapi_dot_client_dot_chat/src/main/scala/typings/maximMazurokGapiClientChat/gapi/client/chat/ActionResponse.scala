package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionResponse extends StObject {
  
  /** Input only. A response to an event related to a [dialog](https://developers.google.com/chat/how-tos/dialogs). Must be accompanied by `ResponseType.Dialog`. */
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  
  /** Input only. The type of Chat app response. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Input only. URL for users to auth or config. (Only for REQUEST_CONFIG response types.) */
  var url: js.UndefOr[String] = js.undefined
}
object ActionResponse {
  
  inline def apply(): ActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionResponse]
  }
  
  extension [Self <: ActionResponse](x: Self) {
    
    inline def setDialogAction(value: DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
