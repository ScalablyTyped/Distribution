package typings.mapboxGl.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.GeoJSONSourceRaw
  - typings.mapboxGl.mod.VideoSourceRaw
  - typings.mapboxGl.mod.ImageSourceRaw
  - typings.mapboxGl.mod.CanvasSourceRaw
  - typings.mapboxGl.mod.VectorSource
  - typings.mapboxGl.mod.RasterSource
  - typings.mapboxGl.mod.RasterDemSource
*/
trait AnySourceData extends StObject
object AnySourceData {
  
  inline def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): typings.mapboxGl.mod.CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[typings.mapboxGl.mod.CanvasSourceRaw]
  }
  
  inline def GeoJSONSourceRaw(): typings.mapboxGl.mod.GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.mapboxGl.mod.GeoJSONSourceRaw]
  }
  
  inline def ImageSourceRaw(): typings.mapboxGl.mod.ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.mapboxGl.mod.ImageSourceRaw]
  }
  
  inline def RasterDemSource(): typings.mapboxGl.mod.RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typings.mapboxGl.mod.RasterDemSource]
  }
  
  inline def RasterSource(): typings.mapboxGl.mod.RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.mapboxGl.mod.RasterSource]
  }
  
  inline def VectorSource(): typings.mapboxGl.mod.VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typings.mapboxGl.mod.VectorSource]
  }
  
  inline def VideoSourceRaw(): typings.mapboxGl.mod.VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.mapboxGl.mod.VideoSourceRaw]
  }
}
