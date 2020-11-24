package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartSpec]
  }
  
  @scala.inline
  implicit class SchemaChartSpecOps[Self <: SchemaChartSpec] (val x: Self) extends AnyVal {
    
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: SchemaColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBasicChart(value: SchemaBasicChartSpec): Self = this.set("basicChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicChart: Self = this.set("basicChart", js.undefined)
    
    @scala.inline
    def setBubbleChart(value: SchemaBubbleChartSpec): Self = this.set("bubbleChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleChart: Self = this.set("bubbleChart", js.undefined)
    
    @scala.inline
    def setCandlestickChart(value: SchemaCandlestickChartSpec): Self = this.set("candlestickChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandlestickChart: Self = this.set("candlestickChart", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    
    @scala.inline
    def setHiddenDimensionStrategy(value: String): Self = this.set("hiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenDimensionStrategy: Self = this.set("hiddenDimensionStrategy", js.undefined)
    
    @scala.inline
    def setHistogramChart(value: SchemaHistogramChartSpec): Self = this.set("histogramChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramChart: Self = this.set("histogramChart", js.undefined)
    
    @scala.inline
    def setMaximized(value: Boolean): Self = this.set("maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximized: Self = this.set("maximized", js.undefined)
    
    @scala.inline
    def setOrgChart(value: SchemaOrgChartSpec): Self = this.set("orgChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgChart: Self = this.set("orgChart", js.undefined)
    
    @scala.inline
    def setPieChart(value: SchemaPieChartSpec): Self = this.set("pieChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieChart: Self = this.set("pieChart", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleTextFormat(value: SchemaTextFormat): Self = this.set("subtitleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTextFormat: Self = this.set("subtitleTextFormat", js.undefined)
    
    @scala.inline
    def setSubtitleTextPosition(value: SchemaTextPosition): Self = this.set("subtitleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTextPosition: Self = this.set("subtitleTextPosition", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextFormat(value: SchemaTextFormat): Self = this.set("titleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextFormat: Self = this.set("titleTextFormat", js.undefined)
    
    @scala.inline
    def setTitleTextPosition(value: SchemaTextPosition): Self = this.set("titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextPosition: Self = this.set("titleTextPosition", js.undefined)
    
    @scala.inline
    def setTreemapChart(value: SchemaTreemapChartSpec): Self = this.set("treemapChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreemapChart: Self = this.set("treemapChart", js.undefined)
    
    @scala.inline
    def setWaterfallChart(value: SchemaWaterfallChartSpec): Self = this.set("waterfallChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfallChart: Self = this.set("waterfallChart", js.undefined)
  }
}
