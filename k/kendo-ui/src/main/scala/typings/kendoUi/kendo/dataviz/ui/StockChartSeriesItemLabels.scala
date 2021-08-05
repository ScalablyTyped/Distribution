package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItemLabels extends StObject {
  
  var background: js.UndefOr[String | js.Function] = js.undefined
  
  var border: js.UndefOr[StockChartSeriesItemLabelsBorder] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var font: js.UndefOr[String | js.Function] = js.undefined
  
  var format: js.UndefOr[String | js.Function] = js.undefined
  
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  
  var padding: js.UndefOr[Double | js.Any] = js.undefined
  
  var position: js.UndefOr[String | js.Function] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
}
object StockChartSeriesItemLabels {
  
  inline def apply(): StockChartSeriesItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemLabels]
  }
  
  extension [Self <: StockChartSeriesItemLabels](x: Self) {
    
    inline def setBackground(value: String | js.Function): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: StockChartSeriesItemLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: String | js.Function): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: String | js.Function): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMargin(value: Double | js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPadding(value: Double | js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: String | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVisible(value: Boolean | js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
