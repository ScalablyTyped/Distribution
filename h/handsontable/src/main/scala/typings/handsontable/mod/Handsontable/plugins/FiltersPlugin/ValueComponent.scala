package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueComponent extends BaseComponent {
  def getMenuItemDescriptor(): js.Object
  def getMultipleSelectElement(): MultipleSelectUI
  def getState(): js.Object
  def setState(value: js.Object): Unit
  def updateState(stateInfo: js.Object): Unit
}

object ValueComponent {
  @scala.inline
  def apply(
    destroy: () => Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    getMultipleSelectElement: () => MultipleSelectUI,
    getState: () => js.Object,
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    setState: js.Object => Unit,
    show: () => Unit,
    updateState: js.Object => Unit
  ): ValueComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), getMultipleSelectElement = js.Any.fromFunction0(getMultipleSelectElement), getState = js.Any.fromFunction0(getState), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), show = js.Any.fromFunction0(show), updateState = js.Any.fromFunction1(updateState))
  
    __obj.asInstanceOf[ValueComponent]
  }
}

