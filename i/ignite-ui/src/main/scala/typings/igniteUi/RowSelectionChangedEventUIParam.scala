package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowSelectionChangedEventUIParam extends js.Object {
  
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
}
object RowSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): RowSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class RowSelectionChangedEventUIParamOps[Self <: RowSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setSelectedRowsVarargs(value: js.Any*): Self = this.set("selectedRows", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRows(value: js.Array[_]): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
  }
}
