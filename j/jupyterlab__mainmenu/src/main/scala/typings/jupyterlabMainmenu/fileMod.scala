package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.fileMod.IFileMenu.ICloseAndCleaner
import typings.jupyterlabMainmenu.fileMod.IFileMenu.IConsoleCreator
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

object fileMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/file", "FileMenu")
  @js.native
  open class FileMenu protected ()
    extends RankedMenu
       with IFileMenu {
    def this(options: IOptions) = this()
    
    /* private */ var _newMenu: Any = js.native
    
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
      * The New submenu.
      */
    @JSName("newMenu")
    def newMenu_MFileMenu: RankedMenu = js.native
    
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
      
      extension [Self <: ICloseAndCleaner[?], T /* <: Widget */](x: Self & ICloseAndCleaner[T]) {
        
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
      
      extension [Self <: IConsoleCreator[?], T /* <: Widget */](x: Self & IConsoleCreator[T]) {
        
        inline def setCreateConsole(value: T => js.Promise[Unit]): Self = StObject.set(x, "createConsole", js.Any.fromFunction1(value))
        
        inline def setCreateConsoleLabel(value: /* n */ Double => String): Self = StObject.set(x, "createConsoleLabel", js.Any.fromFunction1(value))
        
        inline def setCreateConsoleLabelUndefined: Self = StObject.set(x, "createConsoleLabel", js.undefined)
      }
    }
  }
}
