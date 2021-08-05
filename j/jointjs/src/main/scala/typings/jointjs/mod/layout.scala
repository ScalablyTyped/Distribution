package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.BT
import typings.jointjs.jointjsStrings.LR
import typings.jointjs.jointjsStrings.RL
import typings.jointjs.jointjsStrings.TB
import typings.jointjs.jointjsStrings.`longest-path`
import typings.jointjs.jointjsStrings.`network-simplex`
import typings.jointjs.jointjsStrings.`tight-tree`
import typings.jointjs.jointjsStrings.c_
import typings.jointjs.jointjsStrings.l_
import typings.jointjs.jointjsStrings.r
import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Graph
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.dia.Padding
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.g.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  object DirectedGraph {
    
    @JSImport("jointjs", "layout.DirectedGraph")
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
    
    trait Edge extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var labeloffset: js.UndefOr[Double] = js.undefined
      
      var labelpos: js.UndefOr[l_ | c_ | r] = js.undefined
      
      var minLen: js.UndefOr[Double] = js.undefined
      
      var weight: js.UndefOr[Double] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object Edge {
      
      inline def apply(): Edge = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Edge]
      }
      
      extension [Self <: Edge](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setLabeloffset(value: Double): Self = StObject.set(x, "labeloffset", value.asInstanceOf[js.Any])
        
        inline def setLabeloffsetUndefined: Self = StObject.set(x, "labeloffset", js.undefined)
        
        inline def setLabelpos(value: l_ | c_ | r): Self = StObject.set(x, "labelpos", value.asInstanceOf[js.Any])
        
        inline def setLabelposUndefined: Self = StObject.set(x, "labelpos", js.undefined)
        
        inline def setMinLen(value: Double): Self = StObject.set(x, "minLen", value.asInstanceOf[js.Any])
        
        inline def setMinLenUndefined: Self = StObject.set(x, "minLen", js.undefined)
        
        inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait LayoutOptions extends StObject {
      
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
    object LayoutOptions {
      
      inline def apply(): LayoutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutOptions]
      }
      
      extension [Self <: LayoutOptions](x: Self) {
        
        inline def setClusterPadding(value: Padding): Self = StObject.set(x, "clusterPadding", value.asInstanceOf[js.Any])
        
        inline def setClusterPaddingUndefined: Self = StObject.set(x, "clusterPadding", js.undefined)
        
        inline def setDagre(value: js.Any): Self = StObject.set(x, "dagre", value.asInstanceOf[js.Any])
        
        inline def setDagreUndefined: Self = StObject.set(x, "dagre", js.undefined)
        
        inline def setDebugTiming(value: Boolean): Self = StObject.set(x, "debugTiming", value.asInstanceOf[js.Any])
        
        inline def setDebugTimingUndefined: Self = StObject.set(x, "debugTiming", js.undefined)
        
        inline def setEdgeSep(value: Double): Self = StObject.set(x, "edgeSep", value.asInstanceOf[js.Any])
        
        inline def setEdgeSepUndefined: Self = StObject.set(x, "edgeSep", js.undefined)
        
        inline def setExportElement(value: /* element */ Element => Node): Self = StObject.set(x, "exportElement", js.Any.fromFunction1(value))
        
        inline def setExportElementUndefined: Self = StObject.set(x, "exportElement", js.undefined)
        
        inline def setExportLink(value: /* link */ Link => Edge): Self = StObject.set(x, "exportLink", js.Any.fromFunction1(value))
        
        inline def setExportLinkUndefined: Self = StObject.set(x, "exportLink", js.undefined)
        
        inline def setGraphlib(value: js.Any): Self = StObject.set(x, "graphlib", value.asInstanceOf[js.Any])
        
        inline def setGraphlibUndefined: Self = StObject.set(x, "graphlib", js.undefined)
        
        inline def setMarginX(value: Double): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
        
        inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
        
        inline def setMarginY(value: Double): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
        
        inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
        
        inline def setNodeSep(value: Double): Self = StObject.set(x, "nodeSep", value.asInstanceOf[js.Any])
        
        inline def setNodeSepUndefined: Self = StObject.set(x, "nodeSep", js.undefined)
        
        inline def setRankDir(value: TB | BT | LR | RL): Self = StObject.set(x, "rankDir", value.asInstanceOf[js.Any])
        
        inline def setRankDirUndefined: Self = StObject.set(x, "rankDir", js.undefined)
        
        inline def setRankSep(value: Double): Self = StObject.set(x, "rankSep", value.asInstanceOf[js.Any])
        
        inline def setRankSepUndefined: Self = StObject.set(x, "rankSep", js.undefined)
        
        inline def setRanker(value: `network-simplex` | `tight-tree` | `longest-path`): Self = StObject.set(x, "ranker", value.asInstanceOf[js.Any])
        
        inline def setRankerUndefined: Self = StObject.set(x, "ranker", js.undefined)
        
        inline def setResizeClusters(value: Boolean): Self = StObject.set(x, "resizeClusters", value.asInstanceOf[js.Any])
        
        inline def setResizeClustersUndefined: Self = StObject.set(x, "resizeClusters", js.undefined)
        
        inline def setSetLabels(
          value: Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
        ): Self = StObject.set(x, "setLabels", value.asInstanceOf[js.Any])
        
        inline def setSetLabelsFunction3(value: (/* link */ Link, /* position */ Point, /* points */ js.Array[Point]) => Unit): Self = StObject.set(x, "setLabels", js.Any.fromFunction3(value))
        
        inline def setSetLabelsUndefined: Self = StObject.set(x, "setLabels", js.undefined)
        
        inline def setSetLinkVertices(value: Boolean): Self = StObject.set(x, "setLinkVertices", value.asInstanceOf[js.Any])
        
        inline def setSetLinkVerticesUndefined: Self = StObject.set(x, "setLinkVertices", js.undefined)
        
        inline def setSetPosition(value: (/* element */ Element, /* position */ BBox) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
        
        inline def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
        
        inline def setSetVertices(value: Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])): Self = StObject.set(x, "setVertices", value.asInstanceOf[js.Any])
        
        inline def setSetVerticesFunction2(value: (/* link */ Link, /* vertices */ js.Array[Point]) => Unit): Self = StObject.set(x, "setVertices", js.Any.fromFunction2(value))
        
        inline def setSetVerticesUndefined: Self = StObject.set(x, "setVertices", js.undefined)
      }
    }
    
    trait Node extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object Node {
      
      inline def apply(): Node = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Node]
      }
      
      extension [Self <: Node](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait toGraphLibOptions
      extends StObject
         with /* key */ StringDictionary[js.Any] {
      
      var graphlib: js.UndefOr[js.Any] = js.undefined
    }
    object toGraphLibOptions {
      
      inline def apply(): toGraphLibOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[toGraphLibOptions]
      }
      
      extension [Self <: toGraphLibOptions](x: Self) {
        
        inline def setGraphlib(value: js.Any): Self = StObject.set(x, "graphlib", value.asInstanceOf[js.Any])
        
        inline def setGraphlibUndefined: Self = StObject.set(x, "graphlib", js.undefined)
      }
    }
  }
}
