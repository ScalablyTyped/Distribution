package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedButton extends StObject {
  
  /** The alternative text used for accessibility. Has no effect when an icon is set; use `icon.alt_text` instead. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** If set, the button is filled with a solid background. */
  var color: js.UndefOr[Color] = js.undefined
  
  /** If true, the button is displayed in a disabled state and doesn't respond to user actions. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** The icon image. */
  var icon: js.UndefOr[AppsDynamiteSharedIcon] = js.undefined
  
  /** The action to perform when the button is clicked. */
  var onClick: js.UndefOr[AppsDynamiteSharedOnClick] = js.undefined
  
  /** The text of the button. */
  var text: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedButton {
  
  inline def apply(): AppsDynamiteSharedButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedButton] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: AppsDynamiteSharedIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: AppsDynamiteSharedOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
