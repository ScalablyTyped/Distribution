package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreMaplibreGlStyleSpec.mod.VectorSourceSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.RasterSourceSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.RasterDEMSourceSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.GeoJSONSourceSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.VideoSourceSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.ImageSourceSpecification
*/
trait SourceSpecification extends StObject
object SourceSpecification {
  
  inline def GeoJSONSourceSpecification(data: Any): typings.maplibreMaplibreGlStyleSpec.mod.GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.GeoJSONSourceSpecification]
  }
  
  inline def ImageSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): typings.maplibreMaplibreGlStyleSpec.mod.ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.ImageSourceSpecification]
  }
  
  inline def RasterDEMSourceSpecification(): typings.maplibreMaplibreGlStyleSpec.mod.RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.RasterDEMSourceSpecification]
  }
  
  inline def RasterSourceSpecification(): typings.maplibreMaplibreGlStyleSpec.mod.RasterSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.RasterSourceSpecification]
  }
  
  inline def VectorSourceSpecification(): typings.maplibreMaplibreGlStyleSpec.mod.VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.VectorSourceSpecification]
  }
  
  inline def VideoSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): typings.maplibreMaplibreGlStyleSpec.mod.VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.VideoSourceSpecification]
  }
}
