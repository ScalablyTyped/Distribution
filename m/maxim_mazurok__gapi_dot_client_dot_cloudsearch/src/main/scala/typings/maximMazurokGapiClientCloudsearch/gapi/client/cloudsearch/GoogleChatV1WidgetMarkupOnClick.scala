package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupOnClick extends StObject {
  
  /** A form action will be triggered by this onclick if specified. */
  var action: js.UndefOr[GoogleChatV1WidgetMarkupFormAction] = js.undefined
  
  /** This onclick triggers an open link action if specified. */
  var openLink: js.UndefOr[GoogleChatV1WidgetMarkupOpenLink] = js.undefined
}
object GoogleChatV1WidgetMarkupOnClick {
  
  inline def apply(): GoogleChatV1WidgetMarkupOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupOnClick]
  }
  
  extension [Self <: GoogleChatV1WidgetMarkupOnClick](x: Self) {
    
    inline def setAction(value: GoogleChatV1WidgetMarkupFormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setOpenLink(value: GoogleChatV1WidgetMarkupOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
