package typings.materialMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var focusIndex: js.UndefOr[Double | Null] = js.undefined
}

object `0` {
  @scala.inline
  def apply(focusIndex: js.UndefOr[Null | Double] = js.undefined): `0` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusIndex)) __obj.updateDynamic("focusIndex")(focusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

