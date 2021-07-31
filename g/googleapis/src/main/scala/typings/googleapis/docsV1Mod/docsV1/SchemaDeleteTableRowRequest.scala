package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a row from a table.
  */
trait SchemaDeleteTableRowRequest extends StObject {
  
  /**
    * The reference table cell location from which the row will be deleted. The
    * row this cell spans will be deleted. If this is a merged cell that spans
    * multiple rows, all rows that the cell spans will be deleted. If no rows
    * remain in the table after this deletion, the whole table is deleted.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
}
object SchemaDeleteTableRowRequest {
  
  @scala.inline
  def apply(): SchemaDeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTableRowRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteTableRowRequestMutableBuilder[Self <: SchemaDeleteTableRowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
