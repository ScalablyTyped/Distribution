package typings.lokijs.anon

import typings.lokijs.DeserializeOptions
import typings.lokijs.lokijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends DeserializeOptions {
  var delimited: js.UndefOr[`true`] = js.undefined
  var delimiter: String
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object Delimiter {
  @scala.inline
  def apply(
    delimiter: String,
    delimited: `true` = null,
    partition: js.UndefOr[Double] = js.undefined,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (delimited != null) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
}

