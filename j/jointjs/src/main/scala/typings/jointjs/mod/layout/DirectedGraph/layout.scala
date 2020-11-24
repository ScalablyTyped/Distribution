package typings.jointjs.mod.layout.DirectedGraph

import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.Graph
import typings.jointjs.mod.g.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "layout.DirectedGraph.layout")
@js.native
object layout extends js.Object {
  
  def apply(graph: js.Array[Cell]): Rect = js.native
  def apply(graph: js.Array[Cell], opt: LayoutOptions): Rect = js.native
  def apply(graph: Graph): Rect = js.native
  def apply(graph: Graph, opt: LayoutOptions): Rect = js.native
}
