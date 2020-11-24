package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttColumnSortable extends js.Object {
  
  var compare: js.UndefOr[js.Function] = js.native
}
object GanttColumnSortable {
  
  @scala.inline
  def apply(): GanttColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttColumnSortable]
  }
  
  @scala.inline
  implicit class GanttColumnSortableOps[Self <: GanttColumnSortable] (val x: Self) extends AnyVal {
    
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
    def setCompare(value: js.Function): Self = this.set("compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
  }
}
