package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grow extends js.Object {
  var grow: js.UndefOr[Double] = js.undefined
  var shrink: js.UndefOr[Double] = js.undefined
}

object Grow {
  @scala.inline
  def apply(grow: js.UndefOr[Double] = js.undefined, shrink: js.UndefOr[Double] = js.undefined): Grow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(grow)) __obj.updateDynamic("grow")(grow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grow]
  }
}

