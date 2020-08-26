package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartYAxisItemLabels extends js.Object {
  var background: js.UndefOr[String] = js.native
  var border: js.UndefOr[ChartYAxisItemLabelsBorder] = js.native
  var color: js.UndefOr[String] = js.native
  var culture: js.UndefOr[String] = js.native
  var dateFormats: js.UndefOr[ChartYAxisItemLabelsDateFormats] = js.native
  var font: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var margin: js.UndefOr[Double | ChartYAxisItemLabelsMargin] = js.native
  var mirror: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Double | ChartYAxisItemLabelsPadding] = js.native
  var rotation: js.UndefOr[Double | ChartYAxisItemLabelsRotation] = js.native
  var skip: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartYAxisItemLabels {
  @scala.inline
  def apply(): ChartYAxisItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemLabels]
  }
  @scala.inline
  implicit class ChartYAxisItemLabelsOps[Self <: ChartYAxisItemLabels] (val x: Self) extends AnyVal {
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
    def setBorder(value: ChartYAxisItemLabelsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDateFormats(value: ChartYAxisItemLabelsDateFormats): Self = this.set("dateFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormats: Self = this.set("dateFormats", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMargin(value: Double | ChartYAxisItemLabelsMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setPadding(value: Double | ChartYAxisItemLabelsPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRotation(value: Double | ChartYAxisItemLabelsRotation): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
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

