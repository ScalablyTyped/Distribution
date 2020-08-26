package typings.log4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker extends js.Object {
  var worker: Double = js.native
  var workerId: Double = js.native
}

object Worker {
  @scala.inline
  def apply(worker: Double, workerId: Double): Worker = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Worker]
  }
  @scala.inline
  implicit class WorkerOps[Self <: Worker] (val x: Self) extends AnyVal {
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
    def setWorker(value: Double): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerId(value: Double): Self = this.set("workerId", value.asInstanceOf[js.Any])
  }
  
}

