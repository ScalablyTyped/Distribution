package typings.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Worker extends js.Object {
  var worker: Double
  var workerId: Double
}

object Anon_Worker {
  @scala.inline
  def apply(worker: Double, workerId: Double): Anon_Worker = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Worker]
  }
}

