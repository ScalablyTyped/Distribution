package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosest extends js.Object {
  var closest: js.UndefOr[Boolean] = js.undefined
  var heuristic: js.UndefOr[Heuristic] = js.undefined
}

object AnonClosest {
  @scala.inline
  def apply(
    closest: js.UndefOr[Boolean] = js.undefined,
    heuristic: (/* pos0 */ AnonX, /* pos1 */ AnonX) => Double = null
  ): AnonClosest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closest)) __obj.updateDynamic("closest")(closest.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    __obj.asInstanceOf[AnonClosest]
  }
}

