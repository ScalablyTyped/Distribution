package typings.materialRipple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsUnbounded extends js.Object {
  var isUnbounded: js.UndefOr[Boolean] = js.undefined
}

object AnonIsUnbounded {
  @scala.inline
  def apply(isUnbounded: js.UndefOr[Boolean] = js.undefined): AnonIsUnbounded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isUnbounded)) __obj.updateDynamic("isUnbounded")(isUnbounded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsUnbounded]
  }
}

