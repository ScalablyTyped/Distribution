package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetRowCellBorderTop extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetRowCellBorderTop {
  
  inline def apply(): SpreadsheetSheetRowCellBorderTop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderTop]
  }
  
  extension [Self <: SpreadsheetSheetRowCellBorderTop](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
