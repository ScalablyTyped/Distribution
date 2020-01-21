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
    d: Int | Double = null,
    h: Int | Double = null,
    m: Int | Double = null,
    mo: Int | Double = null,
    ms: Int | Double = null,
    s: Int | Double = null,
    w: Int | Double = null,
    y: Int | Double = null
  ): UnitMeasuresOptions = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mo != null) __obj.updateDynamic("mo")(mo.asInstanceOf[js.Any])
    if (ms != null) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitMeasuresOptions]
  }
}

