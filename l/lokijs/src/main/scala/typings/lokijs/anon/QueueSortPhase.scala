package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueSortPhase extends js.Object {
  var queueSortPhase: js.UndefOr[Boolean] = js.undefined
}

object QueueSortPhase {
  @scala.inline
  def apply(queueSortPhase: js.UndefOr[Boolean] = js.undefined): QueueSortPhase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(queueSortPhase)) __obj.updateDynamic("queueSortPhase")(queueSortPhase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueSortPhase]
  }
}

