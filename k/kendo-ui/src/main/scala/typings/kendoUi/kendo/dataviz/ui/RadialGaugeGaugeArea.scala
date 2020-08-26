package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGaugeGaugeArea extends js.Object {
  var background: js.UndefOr[String] = js.native
  var border: js.UndefOr[RadialGaugeGaugeAreaBorder] = js.native
  var height: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double | RadialGaugeGaugeAreaMargin] = js.native
  var width: js.UndefOr[Double] = js.native
}

object RadialGaugeGaugeArea {
  @scala.inline
  def apply(): RadialGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugeGaugeArea]
  }
  @scala.inline
  implicit class RadialGaugeGaugeAreaOps[Self <: RadialGaugeGaugeArea] (val x: Self) extends AnyVal {
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
    def setBorder(value: RadialGaugeGaugeAreaBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: Double | RadialGaugeGaugeAreaMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

