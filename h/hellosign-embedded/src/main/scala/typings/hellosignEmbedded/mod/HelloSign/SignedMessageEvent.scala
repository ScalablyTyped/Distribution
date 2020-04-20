package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_signed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessageEvent extends MessageEvent {
  var event: signature_request_signed
  var signature_id: String
}

object SignedMessageEvent {
  @scala.inline
  def apply(event: signature_request_signed, signature_id: String): SignedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessageEvent]
  }
}

