package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircularProgressBarOptions extends StObject {
  
  var ariaRole: js.UndefOr[Boolean] = js.undefined
  
  var centerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colors: js.UndefOr[js.Array[CircularProgressBarColor]] = js.undefined
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pointerWidth: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object CircularProgressBarOptions {
  
  inline def apply(): CircularProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularProgressBarOptions]
  }
  
  extension [Self <: CircularProgressBarOptions](x: Self) {
    
    inline def setAriaRole(value: Boolean): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    inline def setCenterTemplate(value: String | js.Function): Self = StObject.set(x, "centerTemplate", value.asInstanceOf[js.Any])
    
    inline def setCenterTemplateUndefined: Self = StObject.set(x, "centerTemplate", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[CircularProgressBarColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: CircularProgressBarColor*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
    
    inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
