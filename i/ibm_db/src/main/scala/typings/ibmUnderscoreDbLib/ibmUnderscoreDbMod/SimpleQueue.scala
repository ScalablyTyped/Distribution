package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "SimpleQueue")
@js.native
class SimpleQueue () extends js.Object {
  var executing: scala.Boolean = js.native
  var fifo: js.Array[_] = js.native
  def maybeNext(): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def push(fn: js.Function2[/* foo */ js.Any, /* bar */ js.Any, scala.Unit]): scala.Unit = js.native
}

