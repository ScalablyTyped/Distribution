package typings.hellosignEmbedded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCcemailaddresses extends js.Object {
  var cc_email_addresses: js.Array[String]
  var message: String
  var signatures: js.Array[AnonHaspin]
  var title: String
}

object AnonCcemailaddresses {
  @scala.inline
  def apply(
    cc_email_addresses: js.Array[String],
    message: String,
    signatures: js.Array[AnonHaspin],
    title: String
  ): AnonCcemailaddresses = {
    val __obj = js.Dynamic.literal(cc_email_addresses = cc_email_addresses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCcemailaddresses]
  }
}

