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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  object DirectedGraph {
    
    @JSImport("jointjs", "layout.DirectedGraph.fromGraphLib")
    @js.native
    def fromGraphLib(glGraph: js.Any): Graph = js.native
    @JSImport("jointjs", "layout.DirectedGraph.fromGraphLib")
    @js.native
    def fromGraphLib(glGraph: js.Any, opt: StringDictionary[js.Any]): Graph = js.native
    
    @JSImport("jointjs", "layout.DirectedGraph.layout")
    @js.native
    def layout(graph: js.Array[Cell]): Rect = js.native
    @JSImport("jointjs", "layout.DirectedGraph.layout")
    @js.native
    def layout(graph: js.Array[Cell], opt: LayoutOptions): Rect = js.native
    @JSImport("jointjs", "layout.DirectedGraph.layout")
    @js.native
    def layout(graph: Graph): Rect = js.native
    @JSImport("jointjs", "layout.DirectedGraph.layout")
    @js.native
    def layout(graph: Graph, opt: LayoutOptions): Rect = js.native
    
    @JSImport("jointjs", "layout.DirectedGraph.toGraphLib")
    @js.native
    def toGraphLib(graph: Graph): js.Any = js.native
    @JSImport("jointjs", "layout.DirectedGraph.toGraphLib")
    @js.native
    def toGraphLib(graph: Graph, opt: toGraphLibOptions): js.Any = js.native
    
    @js.native
    trait Edge extends StObject {
      
      var height: js.UndefOr[Double] = js.native
      
      var labeloffset: js.UndefOr[Double] = js.native
      
      var labelpos: js.UndefOr[l_ | c_ | r] = js.native
      
      var minLen: js.UndefOr[Double] = js.native
      
      var weight: js.UndefOr[Double] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object Edge {
      
      @scala.inline
      def apply(): Edge = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Edge]
      }
      
      @scala.inline
      implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setLabeloffset(value: Double): Self = StObject.set(x, "labeloffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabeloffsetUndefined: Self = StObject.set(x, "labeloffset", js.undefined)
        
        @scala.inline
        def setLabelpos(value: l_ | c_ | r): Self = StObject.set(x, "labelpos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelposUndefined: Self = StObject.set(x, "labelpos", js.undefined)
        
        @scala.inline
        def setMinLen(value: Double): Self = StObject.set(x, "minLen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinLenUndefined: Self = StObject.set(x, "minLen", js.undefined)
        
        @scala.inline
        def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait LayoutOptions extends StObject {
      
      var clusterPadding: js.UndefOr[Padding] = js.native
      
      var dagre: js.UndefOr[js.Any] = js.native
      
      var debugTiming: js.UndefOr[Boolean] = js.native
      
      var edgeSep: js.UndefOr[Double] = js.native
      
      var exportElement: js.UndefOr[js.Function1[/* element */ Element, Node]] = js.native
      
      var exportLink: js.UndefOr[js.Function1[/* link */ Link, Edge]] = js.native
      
      var graphlib: js.UndefOr[js.Any] = js.native
      
      var marginX: js.UndefOr[Double] = js.native
      
      var marginY: js.UndefOr[Double] = js.native
      
      var nodeSep: js.UndefOr[Double] = js.native
      
      var rankDir: js.UndefOr[TB | BT | LR | RL] = js.native
      
      var rankSep: js.UndefOr[Double] = js.native
      
      var ranker: js.UndefOr[`network-simplex` | `tight-tree` | `longest-path`] = js.native
      
      var resizeClusters: js.UndefOr[Boolean] = js.native
      
      var setLabels: js.UndefOr[
            Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
          ] = js.native
      
      // deprecated
      var setLinkVertices: js.UndefOr[Boolean] = js.native
      
      var setPosition: js.UndefOr[js.Function2[/* element */ Element, /* position */ BBox, Unit]] = js.native
      
      var setVertices: js.UndefOr[Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])] = js.native
    }
    object LayoutOptions {
      
      @scala.inline
      def apply(): LayoutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutOptions]
      }
      
      @scala.inline
      implicit class LayoutOptionsMutableBuilder[Self <: LayoutOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClusterPadding(value: Padding): Self = StObject.set(x, "clusterPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClusterPaddingUndefined: Self = StObject.set(x, "clusterPadding", js.undefined)
        
        @scala.inline
        def setDagre(value: js.Any): Self = StObject.set(x, "dagre", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDagreUndefined: Self = StObject.set(x, "dagre", js.undefined)
        
        @scala.inline
        def setDebugTiming(value: Boolean): Self = StObject.set(x, "debugTiming", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugTimingUndefined: Self = StObject.set(x, "debugTiming", js.undefined)
        
        @scala.inline
        def setEdgeSep(value: Double): Self = StObject.set(x, "edgeSep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEdgeSepUndefined: Self = StObject.set(x, "edgeSep", js.undefined)
        
        @scala.inline
        def setExportElement(value: /* element */ Element => Node): Self = StObject.set(x, "exportElement", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExportElementUndefined: Self = StObject.set(x, "exportElement", js.undefined)
        
        @scala.inline
        def setExportLink(value: /* link */ Link => Edge): Self = StObject.set(x, "exportLink", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExportLinkUndefined: Self = StObject.set(x, "exportLink", js.undefined)
        
        @scala.inline
        def setGraphlib(value: js.Any): Self = StObject.set(x, "graphlib", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGraphlibUndefined: Self = StObject.set(x, "graphlib", js.undefined)
        
        @scala.inline
        def setMarginX(value: Double): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
        
        @scala.inline
        def setMarginY(value: Double): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
        
        @scala.inline
        def setNodeSep(value: Double): Self = StObject.set(x, "nodeSep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeSepUndefined: Self = StObject.set(x, "nodeSep", js.undefined)
        
        @scala.inline
        def setRankDir(value: TB | BT | LR | RL): Self = StObject.set(x, "rankDir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankDirUndefined: Self = StObject.set(x, "rankDir", js.undefined)
        
        @scala.inline
        def setRankSep(value: Double): Self = StObject.set(x, "rankSep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankSepUndefined: Self = StObject.set(x, "rankSep", js.undefined)
        
        @scala.inline
        def setRanker(value: `network-simplex` | `tight-tree` | `longest-path`): Self = StObject.set(x, "ranker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankerUndefined: Self = StObject.set(x, "ranker", js.undefined)
        
        @scala.inline
        def setResizeClusters(value: Boolean): Self = StObject.set(x, "resizeClusters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResizeClustersUndefined: Self = StObject.set(x, "resizeClusters", js.undefined)
        
        @scala.inline
        def setSetLabels(
          value: Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
        ): Self = StObject.set(x, "setLabels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetLabelsFunction3(value: (/* link */ Link, /* position */ Point, /* points */ js.Array[Point]) => Unit): Self = StObject.set(x, "setLabels", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetLabelsUndefined: Self = StObject.set(x, "setLabels", js.undefined)
        
        @scala.inline
        def setSetLinkVertices(value: Boolean): Self = StObject.set(x, "setLinkVertices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetLinkVerticesUndefined: Self = StObject.set(x, "setLinkVertices", js.undefined)
        
        @scala.inline
        def setSetPosition(value: (/* element */ Element, /* position */ BBox) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
        
        @scala.inline
        def setSetVertices(value: Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])): Self = StObject.set(x, "setVertices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetVerticesFunction2(value: (/* link */ Link, /* vertices */ js.Array[Point]) => Unit): Self = StObject.set(x, "setVertices", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetVerticesUndefined: Self = StObject.set(x, "setVertices", js.undefined)
      }
    }
    
    @js.native
    trait Node extends StObject {
      
      var height: js.UndefOr[Double] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object Node {
      
      @scala.inline
      def apply(): Node = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait toGraphLibOptions
      extends /* key */ StringDictionary[js.Any] {
      
      var graphlib: js.UndefOr[js.Any] = js.native
    }
    object toGraphLibOptions {
      
      @scala.inline
      def apply(): toGraphLibOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[toGraphLibOptions]
      }
      
      @scala.inline
      implicit class toGraphLibOptionsMutableBuilder[Self <: toGraphLibOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGraphlib(value: js.Any): Self = StObject.set(x, "graphlib", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGraphlibUndefined: Self = StObject.set(x, "graphlib", js.undefined)
      }
    }
  }
}
