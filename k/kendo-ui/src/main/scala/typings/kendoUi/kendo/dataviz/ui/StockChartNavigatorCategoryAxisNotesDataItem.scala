package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigatorCategoryAxisNotesDataItem extends StObject {
  
  var icon: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemIcon] = js.undefined
  
  var label: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemLabel] = js.undefined
  
  var line: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object StockChartNavigatorCategoryAxisNotesDataItem {
  
  inline def apply(): StockChartNavigatorCategoryAxisNotesDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisNotesDataItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockChartNavigatorCategoryAxisNotesDataItem] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: StockChartNavigatorCategoryAxisNotesDataItemIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: StockChartNavigatorCategoryAxisNotesDataItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: StockChartNavigatorCategoryAxisNotesDataItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
