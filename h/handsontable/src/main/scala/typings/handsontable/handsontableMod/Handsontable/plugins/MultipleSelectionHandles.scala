package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod.Handsontable.wot.CellCoords
import typings.handsontable.handsontableMod.Handsontable.wot.CellRange
import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectionHandles extends Base {
  var dragged: js.Array[_]
  var eventManager: EventManager
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
    eventManager: EventManager,
    getCurrentRangeCoords: (CellRange, CellCoords, String, String, String) => js.Object,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isDragged: () => Boolean,
    isPluginsReady: Boolean,
    lastSetCell: HTMLElement | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), dragged = dragged.asInstanceOf[js.Any], enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getCurrentRangeCoords = js.Any.fromFunction5(getCurrentRangeCoords), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isDragged = js.Any.fromFunction0(isDragged), isPluginsReady = isPluginsReady.asInstanceOf[js.Any], lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
}

