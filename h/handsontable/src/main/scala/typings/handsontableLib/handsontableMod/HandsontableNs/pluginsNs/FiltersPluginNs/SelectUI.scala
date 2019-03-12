package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectUI extends BaseUI {
  var items: js.Array[_]
  var menu: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Menu | scala.Unit
  def closeOptions(): scala.Unit
  def openOptions(): scala.Unit
  def setItems(items: js.Array[_]): scala.Unit
}

object SelectUI {
  @scala.inline
  def apply(
    build: () => scala.Unit,
    buildState: scala.Boolean,
    closeOptions: () => scala.Unit,
    destroy: () => scala.Unit,
    element: () => stdLib.Element,
    eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    focus: () => scala.Unit,
    getValue: () => js.Any,
    hide: () => scala.Unit,
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isBuilt: () => scala.Boolean,
    items: js.Array[_],
    menu: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Menu | scala.Unit,
    openOptions: () => scala.Unit,
    options: js.Object,
    reset: () => scala.Unit,
    setItems: js.Array[_] => scala.Unit,
    setValue: js.Any => js.Any,
    show: () => scala.Unit,
    update: () => scala.Unit
  ): SelectUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState, closeOptions = js.Any.fromFunction0(closeOptions), destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager, focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot, isBuilt = js.Any.fromFunction0(isBuilt), items = items, menu = menu.asInstanceOf[js.Any], openOptions = js.Any.fromFunction0(openOptions), options = options, reset = js.Any.fromFunction0(reset), setItems = js.Any.fromFunction1(setItems), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[SelectUI]
  }
}

