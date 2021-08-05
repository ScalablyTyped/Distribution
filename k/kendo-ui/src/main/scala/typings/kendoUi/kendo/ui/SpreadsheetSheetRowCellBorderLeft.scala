package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetRowCellBorderLeft extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetRowCellBorderLeft {
  
  inline def apply(): SpreadsheetSheetRowCellBorderLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderLeft]
  }
  
  extension [Self <: SpreadsheetSheetRowCellBorderLeft](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
