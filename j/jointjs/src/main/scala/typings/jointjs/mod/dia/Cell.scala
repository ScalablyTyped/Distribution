package typings.jointjs.mod.dia

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.anon.BreadthFirst
import typings.jointjs.anon.Id
import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.dia.Cell.Attributes
import typings.jointjs.mod.dia.Cell.DisconnectableOptions
import typings.jointjs.mod.dia.Cell.EmbeddableOptions
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Cell.TransitionOptions
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.g.Rect
import typings.jointjs.mod.util.interpolate.InterpolateFunction
import typings.jointjs.mod.util.timing.TimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Cell")
@js.native
class Cell ()
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
  var id_Cell: String | Double = js.native
  
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
object Cell {
  
  /* static member */
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(
    `type`: String,
    defaults: js.UndefOr[scala.Nothing],
    protoProps: js.UndefOr[scala.Nothing],
    staticProps: js.Any
  ): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any, staticProps: js.Any): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String, defaults: js.Any): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.UndefOr[scala.Nothing], staticProps: js.Any): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[Cell] = js.native
  @JSImport("jointjs", "dia.Cell.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[Cell] = js.native
  
  @js.native
  trait Attributes extends GenericAttributes[Selectors]
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
  }
  
  @js.native
  trait Constructor[T /* <: Model[_, ModelSetOptions, js.Object] */]
    extends Instantiable0[T]
       with Instantiable1[/* opt */ Id, T] {
    
    def define(`type`: String): Constructor[T] = js.native
    def define(
      `type`: String,
      defaults: js.UndefOr[scala.Nothing],
      protoProps: js.UndefOr[scala.Nothing],
      staticProps: js.Any
    ): Constructor[T] = js.native
    def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any): Constructor[T] = js.native
    def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any, staticProps: js.Any): Constructor[T] = js.native
    def define(`type`: String, defaults: js.Any): Constructor[T] = js.native
    def define(`type`: String, defaults: js.Any, protoProps: js.UndefOr[scala.Nothing], staticProps: js.Any): Constructor[T] = js.native
    def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[T] = js.native
    def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[T] = js.native
  }
  
  @js.native
  trait DisconnectableOptions
    extends typings.jointjs.mod.dia.Cell.Options {
    
    var disconnectLinks: js.UndefOr[Boolean] = js.native
  }
  object DisconnectableOptions {
    
    @scala.inline
    def apply(): DisconnectableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisconnectableOptions]
    }
    
    @scala.inline
    implicit class DisconnectableOptionsMutableBuilder[Self <: DisconnectableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisconnectLinks(value: Boolean): Self = StObject.set(x, "disconnectLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnectLinksUndefined: Self = StObject.set(x, "disconnectLinks", js.undefined)
    }
  }
  
  @js.native
  trait EmbeddableOptions
    extends typings.jointjs.mod.dia.Cell.Options {
    
    var deep: js.UndefOr[Boolean] = js.native
  }
  object EmbeddableOptions {
    
    @scala.inline
    def apply(): EmbeddableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbeddableOptions]
    }
    
    @scala.inline
    implicit class EmbeddableOptionsMutableBuilder[Self <: EmbeddableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  @js.native
  trait GenericAttributes[T]
    extends /* key */ StringDictionary[js.Any] {
    
    var attrs: js.UndefOr[T] = js.native
    
    var z: js.UndefOr[Double] = js.native
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
      def setAttrs(value: T): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  type Options = StringDictionary[js.Any]
  
  type Selectors = StringDictionary[js.UndefOr[SVGAttributes]]
  
  @js.native
  trait TransitionOptions
    extends typings.jointjs.mod.dia.Cell.Options {
    
    var delay: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var timingFunction: js.UndefOr[TimingFunction] = js.native
    
    var valueFunction: js.UndefOr[InterpolateFunction[_]] = js.native
  }
  object TransitionOptions {
    
    @scala.inline
    def apply(): TransitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOptions]
    }
    
    @scala.inline
    implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setTimingFunction(value: /* time */ Double => Double): Self = StObject.set(x, "timingFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
      
      @scala.inline
      def setValueFunction(value: (_, _) => js.Function1[/* time */ Double, _]): Self = StObject.set(x, "valueFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueFunctionUndefined: Self = StObject.set(x, "valueFunction", js.undefined)
    }
  }
}
