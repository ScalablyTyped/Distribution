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
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, commandGroup = commandGroup, commandKey = commandKey)
  
    __obj.asInstanceOf[CirctuiBreakerConfig]
  }
}

