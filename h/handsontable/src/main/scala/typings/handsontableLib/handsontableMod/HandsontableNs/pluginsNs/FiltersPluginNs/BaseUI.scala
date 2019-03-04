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
    build: js.Function0[scala.Unit],
    buildState: scala.Boolean,
    destroy: js.Function0[scala.Unit],
    element: js.Function0[stdLib.Element],
    eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    focus: js.Function0[scala.Unit],
    getValue: js.Function0[js.Any],
    hide: js.Function0[scala.Unit],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isBuilt: js.Function0[scala.Boolean],
    options: js.Object,
    reset: js.Function0[scala.Unit],
    setValue: js.Function1[js.Any, js.Any],
    show: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): BaseUI = {
    val __obj = js.Dynamic.literal(build = build, buildState = buildState, destroy = destroy, element = element, eventManager = eventManager, focus = focus, getValue = getValue, hide = hide, hot = hot, isBuilt = isBuilt, options = options, reset = reset, setValue = setValue, show = show, update = update)
  
    __obj.asInstanceOf[BaseUI]
  }
}

