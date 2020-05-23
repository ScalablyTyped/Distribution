package typings.javascriptAstar.anon

import typings.javascriptAstar.Heuristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closest extends js.Object {
  var closest: js.UndefOr[Boolean] = js.undefined
  var heuristic: js.UndefOr[Heuristic] = js.undefined
}

object Closest {
  @scala.inline
  def apply(
    closest: js.UndefOr[Boolean] = js.undefined,
    heuristic: (/* pos0 */ X, /* pos1 */ X) => Double = null
  ): Closest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closest)) __obj.updateDynamic("closest")(closest.get.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2(heuristic))
    __obj.asInstanceOf[Closest]
  }
}

