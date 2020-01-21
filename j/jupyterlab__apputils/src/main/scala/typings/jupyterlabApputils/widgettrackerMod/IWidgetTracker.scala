package typings.jupyterlabApputils.widgettrackerMod

import typings.phosphorDisposable.mod.IDisposable
import typings.phosphorSignaling.mod.ISignal
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWidgetTracker[T /* <: Widget */] extends IDisposable {
  /**
    * A signal emitted when the current instance changes.
    *
    * #### Notes
    * If the last instance being tracked is disposed, `null` will be emitted.
    */
  val currentChanged: ISignal[this.type, T | Null]
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  val currentWidget: T | Null
  /**
    * A promise that is resolved when the widget tracker has been
    * restored from a serialized state.
    *
    * #### Notes
    * Most client code will not need to use this, since they can wait
    * for the whole application to restore. However, if an extension
    * wants to perform actions during the application restoration, but
    * after the restoration of another widget tracker, they can use
    * this promise.
    */
  val restored: js.Promise[Unit]
  /**
    * The number of instances held by the tracker.
    */
  val size: Double
  /**
    * A signal emitted when a widget is added.
    */
  val widgetAdded: ISignal[this.type, T]
  /**
    * A signal emitted when a widget is updated.
    */
  val widgetUpdated: ISignal[this.type, T]
  /**
    * Filter the instances in the tracker based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  def filter(fn: js.Function1[/* obj */ T, Boolean]): js.Array[T]
  /**
    * Find the first instance in the tracker that satisfies a filter function.
    *
    * @param - fn The filter function to call on each instance.
    *
    * #### Notes
    * If nothing is found, the value returned is `undefined`.
    */
  def find(fn: js.Function1[/* obj */ T, Boolean]): js.UndefOr[T]
  /**
    * Iterate through each instance in the tracker.
    *
    * @param fn - The function to call on each instance.
    */
  def forEach(fn: js.Function1[/* obj */ T, Unit]): Unit
  /**
    * Check if this tracker has the specified instance.
    *
    * @param obj - The object whose existence is being checked.
    */
  def has(obj: Widget): Boolean
  /**
    * Inject an instance into the widget tracker without the tracker handling
    * its restoration lifecycle.
    *
    * @param obj - The instance to inject into the tracker.
    */
  def inject(obj: T): Unit
}

object IWidgetTracker {
  @scala.inline
  def apply[T /* <: Widget */](
    currentChanged: ISignal[IWidgetTracker[T], T | Null],
    dispose: () => Unit,
    filter: js.Function1[/* obj */ T, Boolean] => js.Array[T],
    find: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T],
    forEach: js.Function1[/* obj */ T, Unit] => Unit,
    has: Widget => Boolean,
    inject: T => Unit,
    isDisposed: Boolean,
    restored: js.Promise[Unit],
    size: Double,
    widgetAdded: ISignal[IWidgetTracker[T], T],
    widgetUpdated: ISignal[IWidgetTracker[T], T],
    currentWidget: T = null
  ): IWidgetTracker[T] = {
    val __obj = js.Dynamic.literal(currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), inject = js.Any.fromFunction1(inject), isDisposed = isDisposed.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], widgetAdded = widgetAdded.asInstanceOf[js.Any], widgetUpdated = widgetUpdated.asInstanceOf[js.Any])
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWidgetTracker[T]]
  }
}

