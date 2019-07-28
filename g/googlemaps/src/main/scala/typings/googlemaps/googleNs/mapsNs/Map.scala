package typings.googlemaps.googleNs.mapsNs

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Map *****/
@JSGlobal("google.maps.Map")
@js.native
class Map () extends MVCObject {
  def this(mapDiv: Element) = this()
  def this(mapDiv: Null, opts: MapOptions) = this()
  def this(mapDiv: Element, opts: MapOptions) = this()
  var controls: js.Array[MVCArray[Node]] = js.native
  var data: Data = js.native
  var mapTypes: MapTypeRegistry = js.native
  var overlayMapTypes: MVCArray[MapType] = js.native
  def fitBounds(bounds: LatLngBounds): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Double): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Padding): Unit = js.native
  def getBounds(): js.UndefOr[LatLngBounds | Null] = js.native
  def getCenter(): LatLng = js.native
  def getDiv(): Element = js.native
  def getHeading(): Double = js.native
  def getMapTypeId(): MapTypeId | String = js.native
  def getProjection(): Projection | Null = js.native
  def getStreetView(): StreetViewPanorama = js.native
  def getTilt(): Double = js.native
  def getZoom(): Double = js.native
  def panBy(x: Double, y: Double): Unit = js.native
  def panTo(latLng: LatLng): Unit = js.native
  def panTo(latLng: LatLngLiteral): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Padding): Unit = js.native
  def setCenter(latlng: LatLng): Unit = js.native
  def setCenter(latlng: LatLngLiteral): Unit = js.native
  def setClickableIcons(clickable: Boolean): Unit = js.native
  def setHeading(heading: Double): Unit = js.native
  def setMapTypeId(mapTypeId: String): Unit = js.native
  def setMapTypeId(mapTypeId: MapTypeId): Unit = js.native
  def setOptions(options: MapOptions): Unit = js.native
  def setStreetView(panorama: StreetViewPanorama): Unit = js.native
  def setTilt(tilt: Double): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
}

