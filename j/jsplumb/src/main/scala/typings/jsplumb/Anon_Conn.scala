package typings.jsplumb

import typings.jsplumb.jsplumbMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conn extends js.Object {
  def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit
}

object Anon_Conn {
  @scala.inline
  def apply(each: js.Function1[/* conn */ Connection, Unit] => Unit): Anon_Conn = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
  
    __obj.asInstanceOf[Anon_Conn]
  }
}

