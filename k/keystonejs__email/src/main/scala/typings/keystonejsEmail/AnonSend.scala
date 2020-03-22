package typings.keystonejsEmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSend extends js.Object {
  def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any
}

object AnonSend {
  @scala.inline
  def apply(send: (js.Any, js.Any) => js.Any): AnonSend = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[AnonSend]
  }
}

