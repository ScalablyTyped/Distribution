package typings.jsgraph

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.jsgraph.anon.Dirgaph
import typings.jsgraph.anon.E
import typings.jsgraph.anon.Error
import typings.jsgraph.anon.G
import typings.jsgraph.anon.Result
import typings.jsgraph.jsgraphNumbers.`0`
import typings.jsgraph.jsgraphNumbers.`1`
import typings.jsgraph.jsgraphNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsgraph", JSImport.Namespace)
  @js.native
  val ^ : jsGraphStatic = js.native
  
  @js.native
  trait Directed extends StObject {
    
    def breadthFirstTraverse(params: TraversalParams): TraversalResult = js.native
    
    var colors: typings.jsgraph.mod.colors = js.native
    
    def create(): Result = js.native
    
    def createTraversalContext(req: Dirgaph): TraversalContext = js.native
    
    def depthFirstTraverse(params: TraversalParams): TraversalResult = js.native
    
    var directedGraph: DirectedGraph = js.native
    
    def transpose(graph: DirectedGraph): Error = js.native
  }
  object Directed {
    
    @scala.inline
    def apply(
      breadthFirstTraverse: TraversalParams => TraversalResult,
      colors: colors,
      create: () => Result,
      createTraversalContext: Dirgaph => TraversalContext,
      depthFirstTraverse: TraversalParams => TraversalResult,
      directedGraph: DirectedGraph,
      transpose: DirectedGraph => Error
    ): Directed = {
      val __obj = js.Dynamic.literal(breadthFirstTraverse = js.Any.fromFunction1(breadthFirstTraverse), colors = colors.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), createTraversalContext = js.Any.fromFunction1(createTraversalContext), depthFirstTraverse = js.Any.fromFunction1(depthFirstTraverse), directedGraph = directedGraph.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
      __obj.asInstanceOf[Directed]
    }
    
    @scala.inline
    implicit class DirectedMutableBuilder[Self <: Directed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadthFirstTraverse(value: TraversalParams => TraversalResult): Self = StObject.set(x, "breadthFirstTraverse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColors(value: colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate(value: () => Result): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateTraversalContext(value: Dirgaph => TraversalContext): Self = StObject.set(x, "createTraversalContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDepthFirstTraverse(value: TraversalParams => TraversalResult): Self = StObject.set(x, "depthFirstTraverse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirectedGraph(value: DirectedGraph): Self = StObject.set(x, "directedGraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspose(value: DirectedGraph => Error): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DirectedGraph extends Instantiable0[DirectedGraph] {
    
    //Edge functions
    def addEdge(request: EdgeRequest): JsGraphResponse = js.native
    
    //Vertex functions
    def addVertex(vertex: VertexRequest): JsGraphResponse = js.native
    
    def clearEdgeProperty(edge: Edge): Boolean = js.native
    
    def clearVertexProperty(vertex: String): Boolean = js.native
    
    def fromObject(graph: js.Any): JsGraphResponse = js.native
    
    def getEdeges(): js.Array[Edge] = js.native
    
    def getEdgeCount(): Double = js.native
    
    def getEdgeProperty(edge: Edge): js.Any = js.native
    
    def getGraphDescription(): String = js.native
    
    def getGraphName(): String = js.native
    
    def getLeafVertices(): js.Array[String] = js.native
    
    def getRootVertices(): js.Array[String] = js.native
    
    def getVertexProperty(vertex: String): js.Any = js.native
    
    def getVertices(): js.Array[String] = js.native
    
    def hasEdgeProperty(edge: Edge): Boolean = js.native
    
    def hasVertexProperty(vertex: String): Boolean = js.native
    
    def inDegree(vertex: String): Double = js.native
    
    def inEdges(vertex: String): js.Array[Edge] = js.native
    
    def isEdge(edge: Edge): Boolean = js.native
    
    def leafVerticesCount(): Double = js.native
    
    def outDegree(vertex: String): Double = js.native
    
    def outEdges(vertex: String): js.Array[Edge] = js.native
    
    def removeEdge(edge: Edge): JsGraphResponse = js.native
    
    def removeVertex(vertex: String): Boolean = js.native
    
    def rootVerticesCount(): Double = js.native
    
    def setEdgeProperty(request: EdgeRequest): JsGraphResponse = js.native
    
    def setGraphDescription(description: String): JsGraphResponse = js.native
    
    def setGraphName(name: String): JsGraphResponse = js.native
    
    def setVertexProperty(vertex: VertexRequest): JsGraphResponse = js.native
    
    def stringify(replacer: js.Function): String = js.native
    def stringify(replacer: js.Function, space: Double): String = js.native
    
    def toJSON(): String = js.native
    
    def toObject(): String = js.native
    
    def verticesCount(): Double = js.native
  }
  
  @js.native
  trait Edge extends StObject {
    
    var u: String = js.native
    
    var v: String = js.native
  }
  object Edge {
    
    @scala.inline
    def apply(u: String, v: String): Edge = {
      val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edge]
    }
    
    @scala.inline
    implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EdgeRequest extends StObject {
    
    var e: Edge = js.native
    
    var p: js.Any = js.native
  }
  object EdgeRequest {
    
    @scala.inline
    def apply(e: Edge, p: js.Any): EdgeRequest = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeRequest]
    }
    
    @scala.inline
    implicit class EdgeRequestMutableBuilder[Self <: EdgeRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: Edge): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsGraphResponse extends StObject {
    
    var error: js.UndefOr[js.Any] = js.native
    
    var result: js.UndefOr[js.Any] = js.native
  }
  object JsGraphResponse {
    
    @scala.inline
    def apply(): JsGraphResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsGraphResponse]
    }
    
    @scala.inline
    implicit class JsGraphResponseMutableBuilder[Self <: JsGraphResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  @js.native
  trait TraversalContext extends StObject {
    
    var colorMap: js.Any = js.native
    
    var searchStatus: String = js.native
    
    var undiscoveredMap: js.Any = js.native
  }
  object TraversalContext {
    
    @scala.inline
    def apply(colorMap: js.Any, searchStatus: String, undiscoveredMap: js.Any): TraversalContext = {
      val __obj = js.Dynamic.literal(colorMap = colorMap.asInstanceOf[js.Any], searchStatus = searchStatus.asInstanceOf[js.Any], undiscoveredMap = undiscoveredMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraversalContext]
    }
    
    @scala.inline
    implicit class TraversalContextMutableBuilder[Self <: TraversalContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorMap(value: js.Any): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchStatus(value: String): Self = StObject.set(x, "searchStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndiscoveredMap(value: js.Any): Self = StObject.set(x, "undiscoveredMap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraversalOptions extends StObject {
    
    var allowEmptyStartVector: Boolean = js.native
    
    var signalStart: Boolean = js.native
    
    var startVector: String | js.Array[String] = js.native
    
    var traverseContext: TraversalContext = js.native
  }
  object TraversalOptions {
    
    @scala.inline
    def apply(
      allowEmptyStartVector: Boolean,
      signalStart: Boolean,
      startVector: String | js.Array[String],
      traverseContext: TraversalContext
    ): TraversalOptions = {
      val __obj = js.Dynamic.literal(allowEmptyStartVector = allowEmptyStartVector.asInstanceOf[js.Any], signalStart = signalStart.asInstanceOf[js.Any], startVector = startVector.asInstanceOf[js.Any], traverseContext = traverseContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraversalOptions]
    }
    
    @scala.inline
    implicit class TraversalOptionsMutableBuilder[Self <: TraversalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmptyStartVector(value: Boolean): Self = StObject.set(x, "allowEmptyStartVector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalStart(value: Boolean): Self = StObject.set(x, "signalStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVector(value: String | js.Array[String]): Self = StObject.set(x, "startVector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVectorVarargs(value: String*): Self = StObject.set(x, "startVector", js.Array(value :_*))
      
      @scala.inline
      def setTraverseContext(value: TraversalContext): Self = StObject.set(x, "traverseContext", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraversalParams extends StObject {
    
    var digraph: DirectedGraph = js.native
    
    var options: js.UndefOr[TraversalOptions] = js.native
    
    var visitor: Visitor = js.native
  }
  object TraversalParams {
    
    @scala.inline
    def apply(digraph: DirectedGraph, visitor: Visitor): TraversalParams = {
      val __obj = js.Dynamic.literal(digraph = digraph.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraversalParams]
    }
    
    @scala.inline
    implicit class TraversalParamsMutableBuilder[Self <: TraversalParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigraph(value: DirectedGraph): Self = StObject.set(x, "digraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: TraversalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setVisitor(value: Visitor): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraversalResult extends StObject {
    
    var error: js.UndefOr[js.Any] = js.native
    
    var result: js.UndefOr[TraversalContext] = js.native
  }
  object TraversalResult {
    
    @scala.inline
    def apply(): TraversalResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalResult]
    }
    
    @scala.inline
    implicit class TraversalResultMutableBuilder[Self <: TraversalResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResult(value: TraversalContext): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  @js.native
  trait VertexRequest extends StObject {
    
    var p: js.Any = js.native
    
    var u: String = js.native
  }
  object VertexRequest {
    
    @scala.inline
    def apply(p: js.Any, u: String): VertexRequest = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[VertexRequest]
    }
    
    @scala.inline
    implicit class VertexRequestMutableBuilder[Self <: VertexRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Visitor extends StObject {
    
    def blackTarget(req: E): Unit = js.native
    
    def discoverVertex(req: G): Unit = js.native
    
    def examineEdge(req: E): Unit = js.native
    
    def examineVertex(req: G): Unit = js.native
    
    def finishVertex(req: G): Unit = js.native
    
    def grayTarget(req: E): Unit = js.native
    
    def initializeVertex(req: G): Unit = js.native
    
    def nonTreeEdge(req: E): Unit = js.native
    
    def startVertex(req: G): Unit = js.native
  }
  object Visitor {
    
    @scala.inline
    def apply(
      blackTarget: E => Unit,
      discoverVertex: G => Unit,
      examineEdge: E => Unit,
      examineVertex: G => Unit,
      finishVertex: G => Unit,
      grayTarget: E => Unit,
      initializeVertex: G => Unit,
      nonTreeEdge: E => Unit,
      startVertex: G => Unit
    ): Visitor = {
      val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1(blackTarget), discoverVertex = js.Any.fromFunction1(discoverVertex), examineEdge = js.Any.fromFunction1(examineEdge), examineVertex = js.Any.fromFunction1(examineVertex), finishVertex = js.Any.fromFunction1(finishVertex), grayTarget = js.Any.fromFunction1(grayTarget), initializeVertex = js.Any.fromFunction1(initializeVertex), nonTreeEdge = js.Any.fromFunction1(nonTreeEdge), startVertex = js.Any.fromFunction1(startVertex))
      __obj.asInstanceOf[Visitor]
    }
    
    @scala.inline
    implicit class VisitorMutableBuilder[Self <: Visitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlackTarget(value: E => Unit): Self = StObject.set(x, "blackTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDiscoverVertex(value: G => Unit): Self = StObject.set(x, "discoverVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExamineEdge(value: E => Unit): Self = StObject.set(x, "examineEdge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExamineVertex(value: G => Unit): Self = StObject.set(x, "examineVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinishVertex(value: G => Unit): Self = StObject.set(x, "finishVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGrayTarget(value: E => Unit): Self = StObject.set(x, "grayTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitializeVertex(value: G => Unit): Self = StObject.set(x, "initializeVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNonTreeEdge(value: E => Unit): Self = StObject.set(x, "nonTreeEdge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartVertex(value: G => Unit): Self = StObject.set(x, "startVertex", js.Any.fromFunction1(value))
    }
  }
  
  type _To = jsGraphStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: jsGraphStatic = ^
  
  @js.native
  trait colors extends StObject {
    
    var black: `2` = js.native
    
    var gray: `1` = js.native
    
    var white: `0` = js.native
  }
  object colors {
    
    @scala.inline
    def apply(black: `2`, gray: `1`, white: `0`): colors = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[colors]
    }
    
    @scala.inline
    implicit class colorsMutableBuilder[Self <: colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlack(value: `2`): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGray(value: `1`): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhite(value: `0`): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait jsGraphStatic extends StObject {
    
    var directed: Directed = js.native
  }
  object jsGraphStatic {
    
    @scala.inline
    def apply(directed: Directed): jsGraphStatic = {
      val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any])
      __obj.asInstanceOf[jsGraphStatic]
    }
    
    @scala.inline
    implicit class jsGraphStaticMutableBuilder[Self <: jsGraphStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirected(value: Directed): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    }
  }
}
