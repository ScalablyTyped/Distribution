package typings.jsgraph.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectedGraph extends Instantiable0[DirectedGraph] {
  
  //Edge functions
  def addEdge(request: EdgeRequest): JsGraphResponse = js.native
  
  //Vertex functions
  def addVertex(vertex: VertexRequest): JsGraphResponse = js.native
  
  def clearEdgeProperty(edge: Edge): Boolean = js.native
  
  def clearVertexProperty(vertex: String): Boolean = js.native
  
  def fromObject(graph: js.Any): JsGraphResponse = js.native
  
  def getEdeges(): js.Array[Edge] = js.native
  
  def getEdgeCount(): Double = js.native
  
  def getEdgeProperty(edge: Edge): js.Any = js.native
  
  def getGraphDescription(): String = js.native
  
  def getGraphName(): String = js.native
  
  def getLeafVertices(): js.Array[String] = js.native
  
  def getRootVertices(): js.Array[String] = js.native
  
  def getVertexProperty(vertex: String): js.Any = js.native
  
  def getVertices(): js.Array[String] = js.native
  
  def hasEdgeProperty(edge: Edge): Boolean = js.native
  
  def hasVertexProperty(vertex: String): Boolean = js.native
  
  def inDegree(vertex: String): Double = js.native
  
  def inEdges(vertex: String): js.Array[Edge] = js.native
  
  def isEdge(edge: Edge): Boolean = js.native
  
  def leafVerticesCount(): Double = js.native
  
  def outDegree(vertex: String): Double = js.native
  
  def outEdges(vertex: String): js.Array[Edge] = js.native
  
  def removeEdge(edge: Edge): JsGraphResponse = js.native
  
  def removeVertex(vertex: String): Boolean = js.native
  
  def rootVerticesCount(): Double = js.native
  
  def setEdgeProperty(request: EdgeRequest): JsGraphResponse = js.native
  
  def setGraphDescription(description: String): JsGraphResponse = js.native
  
  def setGraphName(name: String): JsGraphResponse = js.native
  
  def setVertexProperty(vertex: VertexRequest): JsGraphResponse = js.native
  
  def stringify(replacer: js.Function): String = js.native
  def stringify(replacer: js.Function, space: Double): String = js.native
  
  def toJSON(): String = js.native
  
  def toObject(): String = js.native
  
  def verticesCount(): Double = js.native
}
