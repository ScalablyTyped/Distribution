package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanceledMessageEvent extends MessageEvent {
  var event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_canceled
}

object CanceledMessageEvent {
  @scala.inline
  def apply(event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.signature_request_canceled): CanceledMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CanceledMessageEvent]
  }
}

