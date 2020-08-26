package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridScrollable extends js.Object {
  var endless: js.UndefOr[Boolean] = js.native
  var virtual: js.UndefOr[Boolean | String] = js.native
}

object GridScrollable {
  @scala.inline
  def apply(): GridScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridScrollable]
  }
  @scala.inline
  implicit class GridScrollableOps[Self <: GridScrollable] (val x: Self) extends AnyVal {
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
    def setEndless(value: Boolean): Self = this.set("endless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndless: Self = this.set("endless", js.undefined)
    @scala.inline
    def setVirtual(value: Boolean | String): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

