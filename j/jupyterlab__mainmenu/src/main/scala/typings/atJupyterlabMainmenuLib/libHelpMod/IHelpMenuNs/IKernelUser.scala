package typings
package atJupyterlabMainmenuLib.libHelpMod.IHelpMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Kernel user to register itself
  * with the IHelpMenu's semantic extension points.
  */
trait IKernelUser[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A function to get the kernel for a widget.
    */
  def getKernel(widget: T): atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection | scala.Null
}

object IKernelUser {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    getKernel: T => atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection | scala.Null,
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: T => scala.Boolean = null
  ): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(getKernel = js.Any.fromFunction1(getKernel), tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IKernelUser[T]]
  }
}

