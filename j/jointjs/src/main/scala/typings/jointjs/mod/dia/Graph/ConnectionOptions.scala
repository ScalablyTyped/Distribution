package typings.jointjs.mod.dia.Graph

import typings.jointjs.mod.dia.Cell.EmbeddableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends EmbeddableOptions {
  var inbound: js.UndefOr[Boolean] = js.native
  var outbound: js.UndefOr[Boolean] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setInbound(value: Boolean): Self = this.set("inbound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInbound: Self = this.set("inbound", js.undefined)
    @scala.inline
    def setOutbound(value: Boolean): Self = this.set("outbound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutbound: Self = this.set("outbound", js.undefined)
  }
  
}

