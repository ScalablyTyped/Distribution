package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueComponent extends BaseComponent {
  def getMenuItemDescriptor(): js.Object
  def getMultipleSelectElement(): MultipleSelectUI
  def getState(): js.Object
  def setState(value: js.Object): scala.Unit
  def updateState(stateInfo: js.Object): scala.Unit
}

object ValueComponent {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Boolean],
    elements: js.Array[_],
    getMenuItemDescriptor: js.Function0[js.Object],
    getMultipleSelectElement: js.Function0[MultipleSelectUI],
    getState: js.Function0[js.Object],
    hidden: scala.Boolean,
    hide: js.Function0[scala.Unit],
    isHidden: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    setState: js.Function1[js.Object, scala.Unit],
    show: js.Function0[scala.Unit],
    updateState: js.Function1[js.Object, scala.Unit]
  ): ValueComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("elements")(elements)
    __obj.updateDynamic("getMenuItemDescriptor")(getMenuItemDescriptor)
    __obj.updateDynamic("getMultipleSelectElement")(getMultipleSelectElement)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("isHidden")(isHidden)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("setState")(setState)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("updateState")(updateState)
    __obj.asInstanceOf[ValueComponent]
  }
}

