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
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    dragged: js.Array[_],
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    getCurrentRangeCoords: (handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, java.lang.String, java.lang.String, java.lang.String) => js.Object,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isDragged: () => scala.Boolean,
    isPluginsReady: scala.Boolean,
    lastSetCell: stdLib.HTMLElement | scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), dragged = dragged, enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getCurrentRangeCoords = js.Any.fromFunction5(getCurrentRangeCoords), init = js.Any.fromFunction0(init), initialized = initialized, isDragged = js.Any.fromFunction0(isDragged), isPluginsReady = isPluginsReady, lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook))
  
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
}

