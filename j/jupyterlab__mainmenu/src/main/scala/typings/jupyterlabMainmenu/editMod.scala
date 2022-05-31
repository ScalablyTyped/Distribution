package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typings.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typings.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
  - typings.jupyterlabMainmenu.editMod.IEditMenu because var conflicts: isDisposed. Inlined undoers, clearers, goToLiners */ @JSImport("@jupyterlab/mainmenu/lib/edit", "EditMenu")
  @js.native
  class EditMenu protected () extends JupyterLabMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
    
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
  
  @js.native
  trait IEditMenu
    extends StObject
       with IJupyterLabMenu {
    
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
        * A function to clear the currently portion of activity.
        */
      var clearCurrent: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * A name for the thing to be cleared, used for labeling `clearCurrent`.
        */
      var noun: js.UndefOr[String] = js.undefined
      
      /**
        * A plural name for the thing to be cleared, used for labeling `clearAll`.
        */
      var pluralNoun: js.UndefOr[String] = js.undefined
    }
    object IClearer {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IClearer[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IClearer[T]]
      }
      
      extension [Self <: IClearer[?], T /* <: Widget */](x: Self & IClearer[T]) {
        
        inline def setClearAll(value: /* widget */ T => Unit): Self = StObject.set(x, "clearAll", js.Any.fromFunction1(value))
        
        inline def setClearAllUndefined: Self = StObject.set(x, "clearAll", js.undefined)
        
        inline def setClearCurrent(value: /* widget */ T => Unit): Self = StObject.set(x, "clearCurrent", js.Any.fromFunction1(value))
        
        inline def setClearCurrentUndefined: Self = StObject.set(x, "clearCurrent", js.undefined)
        
        inline def setNoun(value: String): Self = StObject.set(x, "noun", value.asInstanceOf[js.Any])
        
        inline def setNounUndefined: Self = StObject.set(x, "noun", js.undefined)
        
        inline def setPluralNoun(value: String): Self = StObject.set(x, "pluralNoun", value.asInstanceOf[js.Any])
        
        inline def setPluralNounUndefined: Self = StObject.set(x, "pluralNoun", js.undefined)
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
