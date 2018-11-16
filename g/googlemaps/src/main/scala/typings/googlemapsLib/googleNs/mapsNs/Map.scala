package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Map")
@js.native
class Map () extends MVCObject {
  def this(mapDiv: stdLib.Element) = this()
  def this(mapDiv: scala.Null, opts: MapOptions) = this()
  def this(mapDiv: stdLib.Element, opts: MapOptions) = this()
  var controls: js.Array[MVCArray[stdLib.Node]] = js.native
  var data: Data = js.native
  var mapTypes: MapTypeRegistry = js.native
  var overlayMapTypes: MVCArray[MapType] = js.native
  def fitBounds(bounds: LatLngBounds): scala.Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral): scala.Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Padding): scala.Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: scala.Double): scala.Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Padding): scala.Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: scala.Double): scala.Unit = js.native
  def getBounds(): js.UndefOr[LatLngBounds | scala.Null] = js.native
  def getCenter(): LatLng = js.native
  def getDiv(): stdLib.Element = js.native
  def getHeading(): scala.Double = js.native
  def getMapTypeId(): MapTypeId | java.lang.String = js.native
  def getProjection(): Projection = js.native
  def getStreetView(): StreetViewPanorama = js.native
  def getTilt(): scala.Double = js.native
  def getZoom(): scala.Double = js.native
  def panBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def panTo(latLng: LatLng): scala.Unit = js.native
  def panTo(latLng: LatLngLiteral): scala.Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds): scala.Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral): scala.Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Padding): scala.Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: scala.Double): scala.Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Padding): scala.Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: scala.Double): scala.Unit = js.native
  def setCenter(latlng: LatLng): scala.Unit = js.native
  def setCenter(latlng: LatLngLiteral): scala.Unit = js.native
  def setClickableIcons(clickable: scala.Boolean): scala.Unit = js.native
  def setHeading(heading: scala.Double): scala.Unit = js.native
  def setMapTypeId(mapTypeId: MapTypeId): scala.Unit = js.native
  def setMapTypeId(mapTypeId: java.lang.String): scala.Unit = js.native
  def setOptions(options: MapOptions): scala.Unit = js.native
  def setStreetView(panorama: StreetViewPanorama): scala.Unit = js.native
  def setTilt(tilt: scala.Double): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
}

