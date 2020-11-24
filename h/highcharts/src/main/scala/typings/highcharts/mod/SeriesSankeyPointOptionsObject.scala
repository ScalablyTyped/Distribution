package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesSankeyPointOptionsObject extends js.Object {
  
  /**
    * (Highcharts) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.native
  
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The color for the individual _link_. By default, the link
    * color is the same as the node it extends from. The `series.fillOpacity`
    * option also applies to the points, so when setting a specific link color,
    * consider setting the `fillOpacity` to 1.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * (Highcharts) Individual data label for each point. The options are the
    * same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
  ] = js.native
  
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
  
  /**
    * (Highcharts) The node that the link runs from.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels, etc.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Whether the link goes out of the system.
    */
  var outgoing: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The node that the link runs to.
    */
  var to: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The weight of the link.
    */
  var weight: js.UndefOr[Double | Null] = js.native
}
object SeriesSankeyPointOptionsObject {
  
  @scala.inline
  def apply(): SeriesSankeyPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSankeyPointOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesSankeyPointOptionsObjectOps[Self <: SeriesSankeyPointOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAccessibility(value: PointAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: (SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject)*): Self = this.set("dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataLabels(
      value: DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
    ): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabelrank(value: Double): Self = this.set("labelrank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelrank: Self = this.set("labelrank", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutgoing(value: Boolean): Self = this.set("outgoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoing: Self = this.set("outgoing", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWeightNull: Self = this.set("weight", null)
  }
}
