package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.kernelMod.IKernelMenu.IKernelUser
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
  - typings.jupyterlabMainmenu.kernelMod.IKernelMenu because var conflicts: isDisposed. Inlined kernelUsers */ @JSImport("@jupyterlab/mainmenu/lib/kernel", "KernelMenu")
  @js.native
  class KernelMenu protected () extends JupyterLabMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
    
    /**
      * A set storing IKernelUsers for the Kernel menu.
      */
    val kernelUsers: Set[IKernelUser[Widget]] = js.native
  }
  
  @js.native
  trait IKernelMenu
    extends StObject
       with IJupyterLabMenu {
    
    /**
      * A set storing IKernelUsers for the Kernel menu.
      */
    val kernelUsers: Set[IKernelUser[Widget]] = js.native
  }
  object IKernelMenu {
    
    /**
      * Interface for a Kernel user to register itself
      * with the IKernelMenu's semantic extension points.
      */
    trait IKernelUser[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * A function to change the kernel.
        */
      var changeKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
      
      /**
        * A function to interrupt the kernel.
        */
      var interruptKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
      
      /**
        * A noun to use for the restart and clear all command.
        */
      var noun: js.UndefOr[String] = js.undefined
      
      /**
        * A function to restart the kernel, which
        * returns a promise of whether the kernel was restarted.
        */
      var restartKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.undefined
      
      /**
        * A function to restart the kernel and clear the widget, which
        * returns a promise of whether the kernel was restarted.
        */
      var restartKernelAndClear: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.undefined
      
      /**
        * A function to shut down the kernel.
        */
      var shutdownKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
    }
    object IKernelUser {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IKernelUser[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKernelUser[T]]
      }
      
      extension [Self <: IKernelUser[?], T /* <: Widget */](x: Self & IKernelUser[T]) {
        
        inline def setChangeKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "changeKernel", js.Any.fromFunction1(value))
        
        inline def setChangeKernelUndefined: Self = StObject.set(x, "changeKernel", js.undefined)
        
        inline def setInterruptKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "interruptKernel", js.Any.fromFunction1(value))
        
        inline def setInterruptKernelUndefined: Self = StObject.set(x, "interruptKernel", js.undefined)
        
        inline def setNoun(value: String): Self = StObject.set(x, "noun", value.asInstanceOf[js.Any])
        
        inline def setNounUndefined: Self = StObject.set(x, "noun", js.undefined)
        
        inline def setRestartKernel(value: /* widget */ T => js.Promise[Boolean]): Self = StObject.set(x, "restartKernel", js.Any.fromFunction1(value))
        
        inline def setRestartKernelAndClear(value: /* widget */ T => js.Promise[Boolean]): Self = StObject.set(x, "restartKernelAndClear", js.Any.fromFunction1(value))
        
        inline def setRestartKernelAndClearUndefined: Self = StObject.set(x, "restartKernelAndClear", js.undefined)
        
        inline def setRestartKernelUndefined: Self = StObject.set(x, "restartKernel", js.undefined)
        
        inline def setShutdownKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "shutdownKernel", js.Any.fromFunction1(value))
        
        inline def setShutdownKernelUndefined: Self = StObject.set(x, "shutdownKernel", js.undefined)
      }
    }
  }
}
