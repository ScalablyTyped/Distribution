package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A chart embedded in a sheet.
  */
@js.native
trait SchemaEmbeddedChart extends js.Object {
  /**
    * The ID of the chart.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The position of the chart.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.native
  /**
    * The specification of the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.native
}

object SchemaEmbeddedChart {
  @scala.inline
  def apply(
    chartId: Int | Double = null,
    position: SchemaEmbeddedObjectPosition = null,
    spec: SchemaChartSpec = null
  ): SchemaEmbeddedChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmbeddedChart]
  }
}

