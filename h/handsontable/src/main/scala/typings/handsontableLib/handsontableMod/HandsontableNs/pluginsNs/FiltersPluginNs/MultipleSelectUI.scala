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
    build: js.Function0[scala.Unit],
    buildState: scala.Boolean,
    clearAllUI: BaseUI,
    destroy: js.Function0[scala.Unit],
    element: js.Function0[stdLib.Element],
    eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    focus: js.Function0[scala.Unit],
    getItems: js.Function0[scala.Unit],
    getValue: js.Function0[js.Array[_]],
    hide: js.Function0[scala.Unit],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isBuilt: js.Function0[scala.Boolean],
    isSelectedAllValues: js.Function0[scala.Boolean],
    items: js.Array[_],
    itemsBox: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    options: js.Object,
    reset: js.Function0[scala.Unit],
    searchInput: InputUI,
    selectAllUI: BaseUI,
    setItems: js.Function1[js.Array[_], scala.Unit],
    setValue: js.Function1[js.Any, js.Any],
    show: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): MultipleSelectUI = {
    val __obj = js.Dynamic.literal(build = build, buildState = buildState, clearAllUI = clearAllUI, destroy = destroy, element = element, eventManager = eventManager, focus = focus, getItems = getItems, getValue = getValue, hide = hide, hot = hot, isBuilt = isBuilt, isSelectedAllValues = isSelectedAllValues, items = items, itemsBox = itemsBox, options = options, reset = reset, searchInput = searchInput, selectAllUI = selectAllUI, setItems = setItems, setValue = setValue, show = show, update = update)
  
    __obj.asInstanceOf[MultipleSelectUI]
  }
}

