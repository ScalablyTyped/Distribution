package typings
package humanizeDashDurationLib.humanizeDashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitMeasuresOptions extends js.Object {
  var d: js.UndefOr[scala.Double] = js.undefined
  var h: js.UndefOr[scala.Double] = js.undefined
  var m: js.UndefOr[scala.Double] = js.undefined
  var mo: js.UndefOr[scala.Double] = js.undefined
  var ms: js.UndefOr[scala.Double] = js.undefined
  var s: js.UndefOr[scala.Double] = js.undefined
  var w: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object UnitMeasuresOptions {
  @scala.inline
  def apply(
    d: scala.Int | scala.Double = null,
    h: scala.Int | scala.Double = null,
    m: scala.Int | scala.Double = null,
    mo: scala.Int | scala.Double = null,
    ms: scala.Int | scala.Double = null,
    s: scala.Int | scala.Double = null,
    w: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
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

