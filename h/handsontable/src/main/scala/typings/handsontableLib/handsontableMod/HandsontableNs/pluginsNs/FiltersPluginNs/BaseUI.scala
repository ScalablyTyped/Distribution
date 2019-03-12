package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUI extends js.Object {
  var buildState: scala.Boolean
  var eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var options: js.Object
  def build(): scala.Unit
  def destroy(): scala.Unit
  def element(): stdLib.Element
  def focus(): scala.Unit
  def getValue(): js.Any
  def hide(): scala.Unit
  def isBuilt(): scala.Boolean
  def reset(): scala.Unit
  def setValue(value: js.Any): js.Any
  def show(): scala.Unit
  def update(): scala.Unit
}

object BaseUI {
  @scala.inline
  def apply(
    build: () => scala.Unit,
    buildState: scala.Boolean,
    destroy: () => scala.Unit,
    element: () => stdLib.Element,
    eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    focus: () => scala.Unit,
    getValue: () => js.Any,
    hide: () => scala.Unit,
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isBuilt: () => scala.Boolean,
    options: js.Object,
    reset: () => scala.Unit,
    setValue: js.Any => js.Any,
    show: () => scala.Unit,
    update: () => scala.Unit
  ): BaseUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState, destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager, focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot, isBuilt = js.Any.fromFunction0(isBuilt), options = options, reset = js.Any.fromFunction0(reset), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[BaseUI]
  }
}

