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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildState")(buildState)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("eventManager")(eventManager)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("hot")(hot)
    __obj.updateDynamic("isBuilt")(isBuilt)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[BaseUI]
  }
}

