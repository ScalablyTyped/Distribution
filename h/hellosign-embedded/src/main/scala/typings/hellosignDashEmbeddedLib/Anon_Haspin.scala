package typings
package hellosignDashEmbeddedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Haspin extends js.Object {
  var has_pin: scala.Boolean
  var last_reminded_at: scala.Double
  var last_viewed_at: scala.Double
  var order: scala.Double
  var signature_id: java.lang.String
  var signed_at: scala.Double
  var signer_email_address: java.lang.String
  var signer_name: java.lang.String
  var status_code: java.lang.String
}

object Anon_Haspin {
  @scala.inline
  def apply(
    has_pin: scala.Boolean,
    last_reminded_at: scala.Double,
    last_viewed_at: scala.Double,
    order: scala.Double,
    signature_id: java.lang.String,
    signed_at: scala.Double,
    signer_email_address: java.lang.String,
    signer_name: java.lang.String,
    status_code: java.lang.String
  ): Anon_Haspin = {
    val __obj = js.Dynamic.literal(has_pin = has_pin, last_reminded_at = last_reminded_at, last_viewed_at = last_viewed_at, order = order, signature_id = signature_id, signed_at = signed_at, signer_email_address = signer_email_address, signer_name = signer_name, status_code = status_code)
  
    __obj.asInstanceOf[Anon_Haspin]
  }
}

