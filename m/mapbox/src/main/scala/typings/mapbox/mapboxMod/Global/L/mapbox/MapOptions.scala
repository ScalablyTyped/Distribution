package typings.mapbox.mapboxMod.Global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Leaflet.Map.MapOptions * / any */ trait MapOptions extends js.Object {
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
    if (featureLayer != null) __obj.updateDynamic("featureLayer")(featureLayer)
    if (gridLayer != null) __obj.updateDynamic("gridLayer")(gridLayer)
    if (infoControl != null) __obj.updateDynamic("infoControl")(infoControl)
    if (legendControl != null) __obj.updateDynamic("legendControl")(legendControl)
    if (shareControl != null) __obj.updateDynamic("shareControl")(shareControl)
    if (tileLayer != null) __obj.updateDynamic("tileLayer")(tileLayer)
    __obj.asInstanceOf[MapOptions]
  }
}

