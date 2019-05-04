package typings
package atJupyterlabApputilsLib.libInstancetrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstanceTracker[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted when the current widget changes.
    *
    * #### Notes
    * If the last widget being tracked is disposed, `null` will be emitted.
    */
  val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T | scala.Null]
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  val currentWidget: T | scala.Null
  /**
    * The number of widgets held by the tracker.
    */
  val size: scala.Double
  /**
    * A signal emitted when a widget is added.
    *
    * #### Notes
    * This signal will only fire when a widget is added to the tracker. It will
    * not fire if a widget is injected into the tracker.
    */
  val widgetAdded: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T]
  /**
    * Filter the widgets in the tracker based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  def filter(fn: js.Function1[/* widget */ T, scala.Boolean]): js.Array[T]
  /**
    * Find the first widget in the tracker that satisfies a filter function.
    *
    * @param - fn The filter function to call on each widget.
    *
    * #### Notes
    * If no widget is found, the value returned is `undefined`.
    */
  def find(fn: js.Function1[/* widget */ T, scala.Boolean]): js.UndefOr[T]
  /**
    * Iterate through each widget in the tracker.
    *
    * @param fn - The function to call on each widget.
    */
  def forEach(fn: js.Function1[/* widget */ T, scala.Unit]): scala.Unit
  /**
    * Check if this tracker has the specified widget.
    *
    * @param widget - The widget whose existence is being checked.
    */
  def has(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Boolean
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
  def inject(widget: T): scala.Unit
}

object IInstanceTracker {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IInstanceTracker[T], T | scala.Null],
    dispose: () => scala.Unit,
    filter: js.Function1[/* widget */ T, scala.Boolean] => js.Array[T],
    find: js.Function1[/* widget */ T, scala.Boolean] => js.UndefOr[T],
    forEach: js.Function1[/* widget */ T, scala.Unit] => scala.Unit,
    has: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget => scala.Boolean,
    inject: T => scala.Unit,
    isDisposed: scala.Boolean,
    size: scala.Double,
    widgetAdded: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IInstanceTracker[T], T],
    currentWidget: T = null
  ): IInstanceTracker[T] = {
    val __obj = js.Dynamic.literal(currentChanged = currentChanged, dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), inject = js.Any.fromFunction1(inject), isDisposed = isDisposed, size = size, widgetAdded = widgetAdded)
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstanceTracker[T]]
  }
}

