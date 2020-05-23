package typings.keystonejsEmail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Send extends js.Object {
  def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any
}

object Send {
  @scala.inline
  def apply(send: (js.Any, js.Any) => js.Any): Send = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Send]
  }
}

