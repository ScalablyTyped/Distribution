package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
  */
@js.native
trait Marker extends MVCObject {
  def addListener(eventName: MarkerChangeOptionEventNames, handler: js.ThisFunction0[/* this */ this.type, Unit]): MapsEventListener = js.native
  def addListener(
    eventName: MarkerMouseEventNames,
    handler: js.ThisFunction1[/* this */ this.type, /* event */ MouseEvent, Unit]
  ): MapsEventListener = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getAnimation Maps JavaScript API} */
  def getAnimation(): js.UndefOr[Animation | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getClickable Maps JavaScript API} */
  def getClickable(): Boolean = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getCursor Maps JavaScript API} */
  def getCursor(): js.UndefOr[String | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getDraggable Maps JavaScript API} */
  def getDraggable(): js.UndefOr[Boolean | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getIcon Maps JavaScript API} */
  def getIcon(): js.UndefOr[String | ReadonlyIcon | ReadonlySymbol | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getLabel Maps JavaScript API} */
  def getLabel(): js.UndefOr[ReadonlyMarkerLabel | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getMap Maps JavaScript API} */
  def getMap(): js.UndefOr[Map[Element] | StreetViewPanorama | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getOpacity Maps JavaScript API} */
  def getOpacity(): js.UndefOr[Double | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getPosition Maps JavaScript API} */
  def getPosition(): js.UndefOr[LatLng | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getShape Maps JavaScript API} */
  def getShape(): js.UndefOr[MarkerShape | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getTitle Maps JavaScript API} */
  def getTitle(): js.UndefOr[String | Null] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getVisible Maps JavaScript API} */
  def getVisible(): Boolean = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.getZIndex Maps JavaScript API} */
  def getZIndex(): js.UndefOr[Double | Null] = js.native
  /**
    * Start an animation. Any ongoing animation will be cancelled. Currently
    * supported animations are: {@link Animation.BOUNCE BOUNCE},
    * {@link Animation.DROP DROP}. Passing in `null` will cause any animation
    * to stop.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setAnimation Maps JavaScript API}
    */
  def setAnimation(): Unit = js.native
  def setAnimation(animation: Animation): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setClickable Maps JavaScript API} */
  def setClickable(flag: Boolean): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setCursor Maps JavaScript API} */
  def setCursor(): Unit = js.native
  def setCursor(cursor: String): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setDraggable Maps JavaScript API} */
  def setDraggable(): Unit = js.native
  def setDraggable(flag: Boolean): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setIcon Maps JavaScript API} */
  def setIcon(): Unit = js.native
  def setIcon(icon: String): Unit = js.native
  def setIcon(icon: ReadonlyIcon): Unit = js.native
  def setIcon(icon: ReadonlySymbol): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setLabel Maps JavaScript API} */
  def setLabel(): Unit = js.native
  def setLabel(label: String): Unit = js.native
  def setLabel(label: ReadonlyMarkerLabel): Unit = js.native
  /**
    * Renders the marker on the specified map or panorama. If map is set to
    * `null`, the marker will be removed.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setMap Maps JavaScript API}
    */
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setOpacity Maps JavaScript API} */
  def setOpacity(): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setOptions Maps JavaScript API} */
  def setOptions(options: ReadonlyMarkerOptions): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setPosition Maps JavaScript API} */
  def setPosition(): Unit = js.native
  def setPosition(latlng: LatLng): Unit = js.native
  def setPosition(latlng: ReadonlyLatLngLiteral): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setShape Maps JavaScript API} */
  def setShape(): Unit = js.native
  def setShape(shape: MarkerShape): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setTitle Maps JavaScript API} */
  def setTitle(): Unit = js.native
  def setTitle(title: String): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setVisible Maps JavaScript API} */
  def setVisible(visible: Boolean): Unit = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.setZIndex Maps JavaScript API} */
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

