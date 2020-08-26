package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesMapbubbleDataOptions extends js.Object {
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
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highmaps) While the `x` and `y` values of the bubble are determined by
    * the underlying map, the `z` indicates the actual value that gives the
    * size of the bubble.
    */
  var z: js.UndefOr[Double | Null] = js.native
}

object SeriesMapbubbleDataOptions {
  @scala.inline
  def apply(): SeriesMapbubbleDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMapbubbleDataOptions]
  }
  @scala.inline
  implicit class SeriesMapbubbleDataOptionsOps[Self <: SeriesMapbubbleDataOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    @scala.inline
    def setZNull: Self = this.set("z", null)
  }
  
}

