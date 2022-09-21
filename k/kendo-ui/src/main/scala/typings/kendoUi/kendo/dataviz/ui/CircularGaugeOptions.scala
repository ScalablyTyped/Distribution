package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircularGaugeOptions extends StObject {
  
  var centerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colors: js.UndefOr[js.Array[CircularGaugeColor]] = js.undefined
  
  var gaugeArea: js.UndefOr[CircularGaugeGaugeArea] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[CircularGaugeScale] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object CircularGaugeOptions {
  
  inline def apply(): CircularGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularGaugeOptions]
  }
  
  extension [Self <: CircularGaugeOptions](x: Self) {
    
    inline def setCenterTemplate(value: String | js.Function): Self = StObject.set(x, "centerTemplate", value.asInstanceOf[js.Any])
    
    inline def setCenterTemplateUndefined: Self = StObject.set(x, "centerTemplate", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[CircularGaugeColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: CircularGaugeColor*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setGaugeArea(value: CircularGaugeGaugeArea): Self = StObject.set(x, "gaugeArea", value.asInstanceOf[js.Any])
    
    inline def setGaugeAreaUndefined: Self = StObject.set(x, "gaugeArea", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setScale(value: CircularGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
