package typings
package graphvizLib.graphvizMod

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
  var path: java.lang.String
  var `type`: java.lang.String
    // output file type (png, jpeg, ps, ...)
  var use: java.lang.String
}

object RenderOptions {
  @scala.inline
  def apply(
    E: js.Any,
    G: js.Any,
    N: js.Any,
    path: java.lang.String,
    `type`: java.lang.String,
    use: java.lang.String
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("E")(E)
    __obj.updateDynamic("G")(G)
    __obj.updateDynamic("N")(N)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[RenderOptions]
  }
}

