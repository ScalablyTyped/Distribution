package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.LatLngBounds")
@js.native
class LatLngBounds () extends js.Object {
  /**
       * Constructs a rectangle from the points at its south-west and north-east
       * corners.
       */
  def this(sw: LatLng) = this()
  /**
       * Constructs a rectangle from the points at its south-west and north-east
       * corners.
       */
  def this(sw: LatLngLiteral) = this()
  /**
       * Constructs a rectangle from the points at its south-west and north-east
       * corners.
       */
  def this(sw: LatLngLiteral, ne: LatLng) = this()
  /**
       * Constructs a rectangle from the points at its south-west and north-east
       * corners.
       */
  def this(sw: LatLngLiteral, ne: LatLngLiteral) = this()
  /**
       * Constructs a rectangle from the points at its south-west and north-east
       * corners.
       */
  def this(sw: LatLng, ne: LatLng) = this()
  /**
       * Constructs a rectangle from the points at its south-west and north-east
       * corners.
       */
  def this(sw: LatLng, ne: LatLngLiteral) = this()
  /** Returns true if the given lat/lng is in this bounds. */
  def contains(latLng: LatLng): scala.Boolean = js.native
  /** Returns true if the given lat/lng is in this bounds. */
  def contains(latLng: LatLngLiteral): scala.Boolean = js.native
  /** Returns true if this bounds approximately equals the given bounds. */
  def equals(other: LatLngBounds): scala.Boolean = js.native
  /** Returns true if this bounds approximately equals the given bounds. */
  def equals(other: LatLngBoundsLiteral): scala.Boolean = js.native
  /** Extends this bounds to contain the given point. */
  def extend(point: LatLng): LatLngBounds = js.native
  /** Extends this bounds to contain the given point. */
  def extend(point: LatLngLiteral): LatLngBounds = js.native
  /** Computes the center of this LatLngBounds */
  def getCenter(): LatLng = js.native
  /** Returns the north-east corner of this bounds. */
  def getNorthEast(): LatLng = js.native
  /** Returns the south-west corner of this bounds. */
  def getSouthWest(): LatLng = js.native
  /** Returns true if this bounds shares any points with the other bounds. */
  def intersects(other: LatLngBounds): scala.Boolean = js.native
  /** Returns true if this bounds shares any points with the other bounds. */
  def intersects(other: LatLngBoundsLiteral): scala.Boolean = js.native
  /** Returns if the bounds are empty. */
  def isEmpty(): scala.Boolean = js.native
  /**
       * Converts to JSON representation. This function is intended to be used
       * via JSON.stringify.
       */
  def toJSON(): LatLngBoundsLiteral = js.native
  /** Converts the given map bounds to a lat/lng span. */
  def toSpan(): LatLng = js.native
  /**
       * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this
       * bounds, where "lo" corresponds to the southwest corner of the bounding
       * box, while "hi" corresponds to the northeast corner of that box.
       */
  def toUrlValue(): java.lang.String = js.native
  /**
       * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this
       * bounds, where "lo" corresponds to the southwest corner of the bounding
       * box, while "hi" corresponds to the northeast corner of that box.
       */
  def toUrlValue(precision: scala.Double): java.lang.String = js.native
  /**
       * Extends this bounds to contain the union of this and the given bounds.
       */
  def union(other: LatLngBounds): LatLngBounds = js.native
  /**
       * Extends this bounds to contain the union of this and the given bounds.
       */
  def union(other: LatLngBoundsLiteral): LatLngBounds = js.native
}

