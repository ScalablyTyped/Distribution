package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPersistent extends js.Object {
  var persistent: js.UndefOr[Boolean] = js.undefined
  var suppressRebuildEvent: js.UndefOr[Boolean] = js.undefined
}

object AnonPersistent {
  @scala.inline
  def apply(
    persistent: js.UndefOr[Boolean] = js.undefined,
    suppressRebuildEvent: js.UndefOr[Boolean] = js.undefined
  ): AnonPersistent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressRebuildEvent)) __obj.updateDynamic("suppressRebuildEvent")(suppressRebuildEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersistent]
  }
}

