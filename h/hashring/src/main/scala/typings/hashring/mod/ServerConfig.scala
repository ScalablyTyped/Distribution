package typings.hashring.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConfig extends js.Object {
  var vnodes: Double = js.native
  var weight: Double = js.native
}

object ServerConfig {
  @scala.inline
  def apply(vnodes: Double, weight: Double): ServerConfig = {
    val __obj = js.Dynamic.literal(vnodes = vnodes.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  @scala.inline
  implicit class ServerConfigOps[Self <: ServerConfig] (val x: Self) extends AnyVal {
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
    def setVnodes(value: Double): Self = this.set("vnodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

