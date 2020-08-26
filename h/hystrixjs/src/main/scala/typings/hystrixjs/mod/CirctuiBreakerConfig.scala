package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirctuiBreakerConfig extends js.Object {
  var circuitBreakerErrorThresholdPercentage: Double = js.native
  var circuitBreakerForceClosed: Boolean = js.native
  var circuitBreakerForceOpened: Boolean = js.native
  var circuitBreakerRequestVolumeThreshold: Double = js.native
  var circuitBreakerSleepWindowInMilliseconds: Double = js.native
  var commandGroup: String = js.native
  var commandKey: String = js.native
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
  implicit class CirctuiBreakerConfigOps[Self <: CirctuiBreakerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double): Self = this.set("circuitBreakerErrorThresholdPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean): Self = this.set("circuitBreakerForceClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean): Self = this.set("circuitBreakerForceOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double): Self = this.set("circuitBreakerRequestVolumeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double): Self = this.set("circuitBreakerSleepWindowInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandGroup(value: String): Self = this.set("commandGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandKey(value: String): Self = this.set("commandKey", value.asInstanceOf[js.Any])
  }
  
}

