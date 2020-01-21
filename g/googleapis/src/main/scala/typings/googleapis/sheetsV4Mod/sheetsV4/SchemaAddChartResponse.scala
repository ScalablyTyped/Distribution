package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a chart to a spreadsheet.
  */
@js.native
trait SchemaAddChartResponse extends js.Object {
  /**
    * The newly added chart.
    */
  var chart: js.UndefOr[SchemaEmbeddedChart] = js.native
}

object SchemaAddChartResponse {
  @scala.inline
  def apply(chart: SchemaEmbeddedChart = null): SchemaAddChartResponse = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddChartResponse]
  }
}

