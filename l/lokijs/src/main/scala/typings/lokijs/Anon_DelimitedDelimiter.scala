package typings.lokijs

import typings.lokijs.lokijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimitedDelimiter extends DeserializeOptions {
  var delimited: js.UndefOr[`true`] = js.undefined
  var delimiter: String
  var partition: js.UndefOr[Double] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object Anon_DelimitedDelimiter {
  @scala.inline
  def apply(
    delimiter: String,
    delimited: `true` = null,
    partition: Int | Double = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): Anon_DelimitedDelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (delimited != null) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DelimitedDelimiter]
  }
}

