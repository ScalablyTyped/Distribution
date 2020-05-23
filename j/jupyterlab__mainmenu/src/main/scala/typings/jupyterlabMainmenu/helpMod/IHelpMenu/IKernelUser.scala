package typings.jupyterlabMainmenu.helpMod.IHelpMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Kernel user to register itself
  * with the IHelpMenu's semantic extension points.
  */
trait IKernelUser[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A function to get the kernel for a widget.
    */
  def getKernel(widget: T): IKernelConnection | Null
}

object IKernelUser {
  @scala.inline
  def apply[T](
    getKernel: T => IKernelConnection | Null,
    tracker: IWidgetTracker[T],
    isEnabled: T => Boolean = null
  ): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(getKernel = js.Any.fromFunction1(getKernel), tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IKernelUser[T]]
  }
}

