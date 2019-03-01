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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has_pin")(has_pin)
    __obj.updateDynamic("last_reminded_at")(last_reminded_at)
    __obj.updateDynamic("last_viewed_at")(last_viewed_at)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("signature_id")(signature_id)
    __obj.updateDynamic("signed_at")(signed_at)
    __obj.updateDynamic("signer_email_address")(signer_email_address)
    __obj.updateDynamic("signer_name")(signer_name)
    __obj.updateDynamic("status_code")(status_code)
    __obj.asInstanceOf[Anon_Haspin]
  }
}

