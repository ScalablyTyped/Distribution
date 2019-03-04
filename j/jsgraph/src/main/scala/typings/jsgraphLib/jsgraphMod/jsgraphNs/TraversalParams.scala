package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalParams extends js.Object {
  var digraph: DirectedGraph
  var options: js.UndefOr[TraversalOptions] = js.undefined
  var visitor: Visitor
}

object TraversalParams {
  @scala.inline
  def apply(digraph: DirectedGraph, visitor: Visitor, options: TraversalOptions = null): TraversalParams = {
    val __obj = js.Dynamic.literal(digraph = digraph, visitor = visitor)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[TraversalParams]
  }
}

