package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchFeedback extends js.Object {
  var batchFeedback: scala.Boolean
  var gateway: java.lang.String
  var interval: scala.Double
  var port: scala.Double
}

object Anon_BatchFeedback {
  @scala.inline
  def apply(
    batchFeedback: scala.Boolean,
    gateway: java.lang.String,
    interval: scala.Double,
    port: scala.Double
  ): Anon_BatchFeedback = {
    val __obj = js.Dynamic.literal(batchFeedback = batchFeedback, gateway = gateway, interval = interval, port = port)
  
    __obj.asInstanceOf[Anon_BatchFeedback]
  }
}

