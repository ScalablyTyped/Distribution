package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.animation_changed
import typings.googlemaps.googlemapsStrings.click
import typings.googlemaps.googlemapsStrings.clickable_changed
import typings.googlemaps.googlemapsStrings.cursor_changed
import typings.googlemaps.googlemapsStrings.dblclick
import typings.googlemaps.googlemapsStrings.drag
import typings.googlemaps.googlemapsStrings.dragend
import typings.googlemaps.googlemapsStrings.draggable_changed
import typings.googlemaps.googlemapsStrings.dragstart
import typings.googlemaps.googlemapsStrings.flat_changed
import typings.googlemaps.googlemapsStrings.icon_changed
import typings.googlemaps.googlemapsStrings.mousedown
import typings.googlemaps.googlemapsStrings.mouseout
import typings.googlemaps.googlemapsStrings.mouseover
import typings.googlemaps.googlemapsStrings.mouseup
import typings.googlemaps.googlemapsStrings.position_changed
import typings.googlemaps.googlemapsStrings.rightclick
import typings.googlemaps.googlemapsStrings.shape_changed
import typings.googlemaps.googlemapsStrings.title_changed
import typings.googlemaps.googlemapsStrings.visible_changed
import typings.googlemaps.googlemapsStrings.zindex_changed
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
  */
@js.native
trait Marker extends MVCObject {
  
  /**
    * @see {@link MarkerHandlerMap#animation_changed animation_changed} event
    * @see {@link MarkerHandlerMap#click click} event
    * @see {@link MarkerHandlerMap#clickable_changed clickable_changed} event
    * @see {@link MarkerHandlerMap#cursor_changed cursor_changed} event
    * @see {@link MarkerHandlerMap#dblclick dblclick} event
    * @see {@link MarkerHandlerMap#drag drag} event
    * @see {@link MarkerHandlerMap#dragend dragend} event
    * @see {@link MarkerHandlerMap#draggable_changed draggable_changed} event
    * @see {@link MarkerHandlerMap#dragstart dragstart} event
    * @see {@link MarkerHandlerMap#flat_changed flat_changed} event
    * @see {@link MarkerHandlerMap#icon_changed icon_changed} event
    * @see {@link MarkerHandlerMap#mousedown mousedown} event
    * @see {@link MarkerHandlerMap#mouseout mouseout} event
    * @see {@link MarkerHandlerMap#mouseover mouseover} event
    * @see {@link MarkerHandlerMap#mouseup mouseup} event
    * @see {@link MarkerHandlerMap#position_changed position_changed} event
    * @see {@link MarkerHandlerMap#rightclick rightclick} event
    * @see {@link MarkerHandlerMap#shape_changed shape_changed} event
    * @see {@link MarkerHandlerMap#title_changed title_changed} event
    * @see {@link MarkerHandlerMap#visible_changed visible_changed} event
    * @see {@link MarkerHandlerMap#zindex_changed zindex_changed} event
    */
  def addListener[N /* <: /* keyof googlemaps.google.maps.MarkerHandlerMap<this> */ animation_changed | click | clickable_changed | cursor_changed | dblclick | drag | dragend | draggable_changed | dragstart | flat_changed | icon_changed | mousedown | mouseout | mouseover | mouseup | position_changed | rightclick | shape_changed | title_changed | visible_changed | zindex_changed */](
    eventName: N,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: googlemaps.google.maps.MarkerHandlerMap<this>[N] */ js.Any
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
