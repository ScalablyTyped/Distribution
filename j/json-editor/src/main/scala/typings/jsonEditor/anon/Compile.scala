package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compile extends js.Object {
  def compile(template: String): js.Function1[/* vars */ js.Any, String]
}

object Compile {
  @scala.inline
  def apply(compile: String => js.Function1[/* vars */ js.Any, String]): Compile = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
    __obj.asInstanceOf[Compile]
  }
}

