package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsProperties extends StObject {
  
  var commandGroup: String
  
  var commandKey: String
  
  var percentileWindowNumberOfBuckets: js.UndefOr[Double] = js.undefined
  
  var percentileWindowTimeInMilliSeconds: js.UndefOr[Double] = js.undefined
  
  var statisticalWindowNumberOfBuckets: js.UndefOr[Double] = js.undefined
  
  var statisticalWindowTimeInMilliSeconds: js.UndefOr[Double] = js.undefined
}
object MetricsProperties {
  
  @scala.inline
  def apply(commandGroup: String, commandKey: String): MetricsProperties = {
    val __obj = js.Dynamic.literal(commandGroup = commandGroup.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsProperties]
  }
  
  @scala.inline
  implicit class MetricsPropertiesMutableBuilder[Self <: MetricsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandGroup(value: String): Self = StObject.set(x, "commandGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandKey(value: String): Self = StObject.set(x, "commandKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double): Self = StObject.set(x, "percentileWindowNumberOfBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileWindowNumberOfBucketsUndefined: Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.undefined)
    
    @scala.inline
    def setPercentileWindowTimeInMilliSeconds(value: Double): Self = StObject.set(x, "percentileWindowTimeInMilliSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileWindowTimeInMilliSecondsUndefined: Self = StObject.set(x, "percentileWindowTimeInMilliSeconds", js.undefined)
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticalWindowNumberOfBucketsUndefined: Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.undefined)
    
    @scala.inline
    def setStatisticalWindowTimeInMilliSeconds(value: Double): Self = StObject.set(x, "statisticalWindowTimeInMilliSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticalWindowTimeInMilliSecondsUndefined: Self = StObject.set(x, "statisticalWindowTimeInMilliSeconds", js.undefined)
  }
}
