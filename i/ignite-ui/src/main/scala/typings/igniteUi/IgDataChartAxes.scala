package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDataChartAxes
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets the coercion methods to use when loading data from data sources.
    * Should be specified before setting any member paths, if being used. Setting it later
    * will not cause data to be reimported into the chart.
    */
  var coercionMethods: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets or sets the CrossingAxis property.
    */
  var crossingAxis: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the CrossingValue property.
    */
  var crossingValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the DateTime mapping property for the CategoryDateTimeXAxis.
    */
  var dateTimeMemberPath: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the axis display type. Continuous display type divides the axis into even intervals, where labels will not necessarily be aligned with data points. Discrete display type will not use a constant interval, but will align each label with its data point.
    *
    * Valid values:
    * "continuous" Points occur at even intervals, even where data is not present at a given point.
    * "discrete" Points occur when data is present, possibly at uneven intervals.
    */
  var displayType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the mininum desired characters to be displayed for horizontal axes when using advanced label heuristics. -1 will attempt to adjust the interval to precisely fit the horizontal labels.
    */
  var enhancedIntervalMinimumCharacters: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets or sets the amount of space between adjacent categories for the current axis object.
    * The gap is silently clamped to the range [0, 1] when used.
    */
  var gap: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the percentage of the maximum radius extent to leave blank at the center of the chart. Should be
    * a value between 0.0 and 1.0.
    */
  var innerRadiusExtentScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the frequency of displayed labels.
    * The set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets whether the data assigned to the date time axis should be considered pre-sorted by date/time.
    */
  var isDataPreSorted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the IsInverted property.
    */
  var isInverted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the IsLogarithmic property.
    */
  var isLogarithmic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the label mapping property to use for axis labels.
    */
  var label: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specifies the angle that labels on the axis should be rotated
    */
  var labelAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * The bottom margin to use for the labels.
    */
  var labelBottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the extent of the area dedicated to the labels for this axis. If unspecified, this value is auto-calculated.
    */
  var labelExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * the horizontal alignment to use for the labels. Only applicable to vertical axes.
    *
    * Valid values:
    * "left" left aligns the labels.
    * "center" center aligns the labels.
    * "right" right aligns the labels.
    */
  var labelHorizontalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * The left margin to use for the labels.
    */
  var labelLeftMargin: js.UndefOr[Double] = js.undefined
  
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
  var labelLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The margin to use for the labels.
    */
  var labelMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The right margin to use for the labels.
    */
  var labelRightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Overrides the color of the text used for the axis labels.
    */
  var labelTextColor: js.UndefOr[String] = js.undefined
  
  /**
    * Overrides the style of the text used for the axis labels.
    */
  var labelTextStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The top margin to use for the labels.
    */
  var labelTopMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * the vertical alignment to use for the labels. Only applicable to horizontal axes.
    *
    * Valid values:
    * "top" top aligns the labels.
    * "center" center aligns the labels.
    * "bottom" bottom aligns the labels.
    */
  var labelVerticalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the labels are visible.
    *
    * Valid values:
    * "visible" The labels should be visisble for this axis.
    * "collapsed" The labels should not be visible for this axis.
    */
  var labelVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the LogarithmBase property.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the MajorStroke property.
    */
  var majorStroke: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the MajorStrokeThickness property.
    */
  var majorStrokeThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the axis MaximumValue.
    *
    *
    * Valid values:
    * "number" The maximum value can be set to be a number when the axis is of numeric type
    * "date" The maximum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
    */
  var maximumValue: js.UndefOr[Double | Date] = js.undefined
  
  /**
    * Gets or sets the axis MinimumValue.
    *
    *
    * Valid values:
    * "number" The minimum value can be set to be a number when the axis is of numeric type
    * "date" The minimum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
    */
  var minimumValue: js.UndefOr[Double | Date] = js.undefined
  
  /**
    * Gets or sets the MinorStroke property.
    */
  var minorStroke: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the MinorStrokeThickness property.
    */
  var minorStrokeThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The unique identifier of the axis.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the amount of overlap between adjacent categories for the current axis object.
    * The overlap is silently clamped to the range [-1, 1] when used.
    */
  var overlap: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the percentage of the maximum radius extent to use as the maximum radius. Should be
    * a value between 0.0 and 1.0.
    */
  var radiusExtentScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the ReferenceValue property.
    */
  var referenceValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to true in order to have an existing axis removed from the chart, by name
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * Sets whether or not to show the first label on the axis.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the angle in degress that the chart's 0th angle should be offset.
    */
  var startAngleOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the Strip property.
    */
  var strip: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the Stroke property.
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the StrokeThickness property.
    */
  var strokeThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the tickmarks to display for this axis.
    */
  var tickLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The color to use for the tickmarks.
    */
  var tickStroke: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The stroke thickness to use for the tickmarks.
    */
  var tickStrokeThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The title to display for the component.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The angle to use for the axis title.
    */
  var titleAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * The bottom margin to use for the title.
    */
  var titleBottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * the horizontal alignment to use for the title.
    *
    * Valid values:
    * "left" left aligns the title.
    * "center" center aligns the title.
    * "right" right aligns the title.
    */
  var titleHorizontalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * The left margin to use for the title.
    */
  var titleLeftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The margin to display around the title of the axis.
    */
  var titleMargin: js.UndefOr[Double] = js.undefined
  
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
  var titlePosition: js.UndefOr[String] = js.undefined
  
  /**
    * The right margin to use for the title.
    */
  var titleRightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The css font property to use for the title.
    */
  var titleTextStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The top margin to use for the title.
    */
  var titleTopMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * the vertical alignment to use for the title.
    *
    * Valid values:
    * "center" center aligns the title.
    */
  var titleVerticalAlignment: js.UndefOr[String] = js.undefined
  
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
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets whether the cateogory axis should use clustering display mode even if no series are present that would force clustering mode.
    */
  var useClusteringMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets whether to use more advanced heuristics when determining the initial number of labels to render, before resolving collisions, etc.
    */
  var useEnhancedIntervalManagement: js.UndefOr[Boolean] = js.undefined
}
object IgDataChartAxes {
  
