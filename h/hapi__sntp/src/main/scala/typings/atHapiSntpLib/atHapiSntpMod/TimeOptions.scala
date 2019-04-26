package typings
package atHapiSntpLib.atHapiSntpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends js.Object {
  var d: scala.Double
  var isValid: scala.Boolean
  var leapIndicator: java.lang.String
  var mode: java.lang.String
  var originateTimestamp: scala.Double
  var pollInterval: scala.Double
  var precision: scala.Double
  var receiveTimestamp: scala.Double
  var receivedLocally: scala.Double
  var referenceId: java.lang.String
  var referenceTimestamp: scala.Double
  var rootDelay: scala.Double
  var rootDispersion: scala.Double
  var stratum: java.lang.String
  var t: scala.Double
  var transmitTimestamp: scala.Double
  var version: scala.Double
}

object TimeOptions {
  @scala.inline
  def apply(
    d: scala.Double,
    isValid: scala.Boolean,
    leapIndicator: java.lang.String,
    mode: java.lang.String,
    originateTimestamp: scala.Double,
    pollInterval: scala.Double,
    precision: scala.Double,
    receiveTimestamp: scala.Double,
    receivedLocally: scala.Double,
    referenceId: java.lang.String,
    referenceTimestamp: scala.Double,
    rootDelay: scala.Double,
    rootDispersion: scala.Double,
    stratum: java.lang.String,
    t: scala.Double,
    transmitTimestamp: scala.Double,
    version: scala.Double
  ): TimeOptions = {
    val __obj = js.Dynamic.literal(d = d, isValid = isValid, leapIndicator = leapIndicator, mode = mode, originateTimestamp = originateTimestamp, pollInterval = pollInterval, precision = precision, receiveTimestamp = receiveTimestamp, receivedLocally = receivedLocally, referenceId = referenceId, referenceTimestamp = referenceTimestamp, rootDelay = rootDelay, rootDispersion = rootDispersion, stratum = stratum, t = t, transmitTimestamp = transmitTimestamp, version = version)
  
    __obj.asInstanceOf[TimeOptions]
  }
}

