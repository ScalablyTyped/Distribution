package typings.jupyterlabMainmenu.fileMod.IFileMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a command to create a console for an activity.
  */
@js.native
trait IConsoleCreator[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * The function to create the console.
    */
  def createConsole(widget: T): js.Promise[Unit] = js.native
  
  /**
    * A label to use for the activity for which a console is being created.
    */
  var name: String = js.native
}
object IConsoleCreator {
  
  @scala.inline
  def apply[T /* <: Widget */](createConsole: T => js.Promise[Unit], name: String, tracker: IWidgetTracker[T]): IConsoleCreator[T] = {
    val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsoleCreator[T]]
  }
  
  @scala.inline
  implicit class IConsoleCreatorOps[Self <: IConsoleCreator[_], T /* <: Widget */] (val x: Self with IConsoleCreator[T]) extends AnyVal {
    
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
    def setCreateConsole(value: T => js.Promise[Unit]): Self = this.set("createConsole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
