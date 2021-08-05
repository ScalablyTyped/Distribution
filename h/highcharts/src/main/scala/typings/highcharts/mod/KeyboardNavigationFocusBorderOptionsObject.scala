package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardNavigationFocusBorderOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
    * indicator.
    */
  var hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
    * elements.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
    * border drawn around elements while navigating through them. Note that
    * some browsers in addition draw their own borders for focused elements.
    * These automatic borders can not be styled by Highcharts.
    *
    * In styled mode, the border is given the `.highcharts-focus-border` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}
object KeyboardNavigationFocusBorderOptionsObject {
  
  inline def apply(): KeyboardNavigationFocusBorderOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationFocusBorderOptionsObject]
  }
  
  extension [Self <: KeyboardNavigationFocusBorderOptionsObject](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHideBrowserFocusOutline(value: Boolean): Self = StObject.set(x, "hideBrowserFocusOutline", value.asInstanceOf[js.Any])
    
    inline def setHideBrowserFocusOutlineUndefined: Self = StObject.set(x, "hideBrowserFocusOutline", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
