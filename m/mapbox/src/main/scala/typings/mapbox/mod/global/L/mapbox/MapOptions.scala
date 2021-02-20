package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaflet.Map.MapOptions * / any */ @js.native
trait MapOptions extends StObject {
  
  var featureLayer: js.UndefOr[FeatureLayerOptions] = js.native
  
  var gridLayer: js.UndefOr[js.Any] = js.native
  
  var infoControl: js.UndefOr[ControlOptions] = js.native
  
  var legendControl: js.UndefOr[ControlOptions] = js.native
  
  var shareControl: js.UndefOr[ShareControlOptions] = js.native
  
  var tileLayer: js.UndefOr[TileLayerOptions] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureLayer(value: FeatureLayerOptions): Self = StObject.set(x, "featureLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureLayerUndefined: Self = StObject.set(x, "featureLayer", js.undefined)
    
    @scala.inline
    def setGridLayer(value: js.Any): Self = StObject.set(x, "gridLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLayerUndefined: Self = StObject.set(x, "gridLayer", js.undefined)
    
    @scala.inline
    def setInfoControl(value: ControlOptions): Self = StObject.set(x, "infoControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoControlUndefined: Self = StObject.set(x, "infoControl", js.undefined)
    
    @scala.inline
    def setLegendControl(value: ControlOptions): Self = StObject.set(x, "legendControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendControlUndefined: Self = StObject.set(x, "legendControl", js.undefined)
    
    @scala.inline
    def setShareControl(value: ShareControlOptions): Self = StObject.set(x, "shareControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareControlUndefined: Self = StObject.set(x, "shareControl", js.undefined)
    
    @scala.inline
    def setTileLayer(value: TileLayerOptions): Self = StObject.set(x, "tileLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileLayerUndefined: Self = StObject.set(x, "tileLayer", js.undefined)
  }
}
