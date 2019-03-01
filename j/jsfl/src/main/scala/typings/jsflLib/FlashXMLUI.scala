package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashXMLUI extends js.Object {
  def accept(): js.Any
  def cancel(): js.Any
  def get(): js.Any
  def getControlItemElement(): js.Any
  def getEnabled(): js.Any
  def getVisible(): js.Any
  def set(): js.Any
  def setControItemElement(): js.Any
  def setControItemElements(): js.Any
  def setEnabled(): js.Any
  def setVisible(): js.Any
}

object FlashXMLUI {
  @scala.inline
  def apply(
    accept: js.Function0[js.Any],
    cancel: js.Function0[js.Any],
    get: js.Function0[js.Any],
    getControlItemElement: js.Function0[js.Any],
    getEnabled: js.Function0[js.Any],
    getVisible: js.Function0[js.Any],
    set: js.Function0[js.Any],
    setControItemElement: js.Function0[js.Any],
    setControItemElements: js.Function0[js.Any],
    setEnabled: js.Function0[js.Any],
    setVisible: js.Function0[js.Any]
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getControlItemElement")(getControlItemElement)
    __obj.updateDynamic("getEnabled")(getEnabled)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("setControItemElement")(setControItemElement)
    __obj.updateDynamic("setControItemElements")(setControItemElements)
    __obj.updateDynamic("setEnabled")(setEnabled)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[FlashXMLUI]
  }
}

