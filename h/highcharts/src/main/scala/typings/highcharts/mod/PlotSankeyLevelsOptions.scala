package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSankeyLevelsOptions extends StObject {
  
  /**
    * (Highcharts) Can set `borderColor` on all nodes which lay on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts) Can set `borderWidth` on all nodes which lay on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Can set `color` on all nodes which lay on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) Can set `colorByPoint` on all nodes which lay on the same
    * level.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Can set `dataLabels` on all
    * points which lay on the same level.
    */
  var dataLabels: js.UndefOr[
    SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject]
  ] = js.undefined
  
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Can set `linkOpacity` on all points which lay on the same
    * level.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Can set `states` on all nodes and points which lay on the
    * same level.
    */
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.undefined
}
object PlotSankeyLevelsOptions {
  
  @scala.inline
  def apply(): PlotSankeyLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSankeyLevelsOptions]
  }
  
  @scala.inline
  implicit class PlotSankeyLevelsOptionsMutableBuilder[Self <: PlotSankeyLevelsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: ColorString): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorByPoint(value: Boolean): Self = StObject.set(x, "colorByPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorByPointUndefined: Self = StObject.set(x, "colorByPoint", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDataLabels(value: SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: SeriesSankeyDataLabelsOptionsObject*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLinkOpacity(value: Double): Self = StObject.set(x, "linkOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkOpacityUndefined: Self = StObject.set(x, "linkOpacity", js.undefined)
    
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
  }
}
