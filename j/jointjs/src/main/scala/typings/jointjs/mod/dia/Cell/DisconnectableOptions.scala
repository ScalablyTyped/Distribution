package typings.jointjs.mod.dia.Cell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisconnectableOptions extends Options {
  var disconnectLinks: js.UndefOr[Boolean] = js.native
}

object DisconnectableOptions {
  @scala.inline
  def apply(): DisconnectableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisconnectableOptions]
  }
  @scala.inline
  implicit class DisconnectableOptionsOps[Self <: DisconnectableOptions] (val x: Self) extends AnyVal {
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
    def setDisconnectLinks(value: Boolean): Self = this.set("disconnectLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisconnectLinks: Self = this.set("disconnectLinks", js.undefined)
  }
  
}

