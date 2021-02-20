package typings.jsGraphAlgorithms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-graph-algorithms", "BellmanFord")
  @js.native
  class BellmanFord protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.BellmanFord {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "BreadthFirstSearch")
  @js.native
  class BreadthFirstSearch protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.BreadthFirstSearch {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "ConnectedComponents")
  @js.native
  class ConnectedComponents protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.ConnectedComponents {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph) = this()
  }
  
  @JSImport("js-graph-algorithms", "DepthFirstSearch")
  @js.native
  class DepthFirstSearch[T] protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.DepthFirstSearch[T] {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "DiGraph")
  @js.native
  class DiGraph protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.DiGraph {
    def this(V: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "Dijkstra")
  @js.native
  class Dijkstra protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.Dijkstra {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "EagerPrimMST")
  @js.native
  class EagerPrimMST protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.EagerPrimMST {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
  }
  
  @JSImport("js-graph-algorithms", "Edge")
  @js.native
  class Edge protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.Edge {
    def this(v: Double, w: Double, weight: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "FlowEdge")
  @js.native
  class FlowEdge protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.FlowEdge {
    def this(v: Double, w: Double, capacity: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "FlowNetwork")
  @js.native
  class FlowNetwork protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.FlowNetwork {
    def this(V: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "FordFulkerson")
  @js.native
  class FordFulkerson protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.FordFulkerson {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.FlowNetwork, s: Double, t: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "Graph")
  @js.native
  class Graph protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.Graph {
    def this(V: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "IndexMinPQ")
  @js.native
  class IndexMinPQ[T] protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.IndexMinPQ[T] {
    def this(N: Double) = this()
    def this(N: Double, compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
  }
  
  @JSImport("js-graph-algorithms", "KruskalMST")
  @js.native
  class KruskalMST protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.KruskalMST {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
  }
  
  @JSImport("js-graph-algorithms", "LazyPrimMST")
  @js.native
  class LazyPrimMST protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.LazyPrimMST {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
  }
  
  @JSImport("js-graph-algorithms", "MinPQ")
  @js.native
  class MinPQ[T] ()
    extends typings.jsGraphAlgorithms.JsGraphs.MinPQ[T] {
    def this(compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
  }
  
  @JSImport("js-graph-algorithms", "Queue")
  @js.native
  class Queue[T] ()
    extends typings.jsGraphAlgorithms.JsGraphs.Queue[T]
  
  @JSImport("js-graph-algorithms", "QueueNode")
  @js.native
  class QueueNode[T] protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.QueueNode[T] {
    def this(a: T) = this()
  }
  
  @JSImport("js-graph-algorithms", "QuickUnion")
  @js.native
  class QuickUnion protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.QuickUnion {
    def this(V: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "Stack")
  @js.native
  class Stack[T] ()
    extends typings.jsGraphAlgorithms.JsGraphs.Stack[T]
  
  @JSImport("js-graph-algorithms", "StackNode")
  @js.native
  class StackNode[T] protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.StackNode[T] {
    def this(value: T) = this()
  }
  
  @JSImport("js-graph-algorithms", "StronglyConnectedComponents")
  @js.native
  class StronglyConnectedComponents protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.StronglyConnectedComponents {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
  }
  
  @JSImport("js-graph-algorithms", "TopologicalSort")
  @js.native
  class TopologicalSort protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.TopologicalSort {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
  }
  
  @JSImport("js-graph-algorithms", "TopologicalSortShortestPaths")
  @js.native
  class TopologicalSortShortestPaths protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.TopologicalSortShortestPaths {
    def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph, s: Double) = this()
  }
  
  @JSImport("js-graph-algorithms", "WeightedDiGraph")
  @js.native
  class WeightedDiGraph ()
    extends typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph
  
  @JSImport("js-graph-algorithms", "WeightedGraph")
  @js.native
  class WeightedGraph protected ()
    extends typings.jsGraphAlgorithms.JsGraphs.WeightedGraph {
    def this(V: Double) = this()
  }
}
