package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPathOptions extends js.Object {
  var clip: js.UndefOr[typings.kendoUi.kendo.drawing.Path] = js.native
  var cursor: js.UndefOr[String] = js.native
  var fill: js.UndefOr[typings.kendoUi.kendo.drawing.FillOptions] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[typings.kendoUi.kendo.drawing.StrokeOptions] = js.native
  var tooltip: js.UndefOr[typings.kendoUi.kendo.drawing.TooltipOptions] = js.native
  var transform: js.UndefOr[Transformation] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object MultiPathOptions {
  @scala.inline
  def apply(): MultiPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiPathOptions]
  }
  @scala.inline
  implicit class MultiPathOptionsOps[Self <: MultiPathOptions] (val x: Self) extends AnyVal {
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
    def setClip(value: typings.kendoUi.kendo.drawing.Path): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setFill(value: typings.kendoUi.kendo.drawing.FillOptions): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setStroke(value: typings.kendoUi.kendo.drawing.StrokeOptions): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setTooltip(value: typings.kendoUi.kendo.drawing.TooltipOptions): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTransform(value: Transformation): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

