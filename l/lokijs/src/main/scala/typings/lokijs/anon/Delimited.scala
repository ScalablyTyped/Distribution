package typings.lokijs.anon

import typings.lokijs.DeserializeOptions
import typings.lokijs.lokijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimited extends DeserializeOptions {
  var delimited: `false`
  var delimiter: js.UndefOr[String] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object Delimited {
  @scala.inline
  def apply(
    delimited: `false`,
    delimiter: String = null,
    partition: js.UndefOr[Double] = js.undefined,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): Delimited = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimited]
  }
}

