package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPane extends js.Object {
  var background: js.UndefOr[String] = js.native
  var border: js.UndefOr[ChartPaneBorder] = js.native
  var clip: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double | ChartPaneMargin] = js.native
  var name: js.UndefOr[String] = js.native
  var padding: js.UndefOr[ChartPanePadding] = js.native
  var title: js.UndefOr[String | ChartPaneTitle] = js.native
}

object ChartPane {
  @scala.inline
  def apply(): ChartPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPane]
  }
  @scala.inline
  implicit class ChartPaneOps[Self <: ChartPane] (val x: Self) extends AnyVal {
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
    def setBorder(value: ChartPaneBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setClip(value: Boolean): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: Double | ChartPaneMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPadding(value: ChartPanePadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setTitle(value: String | ChartPaneTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

