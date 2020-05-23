package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.QuickUnion")
@js.native
class QuickUnion protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.QuickUnion {
  def this(V: Double) = this()
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override def connected(v: Double, w: Double): Boolean = js.native
  /* CompleteClass */
  override def root(q: Double): Double = js.native
  /* CompleteClass */
  override def union(v: Double, w: Double): Unit = js.native
}

