package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connections extends js.Object {
  var length: Double
  def detach(): Unit
  def each(e: js.Function1[/* c */ Connection, Unit]): Unit
}

object Connections {
  @scala.inline
  def apply(detach: () => Unit, each: js.Function1[/* c */ Connection, Unit] => Unit, length: Double): Connections = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), each = js.Any.fromFunction1(each), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
}

