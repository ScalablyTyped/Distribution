package typings.jsgraph

import typings.jsgraph.mod.DirectedGraph
import typings.jsgraph.mod.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonE extends js.Object {
  var e: Edge
  var g: DirectedGraph
}

object AnonE {
  @scala.inline
  def apply(e: Edge, g: DirectedGraph): AnonE = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonE]
  }
}

