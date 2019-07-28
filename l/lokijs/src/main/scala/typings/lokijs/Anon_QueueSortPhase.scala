package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueueSortPhase extends js.Object {
  var queueSortPhase: js.UndefOr[Boolean] = js.undefined
}

object Anon_QueueSortPhase {
  @scala.inline
  def apply(queueSortPhase: js.UndefOr[Boolean] = js.undefined): Anon_QueueSortPhase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(queueSortPhase)) __obj.updateDynamic("queueSortPhase")(queueSortPhase)
    __obj.asInstanceOf[Anon_QueueSortPhase]
  }
}

