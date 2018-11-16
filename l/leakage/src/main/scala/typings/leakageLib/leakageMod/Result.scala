package typings
package leakageLib.leakageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var gcollections: scala.Double = js.native
  var heapDiffs: js.Array[_] = js.native
  var iterations: scala.Double = js.native
  def printSummary(title: java.lang.String): scala.Unit = js.native
  def printSummary(title: java.lang.String, log: js.Function1[/* msg */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

