package typings.graphviz.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends HasAttributes {
  // Graphviz command to use (dot, neato, ...)
  var use: String = js.native
  // Subgraph (cluster) API
  def addCluster(id: String): Graph = js.native
  // TODO: Use union types when we have TS 1.4
  def addEdge(nodeOne: String, nodeTwo: String): Edge = js.native
  def addEdge(nodeOne: String, nodeTwo: String, attrs: js.Any): Edge = js.native
  def addEdge(nodeOne: String, nodeTwo: Node): Edge = js.native
  def addEdge(nodeOne: String, nodeTwo: Node, attrs: js.Any): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: String): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: String, attrs: js.Any): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: Node): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: Node, attrs: js.Any): Edge = js.native
  def addNode(id: String): Node = js.native
  def addNode(id: String, attrs: js.Any): Node = js.native
  def clusterCount(): Double = js.native
  def edgeCount(): Double = js.native
  def getCluster(id: String): Graph = js.native
  def getEdgeAttribut(name: String): js.Any = js.native
  def getNodeAttribut(name: String): js.Any = js.native
  def nodeCount(): Double = js.native
  def output(options: RenderOptions, callback: OutputCallback): Unit = js.native
  def output(options: RenderOptions, callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  def output(options: RenderOptions, filename: String): Unit = js.native
  def output(options: RenderOptions, filename: String, errback: ErrorCallback): Unit = js.native
  def output(`type`: String, callback: OutputCallback): Unit = js.native
  def output(`type`: String, callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  // alias for render
  def output(`type`: String, filename: String): Unit = js.native
  def output(`type`: String, filename: String, errback: ErrorCallback): Unit = js.native
  def render(options: RenderOptions, callback: OutputCallback): Unit = js.native
  def render(options: RenderOptions, callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  def render(options: RenderOptions, filename: String): Unit = js.native
  def render(options: RenderOptions, filename: String, errback: ErrorCallback): Unit = js.native
  def render(`type`: String, callback: OutputCallback): Unit = js.native
  def render(`type`: String, callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  // TODO: Use union types when we can have TS 1.4
  def render(`type`: String, filename: String): Unit = js.native
  def render(`type`: String, filename: String, errback: ErrorCallback): Unit = js.native
  def setEdgeAttribut(name: String, value: js.Any): Unit = js.native
  // Path containing Graphviz binaries.
  def setGraphVizPath(directoryPath: String): Unit = js.native
  def setNodeAttribut(name: String, value: js.Any): Unit = js.native
  def to_dot(): String = js.native
}

@JSImport("graphviz", "graph")
@js.native
object graph extends js.Object {
  def apply(id: String): Graph = js.native
}

