package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    security: Security = null,
    start: scala.Int | scala.Double = null,
    threshold: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[Anon_End]
  }
}

