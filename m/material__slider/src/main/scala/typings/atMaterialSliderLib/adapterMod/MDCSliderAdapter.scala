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
    addClass: js.Function1[java.lang.String, scala.Unit],
    appendTrackMarkers: js.Function1[scala.Double, scala.Unit],
    computeBoundingRect: js.Function0[stdLib.ClientRect],
    deregisterBodyInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterThumbContainerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    getAttribute: js.Function1[java.lang.String, java.lang.String | scala.Null],
    getTabIndex: js.Function0[scala.Double],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    isRTL: js.Function0[scala.Boolean],
    notifyChange: js.Function0[scala.Unit],
    notifyInput: js.Function0[scala.Unit],
    registerBodyInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerThumbContainerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeAttribute: js.Function1[java.lang.String, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    removeTrackMarkers: js.Function0[scala.Unit],
    setAttribute: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setLastTrackMarkersStyleProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setMarkerValue: js.Function1[scala.Double, scala.Unit],
    setThumbContainerStyleProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setTrackStyleProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("appendTrackMarkers")(appendTrackMarkers)
    __obj.updateDynamic("computeBoundingRect")(computeBoundingRect)
    __obj.updateDynamic("deregisterBodyInteractionHandler")(deregisterBodyInteractionHandler)
    __obj.updateDynamic("deregisterInteractionHandler")(deregisterInteractionHandler)
    __obj.updateDynamic("deregisterResizeHandler")(deregisterResizeHandler)
    __obj.updateDynamic("deregisterThumbContainerInteractionHandler")(deregisterThumbContainerInteractionHandler)
    __obj.updateDynamic("getAttribute")(getAttribute)
    __obj.updateDynamic("getTabIndex")(getTabIndex)
    __obj.updateDynamic("hasClass")(hasClass)
    __obj.updateDynamic("isRTL")(isRTL)
    __obj.updateDynamic("notifyChange")(notifyChange)
    __obj.updateDynamic("notifyInput")(notifyInput)
    __obj.updateDynamic("registerBodyInteractionHandler")(registerBodyInteractionHandler)
    __obj.updateDynamic("registerInteractionHandler")(registerInteractionHandler)
    __obj.updateDynamic("registerResizeHandler")(registerResizeHandler)
    __obj.updateDynamic("registerThumbContainerInteractionHandler")(registerThumbContainerInteractionHandler)
    __obj.updateDynamic("removeAttribute")(removeAttribute)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("removeTrackMarkers")(removeTrackMarkers)
    __obj.updateDynamic("setAttribute")(setAttribute)
    __obj.updateDynamic("setLastTrackMarkersStyleProperty")(setLastTrackMarkersStyleProperty)
    __obj.updateDynamic("setMarkerValue")(setMarkerValue)
    __obj.updateDynamic("setThumbContainerStyleProperty")(setThumbContainerStyleProperty)
    __obj.updateDynamic("setTrackStyleProperty")(setTrackStyleProperty)
    __obj.asInstanceOf[MDCSliderAdapter]
  }
}

