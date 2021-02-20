package typings.mapboxGeoViewport

import typings.mapboxGeoViewport.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/geo-viewport", "bounds")
  @js.native
  def bounds(viewport: js.Tuple2[Double, Double], zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  @JSImport("@mapbox/geo-viewport", "bounds")
  @js.native
  def bounds(
    viewport: js.Tuple2[Double, Double],
    zoom: Double,
    dimensions: js.Tuple2[Double, Double],
    tileSize: Double
  ): BoundingBox = js.native
  @JSImport("@mapbox/geo-viewport", "bounds")
  @js.native
  def bounds(viewport: Lat, zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  @JSImport("@mapbox/geo-viewport", "bounds")
  @js.native
  def bounds(viewport: Lat, zoom: Double, dimensions: js.Tuple2[Double, Double], tileSize: Double): BoundingBox = js.native
  
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double]): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: js.UndefOr[scala.Nothing],
    tileSize: js.UndefOr[scala.Nothing],
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: js.UndefOr[scala.Nothing],
    tileSize: Double
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: js.UndefOr[scala.Nothing],
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: Double
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: Double,
    tileSize: js.UndefOr[scala.Nothing],
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: Double,
    tileSize: Double
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: js.UndefOr[scala.Nothing],
    maxzoom: Double,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: js.UndefOr[scala.Nothing],
    tileSize: js.UndefOr[scala.Nothing],
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: js.UndefOr[scala.Nothing],
    tileSize: Double
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: js.UndefOr[scala.Nothing],
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double, maxzoom: Double): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: js.UndefOr[scala.Nothing],
    allowFloat: Boolean
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double
  ): GeoViewport = js.native
  @JSImport("@mapbox/geo-viewport", "viewport")
  @js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = js.native
  
  type BoundingBox = js.Tuple4[Double, Double, Double, Double]
  
  @js.native
  trait GeoViewport extends StObject {
    
    var center: js.Tuple2[Double, Double] = js.native
    
    var zoom: Double = js.native
  }
  object GeoViewport {
    
    @scala.inline
    def apply(center: js.Tuple2[Double, Double], zoom: Double): GeoViewport = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoViewport]
    }
    
    @scala.inline
    implicit class GeoViewportMutableBuilder[Self <: GeoViewport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
