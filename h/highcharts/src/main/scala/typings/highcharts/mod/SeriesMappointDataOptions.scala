package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesMappointDataOptions extends js.Object {
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
    * (Highmaps) The latitude of the point. Must be combined with the `lon`
    * option to work. Overrides `x` and `y` values.
    */
  var lat: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The longitude of the point. Must be combined with the `lon`
    * option to work. Overrides `x` and `y` values.
    */
  var lon: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highmaps) The x coordinate of the point in terms of the map path
    * coordinates.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The x coordinate of the point in terms of the map path
    * coordinates.
    */
  var y: js.UndefOr[Double | Null] = js.native
}

object SeriesMappointDataOptions {
  @scala.inline
  def apply(): SeriesMappointDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMappointDataOptions]
  }
  @scala.inline
  implicit class SeriesMappointDataOptionsOps[Self <: SeriesMappointDataOptions] (val x: Self) extends AnyVal {
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLon(value: Double): Self = this.set("lon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLon: Self = this.set("lon", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYNull: Self = this.set("y", null)
  }
  
}

