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
  var firstRecord: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to igGridCellMerging.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the next record in the merging chain that the merge is executed for.
    */
  var record: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the row the merged group starts in if available in the DOM.
    */
  var row: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the PK of the row the merged group starts in if available.
    */
  var rowId: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the data index of the row the merged group starts in.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object CellsMergingEventUIParam {
  
  inline def apply(): CellsMergingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellsMergingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellsMergingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setFirstRecord(value: Any): Self = StObject.set(x, "firstRecord", value.asInstanceOf[js.Any])
    
    inline def setFirstRecordUndefined: Self = StObject.set(x, "firstRecord", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRecord(value: Any): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowId(value: Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
