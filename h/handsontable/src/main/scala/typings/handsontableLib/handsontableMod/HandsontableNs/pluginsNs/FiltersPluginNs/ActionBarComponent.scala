package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarComponent extends BaseComponent {
  def accept(): scala.Unit
  def cancel(): scala.Unit
  def getMenuItemDescriptor(): js.Object
}

object ActionBarComponent {
  @scala.inline
  def apply(
    accept: () => scala.Unit,
    cancel: () => scala.Unit,
    destroy: () => scala.Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    hidden: scala.Boolean,
    hide: () => scala.Unit,
    isHidden: () => scala.Boolean,
    reset: () => scala.Unit,
    show: () => scala.Unit
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), elements = elements, getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), hidden = hidden, hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[ActionBarComponent]
  }
}

