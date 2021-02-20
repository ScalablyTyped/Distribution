package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specifications of a chart.
  */
@js.native
trait SchemaChartSpec extends StObject {
  
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
  def apply(): SchemaChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartSpec]
  }
  
  @scala.inline
  implicit class SchemaChartSpecMutableBuilder[Self <: SchemaChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: SchemaColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBasicChart(value: SchemaBasicChartSpec): Self = StObject.set(x, "basicChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicChartUndefined: Self = StObject.set(x, "basicChart", js.undefined)
    
    @scala.inline
    def setBubbleChart(value: SchemaBubbleChartSpec): Self = StObject.set(x, "bubbleChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleChartUndefined: Self = StObject.set(x, "bubbleChart", js.undefined)
    
    @scala.inline
    def setCandlestickChart(value: SchemaCandlestickChartSpec): Self = StObject.set(x, "candlestickChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandlestickChartUndefined: Self = StObject.set(x, "candlestickChart", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    @scala.inline
    def setHiddenDimensionStrategy(value: String): Self = StObject.set(x, "hiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenDimensionStrategyUndefined: Self = StObject.set(x, "hiddenDimensionStrategy", js.undefined)
    
    @scala.inline
    def setHistogramChart(value: SchemaHistogramChartSpec): Self = StObject.set(x, "histogramChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramChartUndefined: Self = StObject.set(x, "histogramChart", js.undefined)
    
    @scala.inline
    def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
    
    @scala.inline
    def setOrgChart(value: SchemaOrgChartSpec): Self = StObject.set(x, "orgChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgChartUndefined: Self = StObject.set(x, "orgChart", js.undefined)
    
    @scala.inline
    def setPieChart(value: SchemaPieChartSpec): Self = StObject.set(x, "pieChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieChartUndefined: Self = StObject.set(x, "pieChart", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "subtitleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextFormatUndefined: Self = StObject.set(x, "subtitleTextFormat", js.undefined)
    
    @scala.inline
    def setSubtitleTextPosition(value: SchemaTextPosition): Self = StObject.set(x, "subtitleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextPositionUndefined: Self = StObject.set(x, "subtitleTextPosition", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "titleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextFormatUndefined: Self = StObject.set(x, "titleTextFormat", js.undefined)
    
    @scala.inline
    def setTitleTextPosition(value: SchemaTextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTreemapChart(value: SchemaTreemapChartSpec): Self = StObject.set(x, "treemapChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreemapChartUndefined: Self = StObject.set(x, "treemapChart", js.undefined)
    
    @scala.inline
    def setWaterfallChart(value: SchemaWaterfallChartSpec): Self = StObject.set(x, "waterfallChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallChartUndefined: Self = StObject.set(x, "waterfallChart", js.undefined)
  }
}
