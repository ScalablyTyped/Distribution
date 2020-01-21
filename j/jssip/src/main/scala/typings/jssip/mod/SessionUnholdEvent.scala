package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionUnholdEvent extends js.Object {
  var originator: String
}

object SessionUnholdEvent {
  @scala.inline
  def apply(originator: String): SessionUnholdEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionUnholdEvent]
  }
}

