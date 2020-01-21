package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageEvent extends MessageEvent {
  var description: String
  var event: error
}

object ErrorMessageEvent {
  @scala.inline
  def apply(description: String, event: error): ErrorMessageEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorMessageEvent]
  }
}

