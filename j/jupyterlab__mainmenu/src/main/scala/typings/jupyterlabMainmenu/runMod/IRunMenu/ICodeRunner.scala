package typings.jupyterlabMainmenu.runMod.IRunMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that runs code, which may be
  * registered with the Run menu.
  */
@js.native
trait ICodeRunner[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * A string label for the thing that is being run,
    * which is used to populate the menu labels.
    */
  var noun: String = js.native
  
  /**
    * A function to restart and run all the code hosted by the widget, which
    * returns a promise of whether the action was performed.
    */
  var restartAndRunAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
  
  /**
    * A function to run a chunk of code.
    */
  var run: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
  
  /**
    * A function to run the entirety of the code hosted by the widget.
    */
  var runAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
}
object ICodeRunner {
  
  @scala.inline
  def apply[T /* <: Widget */](noun: String, tracker: IWidgetTracker[T]): ICodeRunner[T] = {
    val __obj = js.Dynamic.literal(noun = noun.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeRunner[T]]
  }
  
  @scala.inline
  implicit class ICodeRunnerOps[Self <: ICodeRunner[_], T /* <: Widget */] (val x: Self with ICodeRunner[T]) extends AnyVal {
    
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
    def setNoun(value: String): Self = this.set("noun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartAndRunAll(value: /* widget */ T => js.Promise[Boolean]): Self = this.set("restartAndRunAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestartAndRunAll: Self = this.set("restartAndRunAll", js.undefined)
    
    @scala.inline
    def setRun(value: /* widget */ T => js.Promise[Unit]): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setRunAll(value: /* widget */ T => js.Promise[Unit]): Self = this.set("runAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRunAll: Self = this.set("runAll", js.undefined)
  }
}
