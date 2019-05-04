package typings
package atJupyterlabMainmenuLib.libRunMod.IRunMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that runs code, which may be
  * registered with the Run menu.
  */
trait ICodeRunner[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A string label for the thing that is being run,
    * which is used to populate the menu labels.
    */
  var noun: java.lang.String
  /**
    * A function to restart and run all the code hosted by the widget, which
    * returns a promise of whether the action was performed.
    */
  var restartAndRunAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Boolean]]] = js.undefined
  /**
    * A function to run a chunk of code.
    */
  var run: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Unit]]] = js.undefined
  /**
    * A function to run the entirety of the code hosted by the widget.
    */
  var runAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Unit]]] = js.undefined
}

object ICodeRunner {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    noun: java.lang.String,
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: T => scala.Boolean = null,
    restartAndRunAll: /* widget */ T => js.Promise[scala.Boolean] = null,
    run: /* widget */ T => js.Promise[scala.Unit] = null,
    runAll: /* widget */ T => js.Promise[scala.Unit] = null
  ): ICodeRunner[T] = {
    val __obj = js.Dynamic.literal(noun = noun, tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (restartAndRunAll != null) __obj.updateDynamic("restartAndRunAll")(js.Any.fromFunction1(restartAndRunAll))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction1(run))
    if (runAll != null) __obj.updateDynamic("runAll")(js.Any.fromFunction1(runAll))
    __obj.asInstanceOf[ICodeRunner[T]]
  }
}

