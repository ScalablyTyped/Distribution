package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCategoryAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[ChartCategoryAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[ChartCategoryAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[ChartCategoryAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[ChartCategoryAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
}
object ChartCategoryAxisItemNotes {
  
  inline def apply(): ChartCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemNotes]
  }
  
  extension [Self <: ChartCategoryAxisItemNotes](x: Self) {
    
    inline def setData(value: js.Array[ChartCategoryAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ChartCategoryAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIcon(value: ChartCategoryAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ChartCategoryAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: ChartCategoryAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
