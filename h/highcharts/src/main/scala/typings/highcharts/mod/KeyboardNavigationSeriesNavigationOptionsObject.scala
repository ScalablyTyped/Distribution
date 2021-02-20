package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardNavigationSeriesNavigationOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
    * for the chart. Can be "normal" or "serialize". In normal mode, left/right
    * arrow keys move between points in a series, while up/down arrow keys move
    * between series. Up/down navigation acts intelligently to figure out which
    * series makes sense to move to from any given point.
    *
    * In "serialize" mode, points are instead navigated as a single list.
    * Left/right behaves as in "normal" mode. Up/down arrow keys will behave
    * like left/right. This can be useful for unifying navigation behavior
    * with/without screen readers enabled.
    */
  var mode: js.UndefOr[OptionsModeValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer allow keyboard navigation for it.
    *
    * Set to `false` to disable.
    */
  var pointNavigationEnabledThreshold: js.UndefOr[Boolean | Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
    * through points with the keyboard.
    */
  var skipNullPoints: js.UndefOr[Boolean] = js.native
}
object KeyboardNavigationSeriesNavigationOptionsObject {
  
  @scala.inline
  def apply(): KeyboardNavigationSeriesNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationSeriesNavigationOptionsObject]
  }
  
  @scala.inline
  implicit class KeyboardNavigationSeriesNavigationOptionsObjectMutableBuilder[Self <: KeyboardNavigationSeriesNavigationOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: OptionsModeValue): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPointNavigationEnabledThreshold(value: Boolean | Double): Self = StObject.set(x, "pointNavigationEnabledThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNavigationEnabledThresholdUndefined: Self = StObject.set(x, "pointNavigationEnabledThreshold", js.undefined)
    
    @scala.inline
    def setSkipNullPoints(value: Boolean): Self = StObject.set(x, "skipNullPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipNullPointsUndefined: Self = StObject.set(x, "skipNullPoints", js.undefined)
  }
}
