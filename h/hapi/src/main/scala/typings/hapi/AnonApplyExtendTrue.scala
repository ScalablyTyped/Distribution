package typings.hapi

import typings.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyExtendTrue extends js.Object {
  @JSName("apply")
  var apply: `true`
  var extend: js.UndefOr[Boolean] = js.undefined
}

object AnonApplyExtendTrue {
  @scala.inline
  def apply(apply: `true`, extend: js.UndefOr[Boolean] = js.undefined): AnonApplyExtendTrue = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyExtendTrue]
  }
}

