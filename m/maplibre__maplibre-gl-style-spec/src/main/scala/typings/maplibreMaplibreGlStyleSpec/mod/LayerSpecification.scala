package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreMaplibreGlStyleSpec.mod.FillLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.LineLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.SymbolLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.CircleLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.HeatmapLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.FillExtrusionLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.RasterLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.HillshadeLayerSpecification
  - typings.maplibreMaplibreGlStyleSpec.mod.BackgroundLayerSpecification
*/
trait LayerSpecification extends StObject
object LayerSpecification {
  
  inline def BackgroundLayerSpecification(id: String): typings.maplibreMaplibreGlStyleSpec.mod.BackgroundLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.BackgroundLayerSpecification]
  }
  
  inline def CircleLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.CircleLayerSpecification]
  }
  
  inline def FillExtrusionLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.FillExtrusionLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.FillExtrusionLayerSpecification]
  }
  
  inline def FillLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.FillLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.FillLayerSpecification]
  }
  
  inline def HeatmapLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.HeatmapLayerSpecification]
  }
  
  inline def HillshadeLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.HillshadeLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.HillshadeLayerSpecification]
  }
  
  inline def LineLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.LineLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.LineLayerSpecification]
  }
  
  inline def RasterLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.RasterLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.RasterLayerSpecification]
  }
  
  inline def SymbolLayerSpecification(id: String, source: String): typings.maplibreMaplibreGlStyleSpec.mod.SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.mod.SymbolLayerSpecification]
  }
}
