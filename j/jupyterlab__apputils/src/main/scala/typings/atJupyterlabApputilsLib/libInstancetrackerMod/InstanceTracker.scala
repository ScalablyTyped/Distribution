package typings
package atJupyterlabApputilsLib.libInstancetrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/instancetracker", "InstanceTracker")
@js.native
class InstanceTracker[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] protected () extends IInstanceTracker[T] {
  /**
    * Create a new instance tracker.
    *
    * @param options - The instantiation options for an instance tracker.
    */
  def this(options: atJupyterlabApputilsLib.libInstancetrackerMod.InstanceTrackerNs.IOptions) = this()
  var _currentChanged: js.Any = js.native
  var _currentWidget: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Handle the current change signal from the internal focus tracker.
    */
  var _onCurrentChanged: js.Any = js.native
  /**
    * Clean up after disposed widgets.
    */
  var _onWidgetDisposed: js.Any = js.native
  var _restore: js.Any = js.native
  var _tracker: js.Any = js.native
  var _widgetAdded: js.Any = js.native
  var _widgetUpdated: js.Any = js.native
  var _widgets: js.Any = js.native
  /**
    * A signal emitted when the current widget changes.
    *
    * #### Notes
    * If the last widget being tracked is disposed, `null` will be emitted.
    */
  /* CompleteClass */
  override val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T | scala.Null] = js.native
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  /* CompleteClass */
  override val currentWidget: T | scala.Null = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * A namespace for all tracked widgets, (e.g., `notebook`).
    */
  val namespace: java.lang.String = js.native
  /**
    * The number of widgets held by the tracker.
    */
  /* CompleteClass */
  override val size: scala.Double = js.native
  /**
    * A signal emitted when a widget is added.
    *
    * #### Notes
    * This signal will only fire when a widget is added to the tracker. It will
    * not fire if a widget is injected into the tracker.
    */
  /* CompleteClass */
  override val widgetAdded: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T] = js.native
  /**
    * A signal emitted when a widget is updated.
    */
  val widgetUpdated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T] = js.native
  /**
    * Add a new widget to the tracker.
    *
    * @param widget - The widget being added.
    */
  def add(widget: T): js.Promise[scala.Unit] = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Filter the widgets in the tracker based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  /* CompleteClass */
  override def filter(fn: js.Function1[T, scala.Boolean]): js.Array[T] = js.native
  /**
    * Find the first widget in the tracker that satisfies a filter function.
    *
    * @param - fn The filter function to call on each widget.
    *
    * #### Notes
    * If no widget is found, the value returned is `undefined`.
    */
  /* CompleteClass */
  override def find(fn: js.Function1[T, scala.Boolean]): js.UndefOr[T] = js.native
  /**
    * Iterate through each widget in the tracker.
    *
    * @param fn - The function to call on each widget.
    */
  /* CompleteClass */
  override def forEach(fn: js.Function1[T, scala.Unit]): scala.Unit = js.native
  /**
    * Check if this tracker has the specified widget.
    *
    * @param widget - The widget whose existence is being checked.
    */
  /* CompleteClass */
  override def has(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Boolean = js.native
  /**
    * Inject a foreign widget into the instance tracker.
    *
    * @param widget - The widget to inject into the tracker.
    *
    * #### Notes
    * Any widgets injected into an instance tracker will not have their state
    * saved by the tracker. The primary use case for widget injection is for a
    * plugin that offers a sub-class of an extant plugin to have its instances
    * share the same commands as the parent plugin (since most relevant commands
    * will use the `currentWidget` of the parent plugin's instance tracker). In
    * this situation, the sub-class plugin may well have its own instance tracker
    * for layout and state restoration in addition to injecting its widgets into
    * the parent plugin's instance tracker.
    */
  /* CompleteClass */
  override def inject(widget: T): scala.Unit = js.native
  /* protected */ def onCurrentChanged(): scala.Unit = js.native
  /**
    * Handle the current change event.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onCurrentChanged(value: T): scala.Unit = js.native
  /**
    * Restore the widgets in this tracker's namespace.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that resolves when restoration has completed.
    *
    * #### Notes
    * This function should almost never be invoked by client code. Its primary
    * use case is to be invoked by a layout restorer plugin that handles
    * multiple instance trackers and, when ready, asks them each to restore their
    * respective widgets.
    */
  def restore(options: atJupyterlabApputilsLib.libInstancetrackerMod.InstanceTrackerNs.IRestoreOptions[T]): js.Promise[_] = js.native
  /**
    * Save the restore data for a given widget.
    *
    * @param widget - The widget being saved.
    */
  def save(widget: T): scala.Unit = js.native
}

