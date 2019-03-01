package typings
package jqueryDotTimeagoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeagoSetings extends js.Object {
  var allowFuture: js.UndefOr[scala.Boolean] = js.undefined
  var refreshMillis: js.UndefOr[scala.Double] = js.undefined
  var strings: js.UndefOr[Anon_Day] = js.undefined
}

object TimeagoSetings {
  @scala.inline
  def apply(
    allowFuture: js.UndefOr[scala.Boolean] = js.undefined,
    refreshMillis: scala.Int | scala.Double = null,
    strings: Anon_Day = null
  ): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFuture)) __obj.updateDynamic("allowFuture")(allowFuture)
    if (refreshMillis != null) __obj.updateDynamic("refreshMillis")(refreshMillis.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings)
    __obj.asInstanceOf[TimeagoSetings]
  }
}

