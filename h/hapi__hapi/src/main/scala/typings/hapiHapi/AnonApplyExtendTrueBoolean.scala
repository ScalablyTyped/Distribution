package typings.hapiHapi

import typings.hapiHapi.hapiHapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyExtendTrueBoolean extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  var extend: `true`
}

object AnonApplyExtendTrueBoolean {
  @scala.inline
  def apply(extend: `true`, apply: js.UndefOr[Boolean] = js.undefined): AnonApplyExtendTrueBoolean = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyExtendTrueBoolean]
  }
}

