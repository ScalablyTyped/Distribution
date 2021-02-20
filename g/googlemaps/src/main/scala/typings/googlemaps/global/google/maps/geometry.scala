package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  object encoding {
    
    @JSGlobal("google.maps.geometry.encoding.decodePath")
    @js.native
    def decodePath(encodedPath: String): js.Array[typings.googlemaps.google.maps.LatLng] = js.native
    
    @JSGlobal("google.maps.geometry.encoding.encodePath")
    @js.native
    def encodePath(path: js.Array[typings.googlemaps.google.maps.LatLng]): String = js.native
    @JSGlobal("google.maps.geometry.encoding.encodePath")
    @js.native
    def encodePath(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): String = js.native
  }
  
  object poly {
    
    @JSGlobal("google.maps.geometry.poly.containsLocation")
    @js.native
    def containsLocation(point: typings.googlemaps.google.maps.LatLng, polygon: typings.googlemaps.google.maps.Polygon): Boolean = js.native
    
    @JSGlobal("google.maps.geometry.poly.isLocationOnEdge")
    @js.native
    def isLocationOnEdge(point: typings.googlemaps.google.maps.LatLng, poly: typings.googlemaps.google.maps.Polygon): Boolean = js.native
    @JSGlobal("google.maps.geometry.poly.isLocationOnEdge")
    @js.native
    def isLocationOnEdge(
      point: typings.googlemaps.google.maps.LatLng,
      poly: typings.googlemaps.google.maps.Polygon,
      tolerance: Double
    ): Boolean = js.native
    @JSGlobal("google.maps.geometry.poly.isLocationOnEdge")
    @js.native
    def isLocationOnEdge(point: typings.googlemaps.google.maps.LatLng, poly: typings.googlemaps.google.maps.Polyline): Boolean = js.native
    @JSGlobal("google.maps.geometry.poly.isLocationOnEdge")
    @js.native
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
  object spherical {
    
    /**
      * Returns the area of a closed path.
      * The computed area uses the same units as the radius.
      * The radius defaults to the Earth's radius in meters,
      * in which case the area is in square meters.
      */
    @JSGlobal("google.maps.geometry.spherical.computeArea")
    @js.native
    def computeArea(path: js.Array[typings.googlemaps.google.maps.LatLng]): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeArea")
    @js.native
    def computeArea(path: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeArea")
    @js.native
    def computeArea(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeArea")
    @js.native
    def computeArea(
      path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = js.native
    
    /**
      * Returns the distance, in meters, between two LatLngs.
      * You can optionally specify a custom radius.
      * The radius defaults to the radius of the Earth.
      */
    @JSGlobal("google.maps.geometry.spherical.computeDistanceBetween")
    @js.native
    def computeDistanceBetween(from: typings.googlemaps.google.maps.LatLng, to: typings.googlemaps.google.maps.LatLng): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeDistanceBetween")
    @js.native
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
    @JSGlobal("google.maps.geometry.spherical.computeHeading")
    @js.native
    def computeHeading(from: typings.googlemaps.google.maps.LatLng, to: typings.googlemaps.google.maps.LatLng): Double = js.native
    
    /**
      * Returns the length of the given path.
      */
    @JSGlobal("google.maps.geometry.spherical.computeLength")
    @js.native
    def computeLength(path: js.Array[typings.googlemaps.google.maps.LatLng]): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeLength")
    @js.native
    def computeLength(path: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeLength")
    @js.native
    def computeLength(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeLength")
    @js.native
    def computeLength(
      path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = js.native
    
    /**
      * Returns the LatLng resulting from moving a distance from an origin in
      * the specified heading (expressed in degrees clockwise from north).
      */
    @JSGlobal("google.maps.geometry.spherical.computeOffset")
    @js.native
    def computeOffset(from: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double): typings.googlemaps.google.maps.LatLng = js.native
    @JSGlobal("google.maps.geometry.spherical.computeOffset")
    @js.native
    def computeOffset(from: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googlemaps.google.maps.LatLng = js.native
    
    /**
      * Returns the location of origin when provided with a LatLng destination,
      * meters travelled and original heading. Headings are expressed in
      * degrees clockwise from North. This function returns null when no
      * solution is available.
      */
    @JSGlobal("google.maps.geometry.spherical.computeOffsetOrigin")
    @js.native
    def computeOffsetOrigin(to: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double): typings.googlemaps.google.maps.LatLng = js.native
    @JSGlobal("google.maps.geometry.spherical.computeOffsetOrigin")
    @js.native
    def computeOffsetOrigin(to: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googlemaps.google.maps.LatLng = js.native
    
    /**
      * Returns the signed area of a closed path. The signed area may be used
      * to determine the orientation of the path. The computed area uses the
      * same units as the radius. The radius defaults to the Earth's radius in
      * meters, in which case the area is in square meters.
      */
    @JSGlobal("google.maps.geometry.spherical.computeSignedArea")
    @js.native
    def computeSignedArea(loop: js.Array[typings.googlemaps.google.maps.LatLng]): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeSignedArea")
    @js.native
    def computeSignedArea(loop: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeSignedArea")
    @js.native
    def computeSignedArea(loop: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = js.native
    @JSGlobal("google.maps.geometry.spherical.computeSignedArea")
    @js.native
    def computeSignedArea(
      loop: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = js.native
    
    /**
      * Returns the LatLng which lies the given fraction of the way between the
      * origin LatLng and the destination LatLng.
      */
    @JSGlobal("google.maps.geometry.spherical.interpolate")
    @js.native
    def interpolate(
      from: typings.googlemaps.google.maps.LatLng,
      to: typings.googlemaps.google.maps.LatLng,
      fraction: Double
    ): typings.googlemaps.google.maps.LatLng = js.native
  }
}
