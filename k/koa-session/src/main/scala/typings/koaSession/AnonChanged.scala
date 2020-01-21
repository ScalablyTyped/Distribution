package typings.koaSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChanged extends js.Object {
  var changed: Boolean
  var rolling: js.UndefOr[Boolean] = js.undefined
}

object AnonChanged {
  @scala.inline
  def apply(changed: Boolean, rolling: js.UndefOr[Boolean] = js.undefined): AnonChanged = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChanged]
  }
}

