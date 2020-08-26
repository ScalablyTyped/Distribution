package typings.ioredis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ip extends js.Object {
  var ip: String = js.native
  var port: String = js.native
  var prio: js.UndefOr[Double] = js.native
}

object Ip {
  @scala.inline
  def apply(ip: String, port: String): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  @scala.inline
  implicit class IpOps[Self <: Ip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrio(value: Double): Self = this.set("prio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrio: Self = this.set("prio", js.undefined)
  }
  
}

