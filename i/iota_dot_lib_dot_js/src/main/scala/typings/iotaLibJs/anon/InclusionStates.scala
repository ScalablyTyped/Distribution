package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InclusionStates extends js.Object {
  var end: js.UndefOr[Double] = js.native
  var inclusionStates: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.native
  var start: js.UndefOr[Double] = js.native
}

object InclusionStates {
  @scala.inline
  def apply(): InclusionStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusionStates]
  }
  @scala.inline
  implicit class InclusionStatesOps[Self <: InclusionStates] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInclusionStates(value: Boolean): Self = this.set("inclusionStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusionStates: Self = this.set("inclusionStates", js.undefined)
    @scala.inline
    def setSecurity(value: typings.iotaLibJs.mod.Security): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

