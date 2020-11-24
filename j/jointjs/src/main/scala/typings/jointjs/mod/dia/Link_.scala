package typings.jointjs.mod.dia

import typings.jointjs.mod.connectors.Connector
import typings.jointjs.mod.connectors.ConnectorArguments
import typings.jointjs.mod.connectors.ConnectorJSON
import typings.jointjs.mod.connectors.ConnectorType
import typings.jointjs.mod.dia.Cell.EmbeddableOptions
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.dia.Link.EndCellArgs
import typings.jointjs.mod.dia.Link.EndJSON
import typings.jointjs.mod.dia.Link.Label
import typings.jointjs.mod.dia.Link.Vertex
import typings.jointjs.mod.g.Polyline
import typings.jointjs.mod.routers.Router
import typings.jointjs.mod.routers.RouterArguments
import typings.jointjs.mod.routers.RouterJSON
import typings.jointjs.mod.routers.RouterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Link")
@js.native
 // default label props
class Link_ () extends Cell {
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
