package typings.atHapiSntp.atHapiSntpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends js.Object {
  var d: Double
  var isValid: Boolean
  var leapIndicator: String
  var mode: String
  var originateTimestamp: Double
  var pollInterval: Double
  var precision: Double
  var receiveTimestamp: Double
  var receivedLocally: Double
  var referenceId: String
  var referenceTimestamp: Double
  var rootDelay: Double
  var rootDispersion: Double
  var stratum: String
  var t: Double
  var transmitTimestamp: Double
  var version: Double
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
    val __obj = js.Dynamic.literal(d = d, isValid = isValid, leapIndicator = leapIndicator, mode = mode, originateTimestamp = originateTimestamp, pollInterval = pollInterval, precision = precision, receiveTimestamp = receiveTimestamp, receivedLocally = receivedLocally, referenceId = referenceId, referenceTimestamp = referenceTimestamp, rootDelay = rootDelay, rootDispersion = rootDispersion, stratum = stratum, t = t, transmitTimestamp = transmitTimestamp, version = version)
  
    __obj.asInstanceOf[TimeOptions]
  }
}

