package typings
package atHapiCatboxLib.atHapiCatboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyGetReportLog extends js.Object {
  /** error - lookup error. */
  var error: js.UndefOr[stdLib.Error] = js.undefined
  /** isStale - true if the item is stale. */
  var isStale: scala.Boolean
  /** msec - the cache lookup time in milliseconds. */
  var msec: scala.Double
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: scala.Double
  /** ttl - the cache ttl value for the record. */
  var ttl: scala.Double
}

object PolicyGetReportLog {
  @scala.inline
  def apply(
    isStale: scala.Boolean,
    msec: scala.Double,
    stored: scala.Double,
    ttl: scala.Double,
    error: stdLib.Error = null
  ): PolicyGetReportLog = {
    val __obj = js.Dynamic.literal(isStale = isStale, msec = msec, stored = stored, ttl = ttl)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[PolicyGetReportLog]
  }
}

