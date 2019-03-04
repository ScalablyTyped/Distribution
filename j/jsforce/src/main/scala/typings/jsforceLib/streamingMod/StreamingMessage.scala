package typings
package jsforceLib.streamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingMessage extends js.Object {
  var event: jsforceLib.Anon_CreatedDate
  var sobject: jsforceLib.recordMod.Record[_]
}

object StreamingMessage {
  @scala.inline
  def apply(event: jsforceLib.Anon_CreatedDate, sobject: jsforceLib.recordMod.Record[_]): StreamingMessage = {
    val __obj = js.Dynamic.literal(event = event, sobject = sobject)
  
    __obj.asInstanceOf[StreamingMessage]
  }
}

