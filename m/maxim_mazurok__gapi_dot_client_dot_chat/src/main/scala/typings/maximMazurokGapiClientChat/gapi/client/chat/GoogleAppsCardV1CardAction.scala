package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1CardAction extends StObject {
  
  /** The label that displays as the action menu item. */
  var actionLabel: js.UndefOr[String] = js.undefined
  
  /** The `onClick` action for this action item. */
  var onClick: js.UndefOr[GoogleAppsCardV1OnClick] = js.undefined
}
object GoogleAppsCardV1CardAction {
  
  inline def apply(): GoogleAppsCardV1CardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1CardAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1CardAction] (val x: Self) extends AnyVal {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: GoogleAppsCardV1OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
