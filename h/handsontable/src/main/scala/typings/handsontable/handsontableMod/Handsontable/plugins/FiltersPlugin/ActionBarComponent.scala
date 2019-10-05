package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarComponent extends BaseComponent {
  def accept(): Unit
  def cancel(): Unit
  def getMenuItemDescriptor(): js.Object
}

object ActionBarComponent {
  @scala.inline
  def apply(
    accept: () => Unit,
    cancel: () => Unit,
    destroy: () => Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    show: () => Unit
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), elements = elements, getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), hidden = hidden, hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[ActionBarComponent]
  }
}

