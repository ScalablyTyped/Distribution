package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong extends js.Object {
  var medium: js.UndefOr[Double] = js.undefined
  var strong: js.UndefOr[Double] = js.undefined
  var weak: js.UndefOr[Double] = js.undefined
}

object Strong {
  @scala.inline
  def apply(
    medium: js.UndefOr[Double] = js.undefined,
    strong: js.UndefOr[Double] = js.undefined,
    weak: js.UndefOr[Double] = js.undefined
  ): Strong = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(medium)) __obj.updateDynamic("medium")(medium.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strong)) __obj.updateDynamic("strong")(strong.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strong]
  }
}

