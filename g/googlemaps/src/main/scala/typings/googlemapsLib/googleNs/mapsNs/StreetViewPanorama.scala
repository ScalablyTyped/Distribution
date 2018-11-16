package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.StreetViewPanorama")
@js.native
class StreetViewPanorama protected () extends MVCObject {
  def this(container: stdLib.Element) = this()
  def this(container: stdLib.Element, opts: StreetViewPanoramaOptions) = this()
  var controls: js.Array[MVCArray[stdLib.Node]] = js.native
  def getLinks(): js.Array[StreetViewLink] = js.native
  def getLocation(): StreetViewLocation = js.native
  def getMotionTracking(): scala.Boolean = js.native
  def getPano(): java.lang.String = js.native
  def getPhotographerPov(): StreetViewPov = js.native
  def getPosition(): LatLng = js.native
  def getPov(): StreetViewPov = js.native
  def getStatus(): StreetViewStatus = js.native
  def getVisible(): scala.Boolean = js.native
  def getZoom(): scala.Double = js.native
  def registerPanoProvider(provider: js.Function1[/* input */ java.lang.String, StreetViewPanoramaData]): scala.Unit = js.native
  def setLinks(links: js.Array[StreetViewLink]): scala.Unit = js.native
  def setMotionTracking(motionTracking: scala.Boolean): scala.Unit = js.native
  def setOptions(options: StreetViewPanoramaOptions): scala.Unit = js.native
  def setPano(pano: java.lang.String): scala.Unit = js.native
  def setPosition(latLng: LatLng): scala.Unit = js.native
  def setPosition(latLng: LatLngLiteral): scala.Unit = js.native
  def setPov(pov: StreetViewPov): scala.Unit = js.native
  def setVisible(flag: scala.Boolean): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
}

