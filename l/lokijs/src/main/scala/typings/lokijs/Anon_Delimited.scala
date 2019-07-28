package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimited extends js.Object {
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object Anon_Delimited {
  @scala.inline
  def apply(
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    partition: Int | Double = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): Anon_Delimited = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[Anon_Delimited]
  }
}

