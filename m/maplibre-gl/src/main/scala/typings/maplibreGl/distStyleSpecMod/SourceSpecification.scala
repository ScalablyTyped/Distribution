package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.distStyleSpecMod.VectorSourceSpecification
  - typings.maplibreGl.distStyleSpecMod.RasterSourceSpecification
  - typings.maplibreGl.distStyleSpecMod.RasterDEMSourceSpecification
  - typings.maplibreGl.distStyleSpecMod.GeoJSONSourceSpecification
  - typings.maplibreGl.distStyleSpecMod.VideoSourceSpecification
  - typings.maplibreGl.distStyleSpecMod.ImageSourceSpecification
*/
trait SourceSpecification extends StObject
object SourceSpecification {
  
  inline def GeoJSONSourceSpecification(): typings.maplibreGl.distStyleSpecMod.GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.GeoJSONSourceSpecification]
  }
  
  inline def ImageSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): typings.maplibreGl.distStyleSpecMod.ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.ImageSourceSpecification]
  }
  
  inline def RasterDEMSourceSpecification(): typings.maplibreGl.distStyleSpecMod.RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.RasterDEMSourceSpecification]
  }
  
  inline def RasterSourceSpecification(): typings.maplibreGl.distStyleSpecMod.RasterSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.RasterSourceSpecification]
  }
  
  inline def VectorSourceSpecification(): typings.maplibreGl.distStyleSpecMod.VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.VectorSourceSpecification]
  }
  
  inline def VideoSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): typings.maplibreGl.distStyleSpecMod.VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.VideoSourceSpecification]
  }
}
