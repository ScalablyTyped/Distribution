package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMessageID extends js.Object {
  def getMessageID(): js.Promise[String]
  def getThreadID(): js.Promise[String]
}

object Anon_GetMessageID {
  @scala.inline
  def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): Anon_GetMessageID = {
    val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
  
    __obj.asInstanceOf[Anon_GetMessageID]
  }
}

