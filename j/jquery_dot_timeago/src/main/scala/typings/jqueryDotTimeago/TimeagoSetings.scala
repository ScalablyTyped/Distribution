package typings.jqueryDotTimeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeagoSetings extends js.Object {
  var allowFuture: js.UndefOr[Boolean] = js.undefined
  var refreshMillis: js.UndefOr[Double] = js.undefined
  var strings: js.UndefOr[Anon_Day] = js.undefined
}

object TimeagoSetings {
  @scala.inline
  def apply(
    allowFuture: js.UndefOr[Boolean] = js.undefined,
    refreshMillis: Int | Double = null,
    strings: Anon_Day = null
  ): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFuture)) __obj.updateDynamic("allowFuture")(allowFuture.asInstanceOf[js.Any])
    if (refreshMillis != null) __obj.updateDynamic("refreshMillis")(refreshMillis.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeagoSetings]
  }
}

