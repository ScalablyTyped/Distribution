package typings.jupyterlabMainmenu.kernelMod.IKernelMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Kernel user to register itself
  * with the IKernelMenu's semantic extension points.
  */
@js.native
trait IKernelUser[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * A function to change the kernel.
    */
  var changeKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
  
  /**
    * A function to interrupt the kernel.
    */
  var interruptKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
  
  /**
    * A noun to use for the restart and clear all command.
    */
  var noun: js.UndefOr[String] = js.native
  
  /**
    * A function to restart the kernel, which
    * returns a promise of whether the kernel was restarted.
    */
  var restartKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
  
  /**
    * A function to restart the kernel and clear the widget, which
    * returns a promise of whether the kernel was restarted.
    */
  var restartKernelAndClear: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
  
  /**
    * A function to shut down the kernel.
    */
  var shutdownKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
}
object IKernelUser {
  
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
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
    def setChangeKernel(value: /* widget */ T => js.Promise[Unit]): Self = this.set("changeKernel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChangeKernel: Self = this.set("changeKernel", js.undefined)
    
    @scala.inline
    def setInterruptKernel(value: /* widget */ T => js.Promise[Unit]): Self = this.set("interruptKernel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInterruptKernel: Self = this.set("interruptKernel", js.undefined)
    
    @scala.inline
    def setNoun(value: String): Self = this.set("noun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoun: Self = this.set("noun", js.undefined)
    
    @scala.inline
    def setRestartKernel(value: /* widget */ T => js.Promise[Boolean]): Self = this.set("restartKernel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestartKernel: Self = this.set("restartKernel", js.undefined)
    
    @scala.inline
    def setRestartKernelAndClear(value: /* widget */ T => js.Promise[Boolean]): Self = this.set("restartKernelAndClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestartKernelAndClear: Self = this.set("restartKernelAndClear", js.undefined)
    
    @scala.inline
    def setShutdownKernel(value: /* widget */ T => js.Promise[Unit]): Self = this.set("shutdownKernel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShutdownKernel: Self = this.set("shutdownKernel", js.undefined)
  }
}
