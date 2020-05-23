package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "Edge")
@js.native
class Edge protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.Edge {
  def this(v: Double, w: Double, weight: Double) = this()
  /* CompleteClass */
  override var v: js.Any = js.native
  /* CompleteClass */
  override var w: js.Any = js.native
  /* CompleteClass */
  override var weight: Double = js.native
  /* CompleteClass */
  override def either(): Double = js.native
  /* CompleteClass */
  override def from(): Double = js.native
  /* CompleteClass */
  override def other(x: Double): Double = js.native
  /* CompleteClass */
  override def to(): Double = js.native
}

