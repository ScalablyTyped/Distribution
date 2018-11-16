package typings
package atMaterialToolbarLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MDCToolbarAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterScrollHandler(handler: stdLib.EventListener): scala.Unit
  def getFirstRowElementOffsetHeight(): scala.Double
  def getOffsetHeight(): scala.Double
  def getViewportScrollY(): scala.Double
  def getViewportWidth(): scala.Double
  def hasClass(className: java.lang.String): scala.Boolean
  def notifyChange(evtData: atMaterialToolbarLib.Anon_FlexibleExpansionRatio): scala.Unit
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit
  def registerScrollHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def setStyle(property: java.lang.String, value: java.lang.String): scala.Unit
  def setStyleForFixedAdjustElement(property: java.lang.String, value: java.lang.String): scala.Unit
  def setStyleForFlexibleRowElement(property: java.lang.String, value: java.lang.String): scala.Unit
  def setStyleForTitleElement(property: java.lang.String, value: java.lang.String): scala.Unit
}

