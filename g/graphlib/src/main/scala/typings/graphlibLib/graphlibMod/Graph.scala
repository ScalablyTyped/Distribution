package typings
package graphlibLib.graphlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphlib", "Graph")
@js.native
class Graph () extends js.Object {
  def this(options: GraphOptions) = this()
  /**
  		 * Gets list of direct children of node v.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - node to get children of.
  		 * @returns children nodes names list.
  		 */
  def children(v: java.lang.String): js.Array[java.lang.String] = js.native
  /**
  		 * Gets the label for the specified edge.
  		 * Complexity: O(1).
  		 * 
  		 * @argument edge - edge descriptor.
  		 * @returns value associated with specified edge.
  		*/
  def edge(e: Edge): js.Any = js.native
  /**
  		 * Gets the label for the specified edge.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument name - name of the edge (actual for multigraph).
  		 * @returns value associated with specified edge.
  		*/
  def edge(v: java.lang.String, w: java.lang.String): js.Any = js.native
  /**
  		 * Gets the label for the specified edge.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument name - name of the edge (actual for multigraph).
  		 * @returns value associated with specified edge.
  		*/
  def edge(v: java.lang.String, w: java.lang.String, name: java.lang.String): js.Any = js.native
  /**
  		 * Gets the number of edges in the graph.
  		 * Complexity: O(1).
  		 * 
  		 * @returns edges count.
  		 */
  def edgeCount(): scala.Double = js.native
  /**
  		 * Gets edges of the graph. In case of compound graph subgraphs are not considered.
  		 * Complexity: O(|E|).
  		 * 
  		 * @return graph edges list.
  		 */
  def edges(): js.Array[Edge] = js.native
  /**
  		 * Creates new graph with nodes filtered via filter. Edges incident to rejected node
  		 * are also removed. In case of compound graph, if parent is rejected by filter,
  		 * than all its children are rejected too.
  		 * Average-case complexity: O(|E|+|V|).
  		 * 
  		 * @argument filter - filtration function detecting whether the node should stay or not.
  		 * @returns new graph made from current and nodes filtered.
  		 */
  def filterNodes(filter: js.Function1[/* v */ java.lang.String, scala.Boolean]): Graph = js.native
  /**
  		 * Gets the graph label.
  		 * 
  		 * @returns currently assigned label for the graph or undefined if no label assigned.
  		 */
  def graph(): scala.Unit | java.lang.String = js.native
  /**
  		 * Detects whether the graph contains specified edge or not. No subgraphs are considered.
  		 * Complexity: O(1).
  		 * 
  		 * @argument edge - edge descriptor.
  		 * @returns whether the graph contains the specified edge or not.
  		 */
  def hasEdge(edge: Edge): scala.Boolean = js.native
  /**
  		 * Detects whether the graph contains specified edge or not. No subgraphs are considered.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument name - name of the edge (actual for multigraph).
  		 * @returns whether the graph contains the specified edge or not.
  		 */
  def hasEdge(v: java.lang.String, w: java.lang.String): scala.Boolean = js.native
  /**
  		 * Detects whether the graph contains specified edge or not. No subgraphs are considered.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument name - name of the edge (actual for multigraph).
  		 * @returns whether the graph contains the specified edge or not.
  		 */
  def hasEdge(v: java.lang.String, w: java.lang.String, name: java.lang.String): scala.Boolean = js.native
  /**
  		 * Detects whether graph has a node with specified name or not.
  		 
  		 * 
  		 * @argument name - name of the node.
  		 * @returns true if graph has node with specified name, false - otherwise.
  		 */
  def hasNode(name: java.lang.String): scala.Boolean = js.native
  /**
  		 * Return all edges that point to the node v. Optionally filters those edges down to just those
  		 * coming from node u. Behavior is undefined for undirected graphs - use nodeEdges instead.
  		 * Complexity: O(|E|).
  		 * 
  		 * @argument v - edge sink node.
  		 * @argument w - edge source node.
  		 * @returns edges descriptors list if v is in the graph, or undefined otherwise.
  		 */
  def inEdges(v: java.lang.String): scala.Unit | js.Array[Edge] = js.native
  /**
  		 * Return all edges that point to the node v. Optionally filters those edges down to just those
  		 * coming from node u. Behavior is undefined for undirected graphs - use nodeEdges instead.
  		 * Complexity: O(|E|).
  		 * 
  		 * @argument v - edge sink node.
  		 * @argument w - edge source node.
  		 * @returns edges descriptors list if v is in the graph, or undefined otherwise.
  		 */
  def inEdges(v: java.lang.String, w: java.lang.String): scala.Unit | js.Array[Edge] = js.native
  /**
  		 * Whether graph was created with 'compound' flag set to true or not.
  		 * 
  		 * @returns whether a node of the graph can have subnodes.
  		 */
  def isCompound(): scala.Boolean = js.native
  /**
  		 * Whether graph was created with 'directed' flag set to true or not.
  		 * 
  		 * @returns whether the graph edges have an orientation.
  		 */
  def isDirected(): scala.Boolean = js.native
  /**
  		 * Whether graph was created with 'multigraph' flag set to true or not.
  		 * 
  		 * @returns whether the pair of nodes of the graph can have multiple edges.
  		 */
  def isMultigraph(): scala.Boolean = js.native
  /**
  		 * Return all nodes that are predecessors or successors of the specified node or undefined if
  		 * node v is not in the graph.
  		 * Complexity: O(|V|).
  		 * 
  		 * @argument v - node identifier.
  		 * @returns node identifiers list or undefined if v is not in the graph.
  		 */
  
