package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupImageButton extends StObject {
  
  /** The icon specified by an enum that indices to an icon provided by Chat API. */
  var icon: js.UndefOr[String] = js.undefined
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /** The name of this image_button which will be used for accessibility. Default value will be provided if developers don't specify. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The onclick action. */
  var onClick: js.UndefOr[GoogleChatV1WidgetMarkupOnClick] = js.undefined
}
object GoogleChatV1WidgetMarkupImageButton {
  
  inline def apply(): GoogleChatV1WidgetMarkupImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupImageButton]
  }
  
  extension [Self <: GoogleChatV1WidgetMarkupImageButton](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnClick(value: GoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
