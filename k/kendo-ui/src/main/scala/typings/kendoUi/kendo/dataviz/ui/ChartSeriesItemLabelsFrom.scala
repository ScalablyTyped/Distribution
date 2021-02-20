package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemLabelsFrom extends StObject {
  
  var background: js.UndefOr[String | js.Function] = js.native
  
  var border: js.UndefOr[ChartSeriesItemLabelsFromBorder] = js.native
  
  var color: js.UndefOr[String | js.Function] = js.native
  
  var font: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String | js.Function] = js.native
  
  var margin: js.UndefOr[Double | ChartSeriesItemLabelsFromMargin] = js.native
  
  var padding: js.UndefOr[Double | ChartSeriesItemLabelsFromPadding] = js.native
  
  var position: js.UndefOr[String | js.Function] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean | js.Function] = js.native
}
object ChartSeriesItemLabelsFrom {
  
  @scala.inline
  def apply(): ChartSeriesItemLabelsFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemLabelsFrom]
  }
  
  @scala.inline
  implicit class ChartSeriesItemLabelsFromMutableBuilder[Self <: ChartSeriesItemLabelsFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String | js.Function): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesItemLabelsFromBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String | js.Function): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: String | js.Function): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartSeriesItemLabelsFromMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | ChartSeriesItemLabelsFromPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: String | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
