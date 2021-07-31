package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetRowCellBorderLeft extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetRowCellBorderLeft {
  
  @scala.inline
  def apply(): SpreadsheetSheetRowCellBorderLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderLeft]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetRowCellBorderLeftMutableBuilder[Self <: SpreadsheetSheetRowCellBorderLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
