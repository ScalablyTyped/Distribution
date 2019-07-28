package typings.atMaterialSelect.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSelectAdapter extends js.Object {
  def activateBottomLine(): Unit
  def addClass(className: String): Unit
  def deactivateBottomLine(): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def floatLabel(value: Boolean): Unit
  def getSelectedIndex(): Double
  def getValue(): String
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setDisabled(disabled: Boolean): Unit
  def setSelectedIndex(index: Double): Unit
  def setValue(value: String): Unit
}

object MDCSelectAdapter {
  @scala.inline
  def apply(
    activateBottomLine: () => Unit,
    addClass: String => Unit,
    deactivateBottomLine: () => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    floatLabel: Boolean => Unit,
    getSelectedIndex: () => Double,
    getValue: () => String,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    setDisabled: Boolean => Unit,
    setSelectedIndex: Double => Unit,
    setValue: String => Unit
  ): MDCSelectAdapter = {
    val __obj = js.Dynamic.literal(activateBottomLine = js.Any.fromFunction0(activateBottomLine), addClass = js.Any.fromFunction1(addClass), deactivateBottomLine = js.Any.fromFunction0(deactivateBottomLine), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), floatLabel = js.Any.fromFunction1(floatLabel), getSelectedIndex = js.Any.fromFunction0(getSelectedIndex), getValue = js.Any.fromFunction0(getValue), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), setDisabled = js.Any.fromFunction1(setDisabled), setSelectedIndex = js.Any.fromFunction1(setSelectedIndex), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[MDCSelectAdapter]
  }
}

