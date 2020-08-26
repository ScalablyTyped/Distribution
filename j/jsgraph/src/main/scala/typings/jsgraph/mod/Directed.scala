package typings.jsgraph.mod

import typings.jsgraph.anon.Dirgaph
import typings.jsgraph.anon.Error
import typings.jsgraph.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directed extends js.Object {
  var colors: typings.jsgraph.mod.colors = js.native
  var directedGraph: DirectedGraph = js.native
  def breadthFirstTraverse(params: TraversalParams): TraversalResult = js.native
  def create(): Result = js.native
  def createTraversalContext(req: Dirgaph): TraversalContext = js.native
  def depthFirstTraverse(params: TraversalParams): TraversalResult = js.native
  def transpose(graph: DirectedGraph): Error = js.native
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
  @scala.inline
  implicit class DirectedOps[Self <: Directed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreadthFirstTraverse(value: TraversalParams => TraversalResult): Self = this.set("breadthFirstTraverse", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: () => Result): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateTraversalContext(value: Dirgaph => TraversalContext): Self = this.set("createTraversalContext", js.Any.fromFunction1(value))
    @scala.inline
    def setDepthFirstTraverse(value: TraversalParams => TraversalResult): Self = this.set("depthFirstTraverse", js.Any.fromFunction1(value))
    @scala.inline
    def setDirectedGraph(value: DirectedGraph): Self = this.set("directedGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranspose(value: DirectedGraph => Error): Self = this.set("transpose", js.Any.fromFunction1(value))
  }
  
}

