package typings.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitMeasuresOptions extends js.Object {
  var d: js.UndefOr[Double] = js.undefined
  var h: js.UndefOr[Double] = js.undefined
  var m: js.UndefOr[Double] = js.undefined
  var mo: js.UndefOr[Double] = js.undefined
  var ms: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[Double] = js.undefined
  var w: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object UnitMeasuresOptions {
  @scala.inline
  def apply(
    d: js.UndefOr[Double] = js.undefined,
    h: js.UndefOr[Double] = js.undefined,
    m: js.UndefOr[Double] = js.undefined,
    mo: js.UndefOr[Double] = js.undefined,
    ms: js.UndefOr[Double] = js.undefined,
    s: js.UndefOr[Double] = js.undefined,
    w: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): UnitMeasuresOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.get.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mo)) __obj.updateDynamic("mo")(mo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ms)) __obj.updateDynamic("ms")(ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s)) __obj.updateDynamic("s")(s.get.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitMeasuresOptions]
  }
}

