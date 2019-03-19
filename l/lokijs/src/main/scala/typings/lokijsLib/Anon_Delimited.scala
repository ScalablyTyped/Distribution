package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimited extends DeserializeOptions {
  var delimited: lokijsLib.lokijsLibNumbers.`false`
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var partitioned: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Delimited {
  @scala.inline
  def apply(
    delimited: lokijsLib.lokijsLibNumbers.`false`,
    delimiter: java.lang.String = null,
    partition: scala.Int | scala.Double = null,
    partitioned: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Delimited = {
    val __obj = js.Dynamic.literal(delimited = delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[Anon_Delimited]
  }
}

