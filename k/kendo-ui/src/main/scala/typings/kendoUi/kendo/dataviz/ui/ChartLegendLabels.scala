package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendLabels extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[Double | ChartLegendLabelsMargin] = js.undefined
  
  var padding: js.UndefOr[ChartLegendLabelsPadding] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object ChartLegendLabels {
  
  inline def apply(): ChartLegendLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendLabels]
  }
  
  extension [Self <: ChartLegendLabels](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setMargin(value: Double | ChartLegendLabelsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPadding(value: ChartLegendLabelsPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
