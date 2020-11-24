package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsArray extends js.Object {
  
  var rows: js.Array[GetObjectListItem] = js.native
}
object RowsArray {
  
  @scala.inline
  def apply(rows: js.Array[GetObjectListItem]): RowsArray = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsArray]
  }
  
  @scala.inline
  implicit class RowsArrayOps[Self <: RowsArray] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: GetObjectListItem*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[GetObjectListItem]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
}
