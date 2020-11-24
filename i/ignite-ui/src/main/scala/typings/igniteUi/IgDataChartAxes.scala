package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDataChartAxes
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets the coercion methods to use when loading data from data sources.
    * Should be specified before setting any member paths, if being used. Setting it later
    * will not cause data to be reimported into the chart.
    */
  var coercionMethods: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the CrossingAxis property.
    */
  var crossingAxis: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the CrossingValue property.
    */
  var crossingValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the DateTime mapping property for the CategoryDateTimeXAxis.
    */
  var dateTimeMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the axis display type. Continuous display type divides the axis into even intervals, where labels will not necessarily be aligned with data points. Discrete display type will not use a constant interval, but will align each label with its data point.
    *
    * Valid values:
    * "continuous" Points occur at even intervals, even where data is not present at a given point.
    * "discrete" Points occur when data is present, possibly at uneven intervals.
    */
  var displayType: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the mininum desired characters to be displayed for horizontal axes when using advanced label heuristics. -1 will attempt to adjust the interval to precisely fit the horizontal labels.
    */
  var enhancedIntervalMinimumCharacters: js.UndefOr[Double] = js.native
  
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the amount of space between adjacent categories for the current axis object.
    * The gap is silently clamped to the range [0, 1] when used.
    */
  var gap: js.UndefOr[Double] = js.native
  
  /**
    * Defines the percentage of the maximum radius extent to leave blank at the center of the chart. Should be
    * a value between 0.0 and 1.0.
    */
  var innerRadiusExtentScale: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the frequency of displayed labels.
    * The set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets whether the data assigned to the date time axis should be considered pre-sorted by date/time.
    */
  var isDataPreSorted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the IsInverted property.
    */
  var isInverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the IsLogarithmic property.
    */
  var isLogarithmic: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the label mapping property to use for axis labels.
    */
  var label: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the angle that labels on the axis should be rotated
    */
  var labelAngle: js.UndefOr[Double] = js.native
  
  /**
    * The bottom margin to use for the labels.
    */
  var labelBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the extent of the area dedicated to the labels for this axis. If unspecified, this value is auto-calculated.
    */
  var labelExtent: js.UndefOr[Double] = js.native
  
  /**
    * the horizontal alignment to use for the labels. Only applicable to vertical axes.
    *
    * Valid values:
    * "left" left aligns the labels.
    * "center" center aligns the labels.
    * "right" right aligns the labels.
    */
  var labelHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * The left margin to use for the labels.
    */
  var labelLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the location to display the axis labels for this axis.
    *
    * Valid values:
    * "outsideTop" The labels should have an outside top position.
    * "outsideBottom" The labels should have an outside bottom position.
    * "outsideLeft" The labels should have an outside left position.
    * "outsideRight" The labels should have an outside right position.
    * "insideTop" The labels should have an inside top position.
    * "insideBottom" The labels should have an inside bottom position.
    * "insideLeft" The labels should have an inside left position.
    * "insideRight" The labels should have an inside right position.
    */
  var labelLocation: js.UndefOr[String] = js.native
  
  /**
    * The margin to use for the labels.
    */
  var labelMargin: js.UndefOr[Double] = js.native
  
  /**
    * The right margin to use for the labels.
    */
  var labelRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Overrides the color of the text used for the axis labels.
    */
  var labelTextColor: js.UndefOr[String] = js.native
  
  /**
    * Overrides the style of the text used for the axis labels.
    */
  var labelTextStyle: js.UndefOr[String] = js.native
  
  /**
    * The top margin to use for the labels.
    */
  var labelTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * the vertical alignment to use for the labels. Only applicable to horizontal axes.
    *
    * Valid values:
    * "top" top aligns the labels.
    * "center" center aligns the labels.
    * "bottom" bottom aligns the labels.
    */
  var labelVerticalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the labels are visible.
    *
    * Valid values:
    * "visible" The labels should be visisble for this axis.
    * "collapsed" The labels should not be visible for this axis.
    */
  var labelVisibility: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the LogarithmBase property.
    */
  var logarithmBase: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the MajorStroke property.
    */
  var majorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the MajorStrokeThickness property.
    */
  var majorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the axis MaximumValue.
    *
    *
    * Valid values:
    * "number" The maximum value can be set to be a number when the axis is of numeric type
    * "date" The maximum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
    */
  var maximumValue: js.UndefOr[Double | Date] = js.native
  
  /**
    * Gets or sets the axis MinimumValue.
    *
    *
    * Valid values:
    * "number" The minimum value can be set to be a number when the axis is of numeric type
    * "date" The minimum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
    */
  var minimumValue: js.UndefOr[Double | Date] = js.native
  
  /**
    * Gets or sets the MinorStroke property.
    */
  var minorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the MinorStrokeThickness property.
    */
  var minorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * The unique identifier of the axis.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the amount of overlap between adjacent categories for the current axis object.
    * The overlap is silently clamped to the range [-1, 1] when used.
    */
  var overlap: js.UndefOr[Double] = js.native
  
  /**
    * Defines the percentage of the maximum radius extent to use as the maximum radius. Should be
    * a value between 0.0 and 1.0.
    */
  var radiusExtentScale: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the ReferenceValue property.
    */
  var referenceValue: js.UndefOr[Double] = js.native
  
  /**
    * Set to true in order to have an existing axis removed from the chart, by name
    */
  var remove: js.UndefOr[Boolean] = js.native
  
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  
  /**
    * Sets whether or not to show the first label on the axis.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the angle in degress that the chart's 0th angle should be offset.
    */
  var startAngleOffset: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the Strip property.
    */
  var strip: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the Stroke property.
    */
  var stroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the StrokeThickness property.
    */
  var strokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * The length of the tickmarks to display for this axis.
    */
  var tickLength: js.UndefOr[Double] = js.native
  
  /**
    * The color to use for the tickmarks.
    */
  var tickStroke: js.UndefOr[js.Any] = js.native
  
  /**
    * The stroke thickness to use for the tickmarks.
    */
  var tickStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * The title to display for the component.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The angle to use for the axis title.
    */
  var titleAngle: js.UndefOr[Double] = js.native
  
  /**
    * The bottom margin to use for the title.
    */
  var titleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * the horizontal alignment to use for the title.
    *
    * Valid values:
    * "left" left aligns the title.
    * "center" center aligns the title.
    * "right" right aligns the title.
    */
  var titleHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * The left margin to use for the title.
    */
  var titleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * The margin to display around the title of the axis.
    */
  var titleMargin: js.UndefOr[Double] = js.native
  
  /**
    * the position to use for the title.
    *
    * Valid values:
    * "auto" the title is positioned automatically.
    * "left" the title is positioned on the left of the labels, if applicable.
    * "right" the title is positioned on the right of the labels, if applicable.
    * "top" the title is positioned on the top of the labels, if applicable.
    * "bottom" the title is positioned on the bottom of the labels, if applicable.
    */
  var titlePosition: js.UndefOr[String] = js.native
  
  /**
    * The right margin to use for the title.
    */
  var titleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * The css font property to use for the title.
    */
  var titleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * The top margin to use for the title.
    */
  var titleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * the vertical alignment to use for the title.
    *
    * Valid values:
    * "center" center aligns the title.
    */
  var titleVerticalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Type of the axis.
    *
    * Valid values:
    * "numericX" Specify the axis as numeric X axis. Useful for displaying scatter, category and financial price series.
    * "numericY" Specify the axis as numeric Y axis.Useful for displaying scatter, category and financial price series.
    * "categoryX" Specify the axis as category X axis. Useful for displaying scatter, category and financial price series.
    * "categoryDateTimeX" Specify the axis as category datetime X axis. Useful for displaying category and financial price series with date based data.
    * "categoryY" Specify the axis as category Y axis. Useful for displaying scatter, category and financial price series.
    * "categoryAngle" Specify the axis as category angle axis. Useful for displaying polar and radial categories.
    * "numericAngle" Specify the axis as numeric angle axis. Useful for displaying polar and radial series.
    * "numericRadius" Specify the axis as numeric radius axis. Useful for displaying polar and radial series.
    * "time" Specify the axis as time X axis. Useful for displaying date based data with time breaks.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether the cateogory axis should use clustering display mode even if no series are present that would force clustering mode.
    */
  var useClusteringMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether to use more advanced heuristics when determining the initial number of labels to render, before resolving collisions, etc.
    */
  var useEnhancedIntervalManagement: js.UndefOr[Boolean] = js.native
}
object IgDataChartAxes {
  
