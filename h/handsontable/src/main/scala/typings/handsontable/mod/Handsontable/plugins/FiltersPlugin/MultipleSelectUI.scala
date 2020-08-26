package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.mod.Handsontable.plugins.EventManager
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleSelectUI extends BaseUI {
  var clearAllUI: BaseUI = js.native
  var items: js.Array[_] = js.native
  var itemsBox: Core = js.native
  var searchInput: InputUI = js.native
  var selectAllUI: BaseUI = js.native
  def getItems(): Unit = js.native
  def isSelectedAllValues(): Boolean = js.native
  def setItems(items: js.Array[_]): Unit = js.native
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
  @scala.inline
  implicit class MultipleSelectUIOps[Self <: MultipleSelectUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearAllUI(value: BaseUI): Self = this.set("clearAllUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetItems(value: () => Unit): Self = this.set("getItems", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSelectedAllValues(value: () => Boolean): Self = this.set("isSelectedAllValues", js.Any.fromFunction0(value))
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsBox(value: Core): Self = this.set("itemsBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchInput(value: InputUI): Self = this.set("searchInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAllUI(value: BaseUI): Self = this.set("selectAllUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetItems(value: js.Array[_] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
  }
  
}

