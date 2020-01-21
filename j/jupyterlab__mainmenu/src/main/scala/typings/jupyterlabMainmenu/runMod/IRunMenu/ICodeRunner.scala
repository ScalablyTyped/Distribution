package typings.jupyterlabMainmenu.runMod.IRunMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that runs code, which may be
  * registered with the Run menu.
  */
trait ICodeRunner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A string label for the thing that is being run,
    * which is used to populate the menu labels.
    */
  var noun: String
  /**
    * A function to restart and run all the code hosted by the widget, which
    * returns a promise of whether the action was performed.
    */
  var restartAndRunAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.undefined
  /**
    * A function to run a chunk of code.
    */
  var run: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
  /**
    * A function to run the entirety of the code hosted by the widget.
    */
  var runAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
}

object ICodeRunner {
  @scala.inline
  def apply[T /* <: Widget */](
    noun: String,
    tracker: IWidgetTracker[T],
    isEnabled: T => Boolean = null,
    restartAndRunAll: /* widget */ T => js.Promise[Boolean] = null,
    run: /* widget */ T => js.Promise[Unit] = null,
    runAll: /* widget */ T => js.Promise[Unit] = null
  ): ICodeRunner[T] = {
    val __obj = js.Dynamic.literal(noun = noun.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (restartAndRunAll != null) __obj.updateDynamic("restartAndRunAll")(js.Any.fromFunction1(restartAndRunAll))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction1(run))
    if (runAll != null) __obj.updateDynamic("runAll")(js.Any.fromFunction1(runAll))
    __obj.asInstanceOf[ICodeRunner[T]]
  }
}

