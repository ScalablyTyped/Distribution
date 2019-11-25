package typings.koaDashSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Changed extends js.Object {
  var changed: Boolean
  var rolling: js.UndefOr[Boolean] = js.undefined
}

object Anon_Changed {
  @scala.inline
  def apply(changed: Boolean, rolling: js.UndefOr[Boolean] = js.undefined): Anon_Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Changed]
  }
}

