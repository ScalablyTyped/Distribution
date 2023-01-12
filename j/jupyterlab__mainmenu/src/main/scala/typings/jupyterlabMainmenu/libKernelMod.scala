package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.libKernelMod.IKernelMenu.IKernelUser
import typings.jupyterlabMainmenu.libTokensMod.IMenuExtender
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu because Already inherited
  - typings.jupyterlabMainmenu.libKernelMod.IKernelMenu because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/mainmenu/lib/kernel", "KernelMenu")
  @js.native
  open class KernelMenu protected () extends RankedMenu {
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
       with IRankedMenu {
    
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
        * A function to reconnect to the kernel
        */
      var reconnectToKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
      
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
        * A function to return the label associated to the `restartKernelAndClear` action.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var restartKernelAndClearLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IKernelUser[?], T /* <: Widget */] (val x: Self & IKernelUser[T]) extends AnyVal {
        
        inline def setChangeKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "changeKernel", js.Any.fromFunction1(value))
        
        inline def setChangeKernelUndefined: Self = StObject.set(x, "changeKernel", js.undefined)
        
        inline def setInterruptKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "interruptKernel", js.Any.fromFunction1(value))
        
        inline def setInterruptKernelUndefined: Self = StObject.set(x, "interruptKernel", js.undefined)
        
        inline def setReconnectToKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "reconnectToKernel", js.Any.fromFunction1(value))
        
        inline def setReconnectToKernelUndefined: Self = StObject.set(x, "reconnectToKernel", js.undefined)
        
        inline def setRestartKernel(value: /* widget */ T => js.Promise[Boolean]): Self = StObject.set(x, "restartKernel", js.Any.fromFunction1(value))
        
        inline def setRestartKernelAndClear(value: /* widget */ T => js.Promise[Boolean]): Self = StObject.set(x, "restartKernelAndClear", js.Any.fromFunction1(value))
        
        inline def setRestartKernelAndClearLabel(value: /* n */ Double => String): Self = StObject.set(x, "restartKernelAndClearLabel", js.Any.fromFunction1(value))
        
        inline def setRestartKernelAndClearLabelUndefined: Self = StObject.set(x, "restartKernelAndClearLabel", js.undefined)
        
        inline def setRestartKernelAndClearUndefined: Self = StObject.set(x, "restartKernelAndClear", js.undefined)
        
        inline def setRestartKernelUndefined: Self = StObject.set(x, "restartKernel", js.undefined)
        
        inline def setShutdownKernel(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "shutdownKernel", js.Any.fromFunction1(value))
        
        inline def setShutdownKernelUndefined: Self = StObject.set(x, "shutdownKernel", js.undefined)
      }
    }
  }
}
