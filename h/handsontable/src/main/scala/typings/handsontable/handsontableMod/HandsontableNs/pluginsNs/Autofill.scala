package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autofill extends Base {
  var addingStarted: Boolean
  var autoInsertRow: Boolean
  var directions: js.Array[String]
  var eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager
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
    eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    handleDraggedCells: Double,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    mouseDownOnCellCorner: Boolean,
    mouseDragOutside: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit
  ): Autofill = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), addingStarted = addingStarted, autoInsertRow = autoInsertRow, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), directions = directions, disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, handleDraggedCells = handleDraggedCells, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, mouseDownOnCellCorner = mouseDownOnCellCorner, mouseDragOutside = mouseDragOutside, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[Autofill]
  }
}

