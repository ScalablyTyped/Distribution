package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates a chart&#39;s specifications. (This does not move or resize a
  * chart. To move or resize a chart, use UpdateEmbeddedObjectPositionRequest.)
  */
@js.native
trait SchemaUpdateChartSpecRequest extends js.Object {
  /**
    * The ID of the chart to update.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The specification to apply to the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.native
}

object SchemaUpdateChartSpecRequest {
  @scala.inline
  def apply(chartId: js.UndefOr[Double] = js.undefined, spec: SchemaChartSpec = null): SchemaUpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartId)) __obj.updateDynamic("chartId")(chartId.get.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateChartSpecRequest]
  }
}

