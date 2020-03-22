package typings.jsplumb

import typings.jsplumb.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEach extends js.Object {
  def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit
}

object AnonEach {
  @scala.inline
  def apply(each: js.Function1[/* conn */ Connection, Unit] => Unit): AnonEach = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
  
    __obj.asInstanceOf[AnonEach]
  }
}

