package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigatorCategoryAxisNotes extends StObject {
  
  var data: js.UndefOr[js.Array[StockChartNavigatorCategoryAxisNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[StockChartNavigatorCategoryAxisNotesIcon] = js.undefined
  
  var label: js.UndefOr[StockChartNavigatorCategoryAxisNotesLabel] = js.undefined
  
  var line: js.UndefOr[StockChartNavigatorCategoryAxisNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object StockChartNavigatorCategoryAxisNotes {
  
  inline def apply(): StockChartNavigatorCategoryAxisNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisNotes]
  }
  
  extension [Self <: StockChartNavigatorCategoryAxisNotes](x: Self) {
    
    inline def setData(value: js.Array[StockChartNavigatorCategoryAxisNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: StockChartNavigatorCategoryAxisNotesDataItem*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIcon(value: StockChartNavigatorCategoryAxisNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: StockChartNavigatorCategoryAxisNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: StockChartNavigatorCategoryAxisNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
