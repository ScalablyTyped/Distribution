package typings.javascriptDashAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closest extends js.Object {
  var closest: js.UndefOr[Boolean] = js.undefined
  var heuristic: js.UndefOr[Heuristic] = js.undefined
}

object Anon_Closest {
  @scala.inline
  def apply(
    closest: js.UndefOr[Boolean] = js.undefined,
    heuristic: (/* pos0 */ Anon_X, /* pos1 */ Anon_X) => Double = null
  ): Anon_Closest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closest)) __obj.updateDynamic("closest")(closest.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    __obj.asInstanceOf[Anon_Closest]
  }
}

