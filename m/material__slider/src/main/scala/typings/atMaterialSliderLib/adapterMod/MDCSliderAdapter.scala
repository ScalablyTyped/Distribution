package typings
package atMaterialSliderLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSliderAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def appendTrackMarkers(numMarkers: scala.Double): scala.Unit
  def computeBoundingRect(): stdLib.ClientRect
  def deregisterBodyInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterThumbContainerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def getAttribute(name: java.lang.String): java.lang.String | scala.Null
  def getTabIndex(): scala.Double
  def hasClass(className: java.lang.String): scala.Boolean
  def isRTL(): scala.Boolean
  def notifyChange(): scala.Unit
  def notifyInput(): scala.Unit
  def registerBodyInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit
  def registerThumbContainerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeAttribute(name: java.lang.String): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeTrackMarkers(): scala.Unit
  def setAttribute(name: java.lang.String, value: java.lang.String): scala.Unit
  def setLastTrackMarkersStyleProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit
  def setMarkerValue(value: scala.Double): scala.Unit
  def setThumbContainerStyleProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit
  def setTrackStyleProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCSliderAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    appendTrackMarkers: scala.Double => scala.Unit,
    computeBoundingRect: () => stdLib.ClientRect,
    deregisterBodyInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterResizeHandler: stdLib.EventListener => scala.Unit,
    deregisterThumbContainerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    getAttribute: java.lang.String => java.lang.String | scala.Null,
    getTabIndex: () => scala.Double,
    hasClass: java.lang.String => scala.Boolean,
    isRTL: () => scala.Boolean,
    notifyChange: () => scala.Unit,
    notifyInput: () => scala.Unit,
    registerBodyInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerResizeHandler: stdLib.EventListener => scala.Unit,
    registerThumbContainerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeAttribute: java.lang.String => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    removeTrackMarkers: () => scala.Unit,
    setAttribute: (java.lang.String, java.lang.String) => scala.Unit,
    setLastTrackMarkersStyleProperty: (java.lang.String, java.lang.String) => scala.Unit,
    setMarkerValue: scala.Double => scala.Unit,
    setThumbContainerStyleProperty: (java.lang.String, java.lang.String) => scala.Unit,
    setTrackStyleProperty: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), appendTrackMarkers = js.Any.fromFunction1(appendTrackMarkers), computeBoundingRect = js.Any.fromFunction0(computeBoundingRect), deregisterBodyInteractionHandler = js.Any.fromFunction2(deregisterBodyInteractionHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterThumbContainerInteractionHandler = js.Any.fromFunction2(deregisterThumbContainerInteractionHandler), getAttribute = js.Any.fromFunction1(getAttribute), getTabIndex = js.Any.fromFunction0(getTabIndex), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyChange = js.Any.fromFunction0(notifyChange), notifyInput = js.Any.fromFunction0(notifyInput), registerBodyInteractionHandler = js.Any.fromFunction2(registerBodyInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerThumbContainerInteractionHandler = js.Any.fromFunction2(registerThumbContainerInteractionHandler), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), removeTrackMarkers = js.Any.fromFunction0(removeTrackMarkers), setAttribute = js.Any.fromFunction2(setAttribute), setLastTrackMarkersStyleProperty = js.Any.fromFunction2(setLastTrackMarkersStyleProperty), setMarkerValue = js.Any.fromFunction1(setMarkerValue), setThumbContainerStyleProperty = js.Any.fromFunction2(setThumbContainerStyleProperty), setTrackStyleProperty = js.Any.fromFunction2(setTrackStyleProperty))
  
    __obj.asInstanceOf[MDCSliderAdapter]
  }
}

