package typings.jsGraphAlgorithms

import typings.jsGraphAlgorithms.JsGraphs.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-graph-algorithms", "BellmanFord")
  @js.native
  class BellmanFord protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.BellmanFord {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
    
    /* private */ /* CompleteClass */
    var cost: js.Any = js.native
    
    /* CompleteClass */
    override def distanceTo(v: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var edgeTo: js.Any = js.native
    
    /* CompleteClass */
    override def hasPathTo(v: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def pathTo(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* CompleteClass */
    override def relax(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "BreadthFirstSearch")
  @js.native
  class BreadthFirstSearch protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.BreadthFirstSearch {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
    
    /* private */ /* CompleteClass */
    var V: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var edgeTo: js.Any = js.native
    
    /* CompleteClass */
    override def hasPathTo(v: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def pathTo(v: Double): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "ConnectedComponents")
  @js.native
  class ConnectedComponents protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.ConnectedComponents {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph) = this()
    
    /* CompleteClass */
    override def componentCount(): Double = js.native
    
    /* CompleteClass */
    override def componentId(v: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var count: js.Any = js.native
    
    /* CompleteClass */
    override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.Graph, v: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var id: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "DepthFirstSearch")
  @js.native
  class DepthFirstSearch[T] protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.DepthFirstSearch[T] {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
    
    /* CompleteClass */
    override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.Graph, v: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var edgeTo: js.Any = js.native
    
    /* CompleteClass */
    override def hasPathTo(v: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def pathTo(v: Double): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "DiGraph")
  @js.native
  class DiGraph protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.DiGraph {
    def this(V: Double) = this()
    
    /* CompleteClass */
    var V: Double = js.native
    
    /* CompleteClass */
    override def addEdge(v: Double, w: Double): Unit = js.native
    
    /* CompleteClass */
    override def adj(v: Double): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var adjList: js.Any = js.native
    
    /* CompleteClass */
    override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
    
    /* private */ /* CompleteClass */
    var edges: js.Any = js.native
    
    /* CompleteClass */
    override def node(v: Double): Node = js.native
    
    /* private */ /* CompleteClass */
    var nodeInfo: js.Any = js.native
    
    /* CompleteClass */
    override def reverse(): typings.jsGraphAlgorithms.JsGraphs.DiGraph = js.native
  }
  
  @JSImport("js-graph-algorithms", "Dijkstra")
  @js.native
  class Dijkstra protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.Dijkstra {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
    
    /* private */ /* CompleteClass */
    var cost: js.Any = js.native
    
    /* CompleteClass */
    override def distanceTo(v: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var edgeTo: js.Any = js.native
    
    /* CompleteClass */
    override def hasPathTo(v: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def pathTo(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* private */ /* CompleteClass */
    var pq: js.Any = js.native
    
    /* CompleteClass */
    override def relax(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "EagerPrimMST")
  @js.native
  class EagerPrimMST protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.EagerPrimMST {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    var mst: js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* private */ /* CompleteClass */
    var pq: js.Any = js.native
    
    /* CompleteClass */
    override def visit(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, v: Double): Unit = js.native
  }
  
  @JSImport("js-graph-algorithms", "Edge")
  @js.native
  class Edge protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.Edge {
    def this(v: Double, w: Double, weight: Double) = this()
    
    /* CompleteClass */
    override def either(): Double = js.native
    
    /* CompleteClass */
    override def from(): Double = js.native
    
    /* CompleteClass */
    override def other(x: Double): Double = js.native
    
    /* CompleteClass */
    override def to(): Double = js.native
    
    /* private */ /* CompleteClass */
    var v: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var w: js.Any = js.native
    
    /* CompleteClass */
    var weight: Double = js.native
  }
  
  @JSImport("js-graph-algorithms", "FlowEdge")
  @js.native
  class FlowEdge protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.FlowEdge {
    def this(v: Double, w: Double, capacity: Double) = this()
    
    /* CompleteClass */
    override def addResidualFlowTo(x: Double, deltaFlow: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var capacity: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var flow: js.Any = js.native
    
    /* CompleteClass */
    override def from(): Double = js.native
    
    /* CompleteClass */
    override def other(x: Double): Double = js.native
    
    /* CompleteClass */
    override def residualCapacityTo(x: Double): Double = js.native
    
    /* CompleteClass */
    override def to(): Double = js.native
    
    /* private */ /* CompleteClass */
    var v: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var w: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "FlowNetwork")
  @js.native
  class FlowNetwork protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.FlowNetwork {
    def this(V: Double) = this()
    
    /* CompleteClass */
    var V: Double = js.native
    
    /* CompleteClass */
    override def addEdge(e: typings.jsGraphAlgorithms.JsGraphs.FlowEdge): Unit = js.native
    
    /* CompleteClass */
    override def adj(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.FlowEdge] = js.native
    
    /* private */ /* CompleteClass */
    var adjList: js.Any = js.native
    
    /* CompleteClass */
    override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.FlowEdge | Null = js.native
    
    /* CompleteClass */
    override def node(v: Double): Node = js.native
    
    /* private */ /* CompleteClass */
    var nodeInfo: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "FordFulkerson")
  @js.native
  class FordFulkerson protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.FordFulkerson {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.FlowNetwork, s: Double, t: Double) = this()
    
    /* private */ /* CompleteClass */
    var edgeTo: js.Any = js.native
    
    /* CompleteClass */
    override def hasAugmentedPath(G: typings.jsGraphAlgorithms.JsGraphs.FlowNetwork): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def minCut(G: typings.jsGraphAlgorithms.JsGraphs.FlowNetwork): js.Array[typings.jsGraphAlgorithms.JsGraphs.FlowEdge] = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var t: js.Any = js.native
    
    /* CompleteClass */
    var value: Double = js.native
  }
  
  @JSImport("js-graph-algorithms", "Graph")
  @js.native
  class Graph protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.Graph {
    def this(V: Double) = this()
    
    /* CompleteClass */
    var V: Double = js.native
    
    /* CompleteClass */
    override def addEdge(v: Double, w: Double): Unit = js.native
    
    /* CompleteClass */
    override def adj(v: Double): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var adjList: js.Any = js.native
    
    /* CompleteClass */
    override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
    
    /* private */ /* CompleteClass */
    var edges: js.Any = js.native
    
    /* CompleteClass */
    override def node(v: Double): Node = js.native
    
    /* private */ /* CompleteClass */
    var nodeInfo: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "IndexMinPQ")
  @js.native
  class IndexMinPQ[T] protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.IndexMinPQ[T] {
    def this(N: Double) = this()
    def this(N: Double, compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
    
    /* private */ /* CompleteClass */
    var N: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var compare: js.Any = js.native
    
    /* CompleteClass */
    override def containsIndex(index: Double): Boolean = js.native
    
    /* CompleteClass */
    override def decreaseKey(index: Double, key: T): Unit = js.native
    
    /* CompleteClass */
    override def delMin(): Double = js.native
    
    /* CompleteClass */
    override def insert(index: Double, key: T): Unit = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var keys: js.Any = js.native
    
    /* CompleteClass */
    override def min(): Double = js.native
    
    /* CompleteClass */
    override def minKey(): T | Null = js.native
    
    /* private */ /* CompleteClass */
    var pq: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var qp: js.Any = js.native
    
    /* CompleteClass */
    override def sink(k: Double): Unit = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
    
    /* CompleteClass */
    override def swim(k: Double): Unit = js.native
  }
  
  @JSImport("js-graph-algorithms", "KruskalMST")
  @js.native
  class KruskalMST protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.KruskalMST {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
    
    /* CompleteClass */
    var mst: js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
  }
  
  @JSImport("js-graph-algorithms", "LazyPrimMST")
  @js.native
  class LazyPrimMST protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.LazyPrimMST {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    var mst: js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* private */ /* CompleteClass */
    var pq: js.Any = js.native
    
    /* CompleteClass */
    override def visit(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, v: Double): Unit = js.native
  }
  
  @JSImport("js-graph-algorithms", "MinPQ")
  @js.native
  class MinPQ[T] ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.MinPQ[T] {
    def this(compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
    
    /* private */ /* CompleteClass */
    var N: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var compare: js.Any = js.native
    
    /* CompleteClass */
    override def delMin(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def enqueue(item: T): Unit = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
    
    /* CompleteClass */
    override def sink(k: Double): Unit = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
    
    /* CompleteClass */
    override def swim(k: Double): Unit = js.native
  }
  
  @JSImport("js-graph-algorithms", "Queue")
  @js.native
  class Queue[T] ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.Queue[T] {
    
    /* private */ /* CompleteClass */
    var N: js.Any = js.native
    
    /* CompleteClass */
    override def dequeue(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def enqueue(item: T): Unit = js.native
    
    /* private */ /* CompleteClass */
    var first: js.Any = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var last: js.Any = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[T] = js.native
  }
  
  @JSImport("js-graph-algorithms", "QueueNode")
  @js.native
  class QueueNode[T] protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.QueueNode[T] {
    def this(a: T) = this()
    
    /* CompleteClass */
    var next: typings.jsGraphAlgorithms.JsGraphs.QueueNode[T] | Null = js.native
    
    /* CompleteClass */
    var value: T = js.native
  }
  
  @JSImport("js-graph-algorithms", "QuickUnion")
  @js.native
  class QuickUnion protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.QuickUnion {
    def this(V: Double) = this()
    
    /* CompleteClass */
    override def connected(v: Double, w: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var id: js.Any = js.native
    
    /* CompleteClass */
    override def root(q: Double): Double = js.native
    
    /* CompleteClass */
    override def union(v: Double, w: Double): Unit = js.native
  }
  
  @JSImport("js-graph-algorithms", "Stack")
  @js.native
  class Stack[T] ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.Stack[T]
  
  @JSImport("js-graph-algorithms", "StackNode")
  @js.native
  class StackNode[T] protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.StackNode[T] {
    def this(value: T) = this()
    
    /* CompleteClass */
    var next: typings.jsGraphAlgorithms.JsGraphs.StackNode[T] | Null = js.native
    
    /* CompleteClass */
    var value: T = js.native
  }
  
  @JSImport("js-graph-algorithms", "StronglyConnectedComponents")
  @js.native
  class StronglyConnectedComponents protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.StronglyConnectedComponents {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
    
    /* CompleteClass */
    override def componentCount(): Double = js.native
    
    /* CompleteClass */
    override def componentId(v: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var count: js.Any = js.native
    
    /* CompleteClass */
    override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph, v: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var id: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "TopologicalSort")
  @js.native
  class TopologicalSort protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.TopologicalSort {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
    
    /* CompleteClass */
    override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph, v: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def order(): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var postOrder: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "TopologicalSortShortestPaths")
  @js.native
  class TopologicalSortShortestPaths protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.TopologicalSortShortestPaths {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph, s: Double) = this()
    
    /* private */ /* CompleteClass */
    var cost: js.Any = js.native
    
    /* CompleteClass */
    override def distanceTo(v: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var edgeTo: js.Any = js.native
    
    /* CompleteClass */
    override def hasPathTo(v: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var marked: js.Any = js.native
    
    /* CompleteClass */
    override def pathTo(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* CompleteClass */
    override def relax(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
    
    /* private */ /* CompleteClass */
    var s: js.Any = js.native
  }
  
  @JSImport("js-graph-algorithms", "WeightedDiGraph")
  @js.native
  class WeightedDiGraph ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph {
    
    /* CompleteClass */
    var V: Double = js.native
    
    /* CompleteClass */
    override def addEdge(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
    
    /* CompleteClass */
    override def adj(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* protected */ /* CompleteClass */
    var adjList: js.Array[js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge]] = js.native
    
    /* CompleteClass */
    override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
    
    /* CompleteClass */
    override def node(v: Double): Node = js.native
    
    /* private */ /* CompleteClass */
    var nodeInfo: js.Any = js.native
    
    /* CompleteClass */
    override def toDiGraph(): typings.jsGraphAlgorithms.JsGraphs.DiGraph = js.native
  }
  
  @JSImport("js-graph-algorithms", "WeightedGraph")
  @js.native
  class WeightedGraph protected ()
    extends StObject
       with typings.jsGraphAlgorithms.JsGraphs.WeightedGraph {
    def this(V: Double) = this()
    
    /* CompleteClass */
    var V: Double = js.native
    
    /* CompleteClass */
    override def addEdge(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
    
    /* CompleteClass */
    override def adj(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
    
    /* protected */ /* CompleteClass */
    var adjList: js.Array[js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge]] = js.native
    
    /* CompleteClass */
    override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
    
    /* CompleteClass */
    override def node(v: Double): Node = js.native
    
    /* private */ /* CompleteClass */
    var nodeInfo: js.Any = js.native
  }
}
