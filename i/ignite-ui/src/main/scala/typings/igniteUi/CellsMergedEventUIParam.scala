package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellsMergedEventUIParam extends js.Object {
  
  /**
    * Gets the column key the merge is being executed for.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the total count of cells that were merged.
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * Gets the first record in the merging chain that the merge is executed for.
    */
  var firstRecord: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to igGridCellMerging.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the last record in the merging chain that the merge is executed for.
    */
  var record: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the row the merged group starts in if available in the DOM.
    */
  var row: js.UndefOr[String] = js.native
  
  /**
    * Gets the PK of the row the merged group starts in if available.
    */
  var rowId: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the data index of the row the merged group starts in.
    */
  var rowIndex: js.UndefOr[Double] = js.native
}
object CellsMergedEventUIParam {
  
  @scala.inline
  def apply(): CellsMergedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellsMergedEventUIParam]
  }
  
  @scala.inline
  implicit class CellsMergedEventUIParamOps[Self <: CellsMergedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFirstRecord(value: js.Any): Self = this.set("firstRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstRecord: Self = this.set("firstRecord", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRecord(value: js.Any): Self = this.set("record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowId(value: js.Any): Self = this.set("rowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowId: Self = this.set("rowId", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
}
