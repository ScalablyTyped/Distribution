package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Baseline extends js.Object {
  var baseline: js.UndefOr[Double] = js.undefined
  var minSpeed: js.UndefOr[Double] = js.undefined
}

object Anon_Baseline {
  @scala.inline
  def apply(baseline: Int | Double = null, minSpeed: Int | Double = null): Anon_Baseline = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (minSpeed != null) __obj.updateDynamic("minSpeed")(minSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Baseline]
  }
}

