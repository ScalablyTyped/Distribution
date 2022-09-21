package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var mode: js.UndefOr[OptionsModeValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer allow keyboard navigation for it.
    *
    * Set to `false` to disable.
    */
  var pointNavigationEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Remember which point was focused
    * even after navigating away from the series, so that when navigating back
    * to the series you start at the last focused point.
    */
  var rememberPointFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
    * through points with the keyboard.
    */
  var skipNullPoints: js.UndefOr[Boolean] = js.undefined
}
object KeyboardNavigationSeriesNavigationOptionsObject {
  
  inline def apply(): KeyboardNavigationSeriesNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationSeriesNavigationOptionsObject]
  }
  
  extension [Self <: KeyboardNavigationSeriesNavigationOptionsObject](x: Self) {
    
    inline def setMode(value: OptionsModeValue): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPointNavigationEnabledThreshold(value: Boolean | Double): Self = StObject.set(x, "pointNavigationEnabledThreshold", value.asInstanceOf[js.Any])
    
    inline def setPointNavigationEnabledThresholdUndefined: Self = StObject.set(x, "pointNavigationEnabledThreshold", js.undefined)
    
    inline def setRememberPointFocus(value: Boolean): Self = StObject.set(x, "rememberPointFocus", value.asInstanceOf[js.Any])
    
    inline def setRememberPointFocusUndefined: Self = StObject.set(x, "rememberPointFocus", js.undefined)
    
    inline def setSkipNullPoints(value: Boolean): Self = StObject.set(x, "skipNullPoints", value.asInstanceOf[js.Any])
    
    inline def setSkipNullPointsUndefined: Self = StObject.set(x, "skipNullPoints", js.undefined)
  }
}
