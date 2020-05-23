package typings.graphlib.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphlib", "alg")
@js.native
object alg extends js.Object {
  /**
    * Finds all connected components in a graph and returns an array of these components.
    * Each component is itself an array that contains the ids of nodes in the component.
    * Complexity: O(|V|).
    * 
    * @argument graph - graph to find components in.
    * @returns array of nodes list representing components
    */
  def components(graph: Graph): js.Array[js.Array[String]] = js.native
  /**
    * This function is an implementation of Dijkstra's algorithm which finds the shortest
    * path from source to all other nodes in graph. This function returns a map of
    * v -> { distance, predecessor }. The distance property holds the sum of the weights
    * from source to v along the shortest path or Number.POSITIVE_INFINITY if there is no path
    * from source. The predecessor property can be used to walk the individual elements of the
    * path from source to v in reverse order.
    * Complexity: O((|E| + |V|) * log |V|).
    *
    * @argument graph - graph where to search pathes.
    * @argument source - node to start pathes from.
    * @argument weightFn - function which takes edge e and returns the weight of it. If no weightFn
    * is supplied then each edge is assumed to have a weight of 1. This function throws an
    * Error if any of the traversed edges have a negative edge weight.
    * @argument edgeFn - function which takes a node v and returns the ids of all edges incident to it
    * for the purposes of shortest path traversal. By default this function uses the graph.outEdges.
    * @returns shortest pathes map that starts from node source
    */
  def dijkstra(graph: Graph, source: String): StringDictionary[Path] = js.native
  def dijkstra(graph: Graph, source: String, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[Path] = js.native
  def dijkstra(
    graph: Graph,
    source: String,
    weightFn: js.Function1[/* e */ Edge, Double],
    edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
  ): StringDictionary[Path] = js.native
  /**
    * This function finds the shortest path from each node to every other reachable node in
    * the graph. It is similar to alg.dijkstra, but instead of returning a single-source
    * array, it returns a mapping of source -> alg.dijksta(g, source, weightFn, edgeFn).
    * Complexity: O(|V| * (|E| + |V|) * log |V|).
    *
    * @argument graph - graph where to search pathes.
    * @argument weightFn - function which takes edge e and returns the weight of it. If no weightFn
    * is supplied then each edge is assumed to have a weight of 1. This function throws an
    * Error if any of the traversed edges have a negative edge weight.
    * @argument edgeFn - function which takes a node v and returns the ids of all edges incident to it
    * for the purposes of shortest path traversal. By default this function uses the graph.outEdges.
    * @returns shortest pathes map.
    */
  def dijkstraAll(graph: Graph): StringDictionary[StringDictionary[Path]] = js.native
  def dijkstraAll(graph: Graph, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[StringDictionary[Path]] = js.native
  def dijkstraAll(
    graph: Graph,
    weightFn: js.Function1[/* e */ Edge, Double],
    edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
  ): StringDictionary[StringDictionary[Path]] = js.native
  /**
    * Given a Graph, graph, this function returns all nodes that are part of a cycle. As there
    * may be more than one cycle in a graph this function return an array of these cycles,
    * where each cycle is itself represented by an array of ids for each node involved in
    * that cycle. Method alg.isAcyclic is more efficient if you only need to determine whether a graph has a
    * cycle or not.
    * Complexity: O(|V| + |E|).
    * 
    * @argument graph - graph where to search cycles.
    * @returns cycles list.
    */
  def findCycles(graph: Graph): js.Array[js.Array[String]] = js.native
  /**
    * This function is an implementation of the Floyd-Warshall algorithm, which finds the
    * shortest path from each node to every other reachable node in the graph. It is similar
    * to alg.dijkstraAll, but it handles negative edge weights and is more efficient for some types
    * of graphs. This function returns a map of source -> { target -> { distance, predecessor }.
    * The distance property holds the sum of the weights from source to target along the shortest
    * path of Number.POSITIVE_INFINITY if there is no path from source. The predecessor property
    * can be used to walk the individual elements of the path from source to target in reverse
    * order.
    * Complexity: O(|V|^3).
    *
    * @argument graph - graph where to search pathes.
    * @argument weightFn - function which takes edge e and returns the weight of it. If no weightFn
    * is supplied then each edge is assumed to have a weight of 1. This function throws an
    * Error if any of the traversed edges have a negative edge weight.
    * @argument edgeFn - function which takes a node v and returns the ids of all edges incident to it
    * for the purposes of shortest path traversal. By default this function uses the graph.outEdges.
    * @returns shortest pathes map.
    */
  def floydWarshall(graph: Graph): StringDictionary[StringDictionary[Path]] = js.native
  def floydWarshall(graph: Graph, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[StringDictionary[Path]] = js.native
  def floydWarshall(
    graph: Graph,
    weightFn: js.Function1[/* e */ Edge, Double],
    edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
  ): StringDictionary[StringDictionary[Path]] = js.native
  /**
    * Given a Graph, graph, this function returns true if the graph has no cycles and returns false if it
    * does. This algorithm returns as soon as it detects the first cycle. You can use alg.findCycles
    * to get the actual list of cycles in the graph.
    * 
    * @argument graph - graph to detect whether it acyclic ot not.
    * @returns whether graph contain cycles or not.
    */
  def isAcyclic(graph: Graph): Boolean = js.native
  /**
    * Performs post-order depth first traversal on the input graph. If the graph is
    * undirected then this algorithm will navigate using neighbors. If the graph
    * is directed then this algorithm will navigate using successors.
    * 
    * @argument graph - depth first traversal target.
    * @argument vs - nodes list to traverse.
    * @returns the nodes in the order they were visited as a list of their names.
    */
  def postorder(graph: Graph, vs: js.Array[String]): js.Array[String] = js.native
  /**
    * Performs pre-order depth first traversal on the input graph. If the graph is
    * undirected then this algorithm will navigate using neighbors. If the graph
    * is directed then this algorithm will navigate using successors.
    * 
    * @argument graph - depth first traversal target.
    * @argument vs - nodes list to traverse.
    * @returns the nodes in the order they were visited as a list of their names.
    */
  def preorder(graph: Graph, vs: js.Array[String]): js.Array[String] = js.native
  /**
    * Prim's algorithm takes a connected undirected graph and generates a minimum spanning tree. This
    * function returns the minimum spanning tree as an undirected graph. This algorithm is derived
    * from the description in "Introduction to Algorithms", Third Edition, Cormen, et al., Pg 634.
    * Complexity: O(|E| * log |V|);
    *
    * @argument graph - graph to generate a minimum spanning tree of.
    * @argument weightFn - function which takes edge e and returns the weight of it. It throws an Error if
    *           the graph is not connected.
    * @returns minimum spanning tree of graph.
    */
  def prim(graph: Graph, weightFn: js.Function1[/* e */ Edge, Double]): Graph = js.native
  /**
    * This function is an implementation of Tarjan's algorithm which finds all strongly connected
    * components in the directed graph g. Each strongly connected component is composed of nodes that
    * can reach all other nodes in the component via directed edges. A strongly connected component
    * can consist of a single node if that node cannot both reach and be reached by any other
    * specific node in the graph. Components of more than one node are guaranteed to have at least
    * one cycle.
    * Complexity: O(|V| + |E|).
    *
    * @argument graph - graph to find all strongly connected components of.
    * @return  an array of components. Each component is itself an array that contains
    *          the ids of all nodes in the component.
    */
  def tarjan(graph: Graph): js.Array[js.Array[String]] = js.native
  /**
    * Given a Graph graph this function applies topological sorting to it.
    * If the graph has a cycle it is impossible to generate such a list and CycleException is thrown.
    * Complexity: O(|V| + |E|).
    * 
    * @argument graph - graph to apply topological sorting to.
    * @returns an array of nodes such that for each edge u -> v, u appears before v in the array.
    */
  def topsort(graph: Graph): js.Array[String] = js.native
}

