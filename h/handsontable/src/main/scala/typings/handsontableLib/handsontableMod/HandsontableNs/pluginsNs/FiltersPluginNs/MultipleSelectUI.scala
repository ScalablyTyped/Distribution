package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectUI extends BaseUI {
  var clearAllUI: BaseUI
  var items: js.Array[_]
  var itemsBox: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var searchInput: InputUI
  var selectAllUI: BaseUI
  def getItems(): scala.Unit
  def isSelectedAllValues(): scala.Boolean
  def setItems(items: js.Array[_]): scala.Unit
}

object MultipleSelectUI {
  @scala.inline
  def apply(
    build: () => scala.Unit,
    buildState: scala.Boolean,
    clearAllUI: BaseUI,
    destroy: () => scala.Unit,
    element: () => stdLib.Element,
    eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    focus: () => scala.Unit,
    getItems: () => scala.Unit,
    getValue: () => js.Array[_],
    hide: () => scala.Unit,
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isBuilt: () => scala.Boolean,
    isSelectedAllValues: () => scala.Boolean,
    items: js.Array[_],
    itemsBox: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    options: js.Object,
    reset: () => scala.Unit,
    searchInput: InputUI,
    selectAllUI: BaseUI,
    setItems: js.Array[_] => scala.Unit,
    setValue: js.Any => js.Any,
    show: () => scala.Unit,
    update: () => scala.Unit
  ): MultipleSelectUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState, clearAllUI = clearAllUI, destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager, focus = js.Any.fromFunction0(focus), getItems = js.Any.fromFunction0(getItems), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot, isBuilt = js.Any.fromFunction0(isBuilt), isSelectedAllValues = js.Any.fromFunction0(isSelectedAllValues), items = items, itemsBox = itemsBox, options = options, reset = js.Any.fromFunction0(reset), searchInput = searchInput, selectAllUI = selectAllUI, setItems = js.Any.fromFunction1(setItems), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[MultipleSelectUI]
  }
}

