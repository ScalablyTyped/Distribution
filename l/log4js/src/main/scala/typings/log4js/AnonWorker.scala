package typings.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorker extends js.Object {
  var worker: Double
  var workerId: Double
}

object AnonWorker {
  @scala.inline
  def apply(worker: Double, workerId: Double): AnonWorker = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWorker]
  }
}

