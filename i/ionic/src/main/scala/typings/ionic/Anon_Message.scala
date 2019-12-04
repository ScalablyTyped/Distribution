package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: String
  def treat(): js.Promise[Unit]
}

object Anon_Message {
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
  
    __obj.asInstanceOf[Anon_Message]
  }
}

