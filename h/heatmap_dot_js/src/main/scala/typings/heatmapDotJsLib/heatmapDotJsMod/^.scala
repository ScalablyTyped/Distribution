package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heatmap.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create[V /* <: java.lang.String */, X /* <: java.lang.String */, Y /* <: java.lang.String */](configObject: HeatmapConfiguration[V, X, Y]): Heatmap[V, X, Y] = js.native
  def register(pluginKey: java.lang.String, plugin: js.Any): scala.Unit = js.native
}

