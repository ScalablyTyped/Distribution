package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a column from a table.
  */
trait SchemaDeleteTableColumnRequest extends StObject {
  
  /**
    * The reference table cell location from which the column will be deleted.
    * The column this cell spans will be deleted. If this is a merged cell that
    * spans multiple columns, all columns that the cell spans will be deleted.
    * If no columns remain in the table after this deletion, the whole table is
    * deleted.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
}
object SchemaDeleteTableColumnRequest {
  
  @scala.inline
  def apply(): SchemaDeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTableColumnRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteTableColumnRequestMutableBuilder[Self <: SchemaDeleteTableColumnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
