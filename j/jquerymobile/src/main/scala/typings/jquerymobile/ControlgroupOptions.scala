package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlgroupOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.native
  var excludeInvisible: js.UndefOr[Boolean] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ControlgroupOptions {
  @scala.inline
  def apply(): ControlgroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlgroupOptions]
  }
  @scala.inline
  implicit class ControlgroupOptionsOps[Self <: ControlgroupOptions] (val x: Self) extends AnyVal {
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
    def setCorners(value: Boolean): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setExcludeInvisible(value: Boolean): Self = this.set("excludeInvisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeInvisible: Self = this.set("excludeInvisible", js.undefined)
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

