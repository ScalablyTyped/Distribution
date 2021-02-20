package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.X
import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.connectionPoints.ConnectionPointJSON
import typings.jointjs.mod.connectors.Connector
import typings.jointjs.mod.connectors.ConnectorArguments
import typings.jointjs.mod.connectors.ConnectorJSON
import typings.jointjs.mod.connectors.ConnectorType
import typings.jointjs.mod.connectors.GenericConnectorArguments
import typings.jointjs.mod.dia.Cell.Constructor
import typings.jointjs.mod.dia.Cell.EmbeddableOptions
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.dia.Link.EndCellArgs
import typings.jointjs.mod.dia.Link.EndJSON
import typings.jointjs.mod.dia.Link.Label
import typings.jointjs.mod.dia.Link.Vertex
import typings.jointjs.mod.dia.LinkView.LabelOptions
import typings.jointjs.mod.g.PlainPoint
import typings.jointjs.mod.g.Polyline
import typings.jointjs.mod.routers.GenericRouterArguments
import typings.jointjs.mod.routers.Router
import typings.jointjs.mod.routers.RouterArguments
import typings.jointjs.mod.routers.RouterJSON
import typings.jointjs.mod.routers.RouterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Link")
@js.native
// default label props
class Link () extends Cell {
  def this(attributes: Attributes) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
  def this(attributes: Attributes, opt: Options) = this()
  
