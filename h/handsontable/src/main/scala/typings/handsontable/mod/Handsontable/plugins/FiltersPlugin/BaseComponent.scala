package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComponent extends js.Object {
  var elements: js.Array[_]
  var hidden: Boolean
  def destroy(): Boolean
  def hide(): Unit
  def isHidden(): Boolean
  def reset(): Unit
  def show(): Unit
}

object BaseComponent {
  @scala.inline
  def apply(
    destroy: () => Boolean,
    elements: js.Array[_],
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    show: () => Unit
  ): BaseComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BaseComponent]
  }
}

