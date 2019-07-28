package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gateway extends js.Object {
  var gateway: String
  var port: Double
}

object Anon_Gateway {
  @scala.inline
  def apply(gateway: String, port: Double): Anon_Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway, port = port)
  
    __obj.asInstanceOf[Anon_Gateway]
  }
}

