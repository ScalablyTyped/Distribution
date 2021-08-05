package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisAccessibilityOptionsObject extends StObject {
  
  /**
    * (Highcharts) Description for an axis to expose to screen reader users.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Enable axis accessibility features, including axis
    * information in the screen reader information region. If this is disabled
    * on the xAxis, the x values are not exposed to screen readers for the
    * individual data points by default.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Range description for an axis. Overrides the default range
    * description. Set to empty to disable range description for this axis.
    */
  var rangeDescription: js.UndefOr[String] = js.undefined
}
object AxisAccessibilityOptionsObject {
  
  inline def apply(): AxisAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisAccessibilityOptionsObject]
  }
  
  extension [Self <: AxisAccessibilityOptionsObject](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRangeDescription(value: String): Self = StObject.set(x, "rangeDescription", value.asInstanceOf[js.Any])
    
    inline def setRangeDescriptionUndefined: Self = StObject.set(x, "rangeDescription", js.undefined)
  }
}
