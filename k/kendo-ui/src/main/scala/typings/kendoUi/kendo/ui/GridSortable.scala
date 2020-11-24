package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridSortable extends js.Object {
  
  var allowUnsort: js.UndefOr[Boolean] = js.native
  
  var initialDirection: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var showIndexes: js.UndefOr[Boolean] = js.native
}
object GridSortable {
  
  @scala.inline
  def apply(): GridSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSortable]
  }
  
  @scala.inline
  implicit class GridSortableOps[Self <: GridSortable] (val x: Self) extends AnyVal {
    
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
    def setAllowUnsort(value: Boolean): Self = this.set("allowUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnsort: Self = this.set("allowUnsort", js.undefined)
    
    @scala.inline
    def setInitialDirection(value: String): Self = this.set("initialDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDirection: Self = this.set("initialDirection", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setShowIndexes(value: Boolean): Self = this.set("showIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndexes: Self = this.set("showIndexes", js.undefined)
  }
}
