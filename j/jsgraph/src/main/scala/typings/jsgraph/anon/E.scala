package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import typings.jsgraph.mod.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait E extends js.Object {
  var e: Edge
  var g: DirectedGraph
}

object E {
  @scala.inline
  def apply(e: Edge, g: DirectedGraph): E = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
}

