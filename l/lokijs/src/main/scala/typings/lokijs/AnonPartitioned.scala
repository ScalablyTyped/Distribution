package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartitioned extends js.Object {
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object AnonPartitioned {
  @scala.inline
  def apply(
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): AnonPartitioned = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartitioned]
  }
}

