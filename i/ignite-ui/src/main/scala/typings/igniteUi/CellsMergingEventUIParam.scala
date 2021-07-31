package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellsMergingEventUIParam extends StObject {
  
  /**
    * Gets the column key the merge is being executed for.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the first record in the merging chain that the merge is executed for.
    */
  var firstRecord: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to igGridCellMerging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the next record in the merging chain that the merge is executed for.
    */
  var record: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the row the merged group starts in if available in the DOM.
    */
  var row: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the PK of the row the merged group starts in if available.
    */
  var rowId: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the data index of the row the merged group starts in.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object CellsMergingEventUIParam {
  
  @scala.inline
  def apply(): CellsMergingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellsMergingEventUIParam]
  }
  
  @scala.inline
  implicit class CellsMergingEventUIParamMutableBuilder[Self <: CellsMergingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
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
