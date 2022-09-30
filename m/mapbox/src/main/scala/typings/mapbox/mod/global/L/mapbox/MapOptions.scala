package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaflet.Map.MapOptions * / any */ trait MapOptions extends StObject {
  
  var featureLayer: js.UndefOr[FeatureLayerOptions] = js.undefined
  
  var gridLayer: js.UndefOr[Any] = js.undefined
  
  var infoControl: js.UndefOr[ControlOptions] = js.undefined
  
  var legendControl: js.UndefOr[ControlOptions] = js.undefined
  
  var shareControl: js.UndefOr[ShareControlOptions] = js.undefined
  
  var tileLayer: js.UndefOr[TileLayerOptions] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setFeatureLayer(value: FeatureLayerOptions): Self = StObject.set(x, "featureLayer", value.asInstanceOf[js.Any])
    
    inline def setFeatureLayerUndefined: Self = StObject.set(x, "featureLayer", js.undefined)
    
    inline def setGridLayer(value: Any): Self = StObject.set(x, "gridLayer", value.asInstanceOf[js.Any])
    
    inline def setGridLayerUndefined: Self = StObject.set(x, "gridLayer", js.undefined)
    
    inline def setInfoControl(value: ControlOptions): Self = StObject.set(x, "infoControl", value.asInstanceOf[js.Any])
    
    inline def setInfoControlUndefined: Self = StObject.set(x, "infoControl", js.undefined)
    
    inline def setLegendControl(value: ControlOptions): Self = StObject.set(x, "legendControl", value.asInstanceOf[js.Any])
    
    inline def setLegendControlUndefined: Self = StObject.set(x, "legendControl", js.undefined)
    
    inline def setShareControl(value: ShareControlOptions): Self = StObject.set(x, "shareControl", value.asInstanceOf[js.Any])
    
    inline def setShareControlUndefined: Self = StObject.set(x, "shareControl", js.undefined)
    
    inline def setTileLayer(value: TileLayerOptions): Self = StObject.set(x, "tileLayer", value.asInstanceOf[js.Any])
    
    inline def setTileLayerUndefined: Self = StObject.set(x, "tileLayer", js.undefined)
  }
}
