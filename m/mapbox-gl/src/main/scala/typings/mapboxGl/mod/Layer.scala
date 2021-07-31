package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.BackgroundLayer
  - typings.mapboxGl.mod.CircleLayer
  - typings.mapboxGl.mod.FillExtrusionLayer
  - typings.mapboxGl.mod.FillLayer
  - typings.mapboxGl.mod.HeatmapLayer
  - typings.mapboxGl.mod.HillshadeLayer
  - typings.mapboxGl.mod.LineLayer
  - typings.mapboxGl.mod.RasterLayer
  - typings.mapboxGl.mod.SymbolLayer
*/
trait Layer extends StObject
object Layer {
  
  @scala.inline
  def BackgroundLayer(id: String): typings.mapboxGl.mod.BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.mapboxGl.mod.BackgroundLayer]
  }
  
  @scala.inline
  def CircleLayer(id: String): typings.mapboxGl.mod.CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.mapboxGl.mod.CircleLayer]
  }
  
  @scala.inline
  def FillExtrusionLayer(id: String): typings.mapboxGl.mod.FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.mapboxGl.mod.FillExtrusionLayer]
  }
  
  @scala.inline
  def FillLayer(id: String): typings.mapboxGl.mod.FillLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.mapboxGl.mod.FillLayer]
  }
  
  @scala.inline
  def HeatmapLayer(id: String): typings.mapboxGl.mod.HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.mapboxGl.mod.HeatmapLayer]
  }
  
  @scala.inline
  def HillshadeLayer(id: String): typings.mapboxGl.mod.HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.mapboxGl.mod.HillshadeLayer]
  }
  
  @scala.inline
  def LineLayer(id: String): typings.mapboxGl.mod.LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.mapboxGl.mod.LineLayer]
  }
  
  @scala.inline
  def RasterLayer(id: String): typings.mapboxGl.mod.RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.mapboxGl.mod.RasterLayer]
  }
  
  @scala.inline
  def SymbolLayer(id: String): typings.mapboxGl.mod.SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.mapboxGl.mod.SymbolLayer]
  }
}
