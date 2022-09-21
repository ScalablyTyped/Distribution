package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.styleSpecMod.FillLayerSpecification
  - typings.maplibreGl.styleSpecMod.LineLayerSpecification
  - typings.maplibreGl.styleSpecMod.SymbolLayerSpecification
  - typings.maplibreGl.styleSpecMod.CircleLayerSpecification
  - typings.maplibreGl.styleSpecMod.HeatmapLayerSpecification
  - typings.maplibreGl.styleSpecMod.FillExtrusionLayerSpecification
  - typings.maplibreGl.styleSpecMod.RasterLayerSpecification
  - typings.maplibreGl.styleSpecMod.HillshadeLayerSpecification
  - typings.maplibreGl.styleSpecMod.BackgroundLayerSpecification
*/
trait LayerSpecification extends StObject
object LayerSpecification {
  
  inline def BackgroundLayerSpecification(id: String): typings.maplibreGl.styleSpecMod.BackgroundLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.BackgroundLayerSpecification]
  }
  
  inline def CircleLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.CircleLayerSpecification]
  }
  
  inline def FillExtrusionLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.FillExtrusionLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.FillExtrusionLayerSpecification]
  }
  
  inline def FillLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.FillLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.FillLayerSpecification]
  }
  
  inline def HeatmapLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.HeatmapLayerSpecification]
  }
  
  inline def HillshadeLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.HillshadeLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.HillshadeLayerSpecification]
  }
  
  inline def LineLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.LineLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.LineLayerSpecification]
  }
  
  inline def RasterLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.RasterLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.RasterLayerSpecification]
  }
  
  inline def SymbolLayerSpecification(id: String, source: String): typings.maplibreGl.styleSpecMod.SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.maplibreGl.styleSpecMod.SymbolLayerSpecification]
  }
}
