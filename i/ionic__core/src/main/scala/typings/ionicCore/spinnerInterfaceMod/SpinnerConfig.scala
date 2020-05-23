package typings.ionicCore.spinnerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerConfig extends js.Object {
  var circles: js.UndefOr[Double] = js.undefined
  var dur: Double
  var elmDuration: js.UndefOr[Boolean] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  def fn(dur: Double, index: Double, total: Double): SpinnerData
}

object SpinnerConfig {
  @scala.inline
  def apply(
    dur: Double,
    fn: (Double, Double, Double) => SpinnerData,
    circles: js.UndefOr[Double] = js.undefined,
    elmDuration: js.UndefOr[Boolean] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined
  ): SpinnerConfig = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
    if (!js.isUndefined(circles)) __obj.updateDynamic("circles")(circles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elmDuration)) __obj.updateDynamic("elmDuration")(elmDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerConfig]
  }
}

