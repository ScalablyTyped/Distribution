package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomViewabilityMetricConfiguration extends StObject {
  
  /** Whether the video must be audible to count an impression. */
  var audible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time in milliseconds the video must play for the Custom Viewability Metric to count an impression. If both this and timePercent are specified, the earlier of the two will be
    * used.
    */
  var timeMillis: js.UndefOr[Double] = js.undefined
  
  /** The percentage of video that must play for the Custom Viewability Metric to count an impression. If both this and timeMillis are specified, the earlier of the two will be used. */
  var timePercent: js.UndefOr[Double] = js.undefined
  
  /** The percentage of video that must be on screen for the Custom Viewability Metric to count an impression. */
  var viewabilityPercent: js.UndefOr[Double] = js.undefined
}
object CustomViewabilityMetricConfiguration {
  
  @scala.inline
  def apply(): CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomViewabilityMetricConfiguration]
  }
  
  @scala.inline
  implicit class CustomViewabilityMetricConfigurationMutableBuilder[Self <: CustomViewabilityMetricConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    @scala.inline
    def setTimeMillis(value: Double): Self = StObject.set(x, "timeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMillisUndefined: Self = StObject.set(x, "timeMillis", js.undefined)
    
    @scala.inline
    def setTimePercent(value: Double): Self = StObject.set(x, "timePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePercentUndefined: Self = StObject.set(x, "timePercent", js.undefined)
    
    @scala.inline
    def setViewabilityPercent(value: Double): Self = StObject.set(x, "viewabilityPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityPercentUndefined: Self = StObject.set(x, "viewabilityPercent", js.undefined)
  }
}
