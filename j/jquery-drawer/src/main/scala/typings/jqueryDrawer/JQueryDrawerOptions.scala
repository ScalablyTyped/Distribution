package typings.jqueryDrawer

import typings.iscroll.IScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDrawerOptions extends js.Object {
  var `class`: js.UndefOr[JQueryDrawerClassOptions] = js.native
  var iscroll: js.UndefOr[IScrollOptions] = js.native
  var showOverlay: js.UndefOr[Boolean] = js.native
}

object JQueryDrawerOptions {
  @scala.inline
  def apply(): JQueryDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDrawerOptions]
  }
  @scala.inline
  implicit class JQueryDrawerOptionsOps[Self <: JQueryDrawerOptions] (val x: Self) extends AnyVal {
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
    def setClass(value: JQueryDrawerClassOptions): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setIscroll(value: IScrollOptions): Self = this.set("iscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIscroll: Self = this.set("iscroll", js.undefined)
    @scala.inline
    def setShowOverlay(value: Boolean): Self = this.set("showOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOverlay: Self = this.set("showOverlay", js.undefined)
  }
  
}

