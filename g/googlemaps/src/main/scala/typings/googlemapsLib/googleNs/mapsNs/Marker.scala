package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Marker")
@js.native
/**
  * Creates a marker with the options specified. If a map is specified, the
  * marker is added to the map upon construction. Note that the position must
  * be set for the marker to display.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.constructor Maps JavaScript API}
  */
class Marker () extends MVCObject {
  def this(opts: ReadonlyMarkerOptions) = this()
  def addListener(
    eventName: MarkerChangeOptionEventNames,
    handler: js.ThisFunction0[/* this */ this.type, scala.Unit]
  ): MapsEventListener = js.native
  def addListener(
    eventName: MarkerMouseEventNames,
    handler: js.ThisFunction1[/* this */ this.type, /* event */ MouseEvent, scala.Unit]
  ): MapsEventListener = js.native
  /** @deprecated */
  def addListener(
    eventName: java.lang.String,
    handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, scala.Unit]
  ): MapsEventListener = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getAnimation Maps JavaScript API} */
  def getAnimation(): js.UndefOr[Animation | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getClickable Maps JavaScript API} */
  def getClickable(): scala.Boolean = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getCursor Maps JavaScript API} */
  def getCursor(): js.UndefOr[java.lang.String | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getDraggable Maps JavaScript API} */
  def getDraggable(): js.UndefOr[scala.Boolean | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getIcon Maps JavaScript API} */
  def getIcon(): js.UndefOr[java.lang.String | ReadonlyIcon | ReadonlySymbol | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getLabel Maps JavaScript API} */
  def getLabel(): js.UndefOr[ReadonlyMarkerLabel | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getMap Maps JavaScript API} */
  def getMap(): js.UndefOr[Map | StreetViewPanorama | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getOpacity Maps JavaScript API} */
  def getOpacity(): js.UndefOr[scala.Double | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getPosition Maps JavaScript API} */
  def getPosition(): js.UndefOr[LatLng | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getShape Maps JavaScript API} */
  def getShape(): js.UndefOr[MarkerShape | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getTitle Maps JavaScript API} */
  def getTitle(): js.UndefOr[java.lang.String | scala.Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getVisible Maps JavaScript API} */
  def getVisible(): scala.Boolean = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getZIndex Maps JavaScript API} */
  def getZIndex(): js.UndefOr[scala.Double | scala.Null] = js.native
  def setAnimation(): scala.Unit = js.native
  /**
    * Start an animation. Any ongoing animation will be cancelled. Currently
    * supported animations are: {@link Animation.BOUNCE BOUNCE},
    * {@link Animation.DROP DROP}. Passing in `null` will cause any animation
    * to stop.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setAnimation Maps JavaScript API}
    */
  def setAnimation(animation: Animation): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setClickable Maps JavaScript API} */
  def setClickable(flag: scala.Boolean): scala.Unit = js.native
  def setCursor(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setCursor Maps JavaScript API} */
  def setCursor(cursor: java.lang.String): scala.Unit = js.native
  def setDraggable(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setDraggable Maps JavaScript API} */
  def setDraggable(flag: scala.Boolean): scala.Unit = js.native
  def setIcon(): scala.Unit = js.native
  def setIcon(icon: ReadonlyIcon): scala.Unit = js.native
  def setIcon(icon: ReadonlySymbol): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setIcon Maps JavaScript API} */
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  def setLabel(): scala.Unit = js.native
  def setLabel(label: ReadonlyMarkerLabel): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setLabel Maps JavaScript API} */
  def setLabel(label: java.lang.String): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  /**
    * Renders the marker on the specified map or panorama. If map is set to
    * `null`, the marker will be removed.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setMap Maps JavaScript API}
    */
  def setMap(map: Map): scala.Unit = js.native
  def setMap(map: StreetViewPanorama): scala.Unit = js.native
  def setOpacity(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setOpacity Maps JavaScript API} */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setOptions Maps JavaScript API} */
  def setOptions(options: ReadonlyMarkerOptions): scala.Unit = js.native
  def setPosition(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setPosition Maps JavaScript API} */
  def setPosition(latlng: LatLng): scala.Unit = js.native
  def setPosition(latlng: ReadonlyLatLngLiteral): scala.Unit = js.native
  def setShape(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setShape Maps JavaScript API} */
  def setShape(shape: MarkerShape): scala.Unit = js.native
  def setTitle(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setTitle Maps JavaScript API} */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setVisible Maps JavaScript API} */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(): scala.Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setZIndex Maps JavaScript API} */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("google.maps.Marker")
@js.native
object Marker extends js.Object {
  /**
    * The maximum default `z-index` that the API will assign to a marker. You
    * may set a higher `z-index` to bring a marker to the front.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.MAX_ZINDEX Maps JavaScript API}
    */
  val MAX_ZINDEX: scala.Double = js.native
}

