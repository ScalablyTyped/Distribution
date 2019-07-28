package typings.jsgraph

import typings.jsgraph.jsgraphMod.DirectedGraph
import typings.jsgraph.jsgraphMod.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var e: Edge
  var g: DirectedGraph
}

object Anon_E {
  @scala.inline
  def apply(e: Edge, g: DirectedGraph): Anon_E = {
    val __obj = js.Dynamic.literal(e = e, g = g)
  
    __obj.asInstanceOf[Anon_E]
  }
}

