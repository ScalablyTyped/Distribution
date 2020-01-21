package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompile extends js.Object {
  def compile(template: String): js.Function1[/* vars */ js.Any, String]
}

object AnonCompile {
  @scala.inline
  def apply(compile: String => js.Function1[/* vars */ js.Any, String]): AnonCompile = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
  
    __obj.asInstanceOf[AnonCompile]
  }
}

