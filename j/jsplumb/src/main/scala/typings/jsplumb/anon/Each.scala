package typings.jsplumb.anon

import typings.jsplumb.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Each extends js.Object {
  def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit
}

object Each {
  @scala.inline
  def apply(each: js.Function1[/* conn */ Connection, Unit] => Unit): Each = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
    __obj.asInstanceOf[Each]
  }
}

