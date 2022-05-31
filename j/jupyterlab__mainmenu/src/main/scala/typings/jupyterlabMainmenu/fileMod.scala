package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.fileMod.IFileMenu.ICloseAndCleaner
import typings.jupyterlabMainmenu.fileMod.IFileMenu.IConsoleCreator
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
  - typings.jupyterlabMainmenu.fileMod.IFileMenu because var conflicts: isDisposed. Inlined quitEntry, newMenu, closeAndCleaners, consoleCreators */ @JSImport("@jupyterlab/mainmenu/lib/file", "FileMenu")
  @js.native
  class FileMenu protected () extends JupyterLabMenu {
    def this(options: IOptions) = this()
    
    /**
      * The close and cleanup extension point.
      */
    val closeAndCleaners: Set[ICloseAndCleaner[Widget]] = js.native
    
    /**
      * A set storing IConsoleCreators for the Kernel menu.
      */
    val consoleCreators: Set[IConsoleCreator[Widget]] = js.native
    
    /**
      * The New submenu.
      */
    val newMenu: IJupyterLabMenu | JupyterLabMenu = js.native
    
    /**
      * Option to add a `Quit` entry in File menu
      */
    var quitEntry: Boolean = js.native
  }
  
  @js.native
  trait IFileMenu
    extends StObject
       with IJupyterLabMenu {
    
    /**
      * The close and cleanup extension point.
      */
    val closeAndCleaners: Set[ICloseAndCleaner[Widget]] = js.native
    
    /**
      * A set storing IConsoleCreators for the File menu.
      */
    val consoleCreators: Set[IConsoleCreator[Widget]] = js.native
    
    /**
      * A submenu for creating new files/launching new activities.
      */
    val newMenu: IJupyterLabMenu = js.native
    
    /**
      * Option to add a `Quit` entry in the File menu
      */
    var quitEntry: Boolean = js.native
  }
  object IFileMenu {
    
    /**
      * Interface for an activity that has some cleanup action associated
      * with it in addition to merely closing its widget in the main area.
      */
    trait ICloseAndCleaner[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * A label to use for the cleanup action.
        */
      var action: String
      
      /**
        * A function to perform the close and cleanup action.
        */
      def closeAndCleanup(widget: T): js.Promise[Unit]
      
      /**
        * A label to use for the activity that is being cleaned up.
        */
      var name: String
    }
    object ICloseAndCleaner {
      
      inline def apply[T /* <: Widget */](action: String, closeAndCleanup: T => js.Promise[Unit], name: String, tracker: IWidgetTracker[T]): ICloseAndCleaner[T] = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], closeAndCleanup = js.Any.fromFunction1(closeAndCleanup), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICloseAndCleaner[T]]
      }
      
      extension [Self <: ICloseAndCleaner[?], T /* <: Widget */](x: Self & ICloseAndCleaner[T]) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setCloseAndCleanup(value: T => js.Promise[Unit]): Self = StObject.set(x, "closeAndCleanup", js.Any.fromFunction1(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Interface for a command to create a console for an activity.
      */
    trait IConsoleCreator[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * The function to create the console.
        */
      def createConsole(widget: T): js.Promise[Unit]
      
      /**
        * A label to use for the activity for which a console is being created.
        */
      var name: String
    }
    object IConsoleCreator {
      
      inline def apply[T /* <: Widget */](createConsole: T => js.Promise[Unit], name: String, tracker: IWidgetTracker[T]): IConsoleCreator[T] = {
        val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConsoleCreator[T]]
      }
      
      extension [Self <: IConsoleCreator[?], T /* <: Widget */](x: Self & IConsoleCreator[T]) {
        
        inline def setCreateConsole(value: T => js.Promise[Unit]): Self = StObject.set(x, "createConsole", js.Any.fromFunction1(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
