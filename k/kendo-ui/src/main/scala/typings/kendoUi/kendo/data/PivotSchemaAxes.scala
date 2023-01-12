package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchemaAxes extends StObject {
  
  var columns: PivotSchemaColumnAxis
  
  var rows: PivotSchemaRowAxis
}
object PivotSchemaAxes {
  
  inline def apply(columns: PivotSchemaColumnAxis, rows: PivotSchemaRowAxis): PivotSchemaAxes = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaAxes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotSchemaAxes] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: PivotSchemaColumnAxis): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setRows(value: PivotSchemaRowAxis): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
