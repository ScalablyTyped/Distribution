package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionHoldEvent extends js.Object {
  var originator: String
}

object SessionHoldEvent {
  @scala.inline
  def apply(originator: String): SessionHoldEvent = {
    val __obj = js.Dynamic.literal(originator = originator)
  
    __obj.asInstanceOf[SessionHoldEvent]
  }
}