  @scala.inline
  def apply(): IgDataChartAxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartAxes]
  }
  
  @scala.inline
  implicit class IgDataChartAxesOps[Self <: IgDataChartAxes] (val x: Self) extends AnyVal {
    
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
    def setCoercionMethods(value: js.Any): Self = this.set("coercionMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoercionMethods: Self = this.set("coercionMethods", js.undefined)
    
    @scala.inline
    def setCrossingAxis(value: String): Self = this.set("crossingAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossingAxis: Self = this.set("crossingAxis", js.undefined)
    
    @scala.inline
    def setCrossingValue(value: js.Any): Self = this.set("crossingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossingValue: Self = this.set("crossingValue", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    
    @scala.inline
    def setDateTimeMemberPath(value: String): Self = this.set("dateTimeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeMemberPath: Self = this.set("dateTimeMemberPath", js.undefined)
    
    @scala.inline
    def setDisplayType(value: String): Self = this.set("displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    
    @scala.inline
    def setEnhancedIntervalMinimumCharacters(value: Double): Self = this.set("enhancedIntervalMinimumCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedIntervalMinimumCharacters: Self = this.set("enhancedIntervalMinimumCharacters", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: js.Any): Self = this.set("formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setInnerRadiusExtentScale(value: Double): Self = this.set("innerRadiusExtentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadiusExtentScale: Self = this.set("innerRadiusExtentScale", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIsDataPreSorted(value: Boolean): Self = this.set("isDataPreSorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDataPreSorted: Self = this.set("isDataPreSorted", js.undefined)
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = this.set("isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInverted: Self = this.set("isInverted", js.undefined)
    
    @scala.inline
    def setIsLogarithmic(value: Boolean): Self = this.set("isLogarithmic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLogarithmic: Self = this.set("isLogarithmic", js.undefined)
    
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelAngle(value: Double): Self = this.set("labelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAngle: Self = this.set("labelAngle", js.undefined)
    
    @scala.inline
    def setLabelBottomMargin(value: Double): Self = this.set("labelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBottomMargin: Self = this.set("labelBottomMargin", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = this.set("labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelExtent: Self = this.set("labelExtent", js.undefined)
    
    @scala.inline
    def setLabelHorizontalAlignment(value: String): Self = this.set("labelHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHorizontalAlignment: Self = this.set("labelHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setLabelLeftMargin(value: Double): Self = this.set("labelLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLeftMargin: Self = this.set("labelLeftMargin", js.undefined)
    
    @scala.inline
    def setLabelLocation(value: String): Self = this.set("labelLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLocation: Self = this.set("labelLocation", js.undefined)
    
    @scala.inline
    def setLabelMargin(value: Double): Self = this.set("labelMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMargin: Self = this.set("labelMargin", js.undefined)
    
    @scala.inline
    def setLabelRightMargin(value: Double): Self = this.set("labelRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelRightMargin: Self = this.set("labelRightMargin", js.undefined)
    
    @scala.inline
    def setLabelTextColor(value: String): Self = this.set("labelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    
    @scala.inline
    def setLabelTextStyle(value: String): Self = this.set("labelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTextStyle: Self = this.set("labelTextStyle", js.undefined)
    
    @scala.inline
    def setLabelTopMargin(value: Double): Self = this.set("labelTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTopMargin: Self = this.set("labelTopMargin", js.undefined)
    
    @scala.inline
    def setLabelVerticalAlignment(value: String): Self = this.set("labelVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelVerticalAlignment: Self = this.set("labelVerticalAlignment", js.undefined)
    
    @scala.inline
    def setLabelVisibility(value: String): Self = this.set("labelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelVisibility: Self = this.set("labelVisibility", js.undefined)
    
    @scala.inline
    def setLogarithmBase(value: Double): Self = this.set("logarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogarithmBase: Self = this.set("logarithmBase", js.undefined)
    
    @scala.inline
    def setMajorStroke(value: String): Self = this.set("majorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorStroke: Self = this.set("majorStroke", js.undefined)
    
    @scala.inline
    def setMajorStrokeThickness(value: Double): Self = this.set("majorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorStrokeThickness: Self = this.set("majorStrokeThickness", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double | Date): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double | Date): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    
    @scala.inline
    def setMinorStroke(value: String): Self = this.set("minorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorStroke: Self = this.set("minorStroke", js.undefined)
    
    @scala.inline
    def setMinorStrokeThickness(value: Double): Self = this.set("minorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorStrokeThickness: Self = this.set("minorStrokeThickness", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverlap(value: Double): Self = this.set("overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlap: Self = this.set("overlap", js.undefined)
    
    @scala.inline
    def setRadiusExtentScale(value: Double): Self = this.set("radiusExtentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusExtentScale: Self = this.set("radiusExtentScale", js.undefined)
    
    @scala.inline
    def setReferenceValue(value: Double): Self = this.set("referenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceValue: Self = this.set("referenceValue", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = this.set("showFirstLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFirstLabel: Self = this.set("showFirstLabel", js.undefined)
    
    @scala.inline
    def setStartAngleOffset(value: Double): Self = this.set("startAngleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngleOffset: Self = this.set("startAngleOffset", js.undefined)
    
    @scala.inline
    def setStrip(value: String): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeThickness(value: Double): Self = this.set("strokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeThickness: Self = this.set("strokeThickness", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLength: Self = this.set("tickLength", js.undefined)
    
    @scala.inline
    def setTickStroke(value: js.Any): Self = this.set("tickStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickStroke: Self = this.set("tickStroke", js.undefined)
    
    @scala.inline
    def setTickStrokeThickness(value: Double): Self = this.set("tickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickStrokeThickness: Self = this.set("tickStrokeThickness", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleAngle(value: Double): Self = this.set("titleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAngle: Self = this.set("titleAngle", js.undefined)
    
    @scala.inline
    def setTitleBottomMargin(value: Double): Self = this.set("titleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBottomMargin: Self = this.set("titleBottomMargin", js.undefined)
    
    @scala.inline
    def setTitleHorizontalAlignment(value: String): Self = this.set("titleHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleHorizontalAlignment: Self = this.set("titleHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setTitleLeftMargin(value: Double): Self = this.set("titleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLeftMargin: Self = this.set("titleLeftMargin", js.undefined)
    
    @scala.inline
    def setTitleMargin(value: Double): Self = this.set("titleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleMargin: Self = this.set("titleMargin", js.undefined)
    
    @scala.inline
    def setTitlePosition(value: String): Self = this.set("titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePosition: Self = this.set("titlePosition", js.undefined)
    
    @scala.inline
    def setTitleRightMargin(value: Double): Self = this.set("titleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleRightMargin: Self = this.set("titleRightMargin", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: String): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTopMargin(value: Double): Self = this.set("titleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTopMargin: Self = this.set("titleTopMargin", js.undefined)
    
    @scala.inline
    def setTitleVerticalAlignment(value: String): Self = this.set("titleVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleVerticalAlignment: Self = this.set("titleVerticalAlignment", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseClusteringMode(value: Boolean): Self = this.set("useClusteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseClusteringMode: Self = this.set("useClusteringMode", js.undefined)
    
    @scala.inline
    def setUseEnhancedIntervalManagement(value: Boolean): Self = this.set("useEnhancedIntervalManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEnhancedIntervalManagement: Self = this.set("useEnhancedIntervalManagement", js.undefined)
  }
}
