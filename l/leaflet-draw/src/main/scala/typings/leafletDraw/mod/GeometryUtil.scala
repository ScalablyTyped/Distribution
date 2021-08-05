package typings.leafletDraw.mod

import typings.leaflet.mod.LatLngLiteral
import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryUtil {
  
  @JSImport("leaflet", "GeometryUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Shortcut function for planar distance between two {L.LatLng} at current zoom.
    */
  inline def distance(map: DrawMap, latlanA: LatLng_, latlngB: LatLng_): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(map.asInstanceOf[js.Any], latlanA.asInstanceOf[js.Any], latlngB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns n in specified number format (if defined) and precision
    */
  inline def formattedNumber(n: String, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formattedNumber")(n.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns the area of a polygon drawn with leaflet.draw
    */
  inline def geodesicArea(coordinates: js.Array[LatLngLiteral]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geodesicArea")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns true if the Leaflet version is 0.7.x, false otherwise.
    */
  inline def isVersion07x(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVersion07x")().asInstanceOf[Boolean]
  
  /**
    * Returns a readable area string in yards or metric
    */
  inline def readableArea(area: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readableArea")(area.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readableArea(area: Double, isMetric: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableArea")(area.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableArea(area: Double, isMetric: Boolean, precision: PrecisionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableArea")(area.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableArea(area: Double, isMetric: Unit, precision: PrecisionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableArea")(area.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Converts a metric distance to one of [ feet, nauticalMile, metric or yards ] string
    * The value will be rounded as defined by the precision option object.
    */
  inline def readableDistance(distance: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Boolean, isFeet: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Boolean, isFeet: Boolean, isNauticalMile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Boolean,
    isFeet: Boolean,
    isNauticalMile: Boolean,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Boolean,
    isFeet: Boolean,
    isNauticalMile: Unit,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Boolean, isFeet: Unit, isNauticalMile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Boolean,
    isFeet: Unit,
    isNauticalMile: Boolean,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Boolean,
    isFeet: Unit,
    isNauticalMile: Unit,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Unit, isFeet: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Unit, isFeet: Boolean, isNauticalMile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Unit,
    isFeet: Boolean,
    isNauticalMile: Boolean,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Unit,
    isFeet: Boolean,
    isNauticalMile: Unit,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Unit, isFeet: Unit, isNauticalMile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(
    distance: Double,
    isMetric: Unit,
    isFeet: Unit,
    isNauticalMile: Boolean,
    precision: PrecisionOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readableDistance(distance: Double, isMetric: Unit, isFeet: Unit, isNauticalMile: Unit, precision: PrecisionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readableDistance")(distance.asInstanceOf[js.Any], isMetric.asInstanceOf[js.Any], isFeet.asInstanceOf[js.Any], isNauticalMile.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
}
