package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gateway extends js.Object {
  var gateway: String
  var port: Double
}

object Gateway {
  @scala.inline
  def apply(gateway: String, port: Double): Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gateway]
  }
}

