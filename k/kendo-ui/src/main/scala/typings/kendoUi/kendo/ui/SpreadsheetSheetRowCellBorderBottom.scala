package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetRowCellBorderBottom extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetRowCellBorderBottom {
  
  inline def apply(): SpreadsheetSheetRowCellBorderBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderBottom]
  }
  
  extension [Self <: SpreadsheetSheetRowCellBorderBottom](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
