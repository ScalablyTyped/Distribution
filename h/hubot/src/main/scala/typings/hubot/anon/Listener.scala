package typings.hubot.anon

import typings.hubot.mod.Adapter
import typings.hubot.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener[A /* <: Adapter */] extends js.Object {
  var listener: Middleware[A]
  var receive: Middleware[A]
  var response: Middleware[A]
}

object Listener {
  @scala.inline
  def apply[/* <: typings.hubot.mod.Adapter */ A](listener: Middleware[A], receive: Middleware[A], response: Middleware[A]): Listener[A] = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener[A]]
  }
}

