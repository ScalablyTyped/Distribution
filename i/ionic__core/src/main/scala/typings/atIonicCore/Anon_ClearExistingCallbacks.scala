package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearExistingCallbacks extends js.Object {
  var clearExistingCallbacks: js.UndefOr[Boolean] = js.undefined
  var oneTimeCallback: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClearExistingCallbacks {
  @scala.inline
  def apply(
    clearExistingCallbacks: js.UndefOr[Boolean] = js.undefined,
    oneTimeCallback: js.UndefOr[Boolean] = js.undefined
  ): Anon_ClearExistingCallbacks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearExistingCallbacks)) __obj.updateDynamic("clearExistingCallbacks")(clearExistingCallbacks)
    if (!js.isUndefined(oneTimeCallback)) __obj.updateDynamic("oneTimeCallback")(oneTimeCallback)
    __obj.asInstanceOf[Anon_ClearExistingCallbacks]
  }
}

