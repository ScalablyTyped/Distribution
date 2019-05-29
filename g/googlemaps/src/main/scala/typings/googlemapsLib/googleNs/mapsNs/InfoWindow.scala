package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that looks like a bubble and is often connected to a marker.
  * This class extends MVCObject.
  */
@JSGlobal("google.maps.InfoWindow")
@js.native
/**
  * Creates an info window with the given options. An InfoWindow can be
  * placed on a map at a particular position or above a marker,
  * depending on what is specified in the options. Unless auto-pan is
  * disabled, an InfoWindow will pan the map to make itself visible
  * when it is opened. After constructing an InfoWindow, you must call
  * open to display it on the map. The user can click the close button
  * on the InfoWindow to remove it from the map, or the developer can
  * call close() for the same effect.
  */
class InfoWindow () extends MVCObject {
  def this(opts: InfoWindowOptions) = this()
  /** Closes this InfoWindow by removing it from the DOM structure. */
  def close(): scala.Unit = js.native
  def getContent(): java.lang.String | stdLib.Element = js.native
  def getPosition(): LatLng = js.native
  def getZIndex(): scala.Double = js.native
  /**
    * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be
    * associated with an anchor. In the core API, the only anchor is the Marker
    * class. However, an anchor can be any MVCObject that exposes a LatLng
    * position property and optionally a Point anchorPoint property for
    * calculating the pixelOffset (see InfoWindowOptions). The anchorPoint is
    * the offset from the anchor's position to the tip of the InfoWindow.
    */
  def open(): scala.Unit = js.native
  def open(map: Map): scala.Unit = js.native
  def open(map: Map, anchor: MVCObject): scala.Unit = js.native
  def open(map: StreetViewPanorama): scala.Unit = js.native
  def open(map: StreetViewPanorama, anchor: MVCObject): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.Node): scala.Unit = js.native
  def setOptions(options: InfoWindowOptions): scala.Unit = js.native
  def setPosition(position: LatLng): scala.Unit = js.native
  def setPosition(position: LatLngLiteral): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

