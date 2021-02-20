package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowSelectionChangingEventUIParam extends StObject {
  
  /**
    * Gets the end index for a range row selection.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to the row object.
    */
  var row: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to rows object array.
    */
  var selectedRows: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets the start index for a range row selection.
    */
  var startIndex: js.UndefOr[Double] = js.native
}
object RowSelectionChangingEventUIParam {
  
  @scala.inline
  def apply(): RowSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangingEventUIParam]
  }
  
  @scala.inline
  implicit class RowSelectionChangingEventUIParamMutableBuilder[Self <: RowSelectionChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: js.Array[_]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    @scala.inline
    def setSelectedRowsVarargs(value: js.Any*): Self = StObject.set(x, "selectedRows", js.Array(value :_*))
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
