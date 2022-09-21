package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.mod.FillLayerSpecification
  - typings.maplibreGl.mod.LineLayerSpecification
  - typings.maplibreGl.mod.SymbolLayerSpecification
  - typings.maplibreGl.mod.CircleLayerSpecification
  - typings.maplibreGl.mod.HeatmapLayerSpecification
  - typings.maplibreGl.mod.FillExtrusionLayerSpecification
  - typings.maplibreGl.mod.RasterLayerSpecification
  - typings.maplibreGl.mod.HillshadeLayerSpecification
  - typings.maplibreGl.mod.BackgroundLayerSpecification
*/
trait LayerSpecification extends StObject
object LayerSpecification {
  
  inline def BackgroundLayerSpecification(id: String): typings.maplibreGl.mod.BackgroundLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.maplibreGl.mod.BackgroundLayerSpecification]
  }
  
  inline def CircleLayerSpecification(id: String, source: String): typings.maplibreGl.mod.CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.maplibreGl.mod.CircleLayerSpecification]
  }
  
  inline def FillExtrusionLayerSpecification(id: String, source: String): typings.maplibreGl.mod.FillExtrusionLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.maplibreGl.mod.FillExtrusionLayerSpecification]
  }
  
  inline def FillLayerSpecification(id: String, source: String): typings.maplibreGl.mod.FillLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.maplibreGl.mod.FillLayerSpecification]
  }
  
  inline def HeatmapLayerSpecification(id: String, source: String): typings.maplibreGl.mod.HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.maplibreGl.mod.HeatmapLayerSpecification]
  }
  
  inline def HillshadeLayerSpecification(id: String, source: String): typings.maplibreGl.mod.HillshadeLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.maplibreGl.mod.HillshadeLayerSpecification]
  }
  
  inline def LineLayerSpecification(id: String, source: String): typings.maplibreGl.mod.LineLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.maplibreGl.mod.LineLayerSpecification]
  }
  
  inline def RasterLayerSpecification(id: String, source: String): typings.maplibreGl.mod.RasterLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreGl.mod.RasterLayerSpecification]
  }
  
  inline def SymbolLayerSpecification(id: String, source: String): typings.maplibreGl.mod.SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.maplibreGl.mod.SymbolLayerSpecification]
  }
}
