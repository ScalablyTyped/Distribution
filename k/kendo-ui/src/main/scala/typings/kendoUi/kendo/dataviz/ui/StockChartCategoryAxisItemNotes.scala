package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartCategoryAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[StockChartCategoryAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[StockChartCategoryAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[StockChartCategoryAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[StockChartCategoryAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object StockChartCategoryAxisItemNotes {
  
  inline def apply(): StockChartCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartCategoryAxisItemNotes]
  }
  
  extension [Self <: StockChartCategoryAxisItemNotes](x: Self) {
    
    inline def setData(value: js.Array[StockChartCategoryAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: StockChartCategoryAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setIcon(value: StockChartCategoryAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: StockChartCategoryAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: StockChartCategoryAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
