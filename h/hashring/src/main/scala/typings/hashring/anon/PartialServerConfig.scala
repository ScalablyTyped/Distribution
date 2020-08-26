package typings.hashring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hashring.hashring.ServerConfig> */
@js.native
trait PartialServerConfig extends js.Object {
  var vnodes: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object PartialServerConfig {
  @scala.inline
  def apply(): PartialServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerConfig]
  }
  @scala.inline
  implicit class PartialServerConfigOps[Self <: PartialServerConfig] (val x: Self) extends AnyVal {
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
    def deleteVnodes: Self = this.set("vnodes", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

