package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendInactiveItemsLabels extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object ChartLegendInactiveItemsLabels {
  
  @scala.inline
  def apply(): ChartLegendInactiveItemsLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendInactiveItemsLabels]
  }
  
  @scala.inline
  implicit class ChartLegendInactiveItemsLabelsMutableBuilder[Self <: ChartLegendInactiveItemsLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
