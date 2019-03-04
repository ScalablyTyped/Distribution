package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectionHandles extends Base {
  var dragged: js.Array[_]
  var eventManager: EventManager
  var lastSetCell: stdLib.HTMLElement | scala.Unit
  def getCurrentRangeCoords(
    selectedRange: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    currentTouch: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords,
    touchStartDirection: java.lang.String,
    currentDirection: java.lang.String,
    draggedHandle: java.lang.String
  ): js.Object
  def isDragged(): scala.Boolean
}

object MultipleSelectionHandles {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    dragged: js.Array[_],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    getCurrentRangeCoords: js.Function5[
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      js.Object
    ],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isDragged: js.Function0[scala.Boolean],
    isPluginsReady: scala.Boolean,
    lastSetCell: stdLib.HTMLElement | scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit]
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, dragged = dragged, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, getCurrentRangeCoords = getCurrentRangeCoords, init = init, initialized = initialized, isDragged = isDragged, isPluginsReady = isPluginsReady, lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook)
  
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
}

