package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.libHelpMod.IHelpMenu.IKernelUser
import typings.jupyterlabMainmenu.libTokensMod.IMenuExtender
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu because Already inherited
  - typings.jupyterlabMainmenu.libHelpMod.IHelpMenu because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/mainmenu/lib/help", "HelpMenu")
  @js.native
  open class HelpMenu protected () extends RankedMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
    
    /**
      * A set of kernel users for the help menu.
      * This is used to populate additional help
      * links provided by the kernel of a widget.
      */
    val kernelUsers: Set[IKernelUser[Widget]] = js.native
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IKernelUser[?], T /* <: Widget */] (val x: Self & IKernelUser[T]) extends AnyVal {
        
        inline def setGetKernel(value: T => IKernelConnection | Null): Self = StObject.set(x, "getKernel", js.Any.fromFunction1(value))
      }
    }
  }
}
