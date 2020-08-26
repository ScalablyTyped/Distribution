package typings.jointjs.mod.dia.ElementView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractivityOptions extends js.Object {
  var addLinkFromMagnet: js.UndefOr[Boolean] = js.native
  var elementMove: js.UndefOr[Boolean] = js.native
}

object InteractivityOptions {
  @scala.inline
  def apply(): InteractivityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractivityOptions]
  }
  @scala.inline
  implicit class InteractivityOptionsOps[Self <: InteractivityOptions] (val x: Self) extends AnyVal {
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
    def setAddLinkFromMagnet(value: Boolean): Self = this.set("addLinkFromMagnet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddLinkFromMagnet: Self = this.set("addLinkFromMagnet", js.undefined)
    @scala.inline
    def setElementMove(value: Boolean): Self = this.set("elementMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementMove: Self = this.set("elementMove", js.undefined)
  }
  
}

