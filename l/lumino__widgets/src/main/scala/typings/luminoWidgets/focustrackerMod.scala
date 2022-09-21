package typings.luminoWidgets

import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.focustrackerMod.FocusTracker.IChangedArgs
import typings.luminoWidgets.widgetMod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focustrackerMod {
  
  @JSImport("@lumino/widgets/types/focustracker", "FocusTracker")
  @js.native
  open class FocusTracker[T /* <: Widget */] ()
    extends StObject
       with IDisposable {
    
    /* private */ var _activeChanged: Any = js.native
    
    /* private */ var _activeWidget: Any = js.native
    
    /* private */ var _counter: Any = js.native
    
    /* private */ var _currentChanged: Any = js.native
    
    /* private */ var _currentWidget: Any = js.native
    
    /**
      * Handle the `'blur'` event for a tracked widget.
      */
    /* private */ var _evtBlur: Any = js.native
    
    /**
      * Handle the `'focus'` event for a tracked widget.
      */
    /* private */ var _evtFocus: Any = js.native
    
    /* private */ var _nodes: Any = js.native
    
    /* private */ var _numbers: Any = js.native
    
    /**
      * Handle the `disposed` signal for a tracked widget.
      */
    /* private */ var _onWidgetDisposed: Any = js.native
    
    /**
      * Set the current and active widgets for the tracker.
      */
    /* private */ var _setWidgets: Any = js.native
    
    /* private */ var _widgets: Any = js.native
    
    /**
      * A signal emitted when the active widget has changed.
      */
    val activeChanged: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * The active widget in the tracker.
      *
      * #### Notes
      * The active widget is the widget among the tracked widgets which
      * has the *descendant node* which is currently focused.
      */
    val activeWidget: T | Null = js.native
    
    /**
      * Add a widget to the focus tracker.
      *
      * @param widget - The widget of interest.
      *
      * #### Notes
      * A widget will be automatically removed from the tracker if it
      * is disposed after being added.
      *
      * If the widget is already tracked, this is a no-op.
      */
    def add(widget: T): Unit = js.native
    
    /**
      * A signal emitted when the current widget has changed.
      */
    val currentChanged: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * The current widget in the tracker.
      *
      * #### Notes
      * The current widget is the widget among the tracked widgets which
      * has the *descendant node* which has most recently been focused.
      *
      * The current widget will not be updated if the node loses focus. It
      * will only be updated when a different tracked widget gains focus.
      *
      * If the current widget is removed from the tracker, the previous
      * current widget will be restored.
      *
      * This behavior is intended to follow a user's conceptual model of
      * a semantically "current" widget, where the "last thing of type X"
      * to be interacted with is the "current instance of X", regardless
      * of whether that instance still has focus.
      */
    val currentWidget: T | Null = js.native
    
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
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Get the focus number for a particular widget in the tracker.
      *
      * @param widget - The widget of interest.
      *
      * @returns The focus number for the given widget, or `-1` if the
      *   widget has not had focus since being added to the tracker, or
      *   is not contained by the tracker.
      *
      * #### Notes
      * The focus number indicates the relative order in which the widgets
      * have gained focus. A widget with a larger number has gained focus
      * more recently than a widget with a smaller number.
      *
      * The `currentWidget` will always have the largest focus number.
      *
      * All widgets start with a focus number of `-1`, which indicates that
      * the widget has not been focused since being added to the tracker.
      */
    def focusNumber(widget: T): Double = js.native
    
    /**
      * Handle the DOM events for the focus tracker.
      *
      * @param event - The DOM event sent to the panel.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the tracked nodes. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Test whether the focus tracker contains a given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns `true` if the widget is tracked, `false` otherwise.
      */
    def has(widget: T): Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Remove a widget from the focus tracker.
      *
      * #### Notes
      * If the widget is the `currentWidget`, the previous current widget
      * will become the new `currentWidget`.
      *
      * A widget will be automatically removed from the tracker if it
      * is disposed after being added.
      *
      * If the widget is not tracked, this is a no-op.
      */
    def remove(widget: T): Unit = js.native
    
    /**
      * A read only array of the widgets being tracked.
      */
    val widgets: js.Array[T] = js.native
  }
  object FocusTracker {
    
    /**
      * An arguments object for the changed signals.
      */
    trait IChangedArgs[T /* <: Widget */] extends StObject {
      
      /**
        * The new value for the widget.
        */
      var newValue: T | Null
      
      /**
        * The old value for the widget.
        */
      var oldValue: T | Null
    }
    object IChangedArgs {
      
      inline def apply[T /* <: Widget */](): IChangedArgs[T] = {
        val __obj = js.Dynamic.literal(newValue = null, oldValue = null)
        __obj.asInstanceOf[IChangedArgs[T]]
      }
      
      extension [Self <: IChangedArgs[?], T /* <: Widget */](x: Self & IChangedArgs[T]) {
        
        inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
        
        inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
        
        inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
        
        inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
      }
    }
  }
}
