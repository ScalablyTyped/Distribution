package typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerConfig extends js.Object {
  var circles: js.UndefOr[Double] = js.undefined
  var dur: Double
  var lines: js.UndefOr[Double] = js.undefined
  def fn(dur: Double, index: Double, total: Double): SpinnerData
}

object SpinnerConfig {
  @scala.inline
  def apply(
    dur: Double,
    fn: (Double, Double, Double) => SpinnerData,
    circles: Int | Double = null,
    lines: Int | Double = null
  ): SpinnerConfig = {
    val __obj = js.Dynamic.literal(dur = dur, fn = js.Any.fromFunction3(fn))
    if (circles != null) __obj.updateDynamic("circles")(circles.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerConfig]
  }
}

