package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonSize extends StObject {
  
  var buttonSize: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabledColor: js.UndefOr[String] = js.undefined
  
  var disabledTextColor: js.UndefOr[String] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var miniSize: js.UndefOr[Double] = js.undefined
  
  var secondaryColor: js.UndefOr[String] = js.undefined
  
  var secondaryIconColor: js.UndefOr[String] = js.undefined
}
object ButtonSize {
  
  inline def apply(): ButtonSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSize]
  }
  
  extension [Self <: ButtonSize](x: Self) {
    
    inline def setButtonSize(value: Double): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
    
    inline def setButtonSizeUndefined: Self = StObject.set(x, "buttonSize", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    inline def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setMiniSize(value: Double): Self = StObject.set(x, "miniSize", value.asInstanceOf[js.Any])
    
    inline def setMiniSizeUndefined: Self = StObject.set(x, "miniSize", js.undefined)
    
    inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    
    inline def setSecondaryIconColor(value: String): Self = StObject.set(x, "secondaryIconColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIconColorUndefined: Self = StObject.set(x, "secondaryIconColor", js.undefined)
  }
}
