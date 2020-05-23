package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Baseline extends js.Object {
  var baseline: js.UndefOr[Double] = js.undefined
  var minSpeed: js.UndefOr[Double] = js.undefined
}

object Baseline {
  @scala.inline
  def apply(baseline: js.UndefOr[Double] = js.undefined, minSpeed: js.UndefOr[Double] = js.undefined): Baseline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseline)) __obj.updateDynamic("baseline")(baseline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSpeed)) __obj.updateDynamic("minSpeed")(minSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseline]
  }
}

