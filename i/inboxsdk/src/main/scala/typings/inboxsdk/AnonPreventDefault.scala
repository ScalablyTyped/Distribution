package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreventDefault extends js.Object {
  def preventDefault(): Unit
}

object AnonPreventDefault {
  @scala.inline
  def apply(preventDefault: () => Unit): AnonPreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[AnonPreventDefault]
  }
}

