package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.helpMod.IHelpMenu.IKernelUser
import typings.jupyterlabMainmenu.tokensMod.IMenuExtender
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabUiComponents.menuMod.IRankedMenu
import typings.jupyterlabUiComponents.menuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/help", "HelpMenu")
  @js.native
  open class HelpMenu protected ()
    extends RankedMenu
       with IHelpMenu {
    /**
      * Construct the help menu.
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
  trait IHelpMenu
    extends StObject
       with IRankedMenu {
    
    /**
      * A set of kernel users for the help menu.
      * This is used to populate additional help
      * links provided by the kernel of a widget.
      */
    val kernelUsers: Set[IKernelUser[Widget]] = js.native
  }
  object IHelpMenu {
    
    /**
      * Interface for a Kernel user to register itself
      * with the IHelpMenu's semantic extension points.
      */
    trait IKernelUser[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * A function to get the kernel for a widget.
        */
      def getKernel(widget: T): IKernelConnection | Null
    }
    object IKernelUser {
      
      inline def apply[T /* <: Widget */](getKernel: T => IKernelConnection | Null, tracker: IWidgetTracker[T]): IKernelUser[T] = {
        val __obj = js.Dynamic.literal(getKernel = js.Any.fromFunction1(getKernel), tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKernelUser[T]]
      }
      
      extension [Self <: IKernelUser[?], T /* <: Widget */](x: Self & IKernelUser[T]) {
        
        inline def setGetKernel(value: T => IKernelConnection | Null): Self = StObject.set(x, "getKernel", js.Any.fromFunction1(value))
      }
    }
  }
}
