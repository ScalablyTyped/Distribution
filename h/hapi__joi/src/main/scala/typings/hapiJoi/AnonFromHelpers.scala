package typings.hapiJoi

import typings.hapiJoi.mod.CustomHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromHelpers extends js.Object {
  def from(value: js.Any): js.Any
  def to(value: js.Any, helpers: CustomHelpers[_]): js.Any
}

object AnonFromHelpers {
  @scala.inline
  def apply(from: js.Any => js.Any, to: (js.Any, CustomHelpers[_]) => js.Any): AnonFromHelpers = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
  
    __obj.asInstanceOf[AnonFromHelpers]
  }
}

