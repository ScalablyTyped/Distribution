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

object MDCToolbarAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    deregisterResizeHandler: stdLib.EventListener => scala.Unit,
    deregisterScrollHandler: stdLib.EventListener => scala.Unit,
    getFirstRowElementOffsetHeight: () => scala.Double,
    getOffsetHeight: () => scala.Double,
    getViewportScrollY: () => scala.Double,
    getViewportWidth: () => scala.Double,
    hasClass: java.lang.String => scala.Boolean,
    notifyChange: atMaterialToolbarLib.Anon_FlexibleExpansionRatio => scala.Unit,
    registerResizeHandler: stdLib.EventListener => scala.Unit,
    registerScrollHandler: stdLib.EventListener => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    setStyle: (java.lang.String, java.lang.String) => scala.Unit,
    setStyleForFixedAdjustElement: (java.lang.String, java.lang.String) => scala.Unit,
    setStyleForFlexibleRowElement: (java.lang.String, java.lang.String) => scala.Unit,
    setStyleForTitleElement: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCToolbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getFirstRowElementOffsetHeight = js.Any.fromFunction0(getFirstRowElementOffsetHeight), getOffsetHeight = js.Any.fromFunction0(getOffsetHeight), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle), setStyleForFixedAdjustElement = js.Any.fromFunction2(setStyleForFixedAdjustElement), setStyleForFlexibleRowElement = js.Any.fromFunction2(setStyleForFlexibleRowElement), setStyleForTitleElement = js.Any.fromFunction2(setStyleForTitleElement))
  
    __obj.asInstanceOf[MDCToolbarAdapter]
  }
}

