package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageEvent extends MessageEvent {
  var description: java.lang.String
  var event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.error
}

object ErrorMessageEvent {
  @scala.inline
  def apply(
    description: java.lang.String,
    event: hellosignDashEmbeddedLib.hellosignDashEmbeddedLibStrings.error
  ): ErrorMessageEvent = {
    val __obj = js.Dynamic.literal(description = description, event = event)
  
    __obj.asInstanceOf[ErrorMessageEvent]
  }
}

