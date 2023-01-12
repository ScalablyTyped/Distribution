package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupKeyValue extends StObject {
  
  /** The text of the bottom label. Formatted text supported. */
  var bottomLabel: js.UndefOr[String] = js.undefined
  
  /** A button that can be clicked to trigger an action. */
  var button: js.UndefOr[GoogleChatV1WidgetMarkupButton] = js.undefined
  
  /** The text of the content. Formatted text supported and always required. */
  var content: js.UndefOr[String] = js.undefined
  
  /** If the content should be multiline. */
  var contentMultiline: js.UndefOr[Boolean] = js.undefined
  
  /** An enum value that will be replaced by the Chat API with the corresponding icon image. */
  var icon: js.UndefOr[String] = js.undefined
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /** The onclick action. Only the top label, bottom label and content region are clickable. */
  var onClick: js.UndefOr[GoogleChatV1WidgetMarkupOnClick] = js.undefined
  
  /** The text of the top label. Formatted text supported. */
  var topLabel: js.UndefOr[String] = js.undefined
}
object GoogleChatV1WidgetMarkupKeyValue {
  
  inline def apply(): GoogleChatV1WidgetMarkupKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupKeyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleChatV1WidgetMarkupKeyValue] (val x: Self) extends AnyVal {
    
    inline def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    inline def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    inline def setButton(value: GoogleChatV1WidgetMarkupButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentMultiline(value: Boolean): Self = StObject.set(x, "contentMultiline", value.asInstanceOf[js.Any])
    
    inline def setContentMultilineUndefined: Self = StObject.set(x, "contentMultiline", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setOnClick(value: GoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTopLabel(value: String): Self = StObject.set(x, "topLabel", value.asInstanceOf[js.Any])
    
    inline def setTopLabelUndefined: Self = StObject.set(x, "topLabel", js.undefined)
  }
}
