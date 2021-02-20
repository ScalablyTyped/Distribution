package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.helpMod.IHelpMenu.IKernelUser
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
  - typings.jupyterlabMainmenu.helpMod.IHelpMenu because var conflicts: isDisposed. Inlined kernelUsers */ @JSImport("@jupyterlab/mainmenu/lib/help", "HelpMenu")
  @js.native
  class HelpMenu protected () extends JupyterLabMenu {
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
  trait IHelpMenu extends IJupyterLabMenu {
    
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
      implicit class IKernelUserMutableBuilder[Self <: IKernelUser[_], T /* <: Widget */] (val x: Self with IKernelUser[T]) extends AnyVal {
        
        @scala.inline
        def setGetKernel(value: T => IKernelConnection | Null): Self = StObject.set(x, "getKernel", js.Any.fromFunction1(value))
      }
    }
  }
}
