package typings.leakage.leakageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var gcollections: Double = js.native
  var heapDiffs: js.Array[_] = js.native
  var iterations: Double = js.native
  def printSummary(title: String): Unit = js.native
  def printSummary(title: String, log: js.Function1[/* msg */ String, Unit]): Unit = js.native
}

