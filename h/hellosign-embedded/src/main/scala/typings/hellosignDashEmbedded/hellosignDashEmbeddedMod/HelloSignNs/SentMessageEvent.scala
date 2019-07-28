package typings.hellosignDashEmbedded.hellosignDashEmbeddedMod.HelloSignNs

import typings.hellosignDashEmbedded.Anon_Ccemailaddresses
import typings.hellosignDashEmbedded.hellosignDashEmbeddedStrings.signature_request_sent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageEvent extends MessageEvent {
  var event: signature_request_sent
  var signature_request_id: String
  var signature_request_info: Anon_Ccemailaddresses
}

object SentMessageEvent {
  @scala.inline
  def apply(
    event: signature_request_sent,
    signature_request_id: String,
    signature_request_info: Anon_Ccemailaddresses
  ): SentMessageEvent = {
    val __obj = js.Dynamic.literal(event = event, signature_request_id = signature_request_id, signature_request_info = signature_request_info)
  
    __obj.asInstanceOf[SentMessageEvent]
  }
}

