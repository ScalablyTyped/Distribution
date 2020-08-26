package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGaugeOptions extends js.Object {
  var centerTemplate: js.UndefOr[String | js.Function] = js.native
  var color: js.UndefOr[String] = js.native
  var colors: js.UndefOr[js.Array[ArcGaugeColor]] = js.native
  var gaugeArea: js.UndefOr[ArcGaugeGaugeArea] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var renderAs: js.UndefOr[String] = js.native
  var scale: js.UndefOr[ArcGaugeScale] = js.native
  var theme: js.UndefOr[String] = js.native
  var transitions: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
}

object ArcGaugeOptions {
  @scala.inline
  def apply(): ArcGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeOptions]
  }
  @scala.inline
  implicit class ArcGaugeOptionsOps[Self <: ArcGaugeOptions] (val x: Self) extends AnyVal {
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
    def setCenterTemplate(value: String | js.Function): Self = this.set("centerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterTemplate: Self = this.set("centerTemplate", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorsVarargs(value: ArcGaugeColor*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[ArcGaugeColor]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setGaugeArea(value: ArcGaugeGaugeArea): Self = this.set("gaugeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaugeArea: Self = this.set("gaugeArea", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRenderAs(value: String): Self = this.set("renderAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAs: Self = this.set("renderAs", js.undefined)
    @scala.inline
    def setScale(value: ArcGaugeScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

