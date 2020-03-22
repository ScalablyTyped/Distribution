package typings.hapi

import typings.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyBoolean extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  var extend: `true`
}

object AnonApplyBoolean {
  @scala.inline
  def apply(extend: `true`, apply: js.UndefOr[Boolean] = js.undefined): AnonApplyBoolean = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyBoolean]
  }
}

