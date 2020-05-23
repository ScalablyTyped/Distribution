package typings.lodashDecorators.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebounceOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var maxWait: js.UndefOr[Double] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FDebounceOptions: js.UndefOr[Double] = js.undefined
}

object DebounceOptions {
  @scala.inline
  def apply(
    leading: js.UndefOr[Boolean] = js.undefined,
    maxWait: js.UndefOr[Double] = js.undefined,
    trailing: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Double] = js.undefined
  ): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWait)) __obj.updateDynamic("maxWait")(maxWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebounceOptions]
  }
}

