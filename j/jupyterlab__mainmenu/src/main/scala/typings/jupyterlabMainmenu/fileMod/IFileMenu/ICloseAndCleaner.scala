package typings.jupyterlabMainmenu.fileMod.IFileMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an activity that has some cleanup action associated
  * with it in addition to merely closing its widget in the main area.
  */
@js.native
trait ICloseAndCleaner[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * A label to use for the cleanup action.
    */
  var action: String = js.native
  
  /**
    * A function to perform the close and cleanup action.
    */
  def closeAndCleanup(widget: T): js.Promise[Unit] = js.native
  
  /**
    * A label to use for the activity that is being cleaned up.
    */
  var name: String = js.native
}
object ICloseAndCleaner {
  
  @scala.inline
  def apply[T /* <: Widget */](action: String, closeAndCleanup: T => js.Promise[Unit], name: String, tracker: IWidgetTracker[T]): ICloseAndCleaner[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], closeAndCleanup = js.Any.fromFunction1(closeAndCleanup), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloseAndCleaner[T]]
  }
  
  @scala.inline
  implicit class ICloseAndCleanerOps[Self <: ICloseAndCleaner[_], T /* <: Widget */] (val x: Self with ICloseAndCleaner[T]) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseAndCleanup(value: T => js.Promise[Unit]): Self = this.set("closeAndCleanup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
