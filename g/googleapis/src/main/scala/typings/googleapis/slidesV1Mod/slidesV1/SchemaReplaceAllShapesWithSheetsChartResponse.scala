package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of replacing shapes with a Google Sheets chart.
  */
@js.native
trait SchemaReplaceAllShapesWithSheetsChartResponse extends js.Object {
  /**
    * The number of shapes replaced with charts.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object SchemaReplaceAllShapesWithSheetsChartResponse {
  @scala.inline
  def apply(occurrencesChanged: js.UndefOr[Double] = js.undefined): SchemaReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(occurrencesChanged)) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReplaceAllShapesWithSheetsChartResponse]
  }
}

