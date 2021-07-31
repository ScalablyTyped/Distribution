package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapLevelsOptions extends StObject {
  
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts) Set the dash style of the border of all the point which lies
    * on the level. See plotOptions.scatter.dashStyle for possible options.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highcharts) Can set the borderWidth on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Can set a color on all points which lies on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) A configuration object to define how the color of a child
    * varies from the parent's color. The variation is distributed among the
    * children of node. For example when setting brightness, the brightness
    * change will range from the parent's original brightness on the first
    * child, to the amount set in the `to` setting on the last node. This
    * allows a gradient-like color scheme that sets children out from each
    * other while highlighting the grouping on treemaps and sectors on sunburst
    * charts.
    */
  var colorVariation: js.UndefOr[PlotTreemapLevelsColorVariationOptions] = js.undefined
  
  /**
    * (Highcharts) Can set the options of dataLabels on each point which lies
    * on the level. plotOptions.treemap.dataLabels for possible values.
    */
  var dataLabels: js.UndefOr[
    PlotTreemapLevelsDataLabelsOptions | js.Array[PlotTreemapLevelsDataLabelsOptions]
  ] = js.undefined
  
  /**
    * (Highcharts) Can set the layoutAlgorithm option on a specific level.
    */
  var layoutAlgorithm: js.UndefOr[OptionsLayoutAlgorithmValue] = js.undefined
  
  /**
    * (Highcharts) Can set the layoutStartingDirection option on a specific
    * level.
    */
  var layoutStartingDirection: js.UndefOr[OptionsLayoutStartingDirectionValue] = js.undefined
  
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.undefined
}
object PlotTreemapLevelsOptions {
  
  @scala.inline
  def apply(): PlotTreemapLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapLevelsOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapLevelsOptionsMutableBuilder[Self <: PlotTreemapLevelsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: ColorString): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderDashStyle(value: DashStyleValue): Self = StObject.set(x, "borderDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashStyleUndefined: Self = StObject.set(x, "borderDashStyle", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVariation(value: PlotTreemapLevelsColorVariationOptions): Self = StObject.set(x, "colorVariation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVariationUndefined: Self = StObject.set(x, "colorVariation", js.undefined)
    
    @scala.inline
    def setDataLabels(value: PlotTreemapLevelsDataLabelsOptions | js.Array[PlotTreemapLevelsDataLabelsOptions]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: PlotTreemapLevelsDataLabelsOptions*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setLayoutAlgorithm(value: OptionsLayoutAlgorithmValue): Self = StObject.set(x, "layoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutAlgorithmUndefined: Self = StObject.set(x, "layoutAlgorithm", js.undefined)
    
    @scala.inline
    def setLayoutStartingDirection(value: OptionsLayoutStartingDirectionValue): Self = StObject.set(x, "layoutStartingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutStartingDirectionUndefined: Self = StObject.set(x, "layoutStartingDirection", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
