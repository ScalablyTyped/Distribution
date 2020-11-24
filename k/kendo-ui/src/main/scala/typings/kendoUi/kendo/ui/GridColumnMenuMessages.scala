package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnMenuMessages extends js.Object {
  
  var columns: js.UndefOr[String] = js.native
  
  var done: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var lock: js.UndefOr[String] = js.native
  
  var setColumnPosition: js.UndefOr[String] = js.native
  
  var settings: js.UndefOr[String] = js.native
  
  var sortAscending: js.UndefOr[String] = js.native
  
  var sortDescending: js.UndefOr[String] = js.native
  
  var stick: js.UndefOr[String] = js.native
  
  var unlock: js.UndefOr[String] = js.native
  
  var unstick: js.UndefOr[String] = js.native
}
object GridColumnMenuMessages {
  
  @scala.inline
  def apply(): GridColumnMenuMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnMenuMessages]
  }
  
  @scala.inline
  implicit class GridColumnMenuMessagesOps[Self <: GridColumnMenuMessages] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDone(value: String): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLock(value: String): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    
    @scala.inline
    def setSetColumnPosition(value: String): Self = this.set("setColumnPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetColumnPosition: Self = this.set("setColumnPosition", js.undefined)
    
    @scala.inline
    def setSettings(value: String): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSortAscending(value: String): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
    
    @scala.inline
    def setSortDescending(value: String): Self = this.set("sortDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDescending: Self = this.set("sortDescending", js.undefined)
    
    @scala.inline
    def setStick(value: String): Self = this.set("stick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStick: Self = this.set("stick", js.undefined)
    
    @scala.inline
    def setUnlock(value: String): Self = this.set("unlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlock: Self = this.set("unlock", js.undefined)
    
    @scala.inline
    def setUnstick(value: String): Self = this.set("unstick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnstick: Self = this.set("unstick", js.undefined)
  }
}
