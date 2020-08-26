package typings.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Haspin extends js.Object {
  var has_pin: Boolean = js.native
  var last_reminded_at: Double = js.native
  var last_viewed_at: Double = js.native
  var order: Double = js.native
  var signature_id: String = js.native
  var signed_at: Double = js.native
  var signer_email_address: String = js.native
  var signer_name: String = js.native
  var status_code: String = js.native
}

object Haspin {
  @scala.inline
  def apply(
    has_pin: Boolean,
    last_reminded_at: Double,
    last_viewed_at: Double,
    order: Double,
    signature_id: String,
    signed_at: Double,
    signer_email_address: String,
    signer_name: String,
    status_code: String
  ): Haspin = {
    val __obj = js.Dynamic.literal(has_pin = has_pin.asInstanceOf[js.Any], last_reminded_at = last_reminded_at.asInstanceOf[js.Any], last_viewed_at = last_viewed_at.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any], signed_at = signed_at.asInstanceOf[js.Any], signer_email_address = signer_email_address.asInstanceOf[js.Any], signer_name = signer_name.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Haspin]
  }
  @scala.inline
  implicit class HaspinOps[Self <: Haspin] (val x: Self) extends AnyVal {
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
    def setHas_pin(value: Boolean): Self = this.set("has_pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_reminded_at(value: Double): Self = this.set("last_reminded_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_viewed_at(value: Double): Self = this.set("last_viewed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature_id(value: String): Self = this.set("signature_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigned_at(value: Double): Self = this.set("signed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigner_email_address(value: String): Self = this.set("signer_email_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigner_name(value: String): Self = this.set("signer_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus_code(value: String): Self = this.set("status_code", value.asInstanceOf[js.Any])
  }
  
}

