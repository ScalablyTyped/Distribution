package typings.javascriptDashObfuscator.threadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thread[T, U] extends js.Object {
  var killed: Boolean
  def kill(): Unit
  def on(eventType: String, responseCallback: ResponseCallback[U]): Thread[T, U]
  def send(data: T): Thread[T, U]
}

object Thread {
  @scala.inline
  def apply[T, U](
    kill: () => Unit,
    killed: Boolean,
    on: (String, ResponseCallback[U]) => Thread[T, U],
    send: T => Thread[T, U]
  ): Thread[T, U] = {
    val __obj = js.Dynamic.literal(kill = js.Any.fromFunction0(kill), killed = killed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Thread[T, U]]
  }
}

