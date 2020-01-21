package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "SimpleQueue")
@js.native
class SimpleQueue () extends js.Object {
  var executing: Boolean = js.native
  var fifo: js.Array[_] = js.native
  def maybeNext(): Unit = js.native
  def next(): Unit = js.native
  def push(fn: js.Function2[/* foo */ js.Any, /* bar */ js.Any, Unit]): Unit = js.native
}

