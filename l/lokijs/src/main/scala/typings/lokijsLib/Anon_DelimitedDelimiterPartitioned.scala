package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimitedDelimiterPartitioned extends js.Object {
  var delimited: js.UndefOr[scala.Boolean] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var partitioned: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DelimitedDelimiterPartitioned {
  @scala.inline
  def apply(
    delimited: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null,
    partitioned: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DelimitedDelimiterPartitioned = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned)
    __obj.asInstanceOf[Anon_DelimitedDelimiterPartitioned]
  }
}

