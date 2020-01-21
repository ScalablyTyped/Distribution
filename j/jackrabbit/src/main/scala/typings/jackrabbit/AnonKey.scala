package typings.jackrabbit

import typings.jackrabbit.mod.jackrabbit.AckCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var reply: js.UndefOr[AckCallback] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(key: String, reply: /* data */ js.UndefOr[js.Any] => Unit = null): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(js.Any.fromFunction1(reply))
    __obj.asInstanceOf[AnonKey]
  }
}

