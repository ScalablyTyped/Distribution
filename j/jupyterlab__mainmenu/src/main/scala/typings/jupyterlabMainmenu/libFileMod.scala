package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.libFileMod.IFileMenu.ICloseAndCleaner
import typings.jupyterlabMainmenu.libFileMod.IFileMenu.IConsoleCreator
import typings.jupyterlabMainmenu.libTokensMod.IMenuExtender
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu because Already inherited
  - typings.jupyterlabMainmenu.libFileMod.IFileMenu because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/mainmenu/lib/file", "FileMenu")
  @js.native
  open class FileMenu protected () extends RankedMenu {
    def this(options: IOptions) = this()
    
    /* private */ var _newMenu: Any = js.native
    
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
    def newMenu: RankedMenu = js.native
    
    /**
      * Option to add a `Quit` entry in File menu
      */
    var quitEntry: Boolean = js.native
  }
  
  @js.native
  trait IFileMenu
    extends StObject
       with IRankedMenu {
    
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
    val newMenu: IRankedMenu = js.native
    
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
        * A function to perform the close and cleanup action.
        */
      def closeAndCleanup(widget: T): js.Promise[Unit]
      
      /**
        * A function to create the label for the `closeAndCleanup`action.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var closeAndCleanupLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
    }
    object ICloseAndCleaner {
      
      inline def apply[T /* <: Widget */](closeAndCleanup: T => js.Promise[Unit], tracker: IWidgetTracker[T]): ICloseAndCleaner[T] = {
        val __obj = js.Dynamic.literal(closeAndCleanup = js.Any.fromFunction1(closeAndCleanup), tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICloseAndCleaner[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICloseAndCleaner[?], T /* <: Widget */] (val x: Self & ICloseAndCleaner[T]) extends AnyVal {
        
        inline def setCloseAndCleanup(value: T => js.Promise[Unit]): Self = StObject.set(x, "closeAndCleanup", js.Any.fromFunction1(value))
        
        inline def setCloseAndCleanupLabel(value: /* n */ Double => String): Self = StObject.set(x, "closeAndCleanupLabel", js.Any.fromFunction1(value))
        
        inline def setCloseAndCleanupLabelUndefined: Self = StObject.set(x, "closeAndCleanupLabel", js.undefined)
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
        * A function to create the label for the `createConsole`action.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var createConsoleLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
    }
    object IConsoleCreator {
      
      inline def apply[T /* <: Widget */](createConsole: T => js.Promise[Unit], tracker: IWidgetTracker[T]): IConsoleCreator[T] = {
        val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConsoleCreator[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IConsoleCreator[?], T /* <: Widget */] (val x: Self & IConsoleCreator[T]) extends AnyVal {
        
        inline def setCreateConsole(value: T => js.Promise[Unit]): Self = StObject.set(x, "createConsole", js.Any.fromFunction1(value))
        
        inline def setCreateConsoleLabel(value: /* n */ Double => String): Self = StObject.set(x, "createConsoleLabel", js.Any.fromFunction1(value))
        
        inline def setCreateConsoleLabelUndefined: Self = StObject.set(x, "createConsoleLabel", js.undefined)
      }
    }
  }
}
