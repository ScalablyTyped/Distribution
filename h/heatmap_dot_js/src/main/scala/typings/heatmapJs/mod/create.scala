package typings.heatmapJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heatmap.js", "create")
@js.native
object create extends js.Object {
  def apply[V /* <: String */, X /* <: String */, Y /* <: String */](configObject: HeatmapConfiguration[V, X, Y]): Heatmap[V, X, Y] = js.native
}

