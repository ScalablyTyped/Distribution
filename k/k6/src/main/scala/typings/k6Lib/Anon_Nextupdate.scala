package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nextupdate extends js.Object {
  /** When response will be refreshed with the CA in millisecond Unix time. */
  var next_update: scala.Double
  /** When response signed by responder in millisecond Unix time. */
  var produced_at: scala.Double
  /** Certificate revocation reason. One of `OCSP_REASON_*` constants. */
  var revocation_reason: java.lang.String
  /** When certificate was revoked in millisecond Unix time. */
  var revoked_at: scala.Double
  /** Certificate status. One of `OCSP_STATUS_*` constants. */
  var status: java.lang.String
  /** When indicated status was known correct in millisecond Unix time. */
  var this_update: scala.Double
}

object Anon_Nextupdate {
  @scala.inline
  def apply(
    next_update: scala.Double,
    produced_at: scala.Double,
    revocation_reason: java.lang.String,
    revoked_at: scala.Double,
    status: java.lang.String,
    this_update: scala.Double
  ): Anon_Nextupdate = {
    val __obj = js.Dynamic.literal(next_update = next_update, produced_at = produced_at, revocation_reason = revocation_reason, revoked_at = revoked_at, status = status, this_update = this_update)
  
    __obj.asInstanceOf[Anon_Nextupdate]
  }
}

