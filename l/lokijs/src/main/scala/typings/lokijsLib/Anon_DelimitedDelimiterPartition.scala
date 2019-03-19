package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimitedDelimiterPartition extends js.Object {
  var delimited: js.UndefOr[scala.Boolean] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var partitioned: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DelimitedDelimiterPartition {
  @scala.inline
  def apply(
    delimited: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null,
    partition: scala.Int | scala.Double = null,
    partitioned: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DelimitedDelimiterPartition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[Anon_DelimitedDelimiterPartition]
  }
}

