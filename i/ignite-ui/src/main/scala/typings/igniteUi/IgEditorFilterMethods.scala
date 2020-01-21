package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgEditorFilterMethods extends js.Object {
  def destroy(): Unit
  def exitEditMode(): Unit
  def hasInvalidMessage(): Unit
  def remove(): Unit
  def setFocus(delay: js.Object, toggle: js.Object): Unit
  def validator(): Unit
}

object IgEditorFilterMethods {
  @scala.inline
  def apply(
    destroy: () => Unit,
    exitEditMode: () => Unit,
    hasInvalidMessage: () => Unit,
    remove: () => Unit,
    setFocus: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exitEditMode = js.Any.fromFunction0(exitEditMode), hasInvalidMessage = js.Any.fromFunction0(hasInvalidMessage), remove = js.Any.fromFunction0(remove), setFocus = js.Any.fromFunction2(setFocus), validator = js.Any.fromFunction0(validator))
  
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
}

