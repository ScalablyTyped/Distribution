package typings.koaSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changed extends js.Object {
  var changed: Boolean
  var rolling: js.UndefOr[Boolean] = js.undefined
}

object Changed {
  @scala.inline
  def apply(changed: Boolean, rolling: js.UndefOr[Boolean] = js.undefined): Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
}

