package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterPane extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsedSize: js.UndefOr[String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var contentUrl: js.UndefOr[String] = js.native
  var max: js.UndefOr[String] = js.native
  var min: js.UndefOr[String] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var scrollable: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
}

object SplitterPane {
  @scala.inline
  def apply(): SplitterPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterPane]
  }
  @scala.inline
  implicit class SplitterPaneOps[Self <: SplitterPane] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsedSize(value: String): Self = this.set("collapsedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsedSize: Self = this.set("collapsedSize", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

