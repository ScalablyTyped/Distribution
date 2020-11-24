package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaflet.Map.MapOptions * / any */ @js.native
trait MapOptions extends js.Object {
  
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
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFeatureLayer(value: FeatureLayerOptions): Self = this.set("featureLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureLayer: Self = this.set("featureLayer", js.undefined)
    
    @scala.inline
    def setGridLayer(value: js.Any): Self = this.set("gridLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLayer: Self = this.set("gridLayer", js.undefined)
    
    @scala.inline
    def setInfoControl(value: ControlOptions): Self = this.set("infoControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoControl: Self = this.set("infoControl", js.undefined)
    
    @scala.inline
    def setLegendControl(value: ControlOptions): Self = this.set("legendControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendControl: Self = this.set("legendControl", js.undefined)
    
    @scala.inline
    def setShareControl(value: ShareControlOptions): Self = this.set("shareControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareControl: Self = this.set("shareControl", js.undefined)
    
    @scala.inline
    def setTileLayer(value: TileLayerOptions): Self = this.set("tileLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileLayer: Self = this.set("tileLayer", js.undefined)
  }
}
