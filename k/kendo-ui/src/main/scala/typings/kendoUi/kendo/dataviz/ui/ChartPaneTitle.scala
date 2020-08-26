package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPaneTitle extends js.Object {
  var background: js.UndefOr[String] = js.native
  var border: js.UndefOr[ChartPaneTitleBorder] = js.native
  var color: js.UndefOr[String] = js.native
  var font: js.UndefOr[String] = js.native
  var margin: js.UndefOr[Double | ChartPaneTitleMargin] = js.native
  var position: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartPaneTitle {
  @scala.inline
  def apply(): ChartPaneTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPaneTitle]
  }
  @scala.inline
  implicit class ChartPaneTitleOps[Self <: ChartPaneTitle] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: ChartPaneTitleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setMargin(value: Double | ChartPaneTitleMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
  
}

