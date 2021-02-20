package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.ReadonlyMarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Marker {
  
  /**
    * The maximum default `z-index` that the API will assign to a marker. You
    * may set a higher `z-index` to bring a marker to the front.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.MAX_ZINDEX Maps JavaScript API}
    */
  /* static member */
  @JSGlobal("google.maps.Marker.MAX_ZINDEX")
  @js.native
  val MAX_ZINDEX: Double = js.native
}
