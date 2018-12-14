package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectedGraph
  extends org.scalablytyped.runtime.Instantiable0[DirectedGraph] {
  //Edge functions
  def addEdge(request: EdgeRequest): JsGraphResponse = js.native
  //Vertex functions
  def addVertex(vertex: VertexRequest): JsGraphResponse = js.native
  def clearEdgeProperty(edge: Edge): scala.Boolean = js.native
  def clearVertexProperty(vertex: java.lang.String): scala.Boolean = js.native
  def fromObject(graph: js.Any): JsGraphResponse = js.native
  def getEdeges(): js.Array[Edge] = js.native
  def getEdgeCount(): scala.Double = js.native
  def getEdgeProperty(edge: Edge): js.Any = js.native
  def getGraphDescription(): java.lang.String = js.native
  def getGraphName(): java.lang.String = js.native
  def getLeafVertices(): js.Array[java.lang.String] = js.native
  def getRootVertices(): js.Array[java.lang.String] = js.native
  def getVertexProperty(vertex: java.lang.String): js.Any = js.native
  def getVertices(): js.Array[java.lang.String] = js.native
  def hasEdgeProperty(edge: Edge): scala.Boolean = js.native
  def hasVertexProperty(vertex: java.lang.String): scala.Boolean = js.native
  def inDegree(vertex: java.lang.String): scala.Double = js.native
  def inEdges(vertex: java.lang.String): js.Array[Edge] = js.native
  def isEdge(edge: Edge): scala.Boolean = js.native
  def leafVerticesCount(): scala.Double = js.native
  def outDegree(vertex: java.lang.String): scala.Double = js.native
  def outEdges(vertex: java.lang.String): js.Array[Edge] = js.native
  def removeEdge(edge: Edge): JsGraphResponse = js.native
  def removeVertex(vertex: java.lang.String): scala.Boolean = js.native
  def rootVerticesCount(): scala.Double = js.native
  def setEdgeProperty(request: EdgeRequest): JsGraphResponse = js.native
  def setGraphDescription(description: java.lang.String): JsGraphResponse = js.native
  def setGraphName(name: java.lang.String): JsGraphResponse = js.native
  def setVertexProperty(vertex: VertexRequest): JsGraphResponse = js.native
  def stringify(replacer: js.Function): java.lang.String = js.native
  def stringify(replacer: js.Function, space: scala.Double): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toObject(): java.lang.String = js.native
  def verticesCount(): scala.Double = js.native
}

