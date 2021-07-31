package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSpreadsheet extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Spreadsheet
  
  /* static member */
  var fn: Spreadsheet
}
object TypeofSpreadsheet {
  
  @scala.inline
  def apply(extend: js.Object => Spreadsheet, fn: Spreadsheet): TypeofSpreadsheet = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSpreadsheet]
  }
  
  @scala.inline
  implicit class TypeofSpreadsheetMutableBuilder[Self <: TypeofSpreadsheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Spreadsheet): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Spreadsheet): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
