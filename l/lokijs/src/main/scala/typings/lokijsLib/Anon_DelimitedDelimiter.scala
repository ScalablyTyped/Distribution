package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimitedDelimiter extends DeserializeOptions {
  var delimited: js.UndefOr[lokijsLib.lokijsLibNumbers.`true`] = js.undefined
  var delimiter: java.lang.String
  var partition: js.UndefOr[scala.Double] = js.undefined
  var partitioned: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DelimitedDelimiter {
  @scala.inline
  def apply(
    delimiter: java.lang.String,
    delimited: lokijsLib.lokijsLibNumbers.`true` = null,
    partition: scala.Int | scala.Double = null,
    partitioned: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DelimitedDelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter)
    if (delimited != null) __obj.updateDynamic("delimited")(delimited)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[Anon_DelimitedDelimiter]
  }
}

