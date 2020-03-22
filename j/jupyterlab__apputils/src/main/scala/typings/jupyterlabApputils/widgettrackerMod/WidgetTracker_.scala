package typings.jupyterlabApputils.widgettrackerMod

import typings.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions
import typings.jupyterlabStatedb.interfacesMod.IRestorable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/widgettracker", "WidgetTracker")
@js.native
class WidgetTracker_[T /* <: Widget */] protected ()
  extends IWidgetTracker[T]
     with IRestorable[T, js.Any] {
  /**
    * Create a new widget tracker.
    *
    * @param options - The instantiation options for a widget tracker.
    */
  def this(options: IOptions) = this()
  var _currentChanged: js.Any = js.native
  var _focusTracker: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _pool: js.Any = js.native
  var _widgetAdded: js.Any = js.native
  var _widgetUpdated: js.Any = js.native
  /**
    * A signal emitted when the current instance changes.
    *
    * #### Notes
    * If the last instance being tracked is disposed, `null` will be emitted.
    */
  /* CompleteClass */
  override val currentChanged: ISignal[this.type, T | Null] = js.native
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  /* CompleteClass */
  override val currentWidget: T | Null = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A namespace for all tracked widgets, (e.g., `notebook`).
    */
  val namespace: String = js.native
  /**
    * A promise that settles when the collection has been restored.
    */
  /* InferMemberOverrides */
  override val restored: js.Promise[js.Any] with js.Promise[Unit] = js.native
  /**
    * The number of instances held by the tracker.
    */
  /* CompleteClass */
  override val size: Double = js.native
  /**
    * A signal emitted when a widget is added.
    */
  /* CompleteClass */
  override val widgetAdded: ISignal[this.type, T] = js.native
  /**
    * A signal emitted when a widget is updated.
    */
  /* CompleteClass */
  override val widgetUpdated: ISignal[this.type, T] = js.native
  /**
    * Add a new widget to the tracker.
    *
    * @param widget - The widget being added.
    *
    * #### Notes
    * The widget passed into the tracker is added synchronously; its existence in
    * the tracker can be checked with the `has()` method. The promise this method
    * returns resolves after the widget has been added and saved to an underlying
    * restoration connector, if one is available.
    */
  def add(widget: T): js.Promise[Unit] = js.native
  /**
    * A signal emitted when the current widget changes.
    */
  @JSName("currentChanged")
  def currentChanged_MWidgetTracker_(): ISignal[this.type, T | Null] = js.native
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  @JSName("currentWidget")
  def currentWidget_MWidgetTracker_(): T | Null = js.native
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
    * Filter the instances in the tracker based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  /* CompleteClass */
  override def filter(fn: js.Function1[T, Boolean]): js.Array[T] = js.native
  /**
    * Find the first instance in the tracker that satisfies a filter function.
    *
    * @param - fn The filter function to call on each instance.
    *
    * #### Notes
    * If nothing is found, the value returned is `undefined`.
    */
  /* CompleteClass */
  override def find(fn: js.Function1[T, Boolean]): js.UndefOr[T] = js.native
  /**
    * Iterate through each instance in the tracker.
    *
    * @param fn - The function to call on each instance.
    */
  /* CompleteClass */
  override def forEach(fn: js.Function1[T, Unit]): Unit = js.native
  /**
    * Check if this tracker has the specified instance.
    *
    * @param obj - The object whose existence is being checked.
    */
  /* CompleteClass */
  override def has(obj: Widget): Boolean = js.native
  /**
    * Inject an instance into the widget tracker without the tracker handling
    * its restoration lifecycle.
    *
    * @param obj - The instance to inject into the tracker.
    */
  /* CompleteClass */
  override def inject(obj: T): Unit = js.native
  /**
    * Test whether the tracker is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MWidgetTracker_(): Boolean = js.native
  /* protected */ def onCurrentChanged(): Unit = js.native
  /**
    * Handle the current change event.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onCurrentChanged(value: T): Unit = js.native
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  /* InferMemberOverrides */
  override def restore(options: typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[T]): js.Promise[js.Any] = js.native
  /**
    * A promise resolved when the tracker has been restored.
    */
  @JSName("restored")
  def restored_MWidgetTracker_(): js.Promise[Unit] = js.native
  /**
    * Save the restore data for a given widget.
    *
    * @param widget - The widget being saved.
    */
  def save(widget: T): js.Promise[Unit] = js.native
  /**
    * The number of widgets held by the tracker.
    */
  @JSName("size")
  def size_MWidgetTracker_(): Double = js.native
  /**
    * A signal emitted when a widget is added.
    *
    * #### Notes
    * This signal will only fire when a widget is added to the tracker. It will
    * not fire if a widget is injected into the tracker.
    */
  @JSName("widgetAdded")
  def widgetAdded_MWidgetTracker_(): ISignal[this.type, T] = js.native
  /**
    * A signal emitted when a widget is updated.
    */
  @JSName("widgetUpdated")
  def widgetUpdated_MWidgetTracker_(): ISignal[this.type, T] = js.native
}

