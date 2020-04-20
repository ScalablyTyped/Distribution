package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetMessageID extends js.Object {
  def getMessageID(): js.Promise[String]
  def getThreadID(): js.Promise[String]
}

object AnonGetMessageID {
  @scala.inline
  def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): AnonGetMessageID = {
    val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
    __obj.asInstanceOf[AnonGetMessageID]
  }
}

