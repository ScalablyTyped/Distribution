package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageEvent extends MessageEvent {
  var event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_sent
  var signature_request_id: java.lang.String
  var signature_request_info: hellosignDashEmbeddedLib.Anon_Ccemailaddresses
}

object SentMessageEvent {
  @scala.inline
  def apply(
    event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_sent,
    signature_request_id: java.lang.String,
    signature_request_info: hellosignDashEmbeddedLib.Anon_Ccemailaddresses
  ): SentMessageEvent = {
    val __obj = js.Dynamic.literal(event = event, signature_request_id = signature_request_id, signature_request_info = signature_request_info)
  
    __obj.asInstanceOf[SentMessageEvent]
  }
}

