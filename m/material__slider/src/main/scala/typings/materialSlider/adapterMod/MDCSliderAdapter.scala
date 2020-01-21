package typings.materialSlider.adapterMod

import typings.std.ClientRect
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSliderAdapter extends js.Object {
  def addClass(className: String): Unit
  def appendTrackMarkers(numMarkers: Double): Unit
  def computeBoundingRect(): ClientRect
  def deregisterBodyInteractionHandler(`type`: String, handler: EventListener): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def deregisterThumbContainerInteractionHandler(`type`: String, handler: EventListener): Unit
  def getAttribute(name: String): String | Null
  def getTabIndex(): Double
  def hasClass(className: String): Boolean
  def isRTL(): Boolean
  def notifyChange(): Unit
  def notifyInput(): Unit
  def registerBodyInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def registerThumbContainerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeAttribute(name: String): Unit
  def removeClass(className: String): Unit
  def removeTrackMarkers(): Unit
  def setAttribute(name: String, value: String): Unit
  def setLastTrackMarkersStyleProperty(propertyName: String, value: String): Unit
  def setMarkerValue(value: Double): Unit
  def setThumbContainerStyleProperty(propertyName: String, value: String): Unit
  def setTrackStyleProperty(propertyName: String, value: String): Unit
}

object MDCSliderAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    appendTrackMarkers: Double => Unit,
    computeBoundingRect: () => ClientRect,
    deregisterBodyInteractionHandler: (String, EventListener) => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    deregisterResizeHandler: EventListener => Unit,
    deregisterThumbContainerInteractionHandler: (String, EventListener) => Unit,
    getAttribute: String => String | Null,
    getTabIndex: () => Double,
    hasClass: String => Boolean,
    isRTL: () => Boolean,
    notifyChange: () => Unit,
    notifyInput: () => Unit,
    registerBodyInteractionHandler: (String, EventListener) => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    registerResizeHandler: EventListener => Unit,
    registerThumbContainerInteractionHandler: (String, EventListener) => Unit,
    removeAttribute: String => Unit,
    removeClass: String => Unit,
    removeTrackMarkers: () => Unit,
    setAttribute: (String, String) => Unit,
    setLastTrackMarkersStyleProperty: (String, String) => Unit,
    setMarkerValue: Double => Unit,
    setThumbContainerStyleProperty: (String, String) => Unit,
    setTrackStyleProperty: (String, String) => Unit
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), appendTrackMarkers = js.Any.fromFunction1(appendTrackMarkers), computeBoundingRect = js.Any.fromFunction0(computeBoundingRect), deregisterBodyInteractionHandler = js.Any.fromFunction2(deregisterBodyInteractionHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterThumbContainerInteractionHandler = js.Any.fromFunction2(deregisterThumbContainerInteractionHandler), getAttribute = js.Any.fromFunction1(getAttribute), getTabIndex = js.Any.fromFunction0(getTabIndex), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyChange = js.Any.fromFunction0(notifyChange), notifyInput = js.Any.fromFunction0(notifyInput), registerBodyInteractionHandler = js.Any.fromFunction2(registerBodyInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerThumbContainerInteractionHandler = js.Any.fromFunction2(registerThumbContainerInteractionHandler), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), removeTrackMarkers = js.Any.fromFunction0(removeTrackMarkers), setAttribute = js.Any.fromFunction2(setAttribute), setLastTrackMarkersStyleProperty = js.Any.fromFunction2(setLastTrackMarkersStyleProperty), setMarkerValue = js.Any.fromFunction1(setMarkerValue), setThumbContainerStyleProperty = js.Any.fromFunction2(setThumbContainerStyleProperty), setTrackStyleProperty = js.Any.fromFunction2(setTrackStyleProperty))
  
    __obj.asInstanceOf[MDCSliderAdapter]
  }
}

