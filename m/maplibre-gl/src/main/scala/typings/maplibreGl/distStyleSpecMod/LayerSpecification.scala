package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.distStyleSpecMod.FillLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.LineLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.SymbolLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.CircleLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.HeatmapLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.FillExtrusionLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.RasterLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.HillshadeLayerSpecification
  - typings.maplibreGl.distStyleSpecMod.BackgroundLayerSpecification
*/
trait LayerSpecification extends StObject
object LayerSpecification {
  
  inline def BackgroundLayerSpecification(id: String): typings.maplibreGl.distStyleSpecMod.BackgroundLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.BackgroundLayerSpecification]
  }
  
  inline def CircleLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.CircleLayerSpecification]
  }
  
  inline def FillExtrusionLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.FillExtrusionLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.FillExtrusionLayerSpecification]
  }
  
  inline def FillLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.FillLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.FillLayerSpecification]
  }
  
  inline def HeatmapLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.HeatmapLayerSpecification]
  }
  
  inline def HillshadeLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.HillshadeLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.HillshadeLayerSpecification]
  }
  
  inline def LineLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.LineLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.LineLayerSpecification]
  }
  
  inline def RasterLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.RasterLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.RasterLayerSpecification]
  }
  
  inline def SymbolLayerSpecification(id: String, source: String): typings.maplibreGl.distStyleSpecMod.SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typings.maplibreGl.distStyleSpecMod.SymbolLayerSpecification]
  }
}
