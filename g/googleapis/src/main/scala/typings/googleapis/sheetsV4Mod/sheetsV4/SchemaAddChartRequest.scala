package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a chart to a sheet in the spreadsheet.
  */
@js.native
trait SchemaAddChartRequest extends js.Object {
  /**
    * The chart that should be added to the spreadsheet, including the position
    * where it should be placed. The chartId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a chart that already exists.)
    */
  var chart: js.UndefOr[SchemaEmbeddedChart] = js.native
}

object SchemaAddChartRequest {
  @scala.inline
  def apply(chart: SchemaEmbeddedChart = null): SchemaAddChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddChartRequest]
  }
}

