package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAction extends StObject {
  
  /**
    * Input only. Status for a request to either invoke or submit a [dialog](https://developers.google.com/chat/how-tos/dialogs). Displays a status and message to users, if necessary. For
    * example, in case of an error or success.
    */
  var actionStatus: js.UndefOr[ActionStatus] = js.undefined
  
  /** Input only. [Dialog](https://developers.google.com/chat/how-tos/dialogs) for the request. */
  var dialog: js.UndefOr[Dialog] = js.undefined
}
object DialogAction {
  
  inline def apply(): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogAction]
  }
  
  extension [Self <: DialogAction](x: Self) {
    
    inline def setActionStatus(value: ActionStatus): Self = StObject.set(x, "actionStatus", value.asInstanceOf[js.Any])
    
    inline def setActionStatusUndefined: Self = StObject.set(x, "actionStatus", js.undefined)
    
    inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
  }
}
