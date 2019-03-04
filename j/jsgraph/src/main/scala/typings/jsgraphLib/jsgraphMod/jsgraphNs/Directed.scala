package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directed extends js.Object {
  var colors: colors
  var directedGraph: DirectedGraph
  def breadthFirstTraverse(params: TraversalParams): TraversalResult
  def create(): jsgraphLib.Anon_Result
  def createTraversalContext(req: jsgraphLib.Anon_Dirgaph): TraversalContext
  def depthFirstTraverse(params: TraversalParams): TraversalResult
  def transpose(graph: DirectedGraph): jsgraphLib.Anon_Error
}

object Directed {
  @scala.inline
  def apply(
    breadthFirstTraverse: js.Function1[TraversalParams, TraversalResult],
    colors: colors,
    create: js.Function0[jsgraphLib.Anon_Result],
    createTraversalContext: js.Function1[jsgraphLib.Anon_Dirgaph, TraversalContext],
    depthFirstTraverse: js.Function1[TraversalParams, TraversalResult],
    directedGraph: DirectedGraph,
    transpose: js.Function1[DirectedGraph, jsgraphLib.Anon_Error]
  ): Directed = {
    val __obj = js.Dynamic.literal(breadthFirstTraverse = breadthFirstTraverse, colors = colors, create = create, createTraversalContext = createTraversalContext, depthFirstTraverse = depthFirstTraverse, directedGraph = directedGraph, transpose = transpose)
  
    __obj.asInstanceOf[Directed]
  }
}

