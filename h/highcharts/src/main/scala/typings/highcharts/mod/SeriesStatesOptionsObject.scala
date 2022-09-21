package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesStatesOptionsObject extends StObject {
  
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[Double | SeriesStatesHoverOptionsObject] = js.undefined
  
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[SeriesStatesInactiveOptionsObject] = js.undefined
  
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[SeriesStatesNormalOptionsObject] = js.undefined
  
  /**
    * (Highstock) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[SeriesStatesSelectOptionsObject] = js.undefined
}
object SeriesStatesOptionsObject {
  
  inline def apply(): SeriesStatesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesOptionsObject]
  }
  
  extension [Self <: SeriesStatesOptionsObject](x: Self) {
    
    inline def setHover(value: Double | SeriesStatesHoverOptionsObject): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setInactive(value: SeriesStatesInactiveOptionsObject): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setNormal(value: SeriesStatesNormalOptionsObject): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setSelect(value: SeriesStatesSelectOptionsObject): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
