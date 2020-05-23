package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  var extend: js.UndefOr[Boolean] = js.undefined
}

object Apply {
  @scala.inline
  def apply(apply: js.UndefOr[Boolean] = js.undefined, extend: js.UndefOr[Boolean] = js.undefined): Apply = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apply]
  }
}

