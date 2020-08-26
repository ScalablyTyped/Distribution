package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.mod.Handsontable.plugins.EventManager
import typings.handsontable.mod.Handsontable.plugins.Menu
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectUI extends BaseUI {
  var items: js.Array[_] = js.native
  var menu: Menu | Unit = js.native
  def closeOptions(): Unit = js.native
  def openOptions(): Unit = js.native
  def setItems(items: js.Array[_]): Unit = js.native
}

object SelectUI {
  @scala.inline
  def apply(
    build: () => Unit,
    buildState: Boolean,
    closeOptions: () => Unit,
    destroy: () => Unit,
    element: () => Element,
    eventManager: EventManager,
    focus: () => Unit,
    getValue: () => js.Any,
    hide: () => Unit,
    hot: Core,
    isBuilt: () => Boolean,
    items: js.Array[_],
    menu: Menu | Unit,
    openOptions: () => Unit,
    options: js.Object,
    reset: () => Unit,
    setItems: js.Array[_] => Unit,
    setValue: js.Any => js.Any,
    show: () => Unit,
    update: () => Unit
  ): SelectUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], closeOptions = js.Any.fromFunction0(closeOptions), destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), items = items.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], openOptions = js.Any.fromFunction0(openOptions), options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setItems = js.Any.fromFunction1(setItems), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[SelectUI]
  }
  @scala.inline
  implicit class SelectUIOps[Self <: SelectUI] (val x: Self) extends AnyVal {
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
    def setCloseOptions(value: () => Unit): Self = this.set("closeOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: Menu | Unit): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenOptions(value: () => Unit): Self = this.set("openOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setSetItems(value: js.Array[_] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
  }
  
}

