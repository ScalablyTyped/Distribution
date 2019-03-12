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
    destroy: () => scala.Boolean,
    elements: js.Array[_],
    hidden: scala.Boolean,
    hide: () => scala.Unit,
    isHidden: () => scala.Boolean,
    reset: () => scala.Unit,
    show: () => scala.Unit
  ): BaseComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements, hidden = hidden, hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[BaseComponent]
  }
}

