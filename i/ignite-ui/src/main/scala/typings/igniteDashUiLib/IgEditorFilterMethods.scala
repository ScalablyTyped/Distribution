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
    destroy: js.Function0[scala.Unit],
    exitEditMode: js.Function0[scala.Unit],
    hasInvalidMessage: js.Function0[scala.Unit],
    remove: js.Function0[scala.Unit],
    setFocus: js.Function2[js.Object, js.Object, scala.Unit],
    validator: js.Function0[scala.Unit]
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy, exitEditMode = exitEditMode, hasInvalidMessage = hasInvalidMessage, remove = remove, setFocus = setFocus, validator = validator)
  
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
}

