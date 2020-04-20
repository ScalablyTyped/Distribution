package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autofill extends Base {
  var addingStarted: Boolean
  var autoInsertRow: Boolean
  var directions: js.Array[String]
  var eventManager: EventManager
  var handleDraggedCells: Double
  var mouseDownOnCellCorner: Boolean
  var mouseDragOutside: Boolean
}

object Autofill {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    addingStarted: Boolean,
    autoInsertRow: Boolean,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    directions: js.Array[String],
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    handleDraggedCells: Double,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    mouseDownOnCellCorner: Boolean,
    mouseDragOutside: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): Autofill = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), addingStarted = addingStarted.asInstanceOf[js.Any], autoInsertRow = autoInsertRow.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), directions = directions.asInstanceOf[js.Any], disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], handleDraggedCells = handleDraggedCells.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], mouseDownOnCellCorner = mouseDownOnCellCorner.asInstanceOf[js.Any], mouseDragOutside = mouseDragOutside.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Autofill]
  }
}

