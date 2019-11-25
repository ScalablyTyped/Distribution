package typings.jsgraph.jsgraphMod

import typings.jsgraph.Anon_Dirgaph
import typings.jsgraph.Anon_Error
import typings.jsgraph.Anon_Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directed extends js.Object {
  var colors: typings.jsgraph.jsgraphMod.colors
  var directedGraph: DirectedGraph
  def breadthFirstTraverse(params: TraversalParams): TraversalResult
  def create(): Anon_Result
  def createTraversalContext(req: Anon_Dirgaph): TraversalContext
  def depthFirstTraverse(params: TraversalParams): TraversalResult
  def transpose(graph: DirectedGraph): Anon_Error
}

object Directed {
  @scala.inline
  def apply(
    breadthFirstTraverse: TraversalParams => TraversalResult,
    colors: colors,
    create: () => Anon_Result,
    createTraversalContext: Anon_Dirgaph => TraversalContext,
    depthFirstTraverse: TraversalParams => TraversalResult,
    directedGraph: DirectedGraph,
    transpose: DirectedGraph => Anon_Error
  ): Directed = {
    val __obj = js.Dynamic.literal(breadthFirstTraverse = js.Any.fromFunction1(breadthFirstTraverse), colors = colors.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), createTraversalContext = js.Any.fromFunction1(createTraversalContext), depthFirstTraverse = js.Any.fromFunction1(depthFirstTraverse), directedGraph = directedGraph.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
  
    __obj.asInstanceOf[Directed]
  }
}

