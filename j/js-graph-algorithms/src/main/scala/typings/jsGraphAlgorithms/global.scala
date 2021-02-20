package typings.jsGraphAlgorithms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsGraphs {
    
    @JSGlobal("JsGraphs.BellmanFord")
    @js.native
    class BellmanFord protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.BellmanFord {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
    }
    
    @JSGlobal("JsGraphs.BreadthFirstSearch")
    @js.native
    class BreadthFirstSearch protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.BreadthFirstSearch {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
    }
    
    @JSGlobal("JsGraphs.ConnectedComponents")
    @js.native
    class ConnectedComponents protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.ConnectedComponents {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph) = this()
    }
    
    @JSGlobal("JsGraphs.DepthFirstSearch")
    @js.native
    class DepthFirstSearch[T] protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.DepthFirstSearch[T] {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
    }
    
    @JSGlobal("JsGraphs.DiGraph")
    @js.native
    class DiGraph protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.DiGraph {
      def this(V: Double) = this()
    }
    
    @JSGlobal("JsGraphs.Dijkstra")
    @js.native
    class Dijkstra protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.Dijkstra {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
    }
    
    @JSGlobal("JsGraphs.EagerPrimMST")
    @js.native
    class EagerPrimMST protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.EagerPrimMST {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
    }
    
    @JSGlobal("JsGraphs.Edge")
    @js.native
    class Edge protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.Edge {
      def this(v: Double, w: Double, weight: Double) = this()
    }
    
    @JSGlobal("JsGraphs.FlowEdge")
    @js.native
    class FlowEdge protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.FlowEdge {
      def this(v: Double, w: Double, capacity: Double) = this()
    }
    
    @JSGlobal("JsGraphs.FlowNetwork")
    @js.native
    class FlowNetwork protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.FlowNetwork {
      def this(V: Double) = this()
    }
    
    @JSGlobal("JsGraphs.FordFulkerson")
    @js.native
    class FordFulkerson protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.FordFulkerson {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.FlowNetwork, s: Double, t: Double) = this()
    }
    
    @JSGlobal("JsGraphs.Graph")
    @js.native
    class Graph protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.Graph {
      def this(V: Double) = this()
    }
    
    @JSGlobal("JsGraphs.IndexMinPQ")
    @js.native
    class IndexMinPQ[T] protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.IndexMinPQ[T] {
      def this(N: Double) = this()
      def this(N: Double, compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
    }
    
    @JSGlobal("JsGraphs.KruskalMST")
    @js.native
    class KruskalMST protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.KruskalMST {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
    }
    
    @JSGlobal("JsGraphs.LazyPrimMST")
    @js.native
    class LazyPrimMST protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.LazyPrimMST {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
    }
    
    @JSGlobal("JsGraphs.MinPQ")
    @js.native
    class MinPQ[T] ()
      extends typings.jsGraphAlgorithms.JsGraphs.MinPQ[T] {
      def this(compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
    }
    
    @JSGlobal("JsGraphs.Queue")
    @js.native
    class Queue[T] ()
      extends typings.jsGraphAlgorithms.JsGraphs.Queue[T]
    
    @JSGlobal("JsGraphs.QueueNode")
    @js.native
    class QueueNode[T] protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.QueueNode[T] {
      def this(a: T) = this()
    }
    
    @JSGlobal("JsGraphs.QuickUnion")
    @js.native
    class QuickUnion protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.QuickUnion {
      def this(V: Double) = this()
    }
    
    @JSGlobal("JsGraphs.Stack")
    @js.native
    class Stack[T] ()
      extends typings.jsGraphAlgorithms.JsGraphs.Stack[T]
    
    @JSGlobal("JsGraphs.StackNode")
    @js.native
    class StackNode[T] protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.StackNode[T] {
      def this(value: T) = this()
    }
    
    @JSGlobal("JsGraphs.StronglyConnectedComponents")
    @js.native
    class StronglyConnectedComponents protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.StronglyConnectedComponents {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
    }
    
    @JSGlobal("JsGraphs.TopologicalSort")
    @js.native
    class TopologicalSort protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.TopologicalSort {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
    }
    
    @JSGlobal("JsGraphs.TopologicalSortShortestPaths")
    @js.native
    class TopologicalSortShortestPaths protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.TopologicalSortShortestPaths {
      def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph, s: Double) = this()
    }
    
    @JSGlobal("JsGraphs.WeightedDiGraph")
    @js.native
    class WeightedDiGraph ()
      extends typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph
    
    @JSGlobal("JsGraphs.WeightedGraph")
    @js.native
    class WeightedGraph protected ()
      extends typings.jsGraphAlgorithms.JsGraphs.WeightedGraph {
      def this(V: Double) = this()
    }
  }
}
