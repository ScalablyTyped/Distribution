package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetColumn extends StObject {
  
  var index: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SpreadsheetSheetColumn {
  
  @scala.inline
  def apply(): SpreadsheetSheetColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetColumn]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetColumnMutableBuilder[Self <: SpreadsheetSheetColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
