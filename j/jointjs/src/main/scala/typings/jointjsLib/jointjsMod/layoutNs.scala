package typings
package jointjsLib.jointjsMod

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
      var height: js.UndefOr[scala.Double] = js.undefined
      var labeloffset: js.UndefOr[scala.Double] = js.undefined
      var labelpos: js.UndefOr[
            jointjsLib.jointjsLibStrings.l | jointjsLib.jointjsLibStrings.c | jointjsLib.jointjsLibStrings.r
          ] = js.undefined
      var minLen: js.UndefOr[scala.Double] = js.undefined
      var weight: js.UndefOr[scala.Double] = js.undefined
      var width: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait LayoutOptions extends js.Object {
      var clusterPadding: js.UndefOr[jointjsLib.jointjsMod.diaNs.Padding] = js.undefined
      var dagre: js.UndefOr[js.Any] = js.undefined
      var debugTiming: js.UndefOr[scala.Boolean] = js.undefined
      var edgeSep: js.UndefOr[scala.Double] = js.undefined
      var exportElement: js.UndefOr[js.Function1[/* element */ jointjsLib.jointjsMod.diaNs.Element, Node]] = js.undefined
      var exportLink: js.UndefOr[js.Function1[/* link */ jointjsLib.jointjsMod.diaNs.Link, Edge]] = js.undefined
      var graphlib: js.UndefOr[js.Any] = js.undefined
      var marginX: js.UndefOr[scala.Double] = js.undefined
      var marginY: js.UndefOr[scala.Double] = js.undefined
      var nodeSep: js.UndefOr[scala.Double] = js.undefined
      var rankDir: js.UndefOr[
            jointjsLib.jointjsLibStrings.TB | jointjsLib.jointjsLibStrings.BT | jointjsLib.jointjsLibStrings.LR | jointjsLib.jointjsLibStrings.RL
          ] = js.undefined
      var rankSep: js.UndefOr[scala.Double] = js.undefined
      var ranker: js.UndefOr[
            jointjsLib.jointjsLibStrings.`network-simplex` | jointjsLib.jointjsLibStrings.`tight-tree` | jointjsLib.jointjsLibStrings.`longest-path`
          ] = js.undefined
      var resizeClusters: js.UndefOr[scala.Boolean] = js.undefined
      var setLabels: js.UndefOr[
            scala.Boolean | (js.Function3[
              /* link */ jointjsLib.jointjsMod.diaNs.Link, 
              /* position */ jointjsLib.jointjsMod.diaNs.Point, 
              /* points */ js.Array[jointjsLib.jointjsMod.diaNs.Point], 
              scala.Unit
            ])
          ] = js.undefined
      // deprecated
      var setLinkVertices: js.UndefOr[scala.Boolean] = js.undefined
      var setPosition: js.UndefOr[
            js.Function2[
              /* element */ jointjsLib.jointjsMod.diaNs.Element, 
              /* position */ jointjsLib.jointjsMod.diaNs.BBox, 
              scala.Unit
            ]
          ] = js.undefined
      var setVertices: js.UndefOr[
            scala.Boolean | (js.Function2[
              /* link */ jointjsLib.jointjsMod.diaNs.Link, 
              /* vertices */ js.Array[jointjsLib.jointjsMod.diaNs.Point], 
              scala.Unit
            ])
          ] = js.undefined
    }
    
    trait Node extends js.Object {
      var height: js.UndefOr[scala.Double] = js.undefined
      var width: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait toGraphLibOptions
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      var graphlib: js.UndefOr[js.Any] = js.undefined
    }
    
    def fromGraphLib(glGraph: js.Any): jointjsLib.jointjsMod.diaNs.Graph = js.native
    def fromGraphLib(glGraph: js.Any, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): jointjsLib.jointjsMod.diaNs.Graph = js.native
    def layout(graph: jointjsLib.jointjsMod.diaNs.Graph): jointjsLib.jointjsMod.gNs.Rect = js.native
    def layout(graph: jointjsLib.jointjsMod.diaNs.Graph, opt: LayoutOptions): jointjsLib.jointjsMod.gNs.Rect = js.native
    def layout(graph: js.Array[jointjsLib.jointjsMod.diaNs.Cell]): jointjsLib.jointjsMod.gNs.Rect = js.native
    def layout(graph: js.Array[jointjsLib.jointjsMod.diaNs.Cell], opt: LayoutOptions): jointjsLib.jointjsMod.gNs.Rect = js.native
    def toGraphLib(graph: jointjsLib.jointjsMod.diaNs.Graph): js.Any = js.native
    def toGraphLib(graph: jointjsLib.jointjsMod.diaNs.Graph, opt: toGraphLibOptions): js.Any = js.native
  }
  
}

