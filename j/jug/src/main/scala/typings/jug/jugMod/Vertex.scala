package typings.jug.jugMod

import typings.jug.VertexData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents one node of a graph.
  */
@js.native
trait Vertex extends js.Object {
  /**
    * Initial vertex data.
    */
  var internal: VertexStructure = js.native
  /**
    * Get node data.
    */
  def data(): VertexData = js.native
  /**
    * Set node data.
    * @param obj - data to be set.
    */
  def data(obj: VertexData): Vertex = js.native
  /**
    * Get edge count.
    */
  def edge(): Double = js.native
  /**
    * Access node.
    * @param index - edge index.
    */
  def edge(index: Double): Vertex = js.native
  /**
    * Find a node.
    * @param {string} type - object type.
    * @param {Object} query - _.where query object.
    */
  def find(`type`: String, query: js.Object): js.Array[VertexData] = js.native
  def find(`type`: Unit, query: js.Object): js.Array[VertexData] = js.native
  /**
    * Getting childs of an specified edge.
    * @param egde - target vertex;
    */
  def getChildsOf(egde: Double): js.Array[VertexData] = js.native
  /**
    * Getting parents of an specified level and edge.
    * @param {number} level - max level.
    * @param {number} edge - edge index.
    */
  def getParentsFrom(level: Double, edge: Double): js.Array[VertexData] = js.native
  /**
    * Getting the length of childs of an specified edge.
    * @param {number} edge - edge index.
    */
  def getScopeOf(edge: Double): Double = js.native
  /**
    * Get siblings of specified edge.
    * @param {number} index - edge index.
    */
  def getSiblingsOf(index: Double): js.Array[VertexData] = js.native
  /**
    * Verify if the current node is the root.
    */
  def isRoot(): Boolean = js.native
  /**
    * Verify the level.
    */
  def level(): Double = js.native
  /**
    * Get distance between nodes.
    * @param from
    * @param to
    */
  def proximity(from: String, to: String): js.Array[Double] = js.native
  /**
    * Seed node.
    * @param [data] - created vertex UserData.
    */
  def seed(): Vertex = js.native
  def seed(data: VertexData): Vertex = js.native
}

