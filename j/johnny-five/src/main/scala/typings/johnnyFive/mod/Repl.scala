package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repl extends js.Object {
  def inject(`object`: js.Any): Unit
}

object Repl {
  @scala.inline
  def apply(inject: js.Any => Unit): Repl = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction1(inject))
    __obj.asInstanceOf[Repl]
  }
}

