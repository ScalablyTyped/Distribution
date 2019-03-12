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
    destroy: () => scala.Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    getMultipleSelectElement: () => MultipleSelectUI,
    getState: () => js.Object,
    hidden: scala.Boolean,
    hide: () => scala.Unit,
    isHidden: () => scala.Boolean,
    reset: () => scala.Unit,
    setState: js.Object => scala.Unit,
    show: () => scala.Unit,
    updateState: js.Object => scala.Unit
  ): ValueComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements, getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), getMultipleSelectElement = js.Any.fromFunction0(getMultipleSelectElement), getState = js.Any.fromFunction0(getState), hidden = hidden, hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), show = js.Any.fromFunction0(show), updateState = js.Any.fromFunction1(updateState))
  
    __obj.asInstanceOf[ValueComponent]
  }
}

