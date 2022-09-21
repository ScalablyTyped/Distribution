package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineCategoryAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[SparklineCategoryAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[SparklineCategoryAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[SparklineCategoryAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[SparklineCategoryAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object SparklineCategoryAxisItemNotes {
  
  inline def apply(): SparklineCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineCategoryAxisItemNotes]
  }
  
  extension [Self <: SparklineCategoryAxisItemNotes](x: Self) {
    
    inline def setData(value: js.Array[SparklineCategoryAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: SparklineCategoryAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIcon(value: SparklineCategoryAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: SparklineCategoryAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: SparklineCategoryAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
