package typings.googlemaps.google.maps

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that looks like a bubble and is often connected to a marker.
  * This class extends MVCObject.
  */
@js.native
trait InfoWindow extends MVCObject {
  /** Closes this InfoWindow by removing it from the DOM structure. */
  def close(): Unit = js.native
  def getContent(): String | Element = js.native
  def getPosition(): LatLng = js.native
  def getZIndex(): Double = js.native
  /**
    * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be
    * associated with an anchor. In the core API, the only anchor is the Marker
    * class. However, an anchor can be any MVCObject that exposes a LatLng
    * position property and optionally a Point anchorPoint property for
    * calculating the pixelOffset (see InfoWindowOptions). The anchorPoint is
    * the offset from the anchor's position to the tip of the InfoWindow.
    */
  def open(): Unit = js.native
  def open(map: Map[Element]): Unit = js.native
  def open(map: Map[Element], anchor: MVCObject): Unit = js.native
  def open(map: StreetViewPanorama): Unit = js.native
  def open(map: StreetViewPanorama, anchor: MVCObject): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: Node): Unit = js.native
  def setOptions(options: InfoWindowOptions): Unit = js.native
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: LatLngLiteral): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

