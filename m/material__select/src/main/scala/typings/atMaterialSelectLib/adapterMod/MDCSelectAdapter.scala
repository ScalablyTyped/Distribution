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
    activateBottomLine: js.Function0[scala.Unit],
    addClass: js.Function1[java.lang.String, scala.Unit],
    deactivateBottomLine: js.Function0[scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    floatLabel: js.Function1[scala.Boolean, scala.Unit],
    getSelectedIndex: js.Function0[scala.Double],
    getValue: js.Function0[java.lang.String],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setDisabled: js.Function1[scala.Boolean, scala.Unit],
    setSelectedIndex: js.Function1[scala.Double, scala.Unit],
    setValue: js.Function1[java.lang.String, scala.Unit]
  ): MDCSelectAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateBottomLine")(activateBottomLine)
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("deactivateBottomLine")(deactivateBottomLine)
    __obj.updateDynamic("deregisterInteractionHandler")(deregisterInteractionHandler)
    __obj.updateDynamic("floatLabel")(floatLabel)
    __obj.updateDynamic("getSelectedIndex")(getSelectedIndex)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("registerInteractionHandler")(registerInteractionHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("setDisabled")(setDisabled)
    __obj.updateDynamic("setSelectedIndex")(setSelectedIndex)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[MDCSelectAdapter]
  }
}

