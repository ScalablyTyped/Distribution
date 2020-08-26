package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeLabelOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the label text (min, max, average, bins
    * values).
    *
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Formatter function for the label text.
    *
    * Available data are:
    *
    *  (see online documentation for example)
    */
  var formatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highstock) CSS styles for the measure label.
    */
  var style: js.UndefOr[AnnotationsMeasureTypeLabelStyleOptions | CSSObject] = js.native
}

object AnnotationsMeasureTypeLabelOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeLabelOptionsOps[Self <: AnnotationsMeasureTypeLabelOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFormatter(value: js.Function): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setStyle(value: AnnotationsMeasureTypeLabelStyleOptions | CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

