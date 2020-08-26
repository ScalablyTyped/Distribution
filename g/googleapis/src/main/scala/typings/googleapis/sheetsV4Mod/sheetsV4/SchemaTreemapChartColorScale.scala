package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color scale for a treemap chart.
  */
@js.native
trait SchemaTreemapChartColorScale extends js.Object {
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not specified.
    */
  var maxValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and maxValue. Defaults to #efe6dc if not specified.
    */
  var midValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not specified.
    */
  var minValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[SchemaColor] = js.native
}

object SchemaTreemapChartColorScale {
  @scala.inline
  def apply(): SchemaTreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTreemapChartColorScale]
  }
  @scala.inline
  implicit class SchemaTreemapChartColorScaleOps[Self <: SchemaTreemapChartColorScale] (val x: Self) extends AnyVal {
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
    def setMaxValueColor(value: SchemaColor): Self = this.set("maxValueColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValueColor: Self = this.set("maxValueColor", js.undefined)
    @scala.inline
    def setMidValueColor(value: SchemaColor): Self = this.set("midValueColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidValueColor: Self = this.set("midValueColor", js.undefined)
    @scala.inline
    def setMinValueColor(value: SchemaColor): Self = this.set("minValueColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValueColor: Self = this.set("minValueColor", js.undefined)
    @scala.inline
    def setNoDataColor(value: SchemaColor): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDataColor: Self = this.set("noDataColor", js.undefined)
  }
  
}

