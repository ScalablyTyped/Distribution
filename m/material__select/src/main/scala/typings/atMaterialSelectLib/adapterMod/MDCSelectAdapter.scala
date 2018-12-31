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

