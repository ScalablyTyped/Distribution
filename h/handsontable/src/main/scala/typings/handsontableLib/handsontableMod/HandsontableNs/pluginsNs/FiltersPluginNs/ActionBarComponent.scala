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
    accept: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Boolean],
    elements: js.Array[_],
    getMenuItemDescriptor: js.Function0[js.Object],
    hidden: scala.Boolean,
    hide: js.Function0[scala.Unit],
    isHidden: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit]
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal(accept = accept, cancel = cancel, destroy = destroy, elements = elements, getMenuItemDescriptor = getMenuItemDescriptor, hidden = hidden, hide = hide, isHidden = isHidden, reset = reset, show = show)
  
    __obj.asInstanceOf[ActionBarComponent]
  }
}

