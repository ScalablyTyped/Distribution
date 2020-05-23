package typings.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Haspin extends js.Object {
  var has_pin: Boolean
  var last_reminded_at: Double
  var last_viewed_at: Double
  var order: Double
  var signature_id: String
  var signed_at: Double
  var signer_email_address: String
  var signer_name: String
  var status_code: String
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
}

