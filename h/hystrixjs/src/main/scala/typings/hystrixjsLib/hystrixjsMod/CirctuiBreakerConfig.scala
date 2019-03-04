package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirctuiBreakerConfig extends js.Object {
  var circuitBreakerErrorThresholdPercentage: scala.Double
  var circuitBreakerForceClosed: scala.Boolean
  var circuitBreakerForceOpened: scala.Boolean
  var circuitBreakerRequestVolumeThreshold: scala.Double
  var circuitBreakerSleepWindowInMilliseconds: scala.Double
  var commandGroup: java.lang.String
  var commandKey: java.lang.String
}

object CirctuiBreakerConfig {
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: scala.Double,
    circuitBreakerForceClosed: scala.Boolean,
    circuitBreakerForceOpened: scala.Boolean,
    circuitBreakerRequestVolumeThreshold: scala.Double,
    circuitBreakerSleepWindowInMilliseconds: scala.Double,
    commandGroup: java.lang.String,
    commandKey: java.lang.String
  ): CirctuiBreakerConfig = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, commandGroup = commandGroup, commandKey = commandKey)
  
    __obj.asInstanceOf[CirctuiBreakerConfig]
  }
}

