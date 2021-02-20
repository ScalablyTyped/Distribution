package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A LatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180
  * degrees longitudinal meridian.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds Maps JavaScript API}
  */
@JSGlobal("google.maps.LatLngBounds")
@js.native
/**
  * Constructs a rectangle from the points at its south-west and north-east corners.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.constructor Maps JavaScript API}
  */
class LatLngBounds ()
  extends typings.googlemaps.google.maps.LatLngBounds {
  def this(sw: typings.googlemaps.google.maps.LatLng) = this()
  def this(sw: LatLngLiteral) = this()
  def this(sw: js.UndefOr[scala.Nothing], ne: typings.googlemaps.google.maps.LatLng) = this()
  def this(sw: js.UndefOr[scala.Nothing], ne: LatLngLiteral) = this()
  def this(sw: LatLngLiteral, ne: typings.googlemaps.google.maps.LatLng) = this()
  def this(sw: LatLngLiteral, ne: LatLngLiteral) = this()
  def this(sw: typings.googlemaps.google.maps.LatLng, ne: typings.googlemaps.google.maps.LatLng) = this()
  def this(sw: typings.googlemaps.google.maps.LatLng, ne: LatLngLiteral) = this()
}
