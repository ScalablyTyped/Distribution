package typings.googlemaps.global.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.geometry")
@js.native
object geometry extends js.Object {
  @js.native
  object encoding extends js.Object {
    def decodePath(encodedPath: String): js.Array[typings.googlemaps.google.maps.LatLng] = js.native
    def encodePath(path: js.Array[typings.googlemaps.google.maps.LatLng]): String = js.native
    def encodePath(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): String = js.native
  }
  
  @js.native
  object poly extends js.Object {
    def containsLocation(point: typings.googlemaps.google.maps.LatLng, polygon: typings.googlemaps.google.maps.Polygon): Boolean = js.native
    def isLocationOnEdge(point: typings.googlemaps.google.maps.LatLng, poly: typings.googlemaps.google.maps.Polygon): Boolean = js.native
    def isLocationOnEdge(
      point: typings.googlemaps.google.maps.LatLng,
      poly: typings.googlemaps.google.maps.Polygon,
      tolerance: Double
    ): Boolean = js.native
    def isLocationOnEdge(point: typings.googlemaps.google.maps.LatLng, poly: typings.googlemaps.google.maps.Polyline): Boolean = js.native
    def isLocationOnEdge(
      point: typings.googlemaps.google.maps.LatLng,
      poly: typings.googlemaps.google.maps.Polyline,
      tolerance: Double
    ): Boolean = js.native
  }
  
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  @js.native
  object spherical extends js.Object {
    /**
      * Returns the area of a closed path.
      * The computed area uses the same units as the radius.
      * The radius defaults to the Earth's radius in meters,
      * in which case the area is in square meters.
      */
    def computeArea(path: js.Array[typings.googlemaps.google.maps.LatLng]): Double = js.native
    def computeArea(path: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = js.native
    def computeArea(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = js.native
    def computeArea(
      path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = js.native
    /**
      * Returns the distance, in meters, between two LatLngs.
      * You can optionally specify a custom radius.
      * The radius defaults to the radius of the Earth.
      */
    def computeDistanceBetween(from: typings.googlemaps.google.maps.LatLng, to: typings.googlemaps.google.maps.LatLng): Double = js.native
    def computeDistanceBetween(
      from: typings.googlemaps.google.maps.LatLng,
      to: typings.googlemaps.google.maps.LatLng,
      radius: Double
    ): Double = js.native
    /**
      * Returns the heading from one LatLng to another LatLng.
      * Headings are expressed in degrees clockwise from North within the range
      * [-180,180).
      */
    def computeHeading(from: typings.googlemaps.google.maps.LatLng, to: typings.googlemaps.google.maps.LatLng): Double = js.native
    /**
      * Returns the length of the given path.
      */
    def computeLength(path: js.Array[typings.googlemaps.google.maps.LatLng]): Double = js.native
    def computeLength(path: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = js.native
    def computeLength(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = js.native
    def computeLength(
      path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = js.native
    /**
      * Returns the LatLng resulting from moving a distance from an origin in
      * the specified heading (expressed in degrees clockwise from north).
      */
    def computeOffset(from: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double): typings.googlemaps.google.maps.LatLng = js.native
    def computeOffset(from: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googlemaps.google.maps.LatLng = js.native
    /**
      * Returns the location of origin when provided with a LatLng destination,
      * meters travelled and original heading. Headings are expressed in
      * degrees clockwise from North. This function returns null when no
      * solution is available.
      */
    def computeOffsetOrigin(to: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double): typings.googlemaps.google.maps.LatLng = js.native
    def computeOffsetOrigin(to: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googlemaps.google.maps.LatLng = js.native
    /**
      * Returns the signed area of a closed path. The signed area may be used
      * to determine the orientation of the path. The computed area uses the
      * same units as the radius. The radius defaults to the Earth's radius in
      * meters, in which case the area is in square meters.
      */
    def computeSignedArea(loop: js.Array[typings.googlemaps.google.maps.LatLng]): Double = js.native
    def computeSignedArea(loop: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = js.native
    def computeSignedArea(loop: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = js.native
    def computeSignedArea(
      loop: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = js.native
    /**
      * Returns the LatLng which lies the given fraction of the way between the
      * origin LatLng and the destination LatLng.
      */
    def interpolate(
      from: typings.googlemaps.google.maps.LatLng,
      to: typings.googlemaps.google.maps.LatLng,
      fraction: Double
    ): typings.googlemaps.google.maps.LatLng = js.native
  }
  
}

