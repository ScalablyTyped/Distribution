package typings.log4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends js.Object {
  var worker: Double
  var workerId: Double
}

object Worker {
  @scala.inline
  def apply(worker: Double, workerId: Double): Worker = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Worker]
  }
}

