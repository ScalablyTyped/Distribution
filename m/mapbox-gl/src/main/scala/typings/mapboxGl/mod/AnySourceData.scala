package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]], `type`: canvas): typings.mapboxGl.mod.CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.CanvasSourceRaw]
  }
  
  @scala.inline
  def GeoJSONSourceRaw(`type`: geojson): typings.mapboxGl.mod.GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.GeoJSONSourceRaw]
  }
  
  @scala.inline
  def ImageSourceRaw(`type`: image_): typings.mapboxGl.mod.ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.ImageSourceRaw]
  }
  
  @scala.inline
  def RasterDemSource(`type`: `raster-dem`): typings.mapboxGl.mod.RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.RasterDemSource]
  }
  
  @scala.inline
  def RasterSource(`type`: raster): typings.mapboxGl.mod.RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.RasterSource]
  }
  
  @scala.inline
  def VectorSource(`type`: vector): typings.mapboxGl.mod.VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.VectorSource]
  }
  
  @scala.inline
  def VideoSourceRaw(`type`: video): typings.mapboxGl.mod.VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mapboxGl.mod.VideoSourceRaw]
  }
}
