package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Marker")
@js.native
class Marker () extends MVCObject {
  def this(opts: MarkerOptions) = this()
  def getAnimation(): Animation = js.native
  def getAttribution(): Attribution = js.native
  def getClickable(): scala.Boolean = js.native
  def getCursor(): java.lang.String = js.native
  def getDraggable(): scala.Boolean = js.native
  def getIcon(): java.lang.String | Icon | Symbol = js.native
  def getLabel(): MarkerLabel = js.native
  def getMap(): Map | StreetViewPanorama = js.native
  def getOpacity(): scala.Double = js.native
  def getPlace(): Place = js.native
  def getPosition(): LatLng = js.native
  def getShape(): MarkerShape = js.native
  def getTitle(): java.lang.String = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setAnimation(): scala.Unit = js.native
  def setAnimation(animation: Animation): scala.Unit = js.native
  def setAttribution(attribution: Attribution): scala.Unit = js.native
  def setClickable(flag: scala.Boolean): scala.Unit = js.native
  def setCursor(cursor: java.lang.String): scala.Unit = js.native
  def setDraggable(flag: scala.Boolean): scala.Unit = js.native
  def setIcon(icon: Icon): scala.Unit = js.native
  def setIcon(icon: Symbol): scala.Unit = js.native
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  def setLabel(label: MarkerLabel): scala.Unit = js.native
  def setLabel(label: java.lang.String): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setMap(map: StreetViewPanorama): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  def setOptions(options: MarkerOptions): scala.Unit = js.native
  def setPlace(place: Place): scala.Unit = js.native
  def setPosition(latlng: LatLng): scala.Unit = js.native
  def setPosition(latlng: LatLngLiteral): scala.Unit = js.native
  def setShape(shape: MarkerShape): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

@JSGlobal("google.maps.Marker")
@js.native
object Marker extends js.Object {
  var MAX_ZINDEX: scala.Double = js.native
}

