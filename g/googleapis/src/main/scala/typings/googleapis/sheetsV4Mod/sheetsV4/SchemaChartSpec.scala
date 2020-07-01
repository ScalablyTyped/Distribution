package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specifications of a chart.
  */
@js.native
trait SchemaChartSpec extends js.Object {
  /**
    * The alternative text that describes the chart.  This is often used for
    * accessibility.
    */
  var altText: js.UndefOr[String] = js.native
  /**
    * The background color of the entire chart. Not applicable to Org charts.
    */
  var backgroundColor: js.UndefOr[SchemaColor] = js.native
  /**
    * A basic chart specification, can be one of many kinds of charts. See
    * BasicChartType for the list of all charts this supports.
    */
  var basicChart: js.UndefOr[SchemaBasicChartSpec] = js.native
  /**
    * A bubble chart specification.
    */
  var bubbleChart: js.UndefOr[SchemaBubbleChartSpec] = js.native
  /**
    * A candlestick chart specification.
    */
  var candlestickChart: js.UndefOr[SchemaCandlestickChartSpec] = js.native
  /**
    * The name of the font to use by default for all chart text (e.g. title,
    * axis labels, legend).  If a font is specified for a specific part of the
    * chart it will override this font name.
    */
  var fontName: js.UndefOr[String] = js.native
  /**
    * Determines how the charts will use hidden rows or columns.
    */
  var hiddenDimensionStrategy: js.UndefOr[String] = js.native
  /**
    * A histogram chart specification.
    */
  var histogramChart: js.UndefOr[SchemaHistogramChartSpec] = js.native
  /**
    * True to make a chart fill the entire space in which it&#39;s rendered
    * with minimum padding.  False to use the default padding. (Not applicable
    * to Geo and Org charts.)
    */
  var maximized: js.UndefOr[Boolean] = js.native
  /**
    * An org chart specification.
    */
  var orgChart: js.UndefOr[SchemaOrgChartSpec] = js.native
  /**
    * A pie chart specification.
    */
  var pieChart: js.UndefOr[SchemaPieChartSpec] = js.native
  /**
    * The subtitle of the chart.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * The subtitle text format. Strikethrough and underline are not supported.
    */
  var subtitleTextFormat: js.UndefOr[SchemaTextFormat] = js.native
  /**
    * The subtitle text position. This field is optional.
    */
  var subtitleTextPosition: js.UndefOr[SchemaTextPosition] = js.native
  /**
    * The title of the chart.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The title text format. Strikethrough and underline are not supported.
    */
  var titleTextFormat: js.UndefOr[SchemaTextFormat] = js.native
  /**
    * The title text position. This field is optional.
    */
  var titleTextPosition: js.UndefOr[SchemaTextPosition] = js.native
  /**
    * A treemap chart specification.
    */
  var treemapChart: js.UndefOr[SchemaTreemapChartSpec] = js.native
  /**
    * A waterfall chart specification.
    */
  var waterfallChart: js.UndefOr[SchemaWaterfallChartSpec] = js.native
}

object SchemaChartSpec {
  @scala.inline
  def apply(
    altText: String = null,
    backgroundColor: SchemaColor = null,
    basicChart: SchemaBasicChartSpec = null,
    bubbleChart: SchemaBubbleChartSpec = null,
    candlestickChart: SchemaCandlestickChartSpec = null,
    fontName: String = null,
    hiddenDimensionStrategy: String = null,
    histogramChart: SchemaHistogramChartSpec = null,
    maximized: js.UndefOr[Boolean] = js.undefined,
    orgChart: SchemaOrgChartSpec = null,
    pieChart: SchemaPieChartSpec = null,
    subtitle: String = null,
    subtitleTextFormat: SchemaTextFormat = null,
    subtitleTextPosition: SchemaTextPosition = null,
    title: String = null,
    titleTextFormat: SchemaTextFormat = null,
    titleTextPosition: SchemaTextPosition = null,
    treemapChart: SchemaTreemapChartSpec = null,
    waterfallChart: SchemaWaterfallChartSpec = null
  ): SchemaChartSpec = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (basicChart != null) __obj.updateDynamic("basicChart")(basicChart.asInstanceOf[js.Any])
    if (bubbleChart != null) __obj.updateDynamic("bubbleChart")(bubbleChart.asInstanceOf[js.Any])
    if (candlestickChart != null) __obj.updateDynamic("candlestickChart")(candlestickChart.asInstanceOf[js.Any])
    if (fontName != null) __obj.updateDynamic("fontName")(fontName.asInstanceOf[js.Any])
    if (hiddenDimensionStrategy != null) __obj.updateDynamic("hiddenDimensionStrategy")(hiddenDimensionStrategy.asInstanceOf[js.Any])
    if (histogramChart != null) __obj.updateDynamic("histogramChart")(histogramChart.asInstanceOf[js.Any])
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized.get.asInstanceOf[js.Any])
    if (orgChart != null) __obj.updateDynamic("orgChart")(orgChart.asInstanceOf[js.Any])
    if (pieChart != null) __obj.updateDynamic("pieChart")(pieChart.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleTextFormat != null) __obj.updateDynamic("subtitleTextFormat")(subtitleTextFormat.asInstanceOf[js.Any])
    if (subtitleTextPosition != null) __obj.updateDynamic("subtitleTextPosition")(subtitleTextPosition.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextFormat != null) __obj.updateDynamic("titleTextFormat")(titleTextFormat.asInstanceOf[js.Any])
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition.asInstanceOf[js.Any])
    if (treemapChart != null) __obj.updateDynamic("treemapChart")(treemapChart.asInstanceOf[js.Any])
    if (waterfallChart != null) __obj.updateDynamic("waterfallChart")(waterfallChart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChartSpec]
  }
}

