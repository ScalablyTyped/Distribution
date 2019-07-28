package typings.heatmapDotJs.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heatmap.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create[V /* <: String */, X /* <: String */, Y /* <: String */](configObject: HeatmapConfiguration[V, X, Y]): Heatmap[V, X, Y] = js.native
  def register(pluginKey: String, plugin: js.Any): Unit = js.native
}

