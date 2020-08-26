package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabClasses extends js.Object {
  var `ui-tabs`: js.UndefOr[String] = js.native
  var `ui-tabs-active`: js.UndefOr[String] = js.native
  var `ui-tabs-anchor`: js.UndefOr[String] = js.native
  var `ui-tabs-collapsible`: js.UndefOr[String] = js.native
  var `ui-tabs-loading`: js.UndefOr[String] = js.native
  var `ui-tabs-nav`: js.UndefOr[String] = js.native
  var `ui-tabs-panel`: js.UndefOr[String] = js.native
  var `ui-tabs-tab`: js.UndefOr[String] = js.native
}

object TabClasses {
  @scala.inline
  def apply(): TabClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabClasses]
  }
  @scala.inline
  implicit class TabClassesOps[Self <: TabClasses] (val x: Self) extends AnyVal {
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
    def `setUi-tabs`(value: String): Self = this.set("ui-tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs`: Self = this.set("ui-tabs", js.undefined)
    @scala.inline
    def `setUi-tabs-active`(value: String): Self = this.set("ui-tabs-active", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-active`: Self = this.set("ui-tabs-active", js.undefined)
    @scala.inline
    def `setUi-tabs-anchor`(value: String): Self = this.set("ui-tabs-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-anchor`: Self = this.set("ui-tabs-anchor", js.undefined)
    @scala.inline
    def `setUi-tabs-collapsible`(value: String): Self = this.set("ui-tabs-collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-collapsible`: Self = this.set("ui-tabs-collapsible", js.undefined)
    @scala.inline
    def `setUi-tabs-loading`(value: String): Self = this.set("ui-tabs-loading", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-loading`: Self = this.set("ui-tabs-loading", js.undefined)
    @scala.inline
    def `setUi-tabs-nav`(value: String): Self = this.set("ui-tabs-nav", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-nav`: Self = this.set("ui-tabs-nav", js.undefined)
    @scala.inline
    def `setUi-tabs-panel`(value: String): Self = this.set("ui-tabs-panel", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-panel`: Self = this.set("ui-tabs-panel", js.undefined)
    @scala.inline
    def `setUi-tabs-tab`(value: String): Self = this.set("ui-tabs-tab", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-tabs-tab`: Self = this.set("ui-tabs-tab", js.undefined)
  }
  
}

