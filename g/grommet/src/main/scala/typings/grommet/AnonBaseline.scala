package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseline extends js.Object {
  var baseline: js.UndefOr[Double] = js.undefined
  var minSpeed: js.UndefOr[Double] = js.undefined
}

object AnonBaseline {
  @scala.inline
  def apply(baseline: Int | Double = null, minSpeed: Int | Double = null): AnonBaseline = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (minSpeed != null) __obj.updateDynamic("minSpeed")(minSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseline]
  }
}

