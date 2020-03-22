package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartition extends js.Object {
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object AnonPartition {
  @scala.inline
  def apply(
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    partition: Int | Double = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): AnonPartition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartition]
  }
}

