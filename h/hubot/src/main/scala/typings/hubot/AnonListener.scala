package typings.hubot

import typings.hubot.mod.Adapter
import typings.hubot.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListener[A /* <: Adapter */] extends js.Object {
  var listener: Middleware[A]
  var receive: Middleware[A]
  var response: Middleware[A]
}

object AnonListener {
  @scala.inline
  def apply[A /* <: Adapter */](listener: Middleware[A], receive: Middleware[A], response: Middleware[A]): AnonListener[A] = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListener[A]]
  }
}

