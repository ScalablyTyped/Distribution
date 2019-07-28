package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.handsontable.handsontableMod.HandsontableNs.wotNs.CellCoords
import typings.handsontable.handsontableMod.HandsontableNs.wotNs.CellRange
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectionHandles extends Base {
  var dragged: js.Array[_]
  var eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager
  var lastSetCell: HTMLElement | Unit
  def getCurrentRangeCoords(
    selectedRange: CellRange,
    currentTouch: CellCoords,
    touchStartDirection: String,
    currentDirection: String,
    draggedHandle: String
  ): js.Object
  def isDragged(): Boolean
}

object MultipleSelectionHandles {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    dragged: js.Array[_],
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    getCurrentRangeCoords: (CellRange, CellCoords, String, String, String) => js.Object,
    init: () => Unit,
    initialized: Boolean,
    isDragged: () => Boolean,
    isPluginsReady: Boolean,
    lastSetCell: HTMLElement | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), dragged = dragged, enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getCurrentRangeCoords = js.Any.fromFunction5(getCurrentRangeCoords), init = js.Any.fromFunction0(init), initialized = initialized, isDragged = js.Any.fromFunction0(isDragged), isPluginsReady = isPluginsReady, lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
}

