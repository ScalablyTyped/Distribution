package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDoughnutChartSeries
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets or sets the palette of brushes to use for coloring the slices.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart's legend.
    */
  var formatLegendLabel: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets whether all surface interactions with the plot area should be disabled.
    */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the data source for the chart.
    */
  var itemsSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the pixel amount by which the labels are offset from the edge of the slices.
    */
  var labelExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the color for labels rendered inside of the pie chart.
    */
  var labelInnerColor: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the property name that contains the labels.
    */
  var labelMemberPath: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the color for labels rendered outside of the pie chart.
    */
  var labelOuterColor: js.UndefOr[String] = js.undefined
  
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
  var labelsPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the margin between a label and its leader line. The default is 6 pixels.
    */
  var leaderLineMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the style for the leader lines.
    */
  var leaderLineStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets what type of leader lines will be used for the outside end labels.
    *
    * Valid values:
    * "straight" A straight line is drawn between the slice and its label.
    * "arc" A curved line is drawn between the slice and its label. The line follows makes a natural turn from the slice to the label.
    * "spline" A curved line is drawn between the slice and its label. The line starts radially from the slice and then turns to the label.
    */
  var leaderLineType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets whether the leader lines are visible.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var leaderLineVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the legend used for the current chart.
    */
  var legend: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the property name that contains the legend labels.
    */
  var legendLabelMemberPath: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the label of the Others slice.
    */
  var othersCategoryText: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
    */
  var othersCategoryThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets whether to use numeric or percent-based threshold value.
    *
    * Valid values:
    * "number" Data value is compared directly to the value of OthersCategoryThreshold.
    * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
    */
  var othersCategoryType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the palette of brushes to use for outlines on the slices.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
    */
  var radiusFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the style used when a slice is selected.
    */
  var selectedStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether the series should render a tooltip.
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the starting angle of the chart.
    * The default zero value is equivalent to 3 o'clock.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of template or the template itself that chart tooltip will use to render.
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the current series type.
    *
    * Valid values:
    * "flat" Series has flat 1-dimensional data.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or Sets the property name that contains the values.
    */
  var valueMemberPath: js.UndefOr[String] = js.undefined
}
object IgDoughnutChartSeries {
  
  inline def apply(): IgDoughnutChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDoughnutChartSeries]
  }
  
  extension [Self <: IgDoughnutChartSeries](x: Self) {
    
    inline def setBrushes(value: Any): Self = StObject.set(x, "brushes", value.asInstanceOf[js.Any])
    
    inline def setBrushesUndefined: Self = StObject.set(x, "brushes", js.undefined)
    
    inline def setFormatLabel(value: Any): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    inline def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    inline def setFormatLegendLabel(value: Any): Self = StObject.set(x, "formatLegendLabel", value.asInstanceOf[js.Any])
    
    inline def setFormatLegendLabelUndefined: Self = StObject.set(x, "formatLegendLabel", js.undefined)
    
    inline def setIsSurfaceInteractionDisabled(value: Boolean): Self = StObject.set(x, "isSurfaceInteractionDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsSurfaceInteractionDisabledUndefined: Self = StObject.set(x, "isSurfaceInteractionDisabled", js.undefined)
    
    inline def setItemsSource(value: Any): Self = StObject.set(x, "itemsSource", value.asInstanceOf[js.Any])
    
    inline def setItemsSourceUndefined: Self = StObject.set(x, "itemsSource", js.undefined)
    
    inline def setLabelExtent(value: Double): Self = StObject.set(x, "labelExtent", value.asInstanceOf[js.Any])
    
    inline def setLabelExtentUndefined: Self = StObject.set(x, "labelExtent", js.undefined)
    
    inline def setLabelInnerColor(value: String): Self = StObject.set(x, "labelInnerColor", value.asInstanceOf[js.Any])
    
    inline def setLabelInnerColorUndefined: Self = StObject.set(x, "labelInnerColor", js.undefined)
    
    inline def setLabelMemberPath(value: String): Self = StObject.set(x, "labelMemberPath", value.asInstanceOf[js.Any])
    
    inline def setLabelMemberPathUndefined: Self = StObject.set(x, "labelMemberPath", js.undefined)
    
    inline def setLabelOuterColor(value: String): Self = StObject.set(x, "labelOuterColor", value.asInstanceOf[js.Any])
    
    inline def setLabelOuterColorUndefined: Self = StObject.set(x, "labelOuterColor", js.undefined)
    
    inline def setLabelsPosition(value: String): Self = StObject.set(x, "labelsPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelsPositionUndefined: Self = StObject.set(x, "labelsPosition", js.undefined)
    
    inline def setLeaderLineMargin(value: Double): Self = StObject.set(x, "leaderLineMargin", value.asInstanceOf[js.Any])
    
    inline def setLeaderLineMarginUndefined: Self = StObject.set(x, "leaderLineMargin", js.undefined)
    
    inline def setLeaderLineStyle(value: Any): Self = StObject.set(x, "leaderLineStyle", value.asInstanceOf[js.Any])
    
    inline def setLeaderLineStyleUndefined: Self = StObject.set(x, "leaderLineStyle", js.undefined)
    
    inline def setLeaderLineType(value: String): Self = StObject.set(x, "leaderLineType", value.asInstanceOf[js.Any])
    
    inline def setLeaderLineTypeUndefined: Self = StObject.set(x, "leaderLineType", js.undefined)
    
    inline def setLeaderLineVisibility(value: String): Self = StObject.set(x, "leaderLineVisibility", value.asInstanceOf[js.Any])
    
    inline def setLeaderLineVisibilityUndefined: Self = StObject.set(x, "leaderLineVisibility", js.undefined)
    
    inline def setLegend(value: Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelMemberPath(value: String): Self = StObject.set(x, "legendLabelMemberPath", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelMemberPathUndefined: Self = StObject.set(x, "legendLabelMemberPath", js.undefined)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setOthersCategoryText(value: String): Self = StObject.set(x, "othersCategoryText", value.asInstanceOf[js.Any])
    
    inline def setOthersCategoryTextUndefined: Self = StObject.set(x, "othersCategoryText", js.undefined)
    
    inline def setOthersCategoryThreshold(value: Double): Self = StObject.set(x, "othersCategoryThreshold", value.asInstanceOf[js.Any])
    
    inline def setOthersCategoryThresholdUndefined: Self = StObject.set(x, "othersCategoryThreshold", js.undefined)
    
    inline def setOthersCategoryType(value: String): Self = StObject.set(x, "othersCategoryType", value.asInstanceOf[js.Any])
    
    inline def setOthersCategoryTypeUndefined: Self = StObject.set(x, "othersCategoryType", js.undefined)
    
    inline def setOutlines(value: Any): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    inline def setOutlinesUndefined: Self = StObject.set(x, "outlines", js.undefined)
    
    inline def setRadiusFactor(value: Double): Self = StObject.set(x, "radiusFactor", value.asInstanceOf[js.Any])
    
    inline def setRadiusFactorUndefined: Self = StObject.set(x, "radiusFactor", js.undefined)
    
    inline def setSelectedStyle(value: Any): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
    
    inline def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
  }
}
