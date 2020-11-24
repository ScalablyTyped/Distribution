package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a row from a table.
  */
@js.native
trait SchemaDeleteTableRowRequest extends js.Object {
  
  /**
    * The reference table cell location from which a row will be deleted.  The
    * row this cell spans will be deleted. If this is a merged cell, multiple
    * rows will be deleted. If no rows remain in the table after this deletion,
    * the whole table is deleted.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * The table to delete rows from.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}
object SchemaDeleteTableRowRequest {
  
  @scala.inline
  def apply(): SchemaDeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTableRowRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteTableRowRequestOps[Self <: SchemaDeleteTableRowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellLocation(value: SchemaTableCellLocation): Self = this.set("cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellLocation: Self = this.set("cellLocation", js.undefined)
    
    @scala.inline
    def setTableObjectId(value: String): Self = this.set("tableObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableObjectId: Self = this.set("tableObjectId", js.undefined)
  }
}
