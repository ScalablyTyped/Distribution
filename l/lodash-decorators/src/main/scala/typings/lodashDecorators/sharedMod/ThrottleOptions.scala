package typings.lodashDecorators.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
}

object ThrottleOptions {
  @scala.inline
  def apply(leading: js.UndefOr[Boolean] = js.undefined, trailing: js.UndefOr[Boolean] = js.undefined): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
}

