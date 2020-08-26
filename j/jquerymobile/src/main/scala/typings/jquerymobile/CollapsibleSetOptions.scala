package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleSetOptions extends js.Object {
  var collapsedIcon: js.UndefOr[String] = js.native
  var expandedIcon: js.UndefOr[String] = js.native
  var iconpos: js.UndefOr[String] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var inset: js.UndefOr[Boolean] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object CollapsibleSetOptions {
  @scala.inline
  def apply(): CollapsibleSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleSetOptions]
  }
  @scala.inline
  implicit class CollapsibleSetOptionsOps[Self <: CollapsibleSetOptions] (val x: Self) extends AnyVal {
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
    def setCollapsedIcon(value: String): Self = this.set("collapsedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsedIcon: Self = this.set("collapsedIcon", js.undefined)
    @scala.inline
    def setExpandedIcon(value: String): Self = this.set("expandedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedIcon: Self = this.set("expandedIcon", js.undefined)
    @scala.inline
    def setIconpos(value: String): Self = this.set("iconpos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconpos: Self = this.set("iconpos", js.undefined)
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    @scala.inline
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

