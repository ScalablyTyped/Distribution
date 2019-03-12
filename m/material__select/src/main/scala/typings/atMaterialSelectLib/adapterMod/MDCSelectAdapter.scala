package typings
package atMaterialSelectLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSelectAdapter extends js.Object {
  def activateBottomLine(): scala.Unit
  def addClass(className: java.lang.String): scala.Unit
  def deactivateBottomLine(): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def floatLabel(value: scala.Boolean): scala.Unit
  def getSelectedIndex(): scala.Double
  def getValue(): java.lang.String
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def setDisabled(disabled: scala.Boolean): scala.Unit
  def setSelectedIndex(index: scala.Double): scala.Unit
  def setValue(value: java.lang.String): scala.Unit
}

object MDCSelectAdapter {
  @scala.inline
  def apply(
    activateBottomLine: () => scala.Unit,
    addClass: java.lang.String => scala.Unit,
    deactivateBottomLine: () => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    floatLabel: scala.Boolean => scala.Unit,
    getSelectedIndex: () => scala.Double,
    getValue: () => java.lang.String,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    setDisabled: scala.Boolean => scala.Unit,
    setSelectedIndex: scala.Double => scala.Unit,
    setValue: java.lang.String => scala.Unit
  ): MDCSelectAdapter = {
    val __obj = js.Dynamic.literal(activateBottomLine = js.Any.fromFunction0(activateBottomLine), addClass = js.Any.fromFunction1(addClass), deactivateBottomLine = js.Any.fromFunction0(deactivateBottomLine), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), floatLabel = js.Any.fromFunction1(floatLabel), getSelectedIndex = js.Any.fromFunction0(getSelectedIndex), getValue = js.Any.fromFunction0(getValue), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), setDisabled = js.Any.fromFunction1(setDisabled), setSelectedIndex = js.Any.fromFunction1(setSelectedIndex), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[MDCSelectAdapter]
  }
}

