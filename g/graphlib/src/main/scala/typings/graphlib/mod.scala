package typings.graphlib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphlib", "Graph")
  @js.native
  class Graph () extends StObject {
    def this(options: GraphOptions) = this()
    
    /**
      * Gets list of direct children of node v.
      * Complexity: O(1).
      * 
      * @argument v - node to get children of.
      * @returns children nodes names list.
      */
    def children(): js.Array[String] = js.native
    def children(v: String): js.Array[String] = js.native
    
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
    def edge(v: String, w: String): js.Any = js.native
    def edge(v: String, w: String, name: String): js.Any = js.native
    
    /**
      * Gets the number of edges in the graph.
      * Complexity: O(1).
      * 
      * @returns edges count.
      */
    def edgeCount(): Double = js.native
    
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
    def filterNodes(filter: js.Function1[/* v */ String, Boolean]): Graph = js.native
    
    /**
      * Gets the graph label.
      * 
      * @returns currently assigned label for the graph or undefined if no label assigned.
      */
    def graph(): Unit | String = js.native
    
    /**
      * Detects whether the graph contains specified edge or not. No subgraphs are considered.
      * Complexity: O(1).
      * 
      * @argument edge - edge descriptor.
      * @returns whether the graph contains the specified edge or not.
      */
    def hasEdge(edge: Edge): Boolean = js.native
    /**
      * Detects whether the graph contains specified edge or not. No subgraphs are considered.
      * Complexity: O(1).
      * 
      * @argument v - edge source node.
      * @argument w - edge sink node.
      * @argument name - name of the edge (actual for multigraph).
      * @returns whether the graph contains the specified edge or not.
      */
    def hasEdge(v: String, w: String): Boolean = js.native
    def hasEdge(v: String, w: String, name: String): Boolean = js.native
    
    /**
      * Detects whether graph has a node with specified name or not.
      
      * 
      * @argument name - name of the node.
      * @returns true if graph has node with specified name, false - otherwise.
      */
    def hasNode(name: String): Boolean = js.native
    
    /**
      * Return all edges that point to the node v. Optionally filters those edges down to just those
      * coming from node u. Behavior is undefined for undirected graphs - use nodeEdges instead.
      * Complexity: O(|E|).
      * 
      * @argument v - edge sink node.
      * @argument w - edge source node.
      * @returns edges descriptors list if v is in the graph, or undefined otherwise.
      */
    def inEdges(v: String): Unit | js.Array[Edge] = js.native
    def inEdges(v: String, w: String): Unit | js.Array[Edge] = js.native
    
    /**
      * Whether graph was created with 'compound' flag set to true or not.
      * 
      * @returns whether a node of the graph can have subnodes.
      */
    def isCompound(): Boolean = js.native
    
    /**
      * Whether graph was created with 'directed' flag set to true or not.
      * 
      * @returns whether the graph edges have an orientation.
      */
    def isDirected(): Boolean = js.native
    
    /**
      * Whether graph was created with 'multigraph' flag set to true or not.
      * 
      * @returns whether the pair of nodes of the graph can have multiple edges.
      */
    def isMultigraph(): Boolean = js.native
    
    /**
      * Return all nodes that are predecessors or successors of the specified node or undefined if
      * node v is not in the graph.
      * Complexity: O(|V|).
      * 
      * @argument v - node identifier.
      * @returns node identifiers list or undefined if v is not in the graph.
      */
    def neighbors(v: String): Unit | js.Array[String] = js.native
    
    /**
      * Gets the label of node with specified name.
      * Complexity: O(|V|).
      * 
      * @returns label value of the node.
      */
    def node(name: String): js.Any = js.native
    
    /**
      * Gets the number of nodes in the graph.
      * Complexity: O(1).
      * 
      * @returns nodes count.
      */
    def nodeCount(): Double = js.native
    
    /**
      * Returns all edges to or from node v regardless of direction. Optionally filters those edges
      * down to just those between nodes v and w regardless of direction.
      * Complexity: O(|E|).
      * 
      * @argument v - edge adjacent node.
      * @argument w - edge adjacent node.
      * @returns edges descriptors list if v is in the graph, or undefined otherwise.
      */
    def nodeEdges(v: String): Unit | js.Array[Edge] = js.native
    def nodeEdges(v: String, w: String): Unit | js.Array[Edge] = js.native
    
    /**
      * Gets all nodes of the graph. Note, the in case of compound graph subnodes are
      * not included in list.
      * Complexity: O(1).
      * 
      * @returns list of graph nodes.
      */
    def nodes(): js.Array[String] = js.native
    
    /**
      * Return all edges that are pointed at by node v. Optionally filters those edges down to just
      * those point to w. Behavior is undefined for undirected graphs - use nodeEdges instead.
      * Complexity: O(|E|).
      * 
      * @argument v - edge source node.
      * @argument w - edge sink node.
      * @returns edges descriptors list if v is in the graph, or undefined otherwise.
      */
    def outEdges(v: String): Unit | js.Array[Edge] = js.native
    def outEdges(v: String, w: String): Unit | js.Array[Edge] = js.native
    
    /**
      * Gets parent node for node v.
      * Complexity: O(1).
      * 
      * @argument v - node to get parent of.
      * @returns parent node name or void if v has no parent.
      */
    def parent(v: String): String | Unit = js.native
    
    /**
      * Return all nodes that are predecessors of the specified node or undefined if node v is not in
      * the graph. Behavior is undefined for undirected graphs - use neighbors instead.
      * Complexity: O(|V|).
      * 
      * @argument v - node identifier.
      * @returns node identifiers list or undefined if v is not in the graph.
      */
    def predecessors(v: String): Unit | js.Array[String] = js.native
    
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
    def removeEdge(v: String, w: String): Graph = js.native
    def removeEdge(v: String, w: String, name: String): Graph = js.native
    
    /**
      * Remove the node with the name from the graph or do nothing if the node is not in
      * the graph. If the node was removed this function also removes any incident
      * edges.
      * Complexity: O(1).
      *
      * @argument name - name of the node.
      * @returns the graph, allowing this to be chained with other functions.
      */
    def removeNode(name: String): Graph = js.native
    
    /**
      * Sets the default edge label factory function. This function will be invoked
      * each time when setting an edge with no label specified and returned value 
      * will be used as a label for edge.
      * Complexity: O(1).
      * 
      * @argument labelFn - default edge label factory function.
      * @returns the graph, allowing this to be chained with other functions.
      */
    def setDefaultEdgeLabel(labelFn: js.Function1[/* v */ String, _]): Graph = js.native
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
    def setDefaultNodeLabel(labelFn: js.Function1[/* v */ String, _]): Graph = js.native
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
    def setEdge(v: String, w: String): Graph = js.native
    def setEdge(v: String, w: String, label: js.UndefOr[scala.Nothing], name: String): Graph = js.native
    def setEdge(v: String, w: String, label: js.Any): Graph = js.native
    def setEdge(v: String, w: String, label: js.Any, name: String): Graph = js.native
    
    /**
      * Sets the label of the graph.
      * 
      * @argument label - label value.
      * @returns the graph, allowing this to be chained with other functions.
      */
    def setGraph(label: js.Any): Graph = js.native
    
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
    def setNode(name: String): Graph = js.native
    def setNode(name: String, label: js.Any): Graph = js.native
    
    /**
      * Invokes setNode method for each node in names list.
      * Complexity: O(|names|).
      * 
      * @argument names - list of nodes names to be set.
      * @argument label - value to set for each node in list.
      * @returns the graph, allowing this to be chained with other functions.
      */
    def setNodes(names: js.Array[String]): Graph = js.native
    def setNodes(names: js.Array[String], label: js.Any): Graph = js.native
    
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
    def setParent(v: String): Graph = js.native
    def setParent(v: String, p: String): Graph = js.native
    
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
    def setPath(nodes: js.Array[String]): Graph = js.native
    def setPath(nodes: js.Array[String], label: js.Any): Graph = js.native
    
    /**
      * Gets list of nodes without out-edges.
      * Complexity: O(|V|).
      * 
      * @returns the graph source nodes.
      */
    def sinks(): js.Array[String] = js.native
    
    /**
      * Gets list of nodes without in-edges.
      * Complexity: O(|V|).
      * 
      * @returns the graph source nodes.
      */
    def sources(): js.Array[String] = js.native
    
    /**
      * Return all nodes that are successors of the specified node or undefined if node v is not in
      * the graph. Behavior is undefined for undirected graphs - use neighbors instead.
      * Complexity: O(|V|).
      * 
      * @argument v - node identifier.
      * @returns node identifiers list or undefined if v is not in the graph.
      */
    def successors(v: String): Unit | js.Array[String] = js.native
  }
  
  object alg {
    
    /**
      * Finds all connected components in a graph and returns an array of these components.
      * Each component is itself an array that contains the ids of nodes in the component.
      * Complexity: O(|V|).
      * 
      * @argument graph - graph to find components in.
      * @returns array of nodes list representing components
      */
    @JSImport("graphlib", "alg.components")
    @js.native
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
    @JSImport("graphlib", "alg.dijkstra")
    @js.native
    def dijkstra(graph: Graph, source: String): StringDictionary[Path] = js.native
    @JSImport("graphlib", "alg.dijkstra")
    @js.native
    def dijkstra(
      graph: Graph,
      source: String,
      weightFn: js.UndefOr[scala.Nothing],
      edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
    ): StringDictionary[Path] = js.native
    @JSImport("graphlib", "alg.dijkstra")
    @js.native
    def dijkstra(graph: Graph, source: String, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[Path] = js.native
    @JSImport("graphlib", "alg.dijkstra")
    @js.native
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
    @JSImport("graphlib", "alg.dijkstraAll")
    @js.native
    def dijkstraAll(graph: Graph): StringDictionary[StringDictionary[Path]] = js.native
    @JSImport("graphlib", "alg.dijkstraAll")
    @js.native
    def dijkstraAll(
      graph: Graph,
      weightFn: js.UndefOr[scala.Nothing],
      edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
    ): StringDictionary[StringDictionary[Path]] = js.native
    @JSImport("graphlib", "alg.dijkstraAll")
    @js.native
    def dijkstraAll(graph: Graph, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[StringDictionary[Path]] = js.native
    @JSImport("graphlib", "alg.dijkstraAll")
    @js.native
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
    @JSImport("graphlib", "alg.findCycles")
    @js.native
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
    @JSImport("graphlib", "alg.floydWarshall")
    @js.native
    def floydWarshall(graph: Graph): StringDictionary[StringDictionary[Path]] = js.native
    @JSImport("graphlib", "alg.floydWarshall")
    @js.native
    def floydWarshall(
      graph: Graph,
      weightFn: js.UndefOr[scala.Nothing],
      edgeFn: js.Function1[/* v */ String, js.Array[Edge]]
    ): StringDictionary[StringDictionary[Path]] = js.native
    @JSImport("graphlib", "alg.floydWarshall")
    @js.native
    def floydWarshall(graph: Graph, weightFn: js.Function1[/* e */ Edge, Double]): StringDictionary[StringDictionary[Path]] = js.native
    @JSImport("graphlib", "alg.floydWarshall")
    @js.native
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
    @JSImport("graphlib", "alg.isAcyclic")
    @js.native
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
    @JSImport("graphlib", "alg.postorder")
    @js.native
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
    @JSImport("graphlib", "alg.preorder")
    @js.native
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
    @JSImport("graphlib", "alg.prim")
    @js.native
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
    @JSImport("graphlib", "alg.tarjan")
    @js.native
    def tarjan(graph: Graph): js.Array[js.Array[String]] = js.native
    
    /**
      * Given a Graph graph this function applies topological sorting to it.
      * If the graph has a cycle it is impossible to generate such a list and CycleException is thrown.
      * Complexity: O(|V| + |E|).
      * 
      * @argument graph - graph to apply topological sorting to.
      * @returns an array of nodes such that for each edge u -> v, u appears before v in the array.
      */
    @JSImport("graphlib", "alg.topsort")
    @js.native
    def topsort(graph: Graph): js.Array[String] = js.native
  }
  
  object json {
    
    /**
      * Takes JSON as input and returns the graph representation.
      *
      * @example
      * var g2 = graphlib.json.read(JSON.parse(str));
      * g2.nodes();
      * // ['a', 'b']
      * g2.edges()
      * // [ { v: 'a', w: 'b' } ]
      * 
      * @argument json - JSON serializable graph representation
      * @returns graph constructed acccording to specified representation
      */
    @JSImport("graphlib", "json.read")
    @js.native
    def read(json: js.Object): Graph = js.native
    
    /**
      * Creates a JSON representation of the graph that can be serialized to a string with
      * JSON.stringify. The graph can later be restored using json.read.
      * 
      * @argument graph - target to create JSON representation of.
      * @returns JSON serializable graph representation
      */
    @JSImport("graphlib", "json.write")
    @js.native
    def write(graph: Graph): js.Object = js.native
  }
  
  @js.native
  trait Edge extends StObject {
    
    /** The name that uniquely identifies a multi-edge. */
    var name: js.UndefOr[String] = js.native
    
    var v: String = js.native
    
    var w: String = js.native
  }
  object Edge {
    
    @scala.inline
    def apply(v: String, w: String): Edge = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edge]
    }
    
    @scala.inline
    implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GraphOptions extends StObject {
    
    // default: false.
    var compound: js.UndefOr[Boolean] = js.native
    
    var directed: js.UndefOr[Boolean] = js.native
    
    // default: true.
    var multigraph: js.UndefOr[Boolean] = js.native
  }
  object GraphOptions {
    
    @scala.inline
    def apply(): GraphOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphOptions]
    }
    
    @scala.inline
    implicit class GraphOptionsMutableBuilder[Self <: GraphOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      @scala.inline
      def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
      
      @scala.inline
      def setMultigraph(value: Boolean): Self = StObject.set(x, "multigraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultigraphUndefined: Self = StObject.set(x, "multigraph", js.undefined)
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var distance: Double = js.native
    
    var predecessor: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(distance: Double, predecessor: String): Path = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], predecessor = predecessor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredecessor(value: String): Self = StObject.set(x, "predecessor", value.asInstanceOf[js.Any])
    }
  }
}
