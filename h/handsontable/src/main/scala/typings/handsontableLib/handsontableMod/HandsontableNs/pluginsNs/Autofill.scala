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
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    addingStarted: scala.Boolean,
    autoInsertRow: scala.Boolean,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    directions: js.Array[java.lang.String],
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    handleDraggedCells: scala.Double,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    mouseDownOnCellCorner: scala.Boolean,
    mouseDragOutside: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit
  ): Autofill = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), addingStarted = addingStarted, autoInsertRow = autoInsertRow, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), directions = directions, disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, handleDraggedCells = handleDraggedCells, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, mouseDownOnCellCorner = mouseDownOnCellCorner, mouseDragOutside = mouseDragOutside, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[Autofill]
  }
}

