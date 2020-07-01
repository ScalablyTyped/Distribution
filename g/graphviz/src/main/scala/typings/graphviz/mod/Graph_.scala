package typings.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph_ extends HasAttributes {
  var use: RenderEngine = js.native
  // Subgraph (cluster) API
  def addCluster(id: String): Graph_ = js.native
  def addEdge(nodeOne: String, nodeTwo: String): Edge = js.native
  def addEdge(nodeOne: String, nodeTwo: String, attrs: Options): Edge = js.native
  def addEdge(nodeOne: String, nodeTwo: Node): Edge = js.native
  def addEdge(nodeOne: String, nodeTwo: Node, attrs: Options): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: String): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: String, attrs: Options): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: Node): Edge = js.native
  def addEdge(nodeOne: Node, nodeTwo: Node, attrs: Options): Edge = js.native
  def addNode(id: String): Node = js.native
  def addNode(id: String, attrs: js.Any): Node = js.native
  def clusterCount(): Double = js.native
  def edgeCount(): Double = js.native
  def getCluster(id: String): Graph_ = js.native
  def getEdgeAttribut(name: String): js.Any = js.native
  def getNodeAttribut(name: String): js.Any = js.native
  def nodeCount(): Double = js.native
  def output(type_options: String, filename_callback: String): Unit = js.native
  def output(type_options: String, filename_callback: String, errback: ErrorCallback): Unit = js.native
  def output(type_options: String, filename_callback: OutputCallback): Unit = js.native
  def output(type_options: String, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  def output(type_options: RenderOptions, filename_callback: String): Unit = js.native
  def output(type_options: RenderOptions, filename_callback: String, errback: ErrorCallback): Unit = js.native
  def output(type_options: RenderOptions, filename_callback: OutputCallback): Unit = js.native
  def output(type_options: RenderOptions, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  def render(type_options: String, filename_callback: String): Unit = js.native
  def render(type_options: String, filename_callback: String, errback: ErrorCallback): Unit = js.native
  def render(type_options: String, filename_callback: OutputCallback): Unit = js.native
  def render(type_options: String, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  def render(type_options: RenderOptions, filename_callback: String): Unit = js.native
  def render(type_options: RenderOptions, filename_callback: String, errback: ErrorCallback): Unit = js.native
  def render(type_options: RenderOptions, filename_callback: OutputCallback): Unit = js.native
  def render(type_options: RenderOptions, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
  def setEdgeAttribut(name: String, value: js.Any): Unit = js.native
  // Path containing Graphviz binaries.
  def setGraphVizPath(directoryPath: String): Unit = js.native
  def setNodeAttribut(name: String, value: js.Any): Unit = js.native
  def to_dot(): String = js.native
}

