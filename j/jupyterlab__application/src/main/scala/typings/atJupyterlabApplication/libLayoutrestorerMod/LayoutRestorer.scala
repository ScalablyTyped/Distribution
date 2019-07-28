package typings.atJupyterlabApplication.libLayoutrestorerMod

import typings.atJupyterlabApplication.libLayoutrestorerMod.LayoutRestorerNs.IOptions
import typings.atJupyterlabApplication.libShellMod.ILabShellNs.ILayout
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabCoreutils.libInterfacesMod.IRestorable
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/layoutrestorer", "LayoutRestorer")
@js.native
class LayoutRestorer protected () extends ILayoutRestorer {
  /**
    * Create a layout restorer.
    */
  def this(options: IOptions) = this()
  var _connector: js.Any = js.native
  /**
    * Dehydrate a main area description into a serializable object.
    */
  var _dehydrateMainArea: js.Any = js.native
  /**
    * Dehydrate a side area description into a serializable object.
    */
  var _dehydrateSideArea: js.Any = js.native
  var _first: js.Any = js.native
  var _firstDone: js.Any = js.native
  /**
    * Handle a widget disposal.
    */
  var _onWidgetDisposed: js.Any = js.native
  var _promises: js.Any = js.native
  var _promisesDone: js.Any = js.native
  var _registry: js.Any = js.native
  /**
    * Reydrate a serialized main area description object.
    *
    * #### Notes
    * This function consumes data that can become corrupted, so it uses type
    * coercion to guarantee the dehydrated object is safely processed.
    */
  var _rehydrateMainArea: js.Any = js.native
  /**
    * Reydrate a serialized side area description object.
    *
    * #### Notes
    * This function consumes data that can become corrupted, so it uses type
    * coercion to guarantee the dehydrated object is safely processed.
    */
  var _rehydrateSideArea: js.Any = js.native
  var _restored: js.Any = js.native
  var _trackers: js.Any = js.native
  var _widgets: js.Any = js.native
  /**
    * A promise that settles when the collection has been restored.
    */
  /* CompleteClass */
  override val restored: js.Promise[js.Any] = js.native
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  /* CompleteClass */
  @JSName("restored")
  override var restored_ILayoutRestorer: js.Promise[Unit] = js.native
  /**
    * Add a widget to be tracked by the layout restorer.
    */
  /* CompleteClass */
  override def add(widget: Widget, name: String): Unit = js.native
  /**
    * Fetch the layout state for the application.
    *
    * #### Notes
    * Fetching the layout relies on all widget restoration to be complete, so
    * calls to `fetch` are guaranteed to return after restoration is complete.
    */
  def fetch(): js.Promise[ILayout] = js.native
  /**
    * Restore the objects in a given restorable collection.
    *
    * @param restorable - The restorable collection being restored.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  /* CompleteClass */
  override def restore(
    restorable: IRestorable[IObservableDisposable, js.Any],
    options: typings.atJupyterlabCoreutils.libInterfacesMod.IRestorableNs.IOptions[IObservableDisposable]
  ): js.Promise[js.Any] = js.native
  /**
    * Restore the widgets of a particular widget tracker.
    *
    * @param tracker - The widget tracker whose widgets will be restored.
    *
    * @param options - The restoration options.
    */
  /* CompleteClass */
  override def restore[T /* <: Widget */](
    tracker: WidgetTracker[T],
    options: typings.atJupyterlabCoreutils.libInterfacesMod.IRestorerNs.IOptions[T]
  ): js.Promise[_] = js.native
  /**
    * Save the layout state for the application.
    */
  def save(data: ILayout): js.Promise[Unit] = js.native
}

