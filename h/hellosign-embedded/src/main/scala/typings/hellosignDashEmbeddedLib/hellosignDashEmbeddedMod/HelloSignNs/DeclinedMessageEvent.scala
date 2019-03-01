package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclinedMessageEvent extends MessageEvent {
  var event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_declined
  var signature_id: java.lang.String
}

object DeclinedMessageEvent {
  @scala.inline
  def apply(
    event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_declined,
    signature_id: java.lang.String
  ): DeclinedMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("signature_id")(signature_id)
    __obj.asInstanceOf[DeclinedMessageEvent]
  }
}

