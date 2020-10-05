package typings.googlemaps.google.maps

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewPanorama extends MVCObject {
  var controls: js.Array[MVCArray[Node]] = js.native
  def getLinks(): js.Array[StreetViewLink] = js.native
  def getLocation(): StreetViewLocation = js.native
  def getMotionTracking(): Boolean = js.native
  def getPano(): String = js.native
  def getPhotographerPov(): StreetViewPov = js.native
  def getPosition(): LatLng = js.native
  def getPov(): StreetViewPov = js.native
  def getStatus(): StreetViewStatus = js.native
  def getVisible(): Boolean = js.native
  def getZoom(): Double = js.native
  def registerPanoProvider(provider: js.Function1[/* input */ String, StreetViewPanoramaData]): Unit = js.native
  def registerPanoProvider(provider: js.Function1[/* input */ String, StreetViewPanoramaData], opts: PanoProviderOptions): Unit = js.native
  def setLinks(links: js.Array[StreetViewLink]): Unit = js.native
  def setMotionTracking(motionTracking: Boolean): Unit = js.native
  def setOptions(options: StreetViewPanoramaOptions): Unit = js.native
  def setPano(pano: String): Unit = js.native
  def setPosition(latLng: LatLng): Unit = js.native
  def setPosition(latLng: LatLngLiteral): Unit = js.native
  def setPov(pov: StreetViewPov): Unit = js.native
  def setVisible(flag: Boolean): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
}

