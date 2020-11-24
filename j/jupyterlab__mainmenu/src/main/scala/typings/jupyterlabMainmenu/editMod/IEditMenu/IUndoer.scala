package typings.jupyterlabMainmenu.editMod.IEditMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an activity that uses Undo/Redo.
  */
@js.native
trait IUndoer[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * Execute a redo command for the activity.
    */
  var redo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  
  /**
    * Execute an undo command for the activity.
    */
  var undo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
}
object IUndoer {
  
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IUndoer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUndoer[T]]
  }
  
  @scala.inline
  implicit class IUndoerOps[Self <: IUndoer[_], T /* <: Widget */] (val x: Self with IUndoer[T]) extends AnyVal {
    
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
    def setRedo(value: /* widget */ T => Unit): Self = this.set("redo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    
    @scala.inline
    def setUndo(value: /* widget */ T => Unit): Self = this.set("undo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
  }
}
