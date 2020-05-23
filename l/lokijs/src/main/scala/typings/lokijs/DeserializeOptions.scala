package typings.lokijs

import typings.lokijs.lokijsBooleans.`false`
import typings.lokijs.lokijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lokijs.anon.Delimited
  - typings.lokijs.anon.Delimiter
*/
trait DeserializeOptions extends js.Object

object DeserializeOptions {
  @scala.inline
  def Delimited(
    delimited: `false`,
    delimiter: String = null,
    partition: js.UndefOr[Double] = js.undefined,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  def Delimiter(
    delimiter: String,
    delimited: `true` = null,
    partition: js.UndefOr[Double] = js.undefined,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (delimited != null) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (!js.isUndefined(partition)) __obj.updateDynamic("partition")(partition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

