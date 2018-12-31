package typings
package jugLib.jugMod

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
  def data(): jugLib.VertexData = js.native
  /**
    * Set node data.
    * @param obj - data to be set.
    */
  def data(obj: jugLib.VertexData): Vertex = js.native
  /**
    * Get edge count.
    */
  def edge(): scala.Double = js.native
  /**
    * Access node.
    * @param index - edge index.
    */
  def edge(index: scala.Double): Vertex = js.native
  /**
    * Find a node.
    * @param {string} type - object type.
    * @param {Object} query - _.where query object.
    */
  def find(`type`: java.lang.String, query: js.Object): js.Array[jugLib.VertexData] = js.native
  def find(`type`: scala.Unit, query: js.Object): js.Array[jugLib.VertexData] = js.native
  /**
    * Getting childs of an specified edge.
    * @param egde - target vertex;
    */
  def getChildsOf(egde: scala.Double): js.Array[jugLib.VertexData] = js.native
  /**
    * Getting parents of an specified level and edge.
    * @param {number} level - max level.
    * @param {number} edge - edge index.
    */
  def getParentsFrom(level: scala.Double, edge: scala.Double): js.Array[jugLib.VertexData] = js.native
  /**
    * Getting the length of childs of an specified edge.
    * @param {number} edge - edge index.
    */
  def getScopeOf(edge: scala.Double): scala.Double = js.native
  /**
    * Get siblings of specified edge.
    * @param {number} index - edge index.
    */
  def getSiblingsOf(index: scala.Double): js.Array[jugLib.VertexData] = js.native
  /**
    * Verify if the current node is the root.
    */
  def isRoot(): scala.Boolean = js.native
  /**
    * Verify the level.
    */
  def level(): scala.Double = js.native
  /**
    * Get distance between nodes.
    * @param from
    * @param to
    */
  def proximity(from: java.lang.String, to: java.lang.String): js.Array[scala.Double] = js.native
  /**
    * Seed node.
    * @param [data] - created vertex UserData.
    */
  def seed(): Vertex = js.native
  def seed(data: jugLib.VertexData): Vertex = js.native
}

