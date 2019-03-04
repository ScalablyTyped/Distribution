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
    val __obj = js.Dynamic.literal(destroy = destroy, elements = elements, getMenuItemDescriptor = getMenuItemDescriptor, getMultipleSelectElement = getMultipleSelectElement, getState = getState, hidden = hidden, hide = hide, isHidden = isHidden, reset = reset, setState = setState, show = show, updateState = updateState)
  
    __obj.asInstanceOf[ValueComponent]
  }
}

