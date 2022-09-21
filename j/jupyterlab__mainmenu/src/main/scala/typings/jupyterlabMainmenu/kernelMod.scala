package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.kernelMod.IKernelMenu.IKernelUser
import typings.jupyterlabMainmenu.tokensMod.IMenuExtender
import typings.jupyterlabUiComponents.menuMod.IRankedMenu
import typings.jupyterlabUiComponents.menuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/kernel", "KernelMenu")
  @js.native
  open class KernelMenu protected ()
    extends RankedMenu
       with IKernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* InferMemberOverrides */
    override val isDisposed: Boolean = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
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
      
      extension [Self <: IKernelUser[?], T /* <: Widget */](x: Self & IKernelUser[T]) {
        
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
