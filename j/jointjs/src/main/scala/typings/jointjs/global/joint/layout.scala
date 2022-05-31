package typings.jointjs.global.joint

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.Graph
import typings.jointjs.mod.g.Rect
import typings.jointjs.mod.layout.DirectedGraph.LayoutOptions
import typings.jointjs.mod.layout.DirectedGraph.toGraphLibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  object DirectedGraph {
    
    @JSGlobal("joint.layout.DirectedGraph")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromGraphLib(glGraph: js.Any): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphLib")(glGraph.asInstanceOf[js.Any]).asInstanceOf[Graph]
    inline def fromGraphLib(glGraph: js.Any, opt: StringDictionary[js.Any]): Graph = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphLib")(glGraph.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Graph]
    
    inline def layout(graph: js.Array[Cell]): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Rect]
    inline def layout(graph: js.Array[Cell], opt: LayoutOptions): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Rect]
    inline def layout(graph: Graph): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Rect]
    inline def layout(graph: Graph, opt: LayoutOptions): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Rect]
    
    inline def toGraphLib(graph: Graph): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toGraphLib")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def toGraphLib(graph: Graph, opt: toGraphLibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toGraphLib")(graph.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
