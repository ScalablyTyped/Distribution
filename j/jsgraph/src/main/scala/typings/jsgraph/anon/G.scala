package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait G extends js.Object {
  var g: DirectedGraph
  var u: String
}

object G {
  @scala.inline
  def apply(g: DirectedGraph, u: String): G = {
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[G]
  }
}

