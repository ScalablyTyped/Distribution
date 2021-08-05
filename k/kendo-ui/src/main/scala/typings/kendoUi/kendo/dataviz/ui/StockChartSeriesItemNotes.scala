package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItemNotes extends StObject {
  
  var icon: js.UndefOr[StockChartSeriesItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[StockChartSeriesItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[StockChartSeriesItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object StockChartSeriesItemNotes {
  
  inline def apply(): StockChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemNotes]
  }
  
  extension [Self <: StockChartSeriesItemNotes](x: Self) {
    
    inline def setIcon(value: StockChartSeriesItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: StockChartSeriesItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: StockChartSeriesItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
