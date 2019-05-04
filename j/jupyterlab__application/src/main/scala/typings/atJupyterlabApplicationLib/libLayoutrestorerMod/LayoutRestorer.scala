package typings
package atJupyterlabApplicationLib.libLayoutrestorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/layoutrestorer", "LayoutRestorer")
@js.native
class LayoutRestorer protected () extends ILayoutRestorer {
  /**
    * Create a layout restorer.
    */
  def this(options: atJupyterlabApplicationLib.libLayoutrestorerMod.LayoutRestorerNs.IOptions) = this()
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
  var _state: js.Any = js.native
  var _trackers: js.Any = js.native
  var _widgets: js.Any = js.native
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  /* CompleteClass */
  override var restored: js.Promise[scala.Unit] = js.native
  /**
    * Add a widget to be tracked by the layout restorer.
    */
  /* CompleteClass */
  override def add(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, name: java.lang.String): scala.Unit = js.native
  /**
    * Fetch the layout state for the application.
    *
    * #### Notes
    * Fetching the layout relies on all widget restoration to be complete, so
    * calls to `fetch` are guaranteed to return after restoration is complete.
    */
  def fetch(): js.Promise[atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ILayout] = js.native
  /**
    * Restore the widgets of a particular instance tracker.
    *
    * @param tracker - The instance tracker whose widgets will be restored.
    *
    * @param options - The restoration options.
    */
  /* CompleteClass */
  override def restore(
    tracker: atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[_],
    options: atJupyterlabApplicationLib.libLayoutrestorerMod.ILayoutRestorerNs.IRestoreOptions[_]
  ): scala.Unit = js.native
  /**
    * Save the layout state for the application.
    */
  def save(data: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ILayout): js.Promise[scala.Unit] = js.native
}

