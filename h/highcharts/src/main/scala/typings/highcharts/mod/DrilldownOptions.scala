package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrilldownOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
    * a point that has drilldown data. By default it is underlined and blue to
    * invite to interaction.
    *
    * In styled mode, active label styles can be set with the
    * `.highcharts-drilldown-axis-label` class.
    */
  var activeAxisLabelStyle: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Additional styles to apply to the data label of a
    * point that has drilldown data. By default it is underlined and blue to
    * invite to interaction.
    *
    * In styled mode, active data label styles can be applied with the
    * `.highcharts-drilldown-data-label` class.
    */
  var activeDataLabelStyle: js.UndefOr[CSSObject | DrilldownActiveDataLabelStyleOptions] = js.native
  
  /**
    * (Highcharts) When this option is false, clicking a single point will
    * drill down all points in the same category, equivalent to clicking the X
    * axis label.
    */
  var allowPointDrilldown: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) Set the animation for all drilldown animations.
    * Animation of a drilldown occurs when drilling between a column point and
    * a column series, or a pie slice and a full pie series. Drilldown can
    * still be used between series and points of different types, but animation
    * will not occur.
    *
    * The animation can either be set as a boolean or a configuration object.
    * If `true`, it will use the 'swing' jQuery easing and a duration of 500
    * ms. If used as a configuration object, the following properties are
    * supported:
    *
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: A string reference to an easing function set on the `Math`
    * object. See the easing demo.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts, Highmaps) Options for the drill up button that appears when
    * drilling down on a series. The text for the button is defined in
    * lang.drillUpText.
    */
  var drillUpButton: js.UndefOr[DrilldownDrillUpButtonOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) An array of series configurations for the drill
    * down. Each series configuration uses the same syntax as the series option
    * set. These drilldown series are hidden by default. The drilldown series
    * is linked to the parent series' point by its `id`.
    */
  var series: js.UndefOr[js.Array[SeriesOptionsType]] = js.native
}
object DrilldownOptions {
  
  @scala.inline
  def apply(): DrilldownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownOptions]
  }
  
  @scala.inline
  implicit class DrilldownOptionsMutableBuilder[Self <: DrilldownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveAxisLabelStyle(value: CSSObject): Self = StObject.set(x, "activeAxisLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAxisLabelStyleUndefined: Self = StObject.set(x, "activeAxisLabelStyle", js.undefined)
    
    @scala.inline
    def setActiveDataLabelStyle(value: CSSObject | DrilldownActiveDataLabelStyleOptions): Self = StObject.set(x, "activeDataLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDataLabelStyleUndefined: Self = StObject.set(x, "activeDataLabelStyle", js.undefined)
    
    @scala.inline
    def setAllowPointDrilldown(value: Boolean): Self = StObject.set(x, "allowPointDrilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPointDrilldownUndefined: Self = StObject.set(x, "allowPointDrilldown", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setDrillUpButton(value: DrilldownDrillUpButtonOptions): Self = StObject.set(x, "drillUpButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillUpButtonUndefined: Self = StObject.set(x, "drillUpButton", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[SeriesOptionsType]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: SeriesOptionsType*): Self = StObject.set(x, "series", js.Array(value :_*))
  }
}
