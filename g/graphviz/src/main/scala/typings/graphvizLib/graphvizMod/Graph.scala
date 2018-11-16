package typings
package graphvizLib.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends HasAttributes {
  // Graphviz command to use (dot, neato, ...)
  var use: java.lang.String = js.native
  // Subgraph (cluster) API
  def addCluster(id: java.lang.String): Graph = js.native
  def addEdge(nodeOne: Node, nodeTwo: Node): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: Node, attrs: js.Any): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: java.lang.String): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: java.lang.String, attrs: js.Any): Edge = js.native
  def addEdge(nodeOne: java.lang.String, nodeTwo: Node): Edge = js.native
  def addEdge(nodeOne: java.lang.String, nodeTwo: Node, attrs: js.Any): Edge = js.native
  // TODO: Use union types when we have TS 1.4
  def addEdge(nodeOne: java.lang.String, nodeTwo: java.lang.String): Edge = js.native
  // TODO: Use union types when we have TS 1.4
  def addEdge(nodeOne: java.lang.String, nodeTwo: java.lang.String, attrs: js.Any): Edge = js.native
  def addNode(id: java.lang.String): Node = js.native
  def addNode(id: java.lang.String, attrs: js.Any): Node = js.native
  def clusterCount(): scala.Double = js.native
  def edgeCount(): scala.Double = js.native
  def getCluster(id: java.lang.String): Graph = js.native
  def getEdgeAttribut(name: java.lang.String): js.Any = js.native
  def getNodeAttribut(name: java.lang.String): js.Any = js.native
  def nodeCount(): scala.Double = js.native
  def output(options: RenderOptions, callback: OutputCallback): scala.Unit = js.native
  def output(options: RenderOptions, callback: OutputCallback, errback: ErrorCallback): scala.Unit = js.native
  def output(options: RenderOptions, filename: java.lang.String): scala.Unit = js.native
  def output(options: RenderOptions, filename: java.lang.String, errback: ErrorCallback): scala.Unit = js.native
  def output(`type`: java.lang.String, callback: OutputCallback): scala.Unit = js.native
  def output(`type`: java.lang.String, callback: OutputCallback, errback: ErrorCallback): scala.Unit = js.native
  // alias for render
  def output(`type`: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  // alias for render
  def output(`type`: java.lang.String, filename: java.lang.String, errback: ErrorCallback): scala.Unit = js.native
  def render(options: RenderOptions, callback: OutputCallback): scala.Unit = js.native
  def render(options: RenderOptions, callback: OutputCallback, errback: ErrorCallback): scala.Unit = js.native
  def render(options: RenderOptions, filename: java.lang.String): scala.Unit = js.native
  def render(options: RenderOptions, filename: java.lang.String, errback: ErrorCallback): scala.Unit = js.native
  def render(`type`: java.lang.String, callback: OutputCallback): scala.Unit = js.native
  def render(`type`: java.lang.String, callback: OutputCallback, errback: ErrorCallback): scala.Unit = js.native
  // TODO: Use union types when we can have TS 1.4
  def render(`type`: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  // TODO: Use union types when we can have TS 1.4
  def render(`type`: java.lang.String, filename: java.lang.String, errback: ErrorCallback): scala.Unit = js.native
  def setEdgeAttribut(name: java.lang.String, value: js.Any): scala.Unit = js.native
  // Path containing Graphviz binaries.
  def setGraphVizPath(directoryPath: java.lang.String): scala.Unit = js.native
  def setNodeAttribut(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def to_dot(): java.lang.String = js.native
}

