package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
import typings.handsontable.handsontableMod.Handsontable.plugins.Menu
import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectUI extends BaseUI {
  var items: js.Array[_]
  var menu: Menu | Unit
  def closeOptions(): Unit
  def openOptions(): Unit
  def setItems(items: js.Array[_]): Unit
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
}

