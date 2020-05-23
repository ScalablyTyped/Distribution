package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: String
  def treat(): js.Promise[Unit]
}

object Message {
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
    __obj.asInstanceOf[Message]
  }
}

