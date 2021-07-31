package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirctuiBreakerConfig extends StObject {
  
  var circuitBreakerErrorThresholdPercentage: Double
  
  var circuitBreakerForceClosed: Boolean
  
  var circuitBreakerForceOpened: Boolean
  
  var circuitBreakerRequestVolumeThreshold: Double
  
  var circuitBreakerSleepWindowInMilliseconds: Double
  
  var commandGroup: String
  
  var commandKey: String
}
object CirctuiBreakerConfig {
  
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: Double,
    circuitBreakerForceClosed: Boolean,
    circuitBreakerForceOpened: Boolean,
    circuitBreakerRequestVolumeThreshold: Double,
    circuitBreakerSleepWindowInMilliseconds: Double,
    commandGroup: String,
    commandKey: String
  ): CirctuiBreakerConfig = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage.asInstanceOf[js.Any], circuitBreakerForceClosed = circuitBreakerForceClosed.asInstanceOf[js.Any], circuitBreakerForceOpened = circuitBreakerForceOpened.asInstanceOf[js.Any], circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold.asInstanceOf[js.Any], circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds.asInstanceOf[js.Any], commandGroup = commandGroup.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CirctuiBreakerConfig]
  }
  
  @scala.inline
  implicit class CirctuiBreakerConfigMutableBuilder[Self <: CirctuiBreakerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean): Self = StObject.set(x, "circuitBreakerForceClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean): Self = StObject.set(x, "circuitBreakerForceOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandGroup(value: String): Self = StObject.set(x, "commandGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandKey(value: String): Self = StObject.set(x, "commandKey", value.asInstanceOf[js.Any])
  }
}
