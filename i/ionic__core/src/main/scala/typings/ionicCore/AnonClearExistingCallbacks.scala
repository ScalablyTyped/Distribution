package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearExistingCallbacks extends js.Object {
  var clearExistingCallbacks: js.UndefOr[Boolean] = js.undefined
  var oneTimeCallback: js.UndefOr[Boolean] = js.undefined
}

object AnonClearExistingCallbacks {
  @scala.inline
  def apply(
    clearExistingCallbacks: js.UndefOr[Boolean] = js.undefined,
    oneTimeCallback: js.UndefOr[Boolean] = js.undefined
  ): AnonClearExistingCallbacks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearExistingCallbacks)) __obj.updateDynamic("clearExistingCallbacks")(clearExistingCallbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(oneTimeCallback)) __obj.updateDynamic("oneTimeCallback")(oneTimeCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearExistingCallbacks]
  }
}

