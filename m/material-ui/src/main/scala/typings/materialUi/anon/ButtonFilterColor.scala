package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonFilterColor extends StObject {
  
  var buttonFilterColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabledTextColor: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
  
  var primaryTextColor: js.UndefOr[String] = js.undefined
  
  var secondaryTextColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object ButtonFilterColor {
  
  inline def apply(): ButtonFilterColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonFilterColor]
  }
  
  extension [Self <: ButtonFilterColor](x: Self) {
    
    inline def setButtonFilterColor(value: String): Self = StObject.set(x, "buttonFilterColor", value.asInstanceOf[js.Any])
    
    inline def setButtonFilterColorUndefined: Self = StObject.set(x, "buttonFilterColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setPrimaryTextColor(value: String): Self = StObject.set(x, "primaryTextColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTextColorUndefined: Self = StObject.set(x, "primaryTextColor", js.undefined)
    
    inline def setSecondaryTextColor(value: String): Self = StObject.set(x, "secondaryTextColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTextColorUndefined: Self = StObject.set(x, "secondaryTextColor", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
