package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesDefaultsTooltip extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[ChartSeriesDefaultsTooltipBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[ChartSeriesDefaultsTooltipPadding] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartSeriesDefaultsTooltip {
  
  @scala.inline
  def apply(): ChartSeriesDefaultsTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsTooltip]
  }
  
  @scala.inline
  implicit class ChartSeriesDefaultsTooltipMutableBuilder[Self <: ChartSeriesDefaultsTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesDefaultsTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPadding(value: ChartSeriesDefaultsTooltipPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
