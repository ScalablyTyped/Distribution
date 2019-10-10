package typings.atHapiJoi

import typings.atHapiJoi.atHapiJoiMod.CustomHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromHelpers extends js.Object {
  def from(value: js.Any): js.Any
  def to(value: js.Any, helpers: CustomHelpers[_]): js.Any
}

object Anon_FromHelpers {
  @scala.inline
  def apply(from: js.Any => js.Any, to: (js.Any, CustomHelpers[_]) => js.Any): Anon_FromHelpers = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
  
    __obj.asInstanceOf[Anon_FromHelpers]
  }
}

