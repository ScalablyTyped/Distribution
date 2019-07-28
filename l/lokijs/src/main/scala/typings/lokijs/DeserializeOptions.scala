package typings.lokijs

import typings.lokijs.lokijsNumbers.`false`
import typings.lokijs.lokijsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  var delimited: js.UndefOr[`false` | `true`] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(
    delimited: `false` = null,
    delimiter: String = null,
    partition: Int | Double = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (delimited != null) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[DeserializeOptions]
  }
}

