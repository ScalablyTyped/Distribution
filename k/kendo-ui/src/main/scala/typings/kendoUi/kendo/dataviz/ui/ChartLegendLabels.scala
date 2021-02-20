package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendLabels extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[Double | ChartLegendLabelsMargin] = js.native
  
  var padding: js.UndefOr[ChartLegendLabelsPadding] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
}
object ChartLegendLabels {
  
  @scala.inline
  def apply(): ChartLegendLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendLabels]
  }
  
  @scala.inline
  implicit class ChartLegendLabelsMutableBuilder[Self <: ChartLegendLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartLegendLabelsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPadding(value: ChartLegendLabelsPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
