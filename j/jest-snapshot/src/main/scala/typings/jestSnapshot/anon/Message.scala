package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var actual: js.UndefOr[scala.Nothing] = js.undefined
  var expected: js.UndefOr[scala.Nothing] = js.undefined
  var name: js.UndefOr[scala.Nothing] = js.undefined
  var pass: Boolean
  var report: js.UndefOr[scala.Nothing] = js.undefined
  def message(): String
}

object Message {
  @scala.inline
  def apply(message: () => String, pass: Boolean): Message = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

