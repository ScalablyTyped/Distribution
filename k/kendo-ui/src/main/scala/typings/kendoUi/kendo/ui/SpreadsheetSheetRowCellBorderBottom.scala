package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetRowCellBorderBottom extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object SpreadsheetSheetRowCellBorderBottom {
  
  @scala.inline
  def apply(): SpreadsheetSheetRowCellBorderBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderBottom]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetRowCellBorderBottomMutableBuilder[Self <: SpreadsheetSheetRowCellBorderBottom] (val x: Self) extends AnyVal {
    
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
