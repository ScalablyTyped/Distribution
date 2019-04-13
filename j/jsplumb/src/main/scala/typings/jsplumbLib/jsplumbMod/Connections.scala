package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connections extends js.Object {
  var length: scala.Double
  def detach(): scala.Unit
  def each(e: js.Function1[/* c */ Connection, scala.Unit]): scala.Unit
}

object Connections {
  @scala.inline
  def apply(
    detach: () => scala.Unit,
    each: js.Function1[/* c */ Connection, scala.Unit] => scala.Unit,
    length: scala.Double
  ): Connections = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), each = js.Any.fromFunction1(each), length = length)
  
    __obj.asInstanceOf[Connections]
  }
}

