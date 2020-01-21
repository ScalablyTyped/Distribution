package typings.lasso

import typings.lasso.lassoMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLasso extends js.Object {
  var lasso: js.UndefOr[default] = js.undefined
  var sendOptions: js.UndefOr[js.Any] = js.undefined
}

object AnonLasso {
  @scala.inline
  def apply(lasso: default = null, sendOptions: js.Any = null): AnonLasso = {
    val __obj = js.Dynamic.literal()
    if (lasso != null) __obj.updateDynamic("lasso")(lasso.asInstanceOf[js.Any])
    if (sendOptions != null) __obj.updateDynamic("sendOptions")(sendOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLasso]
  }
}

