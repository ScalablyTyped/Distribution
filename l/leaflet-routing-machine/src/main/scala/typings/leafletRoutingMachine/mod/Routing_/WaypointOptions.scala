package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointOptions extends js.Object {
  var allowUTurn: js.UndefOr[Boolean] = js.native
}

object WaypointOptions {
  @scala.inline
  def apply(): WaypointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptions]
  }
  @scala.inline
  implicit class WaypointOptionsOps[Self <: WaypointOptions] (val x: Self) extends AnyVal {
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
    def setAllowUTurn(value: Boolean): Self = this.set("allowUTurn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUTurn: Self = this.set("allowUTurn", js.undefined)
  }
  
}

