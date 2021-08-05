package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
    * the fade out effect.
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
    * `span`.
    */
  var labelStyle: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
    * the fade in effect.
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
    * screen that covers the plot area.
    *
    * In styled mode, the loading label is styled with the
    * `.highcharts-loading` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}
object LoadingOptions {
  
  inline def apply(): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingOptions]
  }
  
  extension [Self <: LoadingOptions](x: Self) {
    
    inline def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    inline def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    inline def setLabelStyle(value: CSSObject): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
