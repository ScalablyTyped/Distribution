package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: String
  def treat(): js.Promise[Unit]
}

object AnonMessage {
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
  
    __obj.asInstanceOf[AnonMessage]
  }
}

