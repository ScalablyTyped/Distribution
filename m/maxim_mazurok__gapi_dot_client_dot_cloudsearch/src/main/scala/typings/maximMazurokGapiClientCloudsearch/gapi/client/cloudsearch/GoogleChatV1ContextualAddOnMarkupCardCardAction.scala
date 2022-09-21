package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1ContextualAddOnMarkupCardCardAction extends StObject {
  
  /** The label used to be displayed in the action menu item. */
  var actionLabel: js.UndefOr[String] = js.undefined
  
  /** The onclick action for this action item. */
  var onClick: js.UndefOr[GoogleChatV1WidgetMarkupOnClick] = js.undefined
}
object GoogleChatV1ContextualAddOnMarkupCardCardAction {
  
  inline def apply(): GoogleChatV1ContextualAddOnMarkupCardCardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1ContextualAddOnMarkupCardCardAction]
  }
  
  extension [Self <: GoogleChatV1ContextualAddOnMarkupCardCardAction](x: Self) {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: GoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
