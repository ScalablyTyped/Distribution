package typings.jupyterlabApputils.widgettrackerMod

import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWidgetTracker[T /* <: Widget */] extends IDisposable {
  
  /**
    * A signal emitted when the current instance changes.
    *
    * #### Notes
    * If the last instance being tracked is disposed, `null` will be emitted.
    */
  val currentChanged: ISignal[this.type, T | Null] = js.native
  
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  val currentWidget: T | Null = js.native
  
  /**
    * Filter the instances in the tracker based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  def filter(fn: js.Function1[/* obj */ T, Boolean]): js.Array[T] = js.native
  
  /**
    * Find the first instance in the tracker that satisfies a filter function.
    *
    * @param - fn The filter function to call on each instance.
    *
    * #### Notes
    * If nothing is found, the value returned is `undefined`.
    */
  def find(fn: js.Function1[/* obj */ T, Boolean]): js.UndefOr[T] = js.native
  
  /**
    * Iterate through each instance in the tracker.
    *
    * @param fn - The function to call on each instance.
    */
  def forEach(fn: js.Function1[/* obj */ T, Unit]): Unit = js.native
  
  /**
    * Check if this tracker has the specified instance.
    *
    * @param obj - The object whose existence is being checked.
    */
  def has(obj: Widget): Boolean = js.native
  
  /**
    * Inject an instance into the widget tracker without the tracker handling
    * its restoration lifecycle.
    *
    * @param obj - The instance to inject into the tracker.
    */
  def inject(obj: T): Unit = js.native
  
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
  val restored: js.Promise[Unit] = js.native
  
  /**
    * The number of instances held by the tracker.
    */
  val size: Double = js.native
  
  /**
    * A signal emitted when a widget is added.
    */
  val widgetAdded: ISignal[this.type, T] = js.native
  
  /**
    * A signal emitted when a widget is updated.
    */
  val widgetUpdated: ISignal[this.type, T] = js.native
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
    widgetUpdated: ISignal[IWidgetTracker[T], T]
  ): IWidgetTracker[T] = {
    val __obj = js.Dynamic.literal(currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), inject = js.Any.fromFunction1(inject), isDisposed = isDisposed.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], widgetAdded = widgetAdded.asInstanceOf[js.Any], widgetUpdated = widgetUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWidgetTracker[T]]
  }
  
  @scala.inline
  implicit class IWidgetTrackerOps[Self <: IWidgetTracker[_], T /* <: Widget */] (val x: Self with IWidgetTracker[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentChanged(value: ISignal[IWidgetTracker[T], T | Null]): Self = this.set("currentChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: js.Function1[/* obj */ T, Boolean] => js.Array[T]): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T]): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function1[/* obj */ T, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: Widget => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInject(value: T => Unit): Self = this.set("inject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestored(value: js.Promise[Unit]): Self = this.set("restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetAdded(value: ISignal[IWidgetTracker[T], T]): Self = this.set("widgetAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetUpdated(value: ISignal[IWidgetTracker[T], T]): Self = this.set("widgetUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidget(value: T): Self = this.set("currentWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidgetNull: Self = this.set("currentWidget", null)
  }
}
