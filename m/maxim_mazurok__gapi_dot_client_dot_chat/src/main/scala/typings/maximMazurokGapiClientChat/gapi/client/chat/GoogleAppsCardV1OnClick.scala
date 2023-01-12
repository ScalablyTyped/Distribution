package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1OnClick extends StObject {
  
  /** If specified, an action is triggered by this `onClick`. */
  var action: js.UndefOr[GoogleAppsCardV1Action] = js.undefined
  
  /** A new card is pushed to the card stack after clicking if specified. */
  var card: js.UndefOr[GoogleAppsCardV1Card] = js.undefined
  
  /**
    * An add-on triggers this action when the action needs to open a link. This differs from the `open_link` above in that this needs to talk to server to get the link. Thus some
    * preparation work is required for web client to do before the open link action response comes back.
    */
  var openDynamicLinkAction: js.UndefOr[GoogleAppsCardV1Action] = js.undefined
  
  /** If specified, this `onClick` triggers an open link action. */
  var openLink: js.UndefOr[GoogleAppsCardV1OpenLink] = js.undefined
}
object GoogleAppsCardV1OnClick {
  
  inline def apply(): GoogleAppsCardV1OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1OnClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1OnClick] (val x: Self) extends AnyVal {
    
    inline def setAction(value: GoogleAppsCardV1Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCard(value: GoogleAppsCardV1Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setOpenDynamicLinkAction(value: GoogleAppsCardV1Action): Self = StObject.set(x, "openDynamicLinkAction", value.asInstanceOf[js.Any])
    
    inline def setOpenDynamicLinkActionUndefined: Self = StObject.set(x, "openDynamicLinkAction", js.undefined)
    
    inline def setOpenLink(value: GoogleAppsCardV1OpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
