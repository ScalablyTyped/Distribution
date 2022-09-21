package typings.mapboxGl.mod

import typings.std.WebGLRenderingContext
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
  - typings.mapboxGl.mod.CustomLayerInterface
  - typings.mapboxGl.mod.SkyLayer
*/
trait AnyLayer extends StObject
object AnyLayer {
  
  inline def BackgroundLayer(id: String): typings.mapboxGl.mod.BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.mapboxGl.mod.BackgroundLayer]
  }
  
  inline def CircleLayer(id: String): typings.mapboxGl.mod.CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.mapboxGl.mod.CircleLayer]
  }
  
  inline def CustomLayerInterface(id: String, render: (WebGLRenderingContext, js.Array[Double]) => Unit): typings.mapboxGl.mod.CustomLayerInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.mapboxGl.mod.CustomLayerInterface]
  }
  
  inline def FillExtrusionLayer(id: String): typings.mapboxGl.mod.FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.mapboxGl.mod.FillExtrusionLayer]
  }
  
  inline def FillLayer(id: String): typings.mapboxGl.mod.FillLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.mapboxGl.mod.FillLayer]
  }
  
  inline def HeatmapLayer(id: String): typings.mapboxGl.mod.HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.mapboxGl.mod.HeatmapLayer]
  }
  
  inline def HillshadeLayer(id: String): typings.mapboxGl.mod.HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.mapboxGl.mod.HillshadeLayer]
  }
  
  inline def LineLayer(id: String): typings.mapboxGl.mod.LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.mapboxGl.mod.LineLayer]
  }
  
  inline def RasterLayer(id: String): typings.mapboxGl.mod.RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.mapboxGl.mod.RasterLayer]
  }
  
  inline def SkyLayer(id: String): typings.mapboxGl.mod.SkyLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sky")
    __obj.asInstanceOf[typings.mapboxGl.mod.SkyLayer]
  }
  
  inline def SymbolLayer(id: String): typings.mapboxGl.mod.SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.mapboxGl.mod.SymbolLayer]
  }
}
