package typings.jsgraph

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonG extends js.Object {
  var g: DirectedGraph
  var u: String
}

object AnonG {
  @scala.inline
  def apply(g: DirectedGraph, u: String): AnonG = {
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonG]
  }
}

