package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaflet.Map.MapOptions * / any */ trait MapOptions extends js.Object {
  var featureLayer: js.UndefOr[FeatureLayerOptions] = js.undefined
  var gridLayer: js.UndefOr[js.Any] = js.undefined
  var infoControl: js.UndefOr[ControlOptions] = js.undefined
  var legendControl: js.UndefOr[ControlOptions] = js.undefined
  var shareControl: js.UndefOr[ShareControlOptions] = js.undefined
  var tileLayer: js.UndefOr[TileLayerOptions] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    featureLayer: FeatureLayerOptions = null,
    gridLayer: js.Any = null,
    infoControl: ControlOptions = null,
    legendControl: ControlOptions = null,
    shareControl: ShareControlOptions = null,
    tileLayer: TileLayerOptions = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (featureLayer != null) __obj.updateDynamic("featureLayer")(featureLayer.asInstanceOf[js.Any])
    if (gridLayer != null) __obj.updateDynamic("gridLayer")(gridLayer.asInstanceOf[js.Any])
    if (infoControl != null) __obj.updateDynamic("infoControl")(infoControl.asInstanceOf[js.Any])
    if (legendControl != null) __obj.updateDynamic("legendControl")(legendControl.asInstanceOf[js.Any])
    if (shareControl != null) __obj.updateDynamic("shareControl")(shareControl.asInstanceOf[js.Any])
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

