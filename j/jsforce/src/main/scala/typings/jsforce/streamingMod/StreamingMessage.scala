package typings.jsforce.streamingMod

import typings.jsforce.anon.CreatedDate
import typings.jsforce.recordMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingMessage extends js.Object {
  var event: CreatedDate
  var sobject: Record[_]
}

object StreamingMessage {
  @scala.inline
  def apply(event: CreatedDate, sobject: Record[_]): StreamingMessage = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], sobject = sobject.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingMessage]
  }
}

