package typings.jupyterlabApputils.widgettrackerMod

import typings.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions
import typings.jupyterlabStatedb.interfacesMod.IRestorable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Add a new widget to the tracker.
    *
    * @param widget - The widget being added.
    *
    * #### Notes
    * The widget passed into the tracker is added synchronously; its existence in
    * the tracker can be checked with the `has()` method. The promise this method
    * returns resolves after the widget has been added and saved to an underlying
    * restoration connector, if one is available.
    *
    * The newly added widget becomes the current widget unless the focus tracker
    * already had a focused widget.
    */
  def add(widget: T): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the current widget changes.
    */
  @JSName("currentChanged")
  def currentChanged_MWidgetTracker_ : ISignal[this.type, T | Null] = js.native
  
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  @JSName("currentWidget")
  def currentWidget_MWidgetTracker_ : T | Null = js.native
  
  /**
    * Test whether the tracker is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MWidgetTracker_ : Boolean = js.native
  
  /**
    * A namespace for all tracked widgets, (e.g., `notebook`).
    */
  val namespace: String = js.native
  
  /**
    * Handle the current change event.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onCurrentChanged(): Unit = js.native
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
    * A promise that settles when the collection has been restored.
    */
  /* InferMemberOverrides */
  override val restored: js.Promise[js.Any] with js.Promise[Unit] = js.native
  /**
    * A promise resolved when the tracker has been restored.
    */
  @JSName("restored")
  def restored_MWidgetTracker_ : js.Promise[Unit] = js.native
  
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
  def size_MWidgetTracker_ : Double = js.native
  
  /**
    * A signal emitted when a widget is added.
    *
    * #### Notes
    * This signal will only fire when a widget is added to the tracker. It will
    * not fire if a widget is injected into the tracker.
    */
  @JSName("widgetAdded")
  def widgetAdded_MWidgetTracker_ : ISignal[this.type, T] = js.native
  
  /**
    * A signal emitted when a widget is updated.
    */
  @JSName("widgetUpdated")
  def widgetUpdated_MWidgetTracker_ : ISignal[this.type, T] = js.native
}
