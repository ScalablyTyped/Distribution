package typings
package atJupyterlabMainmenuLib.libKernelMod.IKernelMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Kernel user to register itself
  * with the IKernelMenu's semantic extension points.
  */
trait IKernelUser[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A function to change the kernel.
    */
  var changeKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Unit]]] = js.undefined
  /**
    * A function to interrupt the kernel.
    */
  var interruptKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Unit]]] = js.undefined
  /**
    * A noun to use for the restart and clear all command.
    */
  var noun: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function to restart the kernel, which
    * returns a promise of whether the kernel was restarted.
    */
  var restartKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Boolean]]] = js.undefined
  /**
    * A function to restart the kernel and clear the widget, which
    * returns a promise of whether the kernel was restarted.
    */
  var restartKernelAndClear: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Boolean]]] = js.undefined
  /**
    * A function to shut down the kernel.
    */
  var shutdownKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[scala.Unit]]] = js.undefined
}

object IKernelUser {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    changeKernel: /* widget */ T => js.Promise[scala.Unit] = null,
    interruptKernel: /* widget */ T => js.Promise[scala.Unit] = null,
    isEnabled: T => scala.Boolean = null,
    noun: java.lang.String = null,
    restartKernel: /* widget */ T => js.Promise[scala.Boolean] = null,
    restartKernelAndClear: /* widget */ T => js.Promise[scala.Boolean] = null,
    shutdownKernel: /* widget */ T => js.Promise[scala.Unit] = null
  ): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker)
    if (changeKernel != null) __obj.updateDynamic("changeKernel")(js.Any.fromFunction1(changeKernel))
    if (interruptKernel != null) __obj.updateDynamic("interruptKernel")(js.Any.fromFunction1(interruptKernel))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (noun != null) __obj.updateDynamic("noun")(noun)
    if (restartKernel != null) __obj.updateDynamic("restartKernel")(js.Any.fromFunction1(restartKernel))
    if (restartKernelAndClear != null) __obj.updateDynamic("restartKernelAndClear")(js.Any.fromFunction1(restartKernelAndClear))
    if (shutdownKernel != null) __obj.updateDynamic("shutdownKernel")(js.Any.fromFunction1(shutdownKernel))
    __obj.asInstanceOf[IKernelUser[T]]
  }
}

