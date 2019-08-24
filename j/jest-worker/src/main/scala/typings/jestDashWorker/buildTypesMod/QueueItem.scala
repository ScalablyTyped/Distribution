package typings.jestDashWorker.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var next: QueueItem | Null
  var task: QueueChildMessage
}

object QueueItem {
  @scala.inline
  def apply(task: QueueChildMessage, next: QueueItem = null): QueueItem = {
    val __obj = js.Dynamic.literal(task = task)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[QueueItem]
  }
}

