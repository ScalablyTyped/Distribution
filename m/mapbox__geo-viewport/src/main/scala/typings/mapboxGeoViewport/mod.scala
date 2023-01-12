package typings.mapboxGeoViewport

import typings.mapboxGeoViewport.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/geo-viewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bounds(viewport: js.Tuple2[Double, Double], zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(viewport.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[BoundingBox]
  inline def bounds(
    viewport: js.Tuple2[Double, Double],
    zoom: Double,
    dimensions: js.Tuple2[Double, Double],
    tileSize: Double
  ): BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(viewport.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any])).asInstanceOf[BoundingBox]
  inline def bounds(viewport: Lat, zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(viewport.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[BoundingBox]
  inline def bounds(viewport: Lat, zoom: Double, dimensions: js.Tuple2[Double, Double], tileSize: Double): BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(viewport.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any])).asInstanceOf[BoundingBox]
  
  inline def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double]): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double, maxzoom: Double): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Unit,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Unit,
    tileSize: Double
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Unit,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Unit,
    tileSize: Unit,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Unit, maxzoom: Double): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Unit,
    maxzoom: Double,
    tileSize: Double
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Unit,
    maxzoom: Double,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Unit,
    maxzoom: Double,
    tileSize: Unit,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Unit,
    maxzoom: Unit,
    tileSize: Double
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Unit,
    maxzoom: Unit,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  inline def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Unit,
    maxzoom: Unit,
    tileSize: Unit,
    allowFloat: Boolean
  ): GeoViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(bounds.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], minzoom.asInstanceOf[js.Any], maxzoom.asInstanceOf[js.Any], tileSize.asInstanceOf[js.Any], allowFloat.asInstanceOf[js.Any])).asInstanceOf[GeoViewport]
  
  type BoundingBox = js.Tuple4[Double, Double, Double, Double]
  
  trait GeoViewport extends StObject {
    
    var center: js.Tuple2[Double, Double]
    
    var zoom: Double
  }
  object GeoViewport {
    
    inline def apply(center: js.Tuple2[Double, Double], zoom: Double): GeoViewport = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoViewport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoViewport] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
