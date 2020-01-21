package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueueSortPhase extends js.Object {
  var queueSortPhase: js.UndefOr[Boolean] = js.undefined
}

object AnonQueueSortPhase {
  @scala.inline
  def apply(queueSortPhase: js.UndefOr[Boolean] = js.undefined): AnonQueueSortPhase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(queueSortPhase)) __obj.updateDynamic("queueSortPhase")(queueSortPhase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueueSortPhase]
  }
}

