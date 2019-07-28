package typings.atMaterialToolbar.adapterMod

import typings.atMaterialToolbar.Anon_FlexibleExpansionRatio
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCToolbarAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def deregisterScrollHandler(handler: EventListener): Unit
  def getFirstRowElementOffsetHeight(): Double
  def getOffsetHeight(): Double
  def getViewportScrollY(): Double
  def getViewportWidth(): Double
  def hasClass(className: String): Boolean
  def notifyChange(evtData: Anon_FlexibleExpansionRatio): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def registerScrollHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setStyle(property: String, value: String): Unit
  def setStyleForFixedAdjustElement(property: String, value: String): Unit
  def setStyleForFlexibleRowElement(property: String, value: String): Unit
  def setStyleForTitleElement(property: String, value: String): Unit
}

object MDCToolbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterResizeHandler: EventListener => Unit,
    deregisterScrollHandler: EventListener => Unit,
    getFirstRowElementOffsetHeight: () => Double,
    getOffsetHeight: () => Double,
    getViewportScrollY: () => Double,
    getViewportWidth: () => Double,
    hasClass: String => Boolean,
    notifyChange: Anon_FlexibleExpansionRatio => Unit,
    registerResizeHandler: EventListener => Unit,
    registerScrollHandler: EventListener => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit,
    setStyleForFixedAdjustElement: (String, String) => Unit,
    setStyleForFlexibleRowElement: (String, String) => Unit,
    setStyleForTitleElement: (String, String) => Unit
  ): MDCToolbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getFirstRowElementOffsetHeight = js.Any.fromFunction0(getFirstRowElementOffsetHeight), getOffsetHeight = js.Any.fromFunction0(getOffsetHeight), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle), setStyleForFixedAdjustElement = js.Any.fromFunction2(setStyleForFixedAdjustElement), setStyleForFlexibleRowElement = js.Any.fromFunction2(setStyleForFlexibleRowElement), setStyleForTitleElement = js.Any.fromFunction2(setStyleForTitleElement))
  
    __obj.asInstanceOf[MDCToolbarAdapter]
  }
}

