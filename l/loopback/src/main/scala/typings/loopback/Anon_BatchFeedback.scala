package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchFeedback extends js.Object {
  var batchFeedback: Boolean
  var gateway: String
  var interval: Double
  var port: Double
}

object Anon_BatchFeedback {
  @scala.inline
  def apply(batchFeedback: Boolean, gateway: String, interval: Double, port: Double): Anon_BatchFeedback = {
    val __obj = js.Dynamic.literal(batchFeedback = batchFeedback.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BatchFeedback]
  }
}

