package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typings.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typings.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
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

object editMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/edit", "EditMenu")
  @js.native
  open class EditMenu protected ()
    extends RankedMenu
       with IEditMenu {
    /**
      * Construct the edit menu.
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
  trait IEditMenu
    extends StObject
       with IRankedMenu {
    
    /**
      * A set storing IClearers for the Edit menu.
      */
    val clearers: Set[IClearer[Widget]] = js.native
    
    /**
      * A set storing IGoToLiners for the Edit menu.
      */
    val goToLiners: Set[IGoToLiner[Widget]] = js.native
    
    /**
      * A set storing IUndoers for the Edit menu.
      */
    val undoers: Set[IUndoer[Widget]] = js.native
  }
  object IEditMenu {
    
    /**
      * Interface for an activity that wants to register a 'Clear...' menu item
      */
    trait IClearer[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * A function to clear all of an activity.
        */
      var clearAll: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * A function to create the label for the `clearAll`action.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var clearAllLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
      /**
        * A function to clear the currently portion of activity.
        */
      var clearCurrent: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * A function to create the label for the `clearCurrent`action.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var clearCurrentLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
    }
    object IClearer {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IClearer[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IClearer[T]]
      }
      
      extension [Self <: IClearer[?], T /* <: Widget */](x: Self & IClearer[T]) {
        
        inline def setClearAll(value: /* widget */ T => Unit): Self = StObject.set(x, "clearAll", js.Any.fromFunction1(value))
        
        inline def setClearAllLabel(value: /* n */ Double => String): Self = StObject.set(x, "clearAllLabel", js.Any.fromFunction1(value))
        
        inline def setClearAllLabelUndefined: Self = StObject.set(x, "clearAllLabel", js.undefined)
        
        inline def setClearAllUndefined: Self = StObject.set(x, "clearAll", js.undefined)
        
        inline def setClearCurrent(value: /* widget */ T => Unit): Self = StObject.set(x, "clearCurrent", js.Any.fromFunction1(value))
        
        inline def setClearCurrentLabel(value: /* n */ Double => String): Self = StObject.set(x, "clearCurrentLabel", js.Any.fromFunction1(value))
        
        inline def setClearCurrentLabelUndefined: Self = StObject.set(x, "clearCurrentLabel", js.undefined)
        
        inline def setClearCurrentUndefined: Self = StObject.set(x, "clearCurrent", js.undefined)
      }
    }
    
    /**
      * Interface for an activity that uses Go to Line.
      */
    trait IGoToLiner[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * Execute a go to line command for the activity.
        */
      var goToLine: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
    }
    object IGoToLiner {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IGoToLiner[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IGoToLiner[T]]
      }
      
      extension [Self <: IGoToLiner[?], T /* <: Widget */](x: Self & IGoToLiner[T]) {
        
        inline def setGoToLine(value: /* widget */ T => Unit): Self = StObject.set(x, "goToLine", js.Any.fromFunction1(value))
        
        inline def setGoToLineUndefined: Self = StObject.set(x, "goToLine", js.undefined)
      }
    }
    
    /**
      * Interface for an activity that uses Undo/Redo.
      */
    trait IUndoer[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * Execute a redo command for the activity.
        */
      var redo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * Execute an undo command for the activity.
        */
      var undo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
    }
    object IUndoer {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IUndoer[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IUndoer[T]]
      }
      
      extension [Self <: IUndoer[?], T /* <: Widget */](x: Self & IUndoer[T]) {
        
        inline def setRedo(value: /* widget */ T => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction1(value))
        
        inline def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
        
        inline def setUndo(value: /* widget */ T => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction1(value))
        
        inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
      }
    }
  }
}
