package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a column from a table.
  */
trait SchemaDeleteTableColumnRequest extends StObject {
  
  /**
    * The reference table cell location from which a column will be deleted.
    * The column this cell spans will be deleted. If this is a merged cell,
    * multiple columns will be deleted. If no columns remain in the table after
    * this deletion, the whole table is deleted.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
  
  /**
    * The table to delete columns from.
    */
  var tableObjectId: js.UndefOr[String] = js.undefined
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
    def setCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
  }
}
