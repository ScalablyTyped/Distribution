package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.anon.BreadthFirst
import typings.jointjs.mod.dia.Cell.Attributes
import typings.jointjs.mod.dia.Cell.DisconnectableOptions
import typings.jointjs.mod.dia.Cell.EmbeddableOptions
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Cell.TransitionOptions
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.g.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Cell")
@js.native
class Cell_ ()
  extends Model[js.Any, ModelSetOptions, js.Object] {
  def this(attributes: Attributes) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
  def this(attributes: Attributes, opt: Options) = this()
  
  def addTo(graph: Graph): this.type = js.native
  def addTo(graph: Graph, opt: Options): this.type = js.native
  
  def angle(): Double = js.native
  
  def attr(): js.Any = js.native
  def attr(key: Path): js.Any = js.native
  def attr(key: Path, value: js.Any): this.type = js.native
  def attr(key: Path, value: js.Any, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def attr(`object`: Selectors): this.type = js.native
  def attr(`object`: Selectors, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def clone(opt: EmbeddableOptions): Cell | js.Array[Cell] = js.native
  
  def embed(cell: Cell): this.type = js.native
  def embed(cell: Cell, opt: Options): this.type = js.native
  
  def findView(paper: Paper): CellView = js.native
  
  /* protected */ def generateId(): String | Double = js.native
  
  def getAncestors(): js.Array[Cell] = js.native
  
  def getBBox(): Rect = js.native
  
  def getChangeFlag(attributes: StringDictionary[Double]): Double = js.native
  
  def getEmbeddedCells(): js.Array[Cell] = js.native
  def getEmbeddedCells(opt: BreadthFirst): js.Array[Cell] = js.native
  
  def getParentCell(): Cell | Null = js.native
  
  def getPointFromConnectedLink(link: Link, endType: LinkEnd): typings.jointjs.mod.g.Point = js.native
  
  def getTransitions(): js.Array[String] = js.native
  
  var graph: Graph = js.native
  
  @JSName("id")
  var id_Cell_ : String | Double = js.native
  
  def isElement(): Boolean = js.native
  
  def isEmbedded(): Boolean = js.native
  
  def isEmbeddedIn(cell: Cell): Boolean = js.native
  def isEmbeddedIn(cell: Cell, opt: EmbeddableOptions): Boolean = js.native
  
  def isLink(): Boolean = js.native
  
  var markup: String | MarkupJSON = js.native
  
  def parent(): String = js.native
  def parent(parentId: String): this.type = js.native
  
  /**
    * @deprecated
    */
  /* protected */ def processPorts(): Unit = js.native
  
  def prop(key: Path): js.Any = js.native
  def prop(key: Path, value: js.Any): this.type = js.native
  def prop(key: Path, value: js.Any, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def prop(`object`: Attributes): this.type = js.native
  def prop(`object`: Attributes, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def remove(): this.type = js.native
  def remove(opt: DisconnectableOptions): this.type = js.native
  
  def removeAttr(path: Path): this.type = js.native
  def removeAttr(path: Path, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def removeProp(path: Path): this.type = js.native
  def removeProp(path: Path, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def startBatch(name: String): this.type = js.native
  def startBatch(name: String, opt: Options): this.type = js.native
  
  def stopBatch(name: String): this.type = js.native
  def stopBatch(name: String, opt: Options): this.type = js.native
  
  def stopTransitions(): this.type = js.native
  def stopTransitions(path: js.UndefOr[scala.Nothing], delim: String): this.type = js.native
  def stopTransitions(path: String): this.type = js.native
  def stopTransitions(path: String, delim: String): this.type = js.native
  
  def toBack(): this.type = js.native
  def toBack(opt: EmbeddableOptions): this.type = js.native
  
  def toFront(): this.type = js.native
  def toFront(opt: EmbeddableOptions): this.type = js.native
  
  def toJSON(): js.Any = js.native
  
  def transition(path: String): Double = js.native
  def transition(path: String, value: js.UndefOr[scala.Nothing], opt: js.UndefOr[scala.Nothing], delim: String): Double = js.native
  def transition(path: String, value: js.UndefOr[scala.Nothing], opt: TransitionOptions): Double = js.native
  def transition(path: String, value: js.UndefOr[scala.Nothing], opt: TransitionOptions, delim: String): Double = js.native
  def transition(path: String, value: js.Any): Double = js.native
  def transition(path: String, value: js.Any, opt: js.UndefOr[scala.Nothing], delim: String): Double = js.native
  def transition(path: String, value: js.Any, opt: TransitionOptions): Double = js.native
  def transition(path: String, value: js.Any, opt: TransitionOptions, delim: String): Double = js.native
  
  def unembed(cell: Cell): this.type = js.native
  def unembed(cell: Cell, opt: Options): this.type = js.native
}
