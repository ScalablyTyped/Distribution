package typings.hellosignDashEmbedded.hellosignDashEmbeddedMod.HelloSign

import typings.hellosignDashEmbedded.hellosignDashEmbeddedStrings.signature_request_signed
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
    val __obj = js.Dynamic.literal(event = event, signature_id = signature_id)
  
    __obj.asInstanceOf[SignedMessageEvent]
  }
}

