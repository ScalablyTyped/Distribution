package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The domain of a CandlestickChart.
  */
@js.native
trait SchemaCandlestickDomain extends js.Object {
  /**
    * The data of the CandlestickDomain.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean] = js.native
}

object SchemaCandlestickDomain {
  @scala.inline
  def apply(data: SchemaChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): SchemaCandlestickDomain = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCandlestickDomain]
  }
}

