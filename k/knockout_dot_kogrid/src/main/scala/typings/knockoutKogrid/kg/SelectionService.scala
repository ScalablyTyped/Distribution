package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionService[EntityType] extends js.Object {
  
  var lastClickedRow: Row[EntityType] = js.native
  
  var multi: Boolean = js.native
  
  def setSelection(row: Row[EntityType], selected: Boolean): Unit = js.native
}
object SelectionService {
  
  @scala.inline
  def apply[EntityType](lastClickedRow: Row[EntityType], multi: Boolean, setSelection: (Row[EntityType], Boolean) => Unit): SelectionService[EntityType] = {
    val __obj = js.Dynamic.literal(lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[SelectionService[EntityType]]
  }
  
  @scala.inline
  implicit class SelectionServiceOps[Self <: SelectionService[_], EntityType] (val x: Self with SelectionService[EntityType]) extends AnyVal {
    
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
    def setLastClickedRow(value: Row[EntityType]): Self = this.set("lastClickedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSelection(value: (Row[EntityType], Boolean) => Unit): Self = this.set("setSelection", js.Any.fromFunction2(value))
  }
}
