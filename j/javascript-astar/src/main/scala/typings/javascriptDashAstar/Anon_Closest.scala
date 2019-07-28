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
  def apply(closest: js.UndefOr[Boolean] = js.undefined, heuristic: Heuristic = null): Anon_Closest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closest)) __obj.updateDynamic("closest")(closest)
    if (heuristic != null) __obj.updateDynamic("heuristic")(heuristic)
    __obj.asInstanceOf[Anon_Closest]
  }
}

