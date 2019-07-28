package typings.graphviz.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
    // node options
  var E: js.Any
    // GraphViz path
  var G: js.Any
    // graph options
  var N: js.Any
    // Graphviz command to use (dot, neato, ...)
  var path: String
  var `type`: String
    // output file type (png, jpeg, ps, ...)
  var use: String
}

object RenderOptions {
  @scala.inline
  def apply(E: js.Any, G: js.Any, N: js.Any, path: String, `type`: String, use: String): RenderOptions = {
    val __obj = js.Dynamic.literal(E = E, G = G, N = N, path = path, use = use)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RenderOptions]
  }
}

