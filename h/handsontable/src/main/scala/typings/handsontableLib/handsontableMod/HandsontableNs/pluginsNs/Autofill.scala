package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autofill extends Base {
  var addingStarted: scala.Boolean
  var autoInsertRow: scala.Boolean
  var directions: js.Array[java.lang.String]
  var eventManager: EventManager
  var handleDraggedCells: scala.Double
  var mouseDownOnCellCorner: scala.Boolean
  var mouseDragOutside: scala.Boolean
}

object Autofill {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    addingStarted: scala.Boolean,
    autoInsertRow: scala.Boolean,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    directions: js.Array[java.lang.String],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    handleDraggedCells: scala.Double,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    mouseDownOnCellCorner: scala.Boolean,
    mouseDragOutside: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit]
  ): Autofill = {
    val __obj = js.Dynamic.literal(addHook = addHook, addingStarted = addingStarted, autoInsertRow = autoInsertRow, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, directions = directions, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, handleDraggedCells = handleDraggedCells, init = init, initialized = initialized, isPluginsReady = isPluginsReady, mouseDownOnCellCorner = mouseDownOnCellCorner, mouseDragOutside = mouseDragOutside, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook)
  
    __obj.asInstanceOf[Autofill]
  }
}

