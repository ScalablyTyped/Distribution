package typings.hystrixjs.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirctuiBreakerConfig extends js.Object {
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
}

