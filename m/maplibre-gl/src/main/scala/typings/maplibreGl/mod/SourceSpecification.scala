package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.mod.VectorSourceSpecification
  - typings.maplibreGl.mod.RasterSourceSpecification
  - typings.maplibreGl.mod.RasterDEMSourceSpecification
  - typings.maplibreGl.mod.GeoJSONSourceSpecification
  - typings.maplibreGl.mod.VideoSourceSpecification
  - typings.maplibreGl.mod.ImageSourceSpecification
*/
trait SourceSpecification extends StObject
object SourceSpecification {
  
  inline def GeoJSONSourceSpecification(): typings.maplibreGl.mod.GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.maplibreGl.mod.GeoJSONSourceSpecification]
  }
  
  inline def ImageSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): typings.maplibreGl.mod.ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.maplibreGl.mod.ImageSourceSpecification]
  }
  
  inline def RasterDEMSourceSpecification(): typings.maplibreGl.mod.RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typings.maplibreGl.mod.RasterDEMSourceSpecification]
  }
  
  inline def RasterSourceSpecification(): typings.maplibreGl.mod.RasterSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreGl.mod.RasterSourceSpecification]
  }
  
  inline def VectorSourceSpecification(): typings.maplibreGl.mod.VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typings.maplibreGl.mod.VectorSourceSpecification]
  }
  
  inline def VideoSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): typings.maplibreGl.mod.VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.maplibreGl.mod.VideoSourceSpecification]
  }
}
