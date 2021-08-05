package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartValueAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[StockChartValueAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[StockChartValueAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[StockChartValueAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[StockChartValueAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object StockChartValueAxisItemNotes {
  
  inline def apply(): StockChartValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartValueAxisItemNotes]
  }
  
  extension [Self <: StockChartValueAxisItemNotes](x: Self) {
    
    inline def setData(value: js.Array[StockChartValueAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: StockChartValueAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setIcon(value: StockChartValueAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: StockChartValueAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: StockChartValueAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
