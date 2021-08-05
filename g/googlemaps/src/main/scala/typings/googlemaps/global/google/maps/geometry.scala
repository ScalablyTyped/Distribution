package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  object encoding {
    
    @JSGlobal("google.maps.geometry.encoding")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodePath(encodedPath: String): js.Array[typings.googlemaps.google.maps.LatLng] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePath")(encodedPath.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.googlemaps.google.maps.LatLng]]
    
    inline def encodePath(path: js.Array[typings.googlemaps.google.maps.LatLng]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encodePath(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object poly {
    
    @JSGlobal("google.maps.geometry.poly")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containsLocation(point: typings.googlemaps.google.maps.LatLng, polygon: typings.googlemaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsLocation")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isLocationOnEdge(point: typings.googlemaps.google.maps.LatLng, poly: typings.googlemaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(
      point: typings.googlemaps.google.maps.LatLng,
      poly: typings.googlemaps.google.maps.Polygon,
      tolerance: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: typings.googlemaps.google.maps.LatLng, poly: typings.googlemaps.google.maps.Polyline): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(
      point: typings.googlemaps.google.maps.LatLng,
      poly: typings.googlemaps.google.maps.Polyline,
      tolerance: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  object spherical {
    
    @JSGlobal("google.maps.geometry.spherical")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the area of a closed path.
      * The computed area uses the same units as the radius.
      * The radius defaults to the Earth's radius in meters,
      * in which case the area is in square meters.
      */
    inline def computeArea(path: js.Array[typings.googlemaps.google.maps.LatLng]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(
      path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the distance, in meters, between two LatLngs.
      * You can optionally specify a custom radius.
      * The radius defaults to the radius of the Earth.
      */
    inline def computeDistanceBetween(from: typings.googlemaps.google.maps.LatLng, to: typings.googlemaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(
      from: typings.googlemaps.google.maps.LatLng,
      to: typings.googlemaps.google.maps.LatLng,
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the heading from one LatLng to another LatLng.
      * Headings are expressed in degrees clockwise from North within the range
      * [-180,180).
      */
    inline def computeHeading(from: typings.googlemaps.google.maps.LatLng, to: typings.googlemaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the length of the given path.
      */
    inline def computeLength(path: js.Array[typings.googlemaps.google.maps.LatLng]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeLength(path: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeLength(path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeLength(
      path: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the LatLng resulting from moving a distance from an origin in
      * the specified heading (expressed in degrees clockwise from north).
      */
    inline def computeOffset(from: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double): typings.googlemaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googlemaps.google.maps.LatLng]
    inline def computeOffset(from: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googlemaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googlemaps.google.maps.LatLng]
    
    /**
      * Returns the location of origin when provided with a LatLng destination,
      * meters travelled and original heading. Headings are expressed in
      * degrees clockwise from North. This function returns null when no
      * solution is available.
      */
    inline def computeOffsetOrigin(to: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double): typings.googlemaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googlemaps.google.maps.LatLng]
    inline def computeOffsetOrigin(to: typings.googlemaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googlemaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googlemaps.google.maps.LatLng]
    
    /**
      * Returns the signed area of a closed path. The signed area may be used
      * to determine the orientation of the path. The computed area uses the
      * same units as the radius. The radius defaults to the Earth's radius in
      * meters, in which case the area is in square meters.
      */
    inline def computeSignedArea(loop: js.Array[typings.googlemaps.google.maps.LatLng]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeSignedArea(loop: js.Array[typings.googlemaps.google.maps.LatLng], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeSignedArea(loop: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeSignedArea(
      loop: typings.googlemaps.google.maps.MVCArray[typings.googlemaps.google.maps.LatLng],
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the LatLng which lies the given fraction of the way between the
      * origin LatLng and the destination LatLng.
      */
    inline def interpolate(
      from: typings.googlemaps.google.maps.LatLng,
      to: typings.googlemaps.google.maps.LatLng,
      fraction: Double
    ): typings.googlemaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.googlemaps.google.maps.LatLng]
  }
}
