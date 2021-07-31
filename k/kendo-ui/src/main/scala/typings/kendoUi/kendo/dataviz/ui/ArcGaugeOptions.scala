package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGaugeOptions extends StObject {
  
  var centerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colors: js.UndefOr[js.Array[ArcGaugeColor]] = js.undefined
  
  var gaugeArea: js.UndefOr[ArcGaugeGaugeArea] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[ArcGaugeScale] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object ArcGaugeOptions {
  
  @scala.inline
  def apply(): ArcGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeOptions]
  }
  
  @scala.inline
  implicit class ArcGaugeOptionsMutableBuilder[Self <: ArcGaugeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterTemplate(value: String | js.Function): Self = StObject.set(x, "centerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterTemplateUndefined: Self = StObject.set(x, "centerTemplate", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[ArcGaugeColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: ArcGaugeColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setGaugeArea(value: ArcGaugeGaugeArea): Self = StObject.set(x, "gaugeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeAreaUndefined: Self = StObject.set(x, "gaugeArea", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setScale(value: ArcGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
