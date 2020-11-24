package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import typings.std.HTMLCanvasElement
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
trait AnySourceData extends js.Object
object AnySourceData {
  
  @scala.inline
  def ImageSourceRaw(`type`: image_): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def RasterDemSource(`type`: `raster-dem`): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def VectorSource(`type`: vector): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def GeoJSONSourceRaw(`type`: geojson): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def RasterSource(`type`: raster): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]], `type`: canvas): AnySourceData = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def VideoSourceRaw(`type`: video): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
}
