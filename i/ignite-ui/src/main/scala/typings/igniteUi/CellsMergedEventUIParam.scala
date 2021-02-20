package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellsMergedEventUIParam extends StObject {
  
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
  implicit class CellsMergedEventUIParamMutableBuilder[Self <: CellsMergedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFirstRecord(value: js.Any): Self = StObject.set(x, "firstRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRecordUndefined: Self = StObject.set(x, "firstRecord", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRecord(value: js.Any): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowId(value: js.Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
