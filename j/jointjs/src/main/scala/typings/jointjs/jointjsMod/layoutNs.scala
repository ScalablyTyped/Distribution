package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.diaNs.BBox
import typings.jointjs.jointjsMod.diaNs.Cell
import typings.jointjs.jointjsMod.diaNs.Element
import typings.jointjs.jointjsMod.diaNs.Graph
import typings.jointjs.jointjsMod.diaNs.Link
import typings.jointjs.jointjsMod.diaNs.Padding
import typings.jointjs.jointjsMod.diaNs.Point
import typings.jointjs.jointjsMod.gNs.Rect
import typings.jointjs.jointjsMod.layoutNs.DirectedGraphNs.Edge
import typings.jointjs.jointjsMod.layoutNs.DirectedGraphNs.LayoutOptions
import typings.jointjs.jointjsMod.layoutNs.DirectedGraphNs.Node
import typings.jointjs.jointjsMod.layoutNs.DirectedGraphNs.toGraphLibOptions
import typings.jointjs.jointjsStrings.BT
import typings.jointjs.jointjsStrings.LR
import typings.jointjs.jointjsStrings.RL
import typings.jointjs.jointjsStrings.TB
import typings.jointjs.jointjsStrings.`longest-path`
import typings.jointjs.jointjsStrings.`network-simplex`
import typings.jointjs.jointjsStrings.`tight-tree`
import typings.jointjs.jointjsStrings.c
import typings.jointjs.jointjsStrings.l
import typings.jointjs.jointjsStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "layout")
@js.native
object layoutNs extends js.Object {
  @JSName("DirectedGraph")
  @js.native
  object DirectedGraphNs extends js.Object {
    trait Edge extends js.Object {
      var height: js.UndefOr[Double] = js.undefined
      var labeloffset: js.UndefOr[Double] = js.undefined
      var labelpos: js.UndefOr[l | c | r] = js.undefined
      var minLen: js.UndefOr[Double] = js.undefined
      var weight: js.UndefOr[Double] = js.undefined
      var width: js.UndefOr[Double] = js.undefined
    }
    
    trait LayoutOptions extends js.Object {
      var clusterPadding: js.UndefOr[Padding] = js.undefined
      var dagre: js.UndefOr[js.Any] = js.undefined
      var debugTiming: js.UndefOr[Boolean] = js.undefined
      var edgeSep: js.UndefOr[Double] = js.undefined
      var exportElement: js.UndefOr[js.Function1[/* element */ Element, Node]] = js.undefined
      var exportLink: js.UndefOr[js.Function1[/* link */ Link, Edge]] = js.undefined
      var graphlib: js.UndefOr[js.Any] = js.undefined
      var marginX: js.UndefOr[Double] = js.undefined
      var marginY: js.UndefOr[Double] = js.undefined
      var nodeSep: js.UndefOr[Double] = js.undefined
      var rankDir: js.UndefOr[TB | BT | LR | RL] = js.undefined
      var rankSep: js.UndefOr[Double] = js.undefined
      var ranker: js.UndefOr[`network-simplex` | `tight-tree` | `longest-path`] = js.undefined
      var resizeClusters: js.UndefOr[Boolean] = js.undefined
      var setLabels: js.UndefOr[
            Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
          ] = js.undefined
      // deprecated
      var setLinkVertices: js.UndefOr[Boolean] = js.undefined
      var setPosition: js.UndefOr[js.Function2[/* element */ Element, /* position */ BBox, Unit]] = js.undefined
      var setVertices: js.UndefOr[Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])] = js.undefined
    }
    
    trait Node extends js.Object {
      var height: js.UndefOr[Double] = js.undefined
      var width: js.UndefOr[Double] = js.undefined
    }
    
    trait toGraphLibOptions
      extends /* key */ StringDictionary[js.Any] {
      var graphlib: js.UndefOr[js.Any] = js.undefined
    }
    
    def fromGraphLib(glGraph: js.Any): Graph = js.native
    def fromGraphLib(glGraph: js.Any, opt: StringDictionary[js.Any]): Graph = js.native
    def layout(graph: js.Array[Cell]): Rect = js.native
    def layout(graph: js.Array[Cell], opt: LayoutOptions): Rect = js.native
    def layout(graph: Graph): Rect = js.native
    def layout(graph: Graph, opt: LayoutOptions): Rect = js.native
    def toGraphLib(graph: Graph): js.Any = js.native
    def toGraphLib(graph: Graph, opt: toGraphLibOptions): js.Any = js.native
  }
  
}

