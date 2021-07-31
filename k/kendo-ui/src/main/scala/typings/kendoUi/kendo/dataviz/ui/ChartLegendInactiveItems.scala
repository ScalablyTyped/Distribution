package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendInactiveItems extends StObject {
  
  var labels: js.UndefOr[ChartLegendInactiveItemsLabels] = js.undefined
}
object ChartLegendInactiveItems {
  
  @scala.inline
  def apply(): ChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendInactiveItems]
  }
  
  @scala.inline
  implicit class ChartLegendInactiveItemsMutableBuilder[Self <: ChartLegendInactiveItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: ChartLegendInactiveItemsLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
