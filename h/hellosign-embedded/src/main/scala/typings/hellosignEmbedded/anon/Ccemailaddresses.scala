package typings.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ccemailaddresses extends js.Object {
  var cc_email_addresses: js.Array[String]
  var message: String
  var signatures: js.Array[Haspin]
  var title: String
}

object Ccemailaddresses {
  @scala.inline
  def apply(cc_email_addresses: js.Array[String], message: String, signatures: js.Array[Haspin], title: String): Ccemailaddresses = {
    val __obj = js.Dynamic.literal(cc_email_addresses = cc_email_addresses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ccemailaddresses]
  }
}