  def appendLabel(label: Label): js.Array[Label] = js.native
  def appendLabel(label: Label, opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  
  def applyToPoints(fn: js.Function1[/* p */ Point, Point]): this.type = js.native
  def applyToPoints(fn: js.Function1[/* p */ Point, Point], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  var arrowHeadMarkup: String = js.native
  
  def connector(): Connector | ConnectorJSON | Null = js.native
  def connector(connector: Connector): this.type = js.native
  def connector(connector: ConnectorJSON): this.type = js.native
  def connector(connector: ConnectorJSON, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def connector(connector: Connector, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def connector(name: ConnectorType): this.type = js.native
  def connector(name: ConnectorType, args: js.UndefOr[scala.Nothing], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def connector(name: ConnectorType, args: ConnectorArguments): this.type = js.native
  def connector(name: ConnectorType, args: ConnectorArguments, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def disconnect(): this.type = js.native
  
  var doubleToolMarkup: js.UndefOr[String] = js.native
  
  def getPolyline(): Polyline = js.native
  
  def getRelationshipAncestor(): js.UndefOr[Element] = js.native
  
  def getSourceCell(): Null | Cell = js.native
  
  def getSourceElement(): Null | Element = js.native
  
  def getSourcePoint(): typings.jointjs.mod.g.Point = js.native
  
  def getTargetCell(): Null | Cell = js.native
  
  def getTargetElement(): Null | Element = js.native
  
  def getTargetPoint(): typings.jointjs.mod.g.Point = js.native
  
  def hasLoop(): Boolean = js.native
  def hasLoop(opt: EmbeddableOptions): Boolean = js.native
  
  def insertLabel(index: Double, label: Label): js.Array[Label] = js.native
  def insertLabel(index: Double, label: Label, opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  
  def insertVertex(index: Double, vertex: Vertex): js.Array[Vertex] = js.native
  def insertVertex(index: Double, vertex: Vertex, opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Vertex] = js.native
  
  def isRelationshipEmbeddedIn(cell: Cell): Boolean = js.native
  
  def label(): Label = js.native
  def label(index: Double): Label = js.native
  def label(index: Double, label: Label): this.type = js.native
  def label(index: Double, label: Label, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  var labelMarkup: js.UndefOr[String | MarkupJSON] = js.native
  
  // default label markup
  var labelProps: js.UndefOr[Label] = js.native
  
  def labels(): js.Array[Label] = js.native
  def labels(labels: js.Array[Label]): this.type = js.native
  
  def removeLabel(): js.Array[Label] = js.native
  def removeLabel(index: js.UndefOr[scala.Nothing], opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  def removeLabel(index: Double): js.Array[Label] = js.native
  def removeLabel(index: Double, opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Label] = js.native
  
  def removeVertex(): js.Array[Vertex] = js.native
  def removeVertex(index: js.UndefOr[scala.Nothing], opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Vertex] = js.native
  def removeVertex(index: Double): js.Array[Vertex] = js.native
  def removeVertex(index: Double, opt: typings.jointjs.mod.dia.Cell.Options): js.Array[Vertex] = js.native
  
  def reparent(): Element = js.native
  def reparent(opt: typings.jointjs.mod.dia.Cell.Options): Element = js.native
  
  def router(): Router | RouterJSON | Null = js.native
  def router(name: RouterType): this.type = js.native
  def router(name: RouterType, args: js.UndefOr[scala.Nothing], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def router(name: RouterType, args: RouterArguments): this.type = js.native
  def router(name: RouterType, args: RouterArguments, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def router(router: Router): this.type = js.native
  def router(router: RouterJSON): this.type = js.native
  def router(router: RouterJSON, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def router(router: Router, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(
    sx: Double,
    sy: Double,
    origin: js.UndefOr[scala.Nothing],
    opt: typings.jointjs.mod.dia.Cell.Options
  ): this.type = js.native
  def scale(sx: Double, sy: Double, origin: Point): this.type = js.native
  def scale(sx: Double, sy: Double, origin: Point, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def source(): EndJSON = js.native
  def source(source: Cell): this.type = js.native
  def source(source: Cell, args: js.UndefOr[scala.Nothing], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def source(source: Cell, args: EndCellArgs): this.type = js.native
  def source(source: Cell, args: EndCellArgs, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def source(source: EndJSON): this.type = js.native
  def source(source: EndJSON, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def target(): EndJSON = js.native
  def target(target: Cell): this.type = js.native
  def target(target: Cell, args: js.UndefOr[scala.Nothing], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def target(target: Cell, args: EndCellArgs): this.type = js.native
  def target(target: Cell, args: EndCellArgs, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def target(target: EndJSON): this.type = js.native
  def target(target: EndJSON, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  var toolMarkup: String = js.native
  
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def vertex(): Vertex = js.native
  def vertex(index: Double): Vertex = js.native
  def vertex(index: Double, vertex: Vertex): this.type = js.native
  def vertex(index: Double, vertex: Vertex, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  var vertexMarkup: String = js.native
  
  def vertices(): js.Array[Vertex] = js.native
  def vertices(vertices: js.Array[Vertex]): this.type = js.native
}
object Link {
  
  /* static member */
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(
    `type`: String,
    defaults: js.UndefOr[scala.Nothing],
    protoProps: js.UndefOr[scala.Nothing],
    staticProps: js.Any
  ): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any, staticProps: js.Any): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String, defaults: js.Any): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.UndefOr[scala.Nothing], staticProps: js.Any): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[Link] = js.native
  @JSImport("jointjs", "dia.Link.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[Link] = js.native
  
  @js.native
  trait Attributes
    extends typings.jointjs.mod.dia.Cell.GenericAttributes[LinkSelectors]
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
  }
  
  @js.native
  trait EndCellArgs extends StObject {
    
    var anchor: js.UndefOr[AnchorJSON] = js.native
    
    var connectionPoint: js.UndefOr[ConnectionPointJSON] = js.native
    
    var magnet: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[Boolean] = js.native
    
    var selector: js.UndefOr[String] = js.native
  }
  object EndCellArgs {
    
    @scala.inline
    def apply(): EndCellArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndCellArgs]
    }
    
    @scala.inline
    implicit class EndCellArgsMutableBuilder[Self <: EndCellArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: AnchorJSON): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setConnectionPoint(value: ConnectionPointJSON): Self = StObject.set(x, "connectionPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPointUndefined: Self = StObject.set(x, "connectionPoint", js.undefined)
      
      @scala.inline
      def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnetUndefined: Self = StObject.set(x, "magnet", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  @js.native
  trait EndJSON extends EndCellArgs {
    
    var id: js.UndefOr[Double | String] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object EndJSON {
    
    @scala.inline
    def apply(): EndJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndJSON]
    }
    
    @scala.inline
    implicit class EndJSONMutableBuilder[Self <: EndJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait GenericAttributes[T]
    extends typings.jointjs.mod.dia.Cell.GenericAttributes[T] {
    
    var connector: js.UndefOr[Connector | ConnectorJSON] = js.native
    
    var labels: js.UndefOr[js.Array[Label]] = js.native
    
    var manhattan: js.UndefOr[Boolean] = js.native
    
    var router: js.UndefOr[Router | RouterJSON] = js.native
    
    var smooth: js.UndefOr[Boolean] = js.native
    
    var source: js.UndefOr[EndJSON] = js.native
    
    var target: js.UndefOr[EndJSON] = js.native
    
    var vertices: js.UndefOr[js.Array[Point]] = js.native
  }
  object GenericAttributes {
    
    @scala.inline
    def apply[T](): GenericAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericAttributes[T]]
    }
    
    @scala.inline
    implicit class GenericAttributesMutableBuilder[Self <: GenericAttributes[_], T] (val x: Self with GenericAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setConnector(value: Connector | ConnectorJSON): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorFunction4(
        value: (/* sourcePoint */ Point, /* targetPoint */ Point, /* routePoints */ js.Array[Point], /* args */ js.UndefOr[GenericConnectorArguments[ConnectorType]]) => String | typings.jointjs.mod.g.Path
      ): Self = StObject.set(x, "connector", js.Any.fromFunction4(value))
      
      @scala.inline
      def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setManhattan(value: Boolean): Self = StObject.set(x, "manhattan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManhattanUndefined: Self = StObject.set(x, "manhattan", js.undefined)
      
      @scala.inline
      def setRouter(value: Router | RouterJSON): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterFunction3(
        value: (/* vertices */ js.Array[Point], /* args */ js.UndefOr[GenericRouterArguments[RouterType]], /* linkView */ js.UndefOr[LinkView]) => js.Array[Point]
      ): Self = StObject.set(x, "router", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setSource(value: EndJSON): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: EndJSON): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVertices(value: js.Array[Point]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
      
      @scala.inline
      def setVerticesVarargs(value: Point*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    // optional for default labels
    var attrs: js.UndefOr[Selectors] = js.native
    
    var markup: js.UndefOr[String | MarkupJSON] = js.native
    
    var position: js.UndefOr[LabelPosition | Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
  }
  object Label {
    
    @scala.inline
    def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Selectors): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setMarkup(value: String | MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setPosition(value: LabelPosition | Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait LabelPosition extends StObject {
    
    var angle: js.UndefOr[Double] = js.native
    
    var args: js.UndefOr[LabelOptions] = js.native
    
    var distance: js.UndefOr[Double] = js.native
    
    // optional for default labels
    var offset: js.UndefOr[Double | X] = js.native
  }
  object LabelPosition {
    
    @scala.inline
    def apply(): LabelPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelPosition]
    }
    
    @scala.inline
    implicit class LabelPositionMutableBuilder[Self <: LabelPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setArgs(value: LabelOptions): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait LinkSelectors extends Selectors {
    
    @JSName(".connection")
    var Dotconnection: js.UndefOr[SVGPathAttributes] = js.native
    
    @JSName(".connection-wrap")
    var `Dotconnection-wrap`: js.UndefOr[SVGPathAttributes] = js.native
    
    @JSName(".labels")
    var Dotlabels: js.UndefOr[SVGAttributes] = js.native
    
    @JSName(".link-tools")
    var `Dotlink-tools`: js.UndefOr[SVGAttributes] = js.native
    
    @JSName(".marker-arrowheads")
    var `Dotmarker-arrowheads`: js.UndefOr[SVGAttributes] = js.native
    
    @JSName(".marker-source")
    var `Dotmarker-source`: js.UndefOr[SVGPathAttributes] = js.native
    
    @JSName(".marker-target")
    var `Dotmarker-target`: js.UndefOr[SVGPathAttributes] = js.native
    
    @JSName(".marker-vertices")
    var `Dotmarker-vertices`: js.UndefOr[SVGAttributes] = js.native
  }
  object LinkSelectors {
    
    @scala.inline
    def apply(): LinkSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkSelectors]
    }
    
    @scala.inline
    implicit class LinkSelectorsMutableBuilder[Self <: LinkSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotconnection(value: SVGPathAttributes): Self = StObject.set(x, ".connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotconnection-wrap`(value: SVGPathAttributes): Self = StObject.set(x, ".connection-wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotconnection-wrapUndefined`: Self = StObject.set(x, ".connection-wrap", js.undefined)
      
      @scala.inline
      def setDotconnectionUndefined: Self = StObject.set(x, ".connection", js.undefined)
      
      @scala.inline
      def setDotlabels(value: SVGAttributes): Self = StObject.set(x, ".labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotlabelsUndefined: Self = StObject.set(x, ".labels", js.undefined)
      
      @scala.inline
      def `setDotlink-tools`(value: SVGAttributes): Self = StObject.set(x, ".link-tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotlink-toolsUndefined`: Self = StObject.set(x, ".link-tools", js.undefined)
      
      @scala.inline
      def `setDotmarker-arrowheads`(value: SVGAttributes): Self = StObject.set(x, ".marker-arrowheads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotmarker-arrowheadsUndefined`: Self = StObject.set(x, ".marker-arrowheads", js.undefined)
      
      @scala.inline
      def `setDotmarker-source`(value: SVGPathAttributes): Self = StObject.set(x, ".marker-source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotmarker-sourceUndefined`: Self = StObject.set(x, ".marker-source", js.undefined)
      
      @scala.inline
      def `setDotmarker-target`(value: SVGPathAttributes): Self = StObject.set(x, ".marker-target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotmarker-targetUndefined`: Self = StObject.set(x, ".marker-target", js.undefined)
      
      @scala.inline
      def `setDotmarker-vertices`(value: SVGAttributes): Self = StObject.set(x, ".marker-vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotmarker-verticesUndefined`: Self = StObject.set(x, ".marker-vertices", js.undefined)
    }
  }
  
  @js.native
  trait Vertex
    extends PlainPoint
       with /* key */ StringDictionary[js.Any]
  object Vertex {
    
    @scala.inline
    def apply(x: Double, y: Double): Vertex = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vertex]
    }
  }
}
