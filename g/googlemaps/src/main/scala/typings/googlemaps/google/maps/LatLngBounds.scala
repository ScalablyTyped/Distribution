package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A LatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180
  * degrees longitudinal meridian.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds Maps JavaScript API}
  */
@js.native
trait LatLngBounds extends _LocationBias {
  
  /**
    * Returns true if the given lat/lng is in this bounds.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.contains Maps JavaScript API}
    */
  def contains(latLng: LatLng): Boolean = js.native
  def contains(latLng: LatLngLiteral): Boolean = js.native
  
  /**
    * Returns true if this bounds approximately equals the given bounds.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.equals Maps JavaScript API}
    */
  def equals(other: LatLngBounds): Boolean = js.native
  def equals(other: LatLngBoundsLiteral): Boolean = js.native
  
  /**
    * Extends this bounds to contain the given point.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.extend Maps JavaScript API}
    */
  def extend(point: LatLng): LatLngBounds = js.native
  def extend(point: LatLngLiteral): LatLngBounds = js.native
  
  /**
    * Computes the center of this LatLngBounds
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.getCenter Maps JavaScript API}
    */
  def getCenter(): LatLng = js.native
  
  /**
    * Returns the north-east corner of this bounds.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.getNorthEast Maps JavaScript API}
    */
  def getNorthEast(): LatLng = js.native
  
  /**
    * Returns the south-west corner of this bounds.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.getSouthWest Maps JavaScript API}
    */
  def getSouthWest(): LatLng = js.native
  
  /**
    * Returns true if this bounds shares any points with the other bounds.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.intersects Maps JavaScript API}
    */
  def intersects(other: LatLngBounds): Boolean = js.native
  def intersects(other: LatLngBoundsLiteral): Boolean = js.native
  
  /**
    * Returns if the bounds are empty.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.isEmpty Maps JavaScript API}
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Converts to JSON representation. This function is intended to be used via {@link JSON.stringify}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.toJSON Maps JavaScript API}
    */
  def toJSON(): LatLngBoundsLiteral = js.native
  
  /**
    * Converts the given map bounds to a lat/lng span.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.toSpan Maps JavaScript API}
    */
  def toSpan(): LatLng = js.native
  
  /**
    * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds, where "lo" corresponds to the
    * southwest corner of the bounding box, while "hi" corresponds to the northeast corner of that box.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.toUrlValue Maps JavaScript API}
    */
  def toUrlValue(): String = js.native
  def toUrlValue(precision: Double): String = js.native
  
  /**
    * Extends this bounds to contain the union of this and the given bounds.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBounds.union Maps JavaScript API}
    */
  def union(other: LatLngBounds): LatLngBounds = js.native
  def union(other: LatLngBoundsLiteral): LatLngBounds = js.native
}
