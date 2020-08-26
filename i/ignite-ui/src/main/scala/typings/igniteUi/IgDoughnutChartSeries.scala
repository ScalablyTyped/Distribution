package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDoughnutChartSeries
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets or sets the palette of brushes to use for coloring the slices.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[js.Any] = js.native
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[js.Any] = js.native
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart's legend.
    */
  var formatLegendLabel: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets whether all surface interactions with the plot area should be disabled.
    */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the data source for the chart.
    */
  var itemsSource: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the pixel amount by which the labels are offset from the edge of the slices.
    */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color for labels rendered inside of the pie chart.
    */
  var labelInnerColor: js.UndefOr[String] = js.native
  /**
    * Gets or sets the property name that contains the labels.
    */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the color for labels rendered outside of the pie chart.
    */
  var labelOuterColor: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position of chart labels.
    *
    * Valid values:
    * "none" No labels will be displayed.
    * "center" Labels will be displayed in the center.
    * "insideEnd" Labels will be displayed inside and by the edge of the container.
    * "outsideEnd" Labels will be displayed outside the container.
    * "bestFit" Labels will automatically decide their location.
    */
  var labelsPosition: js.UndefOr[String] = js.native
  /**
    * Gets or sets the margin between a label and its leader line. The default is 6 pixels.
    */
  var leaderLineMargin: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the style for the leader lines.
    */
  var leaderLineStyle: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets what type of leader lines will be used for the outside end labels.
    *
    * Valid values:
    * "straight" A straight line is drawn between the slice and its label.
    * "arc" A curved line is drawn between the slice and its label. The line follows makes a natural turn from the slice to the label.
    * "spline" A curved line is drawn between the slice and its label. The line starts radially from the slice and then turns to the label.
    */
  var leaderLineType: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether the leader lines are visible.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var leaderLineVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the legend used for the current chart.
    */
  var legend: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the property name that contains the legend labels.
    */
  var legendLabelMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the label of the Others slice.
    */
  var othersCategoryText: js.UndefOr[String] = js.native
  /**
    * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
    */
  var othersCategoryThreshold: js.UndefOr[Double] = js.native
  /**
    * Gets or sets whether to use numeric or percent-based threshold value.
    *
    * Valid values:
    * "number" Data value is compared directly to the value of OthersCategoryThreshold.
    * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
    */
  var othersCategoryType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the palette of brushes to use for outlines on the slices.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
    */
  var radiusFactor: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the style used when a slice is selected.
    */
  var selectedStyle: js.UndefOr[js.Any] = js.native
  /**
    * Whether the series should render a tooltip.
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the starting angle of the chart.
    * The default zero value is equivalent to 3 o'clock.
    */
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * The name of template or the template itself that chart tooltip will use to render.
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the current series type.
    *
    * Valid values:
    * "flat" Series has flat 1-dimensional data.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Gets or Sets the property name that contains the values.
    */
  var valueMemberPath: js.UndefOr[String] = js.native
}

object IgDoughnutChartSeries {
  @scala.inline
  def apply(): IgDoughnutChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDoughnutChartSeries]
  }
  @scala.inline
  implicit class IgDoughnutChartSeriesOps[Self <: IgDoughnutChartSeries] (val x: Self) extends AnyVal {
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
    def setBrushes(value: js.Any): Self = this.set("brushes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrushes: Self = this.set("brushes", js.undefined)
    @scala.inline
    def setFormatLabel(value: js.Any): Self = this.set("formatLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    @scala.inline
    def setFormatLegendLabel(value: js.Any): Self = this.set("formatLegendLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatLegendLabel: Self = this.set("formatLegendLabel", js.undefined)
    @scala.inline
    def setIsSurfaceInteractionDisabled(value: Boolean): Self = this.set("isSurfaceInteractionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSurfaceInteractionDisabled: Self = this.set("isSurfaceInteractionDisabled", js.undefined)
    @scala.inline
    def setItemsSource(value: js.Any): Self = this.set("itemsSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsSource: Self = this.set("itemsSource", js.undefined)
    @scala.inline
    def setLabelExtent(value: Double): Self = this.set("labelExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelExtent: Self = this.set("labelExtent", js.undefined)
    @scala.inline
    def setLabelInnerColor(value: String): Self = this.set("labelInnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInnerColor: Self = this.set("labelInnerColor", js.undefined)
    @scala.inline
    def setLabelMemberPath(value: String): Self = this.set("labelMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMemberPath: Self = this.set("labelMemberPath", js.undefined)
    @scala.inline
    def setLabelOuterColor(value: String): Self = this.set("labelOuterColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOuterColor: Self = this.set("labelOuterColor", js.undefined)
    @scala.inline
    def setLabelsPosition(value: String): Self = this.set("labelsPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsPosition: Self = this.set("labelsPosition", js.undefined)
    @scala.inline
    def setLeaderLineMargin(value: Double): Self = this.set("leaderLineMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderLineMargin: Self = this.set("leaderLineMargin", js.undefined)
    @scala.inline
    def setLeaderLineStyle(value: js.Any): Self = this.set("leaderLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderLineStyle: Self = this.set("leaderLineStyle", js.undefined)
    @scala.inline
    def setLeaderLineType(value: String): Self = this.set("leaderLineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderLineType: Self = this.set("leaderLineType", js.undefined)
    @scala.inline
    def setLeaderLineVisibility(value: String): Self = this.set("leaderLineVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderLineVisibility: Self = this.set("leaderLineVisibility", js.undefined)
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendLabelMemberPath(value: String): Self = this.set("legendLabelMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendLabelMemberPath: Self = this.set("legendLabelMemberPath", js.undefined)
    @scala.inline
    def setOthersCategoryText(value: String): Self = this.set("othersCategoryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOthersCategoryText: Self = this.set("othersCategoryText", js.undefined)
    @scala.inline
    def setOthersCategoryThreshold(value: Double): Self = this.set("othersCategoryThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOthersCategoryThreshold: Self = this.set("othersCategoryThreshold", js.undefined)
    @scala.inline
    def setOthersCategoryType(value: String): Self = this.set("othersCategoryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOthersCategoryType: Self = this.set("othersCategoryType", js.undefined)
    @scala.inline
    def setOutlines(value: js.Any): Self = this.set("outlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlines: Self = this.set("outlines", js.undefined)
    @scala.inline
    def setRadiusFactor(value: Double): Self = this.set("radiusFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusFactor: Self = this.set("radiusFactor", js.undefined)
    @scala.inline
    def setSelectedStyle(value: js.Any): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
  }
  
}

