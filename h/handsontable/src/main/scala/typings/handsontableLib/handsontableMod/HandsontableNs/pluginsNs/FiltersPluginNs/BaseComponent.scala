package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComponent extends js.Object {
  var elements: js.Array[_]
  var hidden: scala.Boolean
  def destroy(): scala.Boolean
  def hide(): scala.Unit
  def isHidden(): scala.Boolean
  def reset(): scala.Unit
  def show(): scala.Unit
}

object BaseComponent {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Boolean],
    elements: js.Array[_],
    hidden: scala.Boolean,
    hide: js.Function0[scala.Unit],
    isHidden: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit]
  ): BaseComponent = {
    val __obj = js.Dynamic.literal(destroy = destroy, elements = elements, hidden = hidden, hide = hide, isHidden = isHidden, reset = reset, show = show)
  
    __obj.asInstanceOf[BaseComponent]
  }
}

