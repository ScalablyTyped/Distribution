package typings
package atMaterialIconDashToggleLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MDCIconToggleAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def getAttr(name: java.lang.String): java.lang.String
  def getTabIndex(): scala.Double
  def notifyChange(evtData: IconToggleEvent): scala.Unit
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def rmAttr(name: java.lang.String): scala.Unit
  def setAttr(name: java.lang.String, value: java.lang.String): scala.Unit
  def setTabIndex(tabIndex: scala.Double): scala.Unit
  def setText(text: java.lang.String): scala.Unit
}

