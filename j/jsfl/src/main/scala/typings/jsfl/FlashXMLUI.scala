package typings.jsfl

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
    accept: () => js.Any,
    cancel: () => js.Any,
    get: () => js.Any,
    getControlItemElement: () => js.Any,
    getEnabled: () => js.Any,
    getVisible: () => js.Any,
    set: () => js.Any,
    setControItemElement: () => js.Any,
    setControItemElements: () => js.Any,
    setEnabled: () => js.Any,
    setVisible: () => js.Any
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), get = js.Any.fromFunction0(get), getControlItemElement = js.Any.fromFunction0(getControlItemElement), getEnabled = js.Any.fromFunction0(getEnabled), getVisible = js.Any.fromFunction0(getVisible), set = js.Any.fromFunction0(set), setControItemElement = js.Any.fromFunction0(setControItemElement), setControItemElements = js.Any.fromFunction0(setControItemElements), setEnabled = js.Any.fromFunction0(setEnabled), setVisible = js.Any.fromFunction0(setVisible))
    __obj.asInstanceOf[FlashXMLUI]
  }
}

