package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.ReadonlyMarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
  */
@JSGlobal("google.maps.Marker")
@js.native
/**
  * Creates a marker with the options specified. If a map is specified, the
  * marker is added to the map upon construction. Note that the position must
  * be set for the marker to display.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.constructor Maps JavaScript API}
  */
class Marker ()
  extends typings.googlemaps.google.maps.Marker {
  def this(opts: ReadonlyMarkerOptions) = this()
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
  val MAX_ZINDEX: Double = js.native
}

