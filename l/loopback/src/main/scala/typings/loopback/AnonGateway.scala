package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGateway extends js.Object {
  var gateway: String
  var port: Double
}

object AnonGateway {
  @scala.inline
  def apply(gateway: String, port: Double): AnonGateway = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGateway]
  }
}

