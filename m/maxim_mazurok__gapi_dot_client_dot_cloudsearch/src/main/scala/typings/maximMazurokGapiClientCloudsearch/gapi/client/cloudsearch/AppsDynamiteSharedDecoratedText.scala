package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedDecoratedText extends StObject {
  
  /** The formatted text label that shows below the main text. */
  var bottomLabel: js.UndefOr[String] = js.undefined
  
  /** A button that can be clicked to trigger an action. */
  var button: js.UndefOr[AppsDynamiteSharedButton] = js.undefined
  
  /** An icon displayed after the text. */
  var endIcon: js.UndefOr[AppsDynamiteSharedIcon] = js.undefined
  
  /** Deprecated in favor of start_icon. */
  var icon: js.UndefOr[AppsDynamiteSharedIcon] = js.undefined
  
  /** Only the top and bottom label and content region are clickable. */
  var onClick: js.UndefOr[AppsDynamiteSharedOnClick] = js.undefined
  
  /** The icon displayed in front of the text. */
  var startIcon: js.UndefOr[AppsDynamiteSharedIcon] = js.undefined
  
  /** A switch widget can be clicked to change its state or trigger an action. */
  var switchControl: js.UndefOr[AppsDynamiteSharedDecoratedTextSwitchControl] = js.undefined
  
  /** Required. The main widget formatted text. See Text formatting for details. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The formatted text label that shows above the main text. */
  var topLabel: js.UndefOr[String] = js.undefined
  
  /** The wrap text setting. If `true`, the text is wrapped and displayed in multiline. Otherwise, the text is truncated. */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteSharedDecoratedText {
  
  inline def apply(): AppsDynamiteSharedDecoratedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedDecoratedText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedDecoratedText] (val x: Self) extends AnyVal {
    
    inline def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    inline def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    inline def setButton(value: AppsDynamiteSharedButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setEndIcon(value: AppsDynamiteSharedIcon): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    inline def setIcon(value: AppsDynamiteSharedIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: AppsDynamiteSharedOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStartIcon(value: AppsDynamiteSharedIcon): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
    
    inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
    inline def setSwitchControl(value: AppsDynamiteSharedDecoratedTextSwitchControl): Self = StObject.set(x, "switchControl", value.asInstanceOf[js.Any])
    
    inline def setSwitchControlUndefined: Self = StObject.set(x, "switchControl", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopLabel(value: String): Self = StObject.set(x, "topLabel", value.asInstanceOf[js.Any])
    
    inline def setTopLabelUndefined: Self = StObject.set(x, "topLabel", js.undefined)
    
    inline def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
