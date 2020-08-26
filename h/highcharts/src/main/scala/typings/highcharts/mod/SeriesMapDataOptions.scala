package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesMapDataOptions extends js.Object {
  /**
    * (Highmaps) Individual color for the point. By default the color is either
    * used to denote the value, or pulled from the global `colors` array.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highmaps) Individual data label for each point. The options are the same
    * as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptions] = js.native
  /**
    * (Highmaps) The `id` of a series in the drilldown.series array to use for
    * a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  /**
    * (Highmaps) Individual point events
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
  /**
    * (Highmaps) An id for the point. This can be used after render time to get
    * a pointer to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highmaps) When data labels are laid out on a map, Highmaps runs a
    * simplified algorithm to detect collision. When two labels collide, the
    * one with the lowest rank is hidden. By default the rank is computed from
    * the area.
    */
  var labelrank: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The relative mid point of an area, used to place the data
    * label. Ranges from 0 to 1\. When `mapData` is used, middleX can be
    * defined there.
    */
  var middleX: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The relative mid point of an area, used to place the data
    * label. Ranges from 0 to 1\. When `mapData` is used, middleY can be
    * defined there.
    */
  var middleY: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highmaps) For map and mapline series types, the SVG path for the shape.
    * For compatibily with old IE, not all SVG path definitions are supported,
    * but M, L and C operators are safe.
    *
    * To achieve a better separation between the structure and the data, it is
    * recommended to use `mapData` to define that paths instead of defining
    * them on the data points themselves.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * (Highmaps) The numeric value of the data point.
    */
  var value: js.UndefOr[Double | Null] = js.native
}

object SeriesMapDataOptions {
  @scala.inline
  def apply(): SeriesMapDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMapDataOptions]
  }
  @scala.inline
  implicit class SeriesMapDataOptionsOps[Self <: SeriesMapDataOptions] (val x: Self) extends AnyVal {
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
    def setDataLabels(value: DataLabelsOptions): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDrilldown(value: String): Self = this.set("drilldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilldown: Self = this.set("drilldown", js.undefined)
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelrank(value: Double): Self = this.set("labelrank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelrank: Self = this.set("labelrank", js.undefined)
    @scala.inline
    def setMiddleX(value: Double): Self = this.set("middleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleX: Self = this.set("middleX", js.undefined)
    @scala.inline
    def setMiddleY(value: Double): Self = this.set("middleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleY: Self = this.set("middleY", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

