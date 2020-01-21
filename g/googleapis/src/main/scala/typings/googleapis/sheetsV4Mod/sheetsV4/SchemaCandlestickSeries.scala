package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The series of a CandlestickData.
  */
@js.native
trait SchemaCandlestickSeries extends js.Object {
  /**
    * The data of the CandlestickSeries.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
}

object SchemaCandlestickSeries {
  @scala.inline
  def apply(data: SchemaChartData = null): SchemaCandlestickSeries = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCandlestickSeries]
  }
}