  def neighbors(v: java.lang.String): scala.Unit | js.Array[java.lang.String] = js.native
  /**
  		 * Gets the label of node with specified name.
  		 * Complexity: O(|V|).
  		 * 
  		 * @returns label value of the node.
  		 */
  def node(name: java.lang.String): js.Any = js.native
  /**
  		 * Gets the number of nodes in the graph.
  		 * Complexity: O(1).
  		 * 
  		 * @returns nodes count.
  		 */
  def nodeCount(): scala.Double = js.native
  /**
  		 * Returns all edges to or from node v regardless of direction. Optionally filters those edges
  		 * down to just those between nodes v and w regardless of direction.
  		 * Complexity: O(|E|).
  		 * 
  		 * @argument v - edge adjacent node.
  		 * @argument w - edge adjacent node.
  		 * @returns edges descriptors list if v is in the graph, or undefined otherwise.
  		 */
  def nodeEdges(v: java.lang.String): scala.Unit | js.Array[Edge] = js.native
  /**
  		 * Returns all edges to or from node v regardless of direction. Optionally filters those edges
  		 * down to just those between nodes v and w regardless of direction.
  		 * Complexity: O(|E|).
  		 * 
  		 * @argument v - edge adjacent node.
  		 * @argument w - edge adjacent node.
  		 * @returns edges descriptors list if v is in the graph, or undefined otherwise.
  		 */
  def nodeEdges(v: java.lang.String, w: java.lang.String): scala.Unit | js.Array[Edge] = js.native
  /**
  		 * Gets all nodes of the graph. Note, the in case of compound graph subnodes are
  		 * not included in list.
  		 * Complexity: O(1).
  		 * 
  		 * @returns list of graph nodes.
  		 */
  def nodes(): js.Array[java.lang.String] = js.native
  /**
  		 * Return all edges that are pointed at by node v. Optionally filters those edges down to just
  		 * those point to w. Behavior is undefined for undirected graphs - use nodeEdges instead.
  		 * Complexity: O(|E|).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @returns edges descriptors list if v is in the graph, or undefined otherwise.
  		 */
  def outEdges(v: java.lang.String): scala.Unit | js.Array[Edge] = js.native
  /**
  		 * Return all edges that are pointed at by node v. Optionally filters those edges down to just
  		 * those point to w. Behavior is undefined for undirected graphs - use nodeEdges instead.
  		 * Complexity: O(|E|).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @returns edges descriptors list if v is in the graph, or undefined otherwise.
  		 */
  def outEdges(v: java.lang.String, w: java.lang.String): scala.Unit | js.Array[Edge] = js.native
  /**
  		 * Gets parent node for node v.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - node to get parent of.
  		 * @returns parent node name or void if v has no parent.
  		 */
  def parent(v: java.lang.String): java.lang.String | scala.Unit = js.native
  /**
  		 * Return all nodes that are predecessors of the specified node or undefined if node v is not in
  		 * the graph. Behavior is undefined for undirected graphs - use neighbors instead.
  		 * Complexity: O(|V|).
  		 * 
  		 * @argument v - node identifier.
  		 * @returns node identifiers list or undefined if v is not in the graph.
  		 */
  def predecessors(v: java.lang.String): scala.Unit | js.Array[java.lang.String] = js.native
  /**
  		 * Removes the specified edge from the graph. No subgraphs are considered.
  		 * Complexity: O(1).
  		 * 
  		 * @argument edge - edge descriptor.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def removeEdge(edge: Edge): Graph = js.native
  /**
  		 * Removes the specified edge from the graph. No subgraphs are considered.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument name - name of the edge (actual for multigraph).
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def removeEdge(v: java.lang.String, w: java.lang.String): Graph = js.native
  /**
  		 * Removes the specified edge from the graph. No subgraphs are considered.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument name - name of the edge (actual for multigraph).
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def removeEdge(v: java.lang.String, w: java.lang.String, name: java.lang.String): Graph = js.native
  /**
  		 * Remove the node with the name from the graph or do nothing if the node is not in
  		 * the graph. If the node was removed this function also removes any incident
  		 * edges.
  		 * Complexity: O(1).
  		 *
  		 * @argument name - name of the node.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def removeNode(name: java.lang.String): Graph = js.native
  /**
  		 * Sets the default edge label factory function. This function will be invoked
  		 * each time when setting an edge with no label specified and returned value 
  		 * will be used as a label for edge.
  		 * Complexity: O(1).
  		 * 
  		 * @argument labelFn - default edge label factory function.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setDefaultEdgeLabel(labelFn: js.Function1[/* v */ java.lang.String, _]): Graph = js.native
  /**
  		 * Sets the default edge label. This label will be assigned as default label
  		 * in case if no label was specified while setting an edge.
  		 * Complexity: O(1).
  		 * 
  		 * @argument label - default edge label.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setDefaultEdgeLabel(label: js.Any): Graph = js.native
  /**
  		 * Sets the default node label factory function. This function will be invoked
  		 * each time when setting a node with no label specified and returned value 
  		 * will be used as a label for node.
  		 * Complexity: O(1).
  		 * 
  		 * @argument labelFn - default node label factory function.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setDefaultNodeLabel(labelFn: js.Function1[/* v */ java.lang.String, _]): Graph = js.native
  /**
  		 * Sets the default node label. This label will be assigned as default label
  		 * in case if no label was specified while setting a node.
  		 * Complexity: O(1).
  		 * 
  		 * @argument label - default node label.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setDefaultNodeLabel(label: js.Any): Graph = js.native
  /**
  		 * Creates or updates the label for the specified edge. If label is supplied it is 
  		 * set as the value for the edge. If label is not supplied and the edge was created 
  		 * by this call then the default edge label will be assigned. The name parameter is 
  		 * only useful with multigraphs.
  		 * Complexity: O(1).
  		 * 
  		 * @argument edge - edge descriptor.
  		 * @argument label - value to associate with the edge.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setEdge(edge: Edge): Graph = js.native
  /**
  		 * Creates or updates the label for the specified edge. If label is supplied it is 
  		 * set as the value for the edge. If label is not supplied and the edge was created 
  		 * by this call then the default edge label will be assigned. The name parameter is 
  		 * only useful with multigraphs.
  		 * Complexity: O(1).
  		 * 
  		 * @argument edge - edge descriptor.
  		 * @argument label - value to associate with the edge.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setEdge(edge: Edge, label: js.Any): Graph = js.native
  /**
  		 * Creates or updates the label for the edge (v, w) with the optionally supplied
  		 * name. If label is supplied it is set as the value for the edge. If label is not
  		 * supplied and the edge was created by this call then the default edge label will
  		 * be assigned. The name parameter is only useful with multigraphs.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument label - value to associate with the edge.
  		 * @argument name - unique name of the edge in order to identify it in multigraph.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setEdge(v: java.lang.String, w: java.lang.String): Graph = js.native
  /**
  		 * Creates or updates the label for the edge (v, w) with the optionally supplied
  		 * name. If label is supplied it is set as the value for the edge. If label is not
  		 * supplied and the edge was created by this call then the default edge label will
  		 * be assigned. The name parameter is only useful with multigraphs.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument label - value to associate with the edge.
  		 * @argument name - unique name of the edge in order to identify it in multigraph.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setEdge(v: java.lang.String, w: java.lang.String, label: js.Any): Graph = js.native
  /**
  		 * Creates or updates the label for the edge (v, w) with the optionally supplied
  		 * name. If label is supplied it is set as the value for the edge. If label is not
  		 * supplied and the edge was created by this call then the default edge label will
  		 * be assigned. The name parameter is only useful with multigraphs.
  		 * Complexity: O(1).
  		 * 
  		 * @argument v - edge source node.
  		 * @argument w - edge sink node.
  		 * @argument label - value to associate with the edge.
  		 * @argument name - unique name of the edge in order to identify it in multigraph.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setEdge(v: java.lang.String, w: java.lang.String, label: js.Any, name: java.lang.String): Graph = js.native
  /**
  		 * Sets the label of the graph.
  		 * 
  		 * @argument label - label value.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setGraph(label: java.lang.String): Graph = js.native
  /**
  		 * Creates or updates the value for the node v in the graph. If label is supplied
  		 * it is set as the value for the node. If label is not supplied and the node was
  		 * created by this call then the default node label will be assigned.
  		 * Complexity: O(1).
  		 * 
  		 * @argument name - node name.
  		 * @argument label - value to set for node.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setNode(name: java.lang.String): Graph = js.native
  /**
  		 * Creates or updates the value for the node v in the graph. If label is supplied
  		 * it is set as the value for the node. If label is not supplied and the node was
  		 * created by this call then the default node label will be assigned.
  		 * Complexity: O(1).
  		 * 
  		 * @argument name - node name.
  		 * @argument label - value to set for node.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setNode(name: java.lang.String, label: js.Any): Graph = js.native
  /**
  		 * Invokes setNode method for each node in names list.
  		 * Complexity: O(|names|).
  		 * 
  		 * @argument names - list of nodes names to be set.
  		 * @argument label - value to set for each node in list.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setNodes(names: js.Array[java.lang.String]): Graph = js.native
  /**
  		 * Invokes setNode method for each node in names list.
  		 * Complexity: O(|names|).
  		 * 
  		 * @argument names - list of nodes names to be set.
  		 * @argument label - value to set for each node in list.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setNodes(names: js.Array[java.lang.String], label: js.Any): Graph = js.native
  /**
  		 * Sets node p as a parent for node v if it is defined, or removes the
  		 * parent for v if p is undefined. Method throws an exception in case of
  		 * invoking it in context of noncompound graph.
  		 * Average-case complexity: O(1).
  		 * 
  		 * @argument v - node to be child for p.
  		 * @argument p - node to be parent for v.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setParent(v: java.lang.String): Graph = js.native
  /**
  		 * Sets node p as a parent for node v if it is defined, or removes the
  		 * parent for v if p is undefined. Method throws an exception in case of
  		 * invoking it in context of noncompound graph.
  		 * Average-case complexity: O(1).
  		 * 
  		 * @argument v - node to be child for p.
  		 * @argument p - node to be parent for v.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setParent(v: java.lang.String, p: java.lang.String): Graph = js.native
  /**
  		 * Establish an edges path over the nodes in nodes list. If some edge is already
  		 * exists, it will update its label, otherwise it will create an edge between pair
  		 * of nodes with label provided or default label if no label provided.
  		 * Complexity: O(|nodes|).
  		 * 
  		 * @argument nodes - list of nodes to be connected in series.
  		 * @argument label - value to set for each edge between pairs of nodes.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setPath(nodes: js.Array[java.lang.String]): Graph = js.native
  /**
  		 * Establish an edges path over the nodes in nodes list. If some edge is already
  		 * exists, it will update its label, otherwise it will create an edge between pair
  		 * of nodes with label provided or default label if no label provided.
  		 * Complexity: O(|nodes|).
  		 * 
  		 * @argument nodes - list of nodes to be connected in series.
  		 * @argument label - value to set for each edge between pairs of nodes.
  		 * @returns the graph, allowing this to be chained with other functions.
  		 */
  def setPath(nodes: js.Array[java.lang.String], label: js.Any): Graph = js.native
  /**
  		 * Gets list of nodes without out-edges.
  		 * Complexity: O(|V|).
  		 * 
  		 * @returns the graph source nodes.
  		 */
  def sinks(): js.Array[java.lang.String] = js.native
  /**
  		 * Gets list of nodes without in-edges.
  		 * Complexity: O(|V|).
  		 * 
  		 * @returns the graph source nodes.
  		 */
  def sources(): js.Array[java.lang.String] = js.native
  /**
  		 * Return all nodes that are successors of the specified node or undefined if node v is not in
  		 * the graph. Behavior is undefined for undirected graphs - use neighbors instead.
  		 * Complexity: O(|V|).
  		 * 
  		 * @argument v - node identifier.
  		 * @returns node identifiers list or undefined if v is not in the graph.
  		 */
  def successors(v: java.lang.String): scala.Unit | js.Array[java.lang.String] = js.native
}

