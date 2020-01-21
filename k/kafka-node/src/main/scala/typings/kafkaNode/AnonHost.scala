package typings.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var nodeId: Double
  var port: Double
}

object AnonHost {
  @scala.inline
  def apply(host: String, nodeId: Double, port: Double): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHost]
  }
}

