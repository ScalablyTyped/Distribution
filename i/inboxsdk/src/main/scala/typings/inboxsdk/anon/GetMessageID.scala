package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMessageID extends js.Object {
  def getMessageID(): js.Promise[String]
  def getThreadID(): js.Promise[String]
}

object GetMessageID {
  @scala.inline
  def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): GetMessageID = {
    val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
    __obj.asInstanceOf[GetMessageID]
  }
}

