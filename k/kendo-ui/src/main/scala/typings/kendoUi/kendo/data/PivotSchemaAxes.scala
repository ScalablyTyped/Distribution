package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchemaAxes extends StObject {
  
  var columns: PivotSchemaColumnAxis
  
  var rows: PivotSchemaRowAxis
}
object PivotSchemaAxes {
  
  @scala.inline
  def apply(columns: PivotSchemaColumnAxis, rows: PivotSchemaRowAxis): PivotSchemaAxes = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaAxes]
  }
  
  @scala.inline
  implicit class PivotSchemaAxesMutableBuilder[Self <: PivotSchemaAxes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: PivotSchemaColumnAxis): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: PivotSchemaRowAxis): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
