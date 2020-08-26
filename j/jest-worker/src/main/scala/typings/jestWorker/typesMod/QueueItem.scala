package typings.jestWorker.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var next: QueueItem | Null = js.native
  var task: QueueChildMessage = js.native
}

object QueueItem {
  @scala.inline
  def apply(task: QueueChildMessage): QueueItem = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTask(value: QueueChildMessage): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: QueueItem): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
  }
  
}

