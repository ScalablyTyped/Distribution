package typings.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIp extends js.Object {
  var ip: String
  var port: String
  var prio: js.UndefOr[Double] = js.undefined
}

object AnonIp {
  @scala.inline
  def apply(ip: String, port: String, prio: Int | Double = null): AnonIp = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (prio != null) __obj.updateDynamic("prio")(prio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIp]
  }
}

