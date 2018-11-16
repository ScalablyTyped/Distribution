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

