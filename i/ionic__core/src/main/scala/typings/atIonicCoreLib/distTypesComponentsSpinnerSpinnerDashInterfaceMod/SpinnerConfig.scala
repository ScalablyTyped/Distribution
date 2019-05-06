package typings
package atIonicCoreLib.distTypesComponentsSpinnerSpinnerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerConfig extends js.Object {
  var circles: js.UndefOr[scala.Double] = js.undefined
  var dur: scala.Double
  var lines: js.UndefOr[scala.Double] = js.undefined
  def fn(dur: scala.Double, index: scala.Double, total: scala.Double): SpinnerData
}

object SpinnerConfig {
  @scala.inline
  def apply(
    dur: scala.Double,
    fn: (scala.Double, scala.Double, scala.Double) => SpinnerData,
    circles: scala.Int | scala.Double = null,
    lines: scala.Int | scala.Double = null
  ): SpinnerConfig = {
    val __obj = js.Dynamic.literal(dur = dur, fn = js.Any.fromFunction3(fn))
    if (circles != null) __obj.updateDynamic("circles")(circles.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerConfig]
  }
}

