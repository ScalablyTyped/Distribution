package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomViewabilityMetricConfiguration extends StObject {
  
  /**
    * Whether the video must be audible to count an impression.
    */
  var audible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The time in milliseconds the video must play for the Custom Viewability Metric to count an impression. If both this and timePercent are specified, the earlier of the two will be used.
    */
  var timeMillis: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The percentage of video that must play for the Custom Viewability Metric to count an impression. If both this and timeMillis are specified, the earlier of the two will be used.
    */
  var timePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The percentage of video that must be on screen for the Custom Viewability Metric to count an impression.
    */
  var viewabilityPercent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCustomViewabilityMetricConfiguration {
  
  inline def apply(): SchemaCustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomViewabilityMetricConfiguration]
  }
  
  extension [Self <: SchemaCustomViewabilityMetricConfiguration](x: Self) {
    
    inline def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    inline def setAudibleNull: Self = StObject.set(x, "audible", null)
    
    inline def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    inline def setTimeMillis(value: Double): Self = StObject.set(x, "timeMillis", value.asInstanceOf[js.Any])
    
    inline def setTimeMillisNull: Self = StObject.set(x, "timeMillis", null)
    
    inline def setTimeMillisUndefined: Self = StObject.set(x, "timeMillis", js.undefined)
    
    inline def setTimePercent(value: Double): Self = StObject.set(x, "timePercent", value.asInstanceOf[js.Any])
    
    inline def setTimePercentNull: Self = StObject.set(x, "timePercent", null)
    
    inline def setTimePercentUndefined: Self = StObject.set(x, "timePercent", js.undefined)
    
    inline def setViewabilityPercent(value: Double): Self = StObject.set(x, "viewabilityPercent", value.asInstanceOf[js.Any])
    
    inline def setViewabilityPercentNull: Self = StObject.set(x, "viewabilityPercent", null)
    
    inline def setViewabilityPercentUndefined: Self = StObject.set(x, "viewabilityPercent", js.undefined)
  }
}
