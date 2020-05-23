package typings.jsgraph.mod

import typings.jsgraph.anon.Dirgaph
import typings.jsgraph.anon.Error
import typings.jsgraph.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directed extends js.Object {
  var colors: typings.jsgraph.mod.colors
  var directedGraph: DirectedGraph
  def breadthFirstTraverse(params: TraversalParams): TraversalResult
  def create(): Result
  def createTraversalContext(req: Dirgaph): TraversalContext
  def depthFirstTraverse(params: TraversalParams): TraversalResult
  def transpose(graph: DirectedGraph): Error
}

object Directed {
  @scala.inline
  def apply(
    breadthFirstTraverse: TraversalParams => TraversalResult,
    colors: colors,
    create: () => Result,
    createTraversalContext: Dirgaph => TraversalContext,
    depthFirstTraverse: TraversalParams => TraversalResult,
    directedGraph: DirectedGraph,
    transpose: DirectedGraph => Error
  ): Directed = {
    val __obj = js.Dynamic.literal(breadthFirstTraverse = js.Any.fromFunction1(breadthFirstTraverse), colors = colors.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), createTraversalContext = js.Any.fromFunction1(createTraversalContext), depthFirstTraverse = js.Any.fromFunction1(depthFirstTraverse), directedGraph = directedGraph.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
    __obj.asInstanceOf[Directed]
  }
}

