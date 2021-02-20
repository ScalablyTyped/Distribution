package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The attributes, like playtime and percent onscreen, that define the Custom
  * Viewability Metric.
  */
@js.native
trait SchemaCustomViewabilityMetricConfiguration extends StObject {
  
  /**
    * Whether the video must be audible to count an impression.
    */
  var audible: js.UndefOr[Boolean] = js.native
  
  /**
    * The time in milliseconds the video must play for the Custom Viewability
    * Metric to count an impression. If both this and timePercent are
    * specified, the earlier of the two will be used.
    */
  var timeMillis: js.UndefOr[Double] = js.native
  
  /**
    * The percentage of video that must play for the Custom Viewability Metric
    * to count an impression. If both this and timeMillis are specified, the
    * earlier of the two will be used.
    */
  var timePercent: js.UndefOr[Double] = js.native
  
  /**
    * The percentage of video that must be on screen for the Custom Viewability
    * Metric to count an impression.
    */
  var viewabilityPercent: js.UndefOr[Double] = js.native
}
object SchemaCustomViewabilityMetricConfiguration {
  
  @scala.inline
  def apply(): SchemaCustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomViewabilityMetricConfiguration]
  }
  
  @scala.inline
  implicit class SchemaCustomViewabilityMetricConfigurationMutableBuilder[Self <: SchemaCustomViewabilityMetricConfiguration] (val x: Self) extends AnyVal {
    
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
