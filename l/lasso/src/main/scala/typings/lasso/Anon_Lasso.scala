package typings.lasso

import typings.lasso.libLassoMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lasso extends js.Object {
  var lasso: js.UndefOr[default] = js.undefined
  var sendOptions: js.UndefOr[js.Any] = js.undefined
}

object Anon_Lasso {
  @scala.inline
  def apply(lasso: default = null, sendOptions: js.Any = null): Anon_Lasso = {
    val __obj = js.Dynamic.literal()
    if (lasso != null) __obj.updateDynamic("lasso")(lasso)
    if (sendOptions != null) __obj.updateDynamic("sendOptions")(sendOptions)
    __obj.asInstanceOf[Anon_Lasso]
  }
}

