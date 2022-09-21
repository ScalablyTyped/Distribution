package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointAccessibilityOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Provide a description of the data point,
    * announced to screen readers.
    */
  /**
    * Provide a description of the data point, announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Set to false to disable accessibility
    * functionality for a specific point. The point will not be included in
    * keyboard navigation, and will not be exposed to assistive technology.
    */
  /**
    * Enable or disable exposing the point to assistive technology
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object PointAccessibilityOptionsObject {
  
  inline def apply(): PointAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointAccessibilityOptionsObject]
  }
  
  extension [Self <: PointAccessibilityOptionsObject](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
