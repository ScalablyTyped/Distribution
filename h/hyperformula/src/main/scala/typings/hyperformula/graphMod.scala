package typings.hyperformula

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/Graph", "Graph")
  @js.native
  open class Graph[T] protected () extends StObject {
    def this(dependencyQuery: DependencyQuery[T]) = this()
    
    /**
      * Adds edge between nodes.
      *
      * The nodes had to be added to the graph before, or the error will be raised
      *
      * @param fromNode - node from which edge is outcoming
      * @param toNode - node to which edge is incoming
      */
    def addEdge(fromNode: T, toNode: T): Unit = js.native
    
    /**
      * Adds node to a graph
      *
      * @param node - a node to be added
      */
    def addNode(node: T): Unit = js.native
    
    /**
      * Returns nodes adjacent to given node
      *
      * @param node - node to which adjacent nodes we want to retrieve
      */
    def adjacentNodes(node: T): Set[T] = js.native
    
    def adjacentNodesCount(node: T): Double = js.native
    
    def clearSpecialNodesRecentlyChanged(): Unit = js.native
    
    /* private */ val dependencyQuery: Any = js.native
    
    /** Nodes adjacency mapping. */
    /* private */ var edges: Any = js.native
    
    /**
      * Returns number of edges in graph
      */
    def edgesCount(): Double = js.native
    
    /**
      * Checks whether exists edge between nodes
      *
      * @param fromNode - node from which edge is outcoming
      * @param toNode - node to which edge is incoming
      */
    def existsEdge(fromNode: T, toNode: T): Boolean = js.native
    
    def getDependencies(vertex: T): js.Array[T] = js.native
    
    /**
      *
      * an iterative implementation of Tarjan's algorithm for finding strongly connected compontents
      * returns vertices in order of topological sort, but vertices that are on cycles are kept separate
      *
      * @param modifiedNodes - seed for computation. During engine init run, all of the vertices of grap. In recomputation run, changed vertices.
      * @param operatingFunction - recomputes value of a node, and returns whether a change occured
      * @param onCycle - action to be performed when node is on cycle
      */
    def getTopSortedWithSccSubgraphFrom(
      modifiedNodes: js.Array[T],
      operatingFunction: js.Function1[/* node */ T, Boolean],
      onCycle: js.Function1[/* node */ T, Unit]
    ): TopSortResult[T] = js.native
    
    /**
      * Checks whether a node is present in graph
      *
      * @param node - node to check
      */
    def hasNode(node: T): Boolean = js.native
    
    var infiniteRanges: Set[T] = js.native
    
    def markNodeAsChangingWithStructure(node: T): Unit = js.native
    
    def markNodeAsInfiniteRange(node: T): Unit = js.native
    
    def markNodeAsSpecial(node: T): Unit = js.native
    
    def markNodeAsSpecialRecentlyChanged(node: T): Unit = js.native
    
    /** Set with nodes in graph. */
    var nodes: Set[T] = js.native
    
    /**
      * Returns number of nodes in graph
      */
    def nodesCount(): Double = js.native
    
    /* private */ var removeDependencies: Any = js.native
    
    def removeEdge(fromNode: T, toNode: T): Unit = js.native
    
    def removeIncomingEdges(toNode: T): Unit = js.native
    
    def removeNode(node: T): js.Array[T] = js.native
    
    def softRemoveEdge(fromNode: T, toNode: T): Unit = js.native
    
    var specialNodes: Set[T] = js.native
    
    var specialNodesRecentlyChanged: Set[T] = js.native
    
    var specialNodesStructuralChanges: Set[T] = js.native
    
    def topSortWithScc(): TopSortResult[T] = js.native
  }
  
  type DependencyQuery[T] = js.Function1[/* vertex */ T, js.Array[T]]
  
  trait TopSortResult[T] extends StObject {
    
    var cycled: js.Array[T]
    
    var sorted: js.Array[T]
  }
  object TopSortResult {
    
    inline def apply[T](cycled: js.Array[T], sorted: js.Array[T]): TopSortResult[T] = {
      val __obj = js.Dynamic.literal(cycled = cycled.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopSortResult[T]]
    }
    
    extension [Self <: TopSortResult[?], T](x: Self & TopSortResult[T]) {
      
      inline def setCycled(value: js.Array[T]): Self = StObject.set(x, "cycled", value.asInstanceOf[js.Any])
      
      inline def setCycledVarargs(value: T*): Self = StObject.set(x, "cycled", js.Array(value*))
      
      inline def setSorted(value: js.Array[T]): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedVarargs(value: T*): Self = StObject.set(x, "sorted", js.Array(value*))
    }
  }
}
