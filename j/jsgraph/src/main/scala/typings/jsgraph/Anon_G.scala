package typings.jsgraph

import typings.jsgraph.jsgraphMod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_G extends js.Object {
  var g: DirectedGraph
  var u: String
}

object Anon_G {
  @scala.inline
  def apply(g: DirectedGraph, u: String): Anon_G = {
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_G]
  }
}

