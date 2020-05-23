package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partition extends js.Object {
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object Partition {
  @scala.inline
  def apply(
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    partition: js.UndefOr[Double] = js.undefined,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): Partition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partition]
  }
}

