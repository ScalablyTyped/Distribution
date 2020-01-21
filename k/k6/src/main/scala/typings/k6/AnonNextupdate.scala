package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextupdate extends js.Object {
  /** When response will be refreshed with the CA in millisecond Unix time. */
  var next_update: Double
  /** When response signed by responder in millisecond Unix time. */
  var produced_at: Double
  /** Certificate revocation reason. One of `OCSP_REASON_*` constants. */
  var revocation_reason: String
  /** When certificate was revoked in millisecond Unix time. */
  var revoked_at: Double
  /** Certificate status. One of `OCSP_STATUS_*` constants. */
  var status: String
  /** When indicated status was known correct in millisecond Unix time. */
  var this_update: Double
}

object AnonNextupdate {
  @scala.inline
  def apply(
    next_update: Double,
    produced_at: Double,
    revocation_reason: String,
    revoked_at: Double,
    status: String,
    this_update: Double
  ): AnonNextupdate = {
    val __obj = js.Dynamic.literal(next_update = next_update.asInstanceOf[js.Any], produced_at = produced_at.asInstanceOf[js.Any], revocation_reason = revocation_reason.asInstanceOf[js.Any], revoked_at = revoked_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], this_update = this_update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNextupdate]
  }
}

