package typings.ioredis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ip extends js.Object {
  var ip: String
  var port: String
  var prio: js.UndefOr[Double] = js.undefined
}

object Ip {
  @scala.inline
  def apply(ip: String, port: String, prio: js.UndefOr[Double] = js.undefined): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(prio)) __obj.updateDynamic("prio")(prio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
}

