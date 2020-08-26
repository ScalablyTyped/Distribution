package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectMenuClasses extends js.Object {
  var `ui-selectmenu-button`: js.UndefOr[String] = js.native
  var `ui-selectmenu-button-closed`: js.UndefOr[String] = js.native
  var `ui-selectmenu-button-open`: js.UndefOr[String] = js.native
  var `ui-selectmenu-icon`: js.UndefOr[String] = js.native
  var `ui-selectmenu-menu`: js.UndefOr[String] = js.native
  var `ui-selectmenu-open`: js.UndefOr[String] = js.native
  var `ui-selectmenu-optgroup`: js.UndefOr[String] = js.native
  var `ui-selectmenu-text`: js.UndefOr[String] = js.native
}

object SelectMenuClasses {
  @scala.inline
  def apply(): SelectMenuClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuClasses]
  }
  @scala.inline
  implicit class SelectMenuClassesOps[Self <: SelectMenuClasses] (val x: Self) extends AnyVal {
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
    def `setUi-selectmenu-button`(value: String): Self = this.set("ui-selectmenu-button", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-button`: Self = this.set("ui-selectmenu-button", js.undefined)
    @scala.inline
    def `setUi-selectmenu-button-closed`(value: String): Self = this.set("ui-selectmenu-button-closed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-button-closed`: Self = this.set("ui-selectmenu-button-closed", js.undefined)
    @scala.inline
    def `setUi-selectmenu-button-open`(value: String): Self = this.set("ui-selectmenu-button-open", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-button-open`: Self = this.set("ui-selectmenu-button-open", js.undefined)
    @scala.inline
    def `setUi-selectmenu-icon`(value: String): Self = this.set("ui-selectmenu-icon", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-icon`: Self = this.set("ui-selectmenu-icon", js.undefined)
    @scala.inline
    def `setUi-selectmenu-menu`(value: String): Self = this.set("ui-selectmenu-menu", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-menu`: Self = this.set("ui-selectmenu-menu", js.undefined)
    @scala.inline
    def `setUi-selectmenu-open`(value: String): Self = this.set("ui-selectmenu-open", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-open`: Self = this.set("ui-selectmenu-open", js.undefined)
    @scala.inline
    def `setUi-selectmenu-optgroup`(value: String): Self = this.set("ui-selectmenu-optgroup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-optgroup`: Self = this.set("ui-selectmenu-optgroup", js.undefined)
    @scala.inline
    def `setUi-selectmenu-text`(value: String): Self = this.set("ui-selectmenu-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-selectmenu-text`: Self = this.set("ui-selectmenu-text", js.undefined)
  }
  
}

