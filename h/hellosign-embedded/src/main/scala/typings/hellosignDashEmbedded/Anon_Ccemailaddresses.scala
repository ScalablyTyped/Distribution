package typings.hellosignDashEmbedded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ccemailaddresses extends js.Object {
  var cc_email_addresses: js.Array[String]
  var message: String
  var signatures: js.Array[Anon_Haspin]
  var title: String
}

object Anon_Ccemailaddresses {
  @scala.inline
  def apply(
    cc_email_addresses: js.Array[String],
    message: String,
    signatures: js.Array[Anon_Haspin],
    title: String
  ): Anon_Ccemailaddresses = {
    val __obj = js.Dynamic.literal(cc_email_addresses = cc_email_addresses, message = message, signatures = signatures, title = title)
  
    __obj.asInstanceOf[Anon_Ccemailaddresses]
  }
}

