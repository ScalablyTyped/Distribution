package typings.luminoWidgets.focustrackerMod

import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.focustrackerMod.FocusTracker.IChangedArgs
import typings.luminoWidgets.widgetMod.Widget
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/focustracker", "FocusTracker")
@js.native
/**
  * Construct a new focus tracker.
  */
class FocusTracker_[T /* <: Widget */] () extends IDisposable {
  
  var _activeChanged: js.Any = js.native
  
  var _activeWidget: js.Any = js.native
  
  var _counter: js.Any = js.native
  
  var _currentChanged: js.Any = js.native
  
  var _currentWidget: js.Any = js.native
  
  /**
    * Handle the `'blur'` event for a tracked widget.
    */
  var _evtBlur: js.Any = js.native
  
  /**
    * Handle the `'focus'` event for a tracked widget.
    */
  var _evtFocus: js.Any = js.native
  
  var _nodes: js.Any = js.native
  
  var _numbers: js.Any = js.native
  
  /**
    * Handle the `disposed` signal for a tracked widget.
    */
  var _onWidgetDisposed: js.Any = js.native
  
  /**
    * Set the current and active widgets for the tracker.
    */
  var _setWidgets: js.Any = js.native
  
  var _widgets: js.Any = js.native
  
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
