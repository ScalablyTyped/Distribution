package typings.jupyterlabMainmenu.helpMod.IHelpMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Kernel user to register itself
  * with the IHelpMenu's semantic extension points.
  */
@js.native
trait IKernelUser[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * A function to get the kernel for a widget.
    */
  def getKernel(widget: T): IKernelConnection | Null = js.native
}
object IKernelUser {
  
  @scala.inline
  def apply[T /* <: Widget */](getKernel: T => IKernelConnection | Null, tracker: IWidgetTracker[T]): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(getKernel = js.Any.fromFunction1(getKernel), tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelUser[T]]
  }
  
  @scala.inline
  implicit class IKernelUserOps[Self <: IKernelUser[_], T /* <: Widget */] (val x: Self with IKernelUser[T]) extends AnyVal {
    
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
    def setGetKernel(value: T => IKernelConnection | Null): Self = this.set("getKernel", js.Any.fromFunction1(value))
  }
}
