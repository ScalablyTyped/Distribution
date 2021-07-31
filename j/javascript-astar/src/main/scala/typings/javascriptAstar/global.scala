package typings.javascriptAstar

import typings.javascriptAstar.anon.Closest
import typings.javascriptAstar.anon.Diagonal
import typings.javascriptAstar.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Graph")
  @js.native
  class Graph protected ()
    extends StObject
       with typings.javascriptAstar.Graph {
    def this(grid: js.Array[js.Array[Double]]) = this()
    def this(grid: js.Array[js.Array[Double]], options: Diagonal) = this()
    
    /* CompleteClass */
    var grid: js.Array[js.Array[typings.javascriptAstar.GridNode]] = js.native
  }
  
  @JSGlobal("GridNode")
  @js.native
  class GridNode ()
    extends StObject
       with typings.javascriptAstar.GridNode {
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  object astar {
    
    @JSGlobal("astar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("astar.heuristics")
    @js.native
    def heuristics: Heuristics = js.native
    @scala.inline
    def heuristics_=(x: Heuristics): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heuristics")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def search(graph: typings.javascriptAstar.Graph, start: X, end: X): js.Array[typings.javascriptAstar.GridNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(graph.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.javascriptAstar.GridNode]]
    @scala.inline
    def search(graph: typings.javascriptAstar.Graph, start: X, end: X, options: Closest): js.Array[typings.javascriptAstar.GridNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(graph.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.javascriptAstar.GridNode]]
  }
}
