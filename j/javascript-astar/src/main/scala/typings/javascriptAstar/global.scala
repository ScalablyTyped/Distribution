package typings.javascriptAstar

import typings.javascriptAstar.anon.Closest
import typings.javascriptAstar.anon.Diagonal
import typings.javascriptAstar.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Graph protected ()
    extends typings.javascriptAstar.Graph {
    def this(grid: js.Array[js.Array[Double]]) = this()
    def this(grid: js.Array[js.Array[Double]], options: Diagonal) = this()
  }
  
  @js.native
  class GridNode ()
    extends typings.javascriptAstar.GridNode
  
  @js.native
  object astar extends js.Object {
    
    var heuristics: Heuristics = js.native
    
    def search(graph: typings.javascriptAstar.Graph, start: X, end: X): js.Array[typings.javascriptAstar.GridNode] = js.native
    def search(graph: typings.javascriptAstar.Graph, start: X, end: X, options: Closest): js.Array[typings.javascriptAstar.GridNode] = js.native
  }
}
