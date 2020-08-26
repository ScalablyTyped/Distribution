package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.closeclick
import typings.googlemaps.googlemapsStrings.content_changed
import typings.googlemaps.googlemapsStrings.domready
import typings.googlemaps.googlemapsStrings.position_changed
import typings.googlemaps.googlemapsStrings.zindex_changed
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that looks like a bubble and is often connected to a marker.
  * This class extends MVCObject.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow Maps JavaScript API}
  */
@js.native
trait InfoWindow extends MVCObject {
  /**
    * @see {@link InfoWindowHandlerMap#closeclick closeclick} event
    * @see {@link InfoWindowHandlerMap#content_changed content_changed} event
    * @see {@link InfoWindowHandlerMap#domready domready} event
    * @see {@link InfoWindowHandlerMap#position_changed position_changed} event
    * @see {@link InfoWindowHandlerMap#zindex_changed zindex_changed} event
    */
  @JSName("addListener")
  def addListener_closeclick(eventName: closeclick, handler: MVCEventHandler[this.type, js.Array[js.Any]]): MapsEventListener = js.native
  @JSName("addListener")
  def addListener_contentchanged(eventName: content_changed, handler: MVCEventHandler[this.type, js.Array[js.Any]]): MapsEventListener = js.native
  @JSName("addListener")
  def addListener_domready(eventName: domready, handler: MVCEventHandler[this.type, js.Array[js.Any]]): MapsEventListener = js.native
  @JSName("addListener")
  def addListener_positionchanged(eventName: position_changed, handler: MVCEventHandler[this.type, js.Array[js.Any]]): MapsEventListener = js.native
  @JSName("addListener")
  def addListener_zindexchanged(eventName: zindex_changed, handler: MVCEventHandler[this.type, js.Array[js.Any]]): MapsEventListener = js.native
  /**
    * Closes this {@link InfoWindow} by removing it from the DOM structure.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.close Maps JavaScript API}
    * @see {@link InfoWindowHandlerMap#closeclick closeclick} event
    * @see {@link open}
    */
  def close(): Unit = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.getContent Maps JavaScript API}
    * @see {@link InfoWindowOptions#content}
    * @see {@link InfoWindowHandlerMap#content_changed content_changed} event
    * @see {@link setContent}
    */
  def getContent(): String | Node = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.getPosition Maps JavaScript API}
    * @see {@link InfoWindowOptions#position}
    * @see {@link InfoWindowHandlerMap#position_changed position_changed} event
    * @see {@link setPosition}
    */
  def getPosition(): LatLng = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.getZIndex Maps JavaScript API}
    * @see {@link InfoWindowOptions#zIndex}
    * @see {@link InfoWindowHandlerMap#zindex_changed zindex_changed} event
    * @see {@link setZIndex}
    */
  def getZIndex(): Double = js.native
  // TODO: Strict `position` & `anchorPoint` in `anchor` argument
  /**
    * Opens this {@link InfoWindow} on the given map. Optionally, an {@link InfoWindow} can be associated with an
    * anchor. In the core API, the only anchor is the {@link Marker} class. However, an anchor can be any
    * {@link MVCObject} that exposes a {@link LatLng} position property and optionally a {@link Point} anchorPoint
    * property for calculating the {@link InfoWindowOptions#pixelOffset pixelOffset}. The anchorPoint is the offset
    * from the anchor's position to the tip of the {@link InfoWindow}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.open Maps JavaScript API}
    * @see {@link close}
    */
  def open(): Unit = js.native
  def open(map: js.UndefOr[scala.Nothing], anchor: MVCObject): Unit = js.native
  def open(map: Map[Element]): Unit = js.native
  def open(map: Map[Element], anchor: MVCObject): Unit = js.native
  def open(map: StreetViewPanorama): Unit = js.native
  def open(map: StreetViewPanorama, anchor: MVCObject): Unit = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.setContent Maps JavaScript API}
    * @see {@link InfoWindowOptions#content}
    * @see {@link InfoWindowHandlerMap#content_changed content_changed} event
    * @see {@link getContent}
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: Node): Unit = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.setOptions Maps JavaScript API}
    */
  def setOptions(options: InfoWindowOptions): Unit = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.setPosition Maps JavaScript API}
    * @see {@link InfoWindowOptions#position}
    * @see {@link InfoWindowHandlerMap#position_changed position_changed} event
    * @see {@link getPosition}
    */
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: LatLngLiteral): Unit = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.setZIndex Maps JavaScript API}
    * @see {@link InfoWindowOptions#zIndex}
    * @see {@link InfoWindowHandlerMap#zindex_changed zindex_changed} event
    * @see {@link getZIndex}
    */
  def setZIndex(zIndex: Double): Unit = js.native
}

