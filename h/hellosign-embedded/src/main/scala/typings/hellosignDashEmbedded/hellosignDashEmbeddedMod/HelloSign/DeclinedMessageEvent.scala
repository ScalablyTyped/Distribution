package typings.hellosignDashEmbedded.hellosignDashEmbeddedMod.HelloSign

import typings.hellosignDashEmbedded.hellosignDashEmbeddedStrings.signature_request_declined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclinedMessageEvent extends MessageEvent {
  var event: signature_request_declined
  var signature_id: String
}

object DeclinedMessageEvent {
  @scala.inline
  def apply(event: signature_request_declined, signature_id: String): DeclinedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeclinedMessageEvent]
  }
}

