package typings.jqueryTimeago

import typings.jqueryTimeago.anon.Day
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeagoSetings extends js.Object {
  var allowFuture: js.UndefOr[Boolean] = js.undefined
  var refreshMillis: js.UndefOr[Double] = js.undefined
  var strings: js.UndefOr[Day] = js.undefined
}

object TimeagoSetings {
  @scala.inline
  def apply(
    allowFuture: js.UndefOr[Boolean] = js.undefined,
    refreshMillis: js.UndefOr[Double] = js.undefined,
    strings: Day = null
  ): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFuture)) __obj.updateDynamic("allowFuture")(allowFuture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshMillis)) __obj.updateDynamic("refreshMillis")(refreshMillis.get.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeagoSetings]
  }
}

