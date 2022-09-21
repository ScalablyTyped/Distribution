package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.styleSpecMod.VectorSourceSpecification
  - typings.maplibreGl.styleSpecMod.RasterSourceSpecification
  - typings.maplibreGl.styleSpecMod.RasterDEMSourceSpecification
  - typings.maplibreGl.styleSpecMod.GeoJSONSourceSpecification
  - typings.maplibreGl.styleSpecMod.VideoSourceSpecification
  - typings.maplibreGl.styleSpecMod.ImageSourceSpecification
*/
trait SourceSpecification extends StObject
object SourceSpecification {
  
  inline def GeoJSONSourceSpecification(): typings.maplibreGl.styleSpecMod.GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.GeoJSONSourceSpecification]
  }
  
  inline def ImageSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): typings.maplibreGl.styleSpecMod.ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.ImageSourceSpecification]
  }
  
  inline def RasterDEMSourceSpecification(): typings.maplibreGl.styleSpecMod.RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.RasterDEMSourceSpecification]
  }
  
  inline def RasterSourceSpecification(): typings.maplibreGl.styleSpecMod.RasterSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.RasterSourceSpecification]
  }
  
  inline def VectorSourceSpecification(): typings.maplibreGl.styleSpecMod.VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.VectorSourceSpecification]
  }
  
  inline def VideoSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): typings.maplibreGl.styleSpecMod.VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.VideoSourceSpecification]
  }
}
