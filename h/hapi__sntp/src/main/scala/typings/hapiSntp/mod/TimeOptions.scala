package typings.hapiSntp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOptions extends js.Object {
  var d: Double = js.native
  var isValid: Boolean = js.native
  var leapIndicator: String = js.native
  var mode: String = js.native
  var originateTimestamp: Double = js.native
  var pollInterval: Double = js.native
  var precision: Double = js.native
  var receiveTimestamp: Double = js.native
  var receivedLocally: Double = js.native
  var referenceId: String = js.native
  var referenceTimestamp: Double = js.native
  var rootDelay: Double = js.native
  var rootDispersion: Double = js.native
  var stratum: String = js.native
  var t: Double = js.native
  var transmitTimestamp: Double = js.native
  var version: Double = js.native
}

object TimeOptions {
  @scala.inline
  def apply(
    d: Double,
    isValid: Boolean,
    leapIndicator: String,
    mode: String,
    originateTimestamp: Double,
    pollInterval: Double,
    precision: Double,
    receiveTimestamp: Double,
    receivedLocally: Double,
    referenceId: String,
    referenceTimestamp: Double,
    rootDelay: Double,
    rootDispersion: Double,
    stratum: String,
    t: Double,
    transmitTimestamp: Double,
    version: Double
  ): TimeOptions = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], leapIndicator = leapIndicator.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originateTimestamp = originateTimestamp.asInstanceOf[js.Any], pollInterval = pollInterval.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], receiveTimestamp = receiveTimestamp.asInstanceOf[js.Any], receivedLocally = receivedLocally.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], referenceTimestamp = referenceTimestamp.asInstanceOf[js.Any], rootDelay = rootDelay.asInstanceOf[js.Any], rootDispersion = rootDispersion.asInstanceOf[js.Any], stratum = stratum.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], transmitTimestamp = transmitTimestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOptions]
  }
  @scala.inline
  implicit class TimeOptionsOps[Self <: TimeOptions] (val x: Self) extends AnyVal {
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
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeapIndicator(value: String): Self = this.set("leapIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginateTimestamp(value: Double): Self = this.set("originateTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceiveTimestamp(value: Double): Self = this.set("receiveTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedLocally(value: Double): Self = this.set("receivedLocally", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceTimestamp(value: Double): Self = this.set("referenceTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDelay(value: Double): Self = this.set("rootDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDispersion(value: Double): Self = this.set("rootDispersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStratum(value: String): Self = this.set("stratum", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransmitTimestamp(value: Double): Self = this.set("transmitTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

