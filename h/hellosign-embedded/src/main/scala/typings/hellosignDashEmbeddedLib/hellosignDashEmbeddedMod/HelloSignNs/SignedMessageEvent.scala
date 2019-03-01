package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessageEvent extends MessageEvent {
  var event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_signed
  var signature_id: java.lang.String
}

object SignedMessageEvent {
  @scala.inline
  def apply(
    event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_signed,
    signature_id: java.lang.String
  ): SignedMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("signature_id")(signature_id)
    __obj.asInstanceOf[SignedMessageEvent]
  }
}

