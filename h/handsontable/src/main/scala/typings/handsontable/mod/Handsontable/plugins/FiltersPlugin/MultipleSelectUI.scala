package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.mod.Handsontable.plugins.EventManager
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectUI extends BaseUI {
  var clearAllUI: BaseUI
  var items: js.Array[_]
  var itemsBox: Core
  var searchInput: InputUI
  var selectAllUI: BaseUI
  def getItems(): Unit
  def isSelectedAllValues(): Boolean
  def setItems(items: js.Array[_]): Unit
}

object MultipleSelectUI {
  @scala.inline
  def apply(
    build: () => Unit,
    buildState: Boolean,
    clearAllUI: BaseUI,
    destroy: () => Unit,
    element: () => Element,
    eventManager: EventManager,
    focus: () => Unit,
    getItems: () => Unit,
    getValue: () => js.Any,
    hide: () => Unit,
    hot: Core,
    isBuilt: () => Boolean,
    isSelectedAllValues: () => Boolean,
    items: js.Array[_],
    itemsBox: Core,
    options: js.Object,
    reset: () => Unit,
    searchInput: InputUI,
    selectAllUI: BaseUI,
    setItems: js.Array[_] => Unit,
    setValue: js.Any => js.Any,
    show: () => Unit,
    update: () => Unit
  ): MultipleSelectUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], clearAllUI = clearAllUI.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getItems = js.Any.fromFunction0(getItems), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), isSelectedAllValues = js.Any.fromFunction0(isSelectedAllValues), items = items.asInstanceOf[js.Any], itemsBox = itemsBox.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), searchInput = searchInput.asInstanceOf[js.Any], selectAllUI = selectAllUI.asInstanceOf[js.Any], setItems = js.Any.fromFunction1(setItems), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[MultipleSelectUI]
  }
}

