package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.Edge")
@js.native
class Edge protected () extends js.Object {
  def this(v: Double, w: Double, weight: Double) = this()
  var label: js.UndefOr[String] = js.native
  var v: js.Any = js.native
  var w: js.Any = js.native
  var weight: Double = js.native
  def either(): Double = js.native
  def from(): Double = js.native
  def other(x: Double): Double = js.native
  def to(): Double = js.native
}

