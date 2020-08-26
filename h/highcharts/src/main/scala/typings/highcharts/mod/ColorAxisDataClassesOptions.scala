package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAxisDataClassesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The color of each data class. If not
    * set, the color is pulled from the global or chart-specific colors array.
    * In styled mode, this option is ignored. Instead, use colors defined in
    * CSS.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The start of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The name of the data class as it
    * appears in the legend. If no name is given, it is automatically created
    * based on the `from` and `to` values. For full programmatic control,
    * legend.labelFormatter can be used. In the formatter, `this.from` and
    * `this.to` can be accessed.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The end of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var to: js.UndefOr[Double] = js.native
}

object ColorAxisDataClassesOptions {
  @scala.inline
  def apply(): ColorAxisDataClassesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisDataClassesOptions]
  }
  @scala.inline
  implicit class ColorAxisDataClassesOptionsOps[Self <: ColorAxisDataClassesOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

