package typings.hapiCatbox.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyGetReportLog extends js.Object {
  /** error - lookup error. */
  var error: js.UndefOr[Error] = js.undefined
  /** isStale - true if the item is stale. */
  var isStale: Boolean
  /** msec - the cache lookup time in milliseconds. */
  var msec: Double
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: Double
  /** ttl - the cache ttl value for the record. */
  var ttl: Double
}

object PolicyGetReportLog {
  @scala.inline
  def apply(isStale: Boolean, msec: Double, stored: Double, ttl: Double, error: Error = null): PolicyGetReportLog = {
    val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], msec = msec.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGetReportLog]
  }
}

