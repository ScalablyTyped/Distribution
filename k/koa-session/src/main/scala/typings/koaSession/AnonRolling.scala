package typings.koaSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRolling extends js.Object {
  var rolling: js.UndefOr[Boolean] = js.undefined
}

object AnonRolling {
  @scala.inline
  def apply(rolling: js.UndefOr[Boolean] = js.undefined): AnonRolling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRolling]
  }
}

