package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnsubscribe extends js.Object {
  def unsubscribe(): Unit
}

object AnonUnsubscribe {
  @scala.inline
  def apply(unsubscribe: () => Unit): AnonUnsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[AnonUnsubscribe]
  }
}

