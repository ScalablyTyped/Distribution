package typings.jupyterlabMainmenu.editMod.IEditMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an activity that uses Go to Line.
  */
@js.native
trait IGoToLiner[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * Execute a go to line command for the activity.
    */
  var goToLine: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
}
object IGoToLiner {
  
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IGoToLiner[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGoToLiner[T]]
  }
  
  @scala.inline
  implicit class IGoToLinerOps[Self <: IGoToLiner[_], T /* <: Widget */] (val x: Self with IGoToLiner[T]) extends AnyVal {
    
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
    def setGoToLine(value: /* widget */ T => Unit): Self = this.set("goToLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGoToLine: Self = this.set("goToLine", js.undefined)
  }
}
