package typings.k6.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nextupdate extends js.Object {
  /** When response will be refreshed with the CA in millisecond Unix time. */
  var next_update: Double = js.native
  /** When response signed by responder in millisecond Unix time. */
  var produced_at: Double = js.native
  /** Certificate revocation reason. One of `OCSP_REASON_*` constants. */
  var revocation_reason: String = js.native
  /** When certificate was revoked in millisecond Unix time. */
  var revoked_at: Double = js.native
  /** Certificate status. One of `OCSP_STATUS_*` constants. */
  var status: String = js.native
  /** When indicated status was known correct in millisecond Unix time. */
  var this_update: Double = js.native
}

object Nextupdate {
  @scala.inline
  def apply(
    next_update: Double,
    produced_at: Double,
    revocation_reason: String,
    revoked_at: Double,
    status: String,
    this_update: Double
  ): Nextupdate = {
    val __obj = js.Dynamic.literal(next_update = next_update.asInstanceOf[js.Any], produced_at = produced_at.asInstanceOf[js.Any], revocation_reason = revocation_reason.asInstanceOf[js.Any], revoked_at = revoked_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], this_update = this_update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nextupdate]
  }
  @scala.inline
  implicit class NextupdateOps[Self <: Nextupdate] (val x: Self) extends AnyVal {
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
    def setNext_update(value: Double): Self = this.set("next_update", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduced_at(value: Double): Self = this.set("produced_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevocation_reason(value: String): Self = this.set("revocation_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevoked_at(value: Double): Self = this.set("revoked_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setThis_update(value: Double): Self = this.set("this_update", value.asInstanceOf[js.Any])
  }
  
}

