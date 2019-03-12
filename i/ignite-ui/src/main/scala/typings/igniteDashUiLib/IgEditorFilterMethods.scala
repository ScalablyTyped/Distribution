package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgEditorFilterMethods extends js.Object {
  def destroy(): scala.Unit
  def exitEditMode(): scala.Unit
  def hasInvalidMessage(): scala.Unit
  def remove(): scala.Unit
  def setFocus(delay: js.Object, toggle: js.Object): scala.Unit
  def validator(): scala.Unit
}

object IgEditorFilterMethods {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    exitEditMode: () => scala.Unit,
    hasInvalidMessage: () => scala.Unit,
    remove: () => scala.Unit,
    setFocus: (js.Object, js.Object) => scala.Unit,
    validator: () => scala.Unit
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exitEditMode = js.Any.fromFunction0(exitEditMode), hasInvalidMessage = js.Any.fromFunction0(hasInvalidMessage), remove = js.Any.fromFunction0(remove), setFocus = js.Any.fromFunction2(setFocus), validator = js.Any.fromFunction0(validator))
  
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
}

