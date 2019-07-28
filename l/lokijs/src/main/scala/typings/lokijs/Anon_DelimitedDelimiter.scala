package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimitedDelimiter extends js.Object {
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var partitioned: js.UndefOr[Boolean] = js.undefined
}

object Anon_DelimitedDelimiter {
  @scala.inline
  def apply(
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): Anon_DelimitedDelimiter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[Anon_DelimitedDelimiter]
  }
}