  @scala.inline
  def apply(): IgDataChartAxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartAxes]
  }
  
  @scala.inline
  implicit class IgDataChartAxesMutableBuilder[Self <: IgDataChartAxes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoercionMethods(value: js.Any): Self = StObject.set(x, "coercionMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoercionMethodsUndefined: Self = StObject.set(x, "coercionMethods", js.undefined)
    
    @scala.inline
    def setCrossingAxis(value: String): Self = StObject.set(x, "crossingAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossingAxisUndefined: Self = StObject.set(x, "crossingAxis", js.undefined)
    
    @scala.inline
    def setCrossingValue(value: js.Any): Self = StObject.set(x, "crossingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossingValueUndefined: Self = StObject.set(x, "crossingValue", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setDateTimeMemberPath(value: String): Self = StObject.set(x, "dateTimeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeMemberPathUndefined: Self = StObject.set(x, "dateTimeMemberPath", js.undefined)
    
    @scala.inline
    def setDisplayType(value: String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    @scala.inline
    def setEnhancedIntervalMinimumCharacters(value: Double): Self = StObject.set(x, "enhancedIntervalMinimumCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedIntervalMinimumCharactersUndefined: Self = StObject.set(x, "enhancedIntervalMinimumCharacters", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: js.Any): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setInnerRadiusExtentScale(value: Double): Self = StObject.set(x, "innerRadiusExtentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusExtentScaleUndefined: Self = StObject.set(x, "innerRadiusExtentScale", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setIsDataPreSorted(value: Boolean): Self = StObject.set(x, "isDataPreSorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataPreSortedUndefined: Self = StObject.set(x, "isDataPreSorted", js.undefined)
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvertedUndefined: Self = StObject.set(x, "isInverted", js.undefined)
    
    @scala.inline
    def setIsLogarithmic(value: Boolean): Self = StObject.set(x, "isLogarithmic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLogarithmicUndefined: Self = StObject.set(x, "isLogarithmic", js.undefined)
    
    @scala.inline
    def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAngle(value: Double): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
    
    @scala.inline
    def setLabelBottomMargin(value: Double): Self = StObject.set(x, "labelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelBottomMarginUndefined: Self = StObject.set(x, "labelBottomMargin", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = StObject.set(x, "labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExtentUndefined: Self = StObject.set(x, "labelExtent", js.undefined)
    
    @scala.inline
    def setLabelHorizontalAlignment(value: String): Self = StObject.set(x, "labelHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHorizontalAlignmentUndefined: Self = StObject.set(x, "labelHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setLabelLeftMargin(value: Double): Self = StObject.set(x, "labelLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLeftMarginUndefined: Self = StObject.set(x, "labelLeftMargin", js.undefined)
    
    @scala.inline
    def setLabelLocation(value: String): Self = StObject.set(x, "labelLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLocationUndefined: Self = StObject.set(x, "labelLocation", js.undefined)
    
    @scala.inline
    def setLabelMargin(value: Double): Self = StObject.set(x, "labelMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMarginUndefined: Self = StObject.set(x, "labelMargin", js.undefined)
    
    @scala.inline
    def setLabelRightMargin(value: Double): Self = StObject.set(x, "labelRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelRightMarginUndefined: Self = StObject.set(x, "labelRightMargin", js.undefined)
    
    @scala.inline
    def setLabelTextColor(value: String): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    @scala.inline
    def setLabelTextStyle(value: String): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
    
    @scala.inline
    def setLabelTopMargin(value: Double): Self = StObject.set(x, "labelTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTopMarginUndefined: Self = StObject.set(x, "labelTopMargin", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelVerticalAlignment(value: String): Self = StObject.set(x, "labelVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVerticalAlignmentUndefined: Self = StObject.set(x, "labelVerticalAlignment", js.undefined)
    
    @scala.inline
    def setLabelVisibility(value: String): Self = StObject.set(x, "labelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVisibilityUndefined: Self = StObject.set(x, "labelVisibility", js.undefined)
    
    @scala.inline
    def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    @scala.inline
    def setMajorStroke(value: String): Self = StObject.set(x, "majorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorStrokeThickness(value: Double): Self = StObject.set(x, "majorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorStrokeThicknessUndefined: Self = StObject.set(x, "majorStrokeThickness", js.undefined)
    
    @scala.inline
    def setMajorStrokeUndefined: Self = StObject.set(x, "majorStroke", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double | Date): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double | Date): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setMinorStroke(value: String): Self = StObject.set(x, "minorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorStrokeThickness(value: Double): Self = StObject.set(x, "minorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorStrokeThicknessUndefined: Self = StObject.set(x, "minorStrokeThickness", js.undefined)
    
    @scala.inline
    def setMinorStrokeUndefined: Self = StObject.set(x, "minorStroke", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOverlap(value: Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    @scala.inline
    def setRadiusExtentScale(value: Double): Self = StObject.set(x, "radiusExtentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusExtentScaleUndefined: Self = StObject.set(x, "radiusExtentScale", js.undefined)
    
    @scala.inline
    def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = StObject.set(x, "showFirstLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFirstLabelUndefined: Self = StObject.set(x, "showFirstLabel", js.undefined)
    
    @scala.inline
    def setStartAngleOffset(value: Double): Self = StObject.set(x, "startAngleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleOffsetUndefined: Self = StObject.set(x, "startAngleOffset", js.undefined)
    
    @scala.inline
    def setStrip(value: String): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    @scala.inline
    def setTickStroke(value: js.Any): Self = StObject.set(x, "tickStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStrokeThickness(value: Double): Self = StObject.set(x, "tickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStrokeThicknessUndefined: Self = StObject.set(x, "tickStrokeThickness", js.undefined)
    
    @scala.inline
    def setTickStrokeUndefined: Self = StObject.set(x, "tickStroke", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAngle(value: Double): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
    
    @scala.inline
    def setTitleBottomMargin(value: Double): Self = StObject.set(x, "titleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBottomMarginUndefined: Self = StObject.set(x, "titleBottomMargin", js.undefined)
    
    @scala.inline
    def setTitleHorizontalAlignment(value: String): Self = StObject.set(x, "titleHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHorizontalAlignmentUndefined: Self = StObject.set(x, "titleHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setTitleLeftMargin(value: Double): Self = StObject.set(x, "titleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLeftMarginUndefined: Self = StObject.set(x, "titleLeftMargin", js.undefined)
    
    @scala.inline
    def setTitleMargin(value: Double): Self = StObject.set(x, "titleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleMarginUndefined: Self = StObject.set(x, "titleMargin", js.undefined)
    
    @scala.inline
    def setTitlePosition(value: String): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
    
    @scala.inline
    def setTitleRightMargin(value: Double): Self = StObject.set(x, "titleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRightMarginUndefined: Self = StObject.set(x, "titleRightMargin", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: String): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTopMargin(value: Double): Self = StObject.set(x, "titleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTopMarginUndefined: Self = StObject.set(x, "titleTopMargin", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVerticalAlignment(value: String): Self = StObject.set(x, "titleVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleVerticalAlignmentUndefined: Self = StObject.set(x, "titleVerticalAlignment", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseClusteringMode(value: Boolean): Self = StObject.set(x, "useClusteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClusteringModeUndefined: Self = StObject.set(x, "useClusteringMode", js.undefined)
    
    @scala.inline
    def setUseEnhancedIntervalManagement(value: Boolean): Self = StObject.set(x, "useEnhancedIntervalManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEnhancedIntervalManagementUndefined: Self = StObject.set(x, "useEnhancedIntervalManagement", js.undefined)
  }
}
