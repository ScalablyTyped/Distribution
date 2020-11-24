package typings.jupyterlabApplication.layoutrestorerMod

import typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions
import typings.jupyterlabApplication.shellMod.ILabShell.ILayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/application/lib/layoutrestorer", "LayoutRestorer")
@js.native
class LayoutRestorer_ protected () extends ILayoutRestorer {
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
    * Fetch the layout state for the application.
    *
    * #### Notes
    * Fetching the layout relies on all widget restoration to be complete, so
    * calls to `fetch` are guaranteed to return after restoration is complete.
    */
  def fetch(): js.Promise[ILayout] = js.native
  
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  @JSName("restored")
  def restored_MLayoutRestorer_ : js.Promise[Unit] = js.native
  
  /**
    * Save the layout state for the application.
    */
  def save(data: ILayout): js.Promise[Unit] = js.native
}
