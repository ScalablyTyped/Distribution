package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A histogram series containing the series color and data.
  */
@js.native
trait SchemaHistogramSeries extends js.Object {
  /**
    * The color of the column representing this series in each bucket. This
    * field is optional.
    */
  var barColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The data for this histogram series.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
}

object SchemaHistogramSeries {
  @scala.inline
  def apply(barColor: SchemaColor = null, data: SchemaChartData = null): SchemaHistogramSeries = {
    val __obj = js.Dynamic.literal()
    if (barColor != null) __obj.updateDynamic("barColor")(barColor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistogramSeries]
  }
}

