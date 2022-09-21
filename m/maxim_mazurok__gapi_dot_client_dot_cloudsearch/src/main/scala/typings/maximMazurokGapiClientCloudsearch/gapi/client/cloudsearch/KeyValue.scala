package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValue extends StObject {
  
  /** Formatted text supported. */
  var bottomLabel: js.UndefOr[String] = js.undefined
  
  var button: js.UndefOr[Button] = js.undefined
  
  /** Formatted text supported and always required. */
  var content: js.UndefOr[String] = js.undefined
  
  var contentMultiline: js.UndefOr[Boolean] = js.undefined
  
  var endIcon: js.UndefOr[IconImage] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  /** The alternative text of this icon_url which will be used for accessibility. */
  var iconAltText: js.UndefOr[String] = js.undefined
  
  var iconUrl: js.UndefOr[String] = js.undefined
  
  var imageStyle: js.UndefOr[String] = js.undefined
  
  /** Only the top/bottom label + content region is clickable. */
  var onClick: js.UndefOr[OnClick] = js.undefined
  
  /** The optional icon to display before the text content. */
  var startIcon: js.UndefOr[IconImage] = js.undefined
  
  var switchWidget: js.UndefOr[SwitchWidget] = js.undefined
  
  /** Formatted text supported. */
  var topLabel: js.UndefOr[String] = js.undefined
}
object KeyValue {
  
  inline def apply(): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValue]
  }
  
  extension [Self <: KeyValue](x: Self) {
    
    inline def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    inline def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    inline def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentMultiline(value: Boolean): Self = StObject.set(x, "contentMultiline", value.asInstanceOf[js.Any])
    
    inline def setContentMultilineUndefined: Self = StObject.set(x, "contentMultiline", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEndIcon(value: IconImage): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconAltText(value: String): Self = StObject.set(x, "iconAltText", value.asInstanceOf[js.Any])
    
    inline def setIconAltTextUndefined: Self = StObject.set(x, "iconAltText", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStartIcon(value: IconImage): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
    
    inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
    inline def setSwitchWidget(value: SwitchWidget): Self = StObject.set(x, "switchWidget", value.asInstanceOf[js.Any])
    
    inline def setSwitchWidgetUndefined: Self = StObject.set(x, "switchWidget", js.undefined)
    
    inline def setTopLabel(value: String): Self = StObject.set(x, "topLabel", value.asInstanceOf[js.Any])
    
    inline def setTopLabelUndefined: Self = StObject.set(x, "topLabel", js.undefined)
  }
}
