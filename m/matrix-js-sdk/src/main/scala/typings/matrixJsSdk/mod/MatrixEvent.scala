package typings.matrixJsSdk.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "MatrixEvent")
@js.native
class MatrixEvent protected () extends js.Object {
        //  True if this event is 'forward looking', meaning that getDirectionalContent() will return event.content and not event.prev_content.
  def this(event: js.Object) = this()
    //  The sending status of the event.
  var error: Error = js.native
  var event: js.Any = js.native
          //  most recent error associated with sending the event, if any
  var forwardLooking: Boolean = js.native
         //  The raw (possibly encrypted) event. Do not access this property directly unless you absolutely have to. Prefer the getter methods defined
  var sender: RoomMember = js.native
     //  The room member who is the target of this event, e.g. the invitee, the person being banned, etc.
  var status: EventStatus = js.native
     //  The room member who sent this event, or null e.g. this is a presence event. This is only guaranteed to be set for events that appear in
  var target: RoomMember = js.native
  def getSender(): String = js.native
  def getType(): EventType = js.native
}

