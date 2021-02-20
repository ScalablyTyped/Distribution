package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.Args
import typings.jointjs.anon.Deep
import typings.jointjs.anon.Dictkey
import typings.jointjs.anon.Groups
import typings.jointjs.anon.Markup
import typings.jointjs.jointjsStrings.auto
import typings.jointjs.mod.dia.Cell.Constructor
import typings.jointjs.mod.dia.Cell.EmbeddableOptions
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Cell.TransitionOptions
import typings.jointjs.mod.dia.Element.Attributes
import typings.jointjs.mod.dia.Element.Port
import typings.jointjs.mod.dia.Element.PortPosition
import typings.jointjs.mod.dia.Element.TranslateOptions
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.g.PlainPoint
import typings.jointjs.mod.g.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Element")
@js.native
class Element () extends Cell {
  def this(attributes: Attributes) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
  def this(attributes: Attributes, opt: Options) = this()
  
  def addPort(port: Port): this.type = js.native
  def addPort(port: Port, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def addPorts(ports: js.Array[Port]): this.type = js.native
  def addPorts(ports: js.Array[Port], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def fitEmbeds(): this.type = js.native
  def fitEmbeds(opt: typings.jointjs.anon.Padding): this.type = js.native
  
  /* protected */ def generatePortId(): String | Double = js.native
  
  def getBBox(opt: EmbeddableOptions): Rect = js.native
  
  def getGroupPorts(groupName: String): js.Array[Port] = js.native
  
  def getPort(id: String): Port = js.native
  
  def getPortIndex(port: String): Double = js.native
  def getPortIndex(port: Port): Double = js.native
  
  def getPorts(): js.Array[Port] = js.native
  
  def getPortsPositions(groupName: String): StringDictionary[PortPosition] = js.native
  
  def hasPort(id: String): Boolean = js.native
  
  def hasPorts(): Boolean = js.native
  
  def portProp(portId: String, path: Path): js.Any = js.native
  def portProp(
    portId: String,
    path: Path,
    value: js.UndefOr[scala.Nothing],
    opt: typings.jointjs.mod.dia.Cell.Options
  ): Element = js.native
  def portProp(portId: String, path: Path, value: js.Any): Element = js.native
  def portProp(portId: String, path: Path, value: js.Any, opt: typings.jointjs.mod.dia.Cell.Options): Element = js.native
  @JSName("portProp")
  def portProp_Element(portId: String, path: Path): Element = js.native
  
  def position(): typings.jointjs.mod.g.Point = js.native
  def position(opt: Dictkey): typings.jointjs.mod.g.Point = js.native
  def position(x: Double, y: Double): this.type = js.native
  def position(x: Double, y: Double, opt: Deep): this.type = js.native
  
  def removePort(port: String): this.type = js.native
  def removePort(port: String, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removePort(port: Port): this.type = js.native
  def removePort(port: Port, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def removePorts(): this.type = js.native
  def removePorts(opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removePorts(ports: js.Array[Port | String]): this.type = js.native
  def removePorts(ports: js.Array[Port | String], opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  
  def resize(width: Double, height: Double): this.type = js.native
  def resize(width: Double, height: Double, opt: typings.jointjs.anon.Direction): this.type = js.native
  
  def rotate(deg: Double): this.type = js.native
  def rotate(
    deg: Double,
    absolute: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    opt: StringDictionary[js.Any]
  ): this.type = js.native
  def rotate(deg: Double, absolute: js.UndefOr[scala.Nothing], origin: Point): this.type = js.native
  def rotate(deg: Double, absolute: js.UndefOr[scala.Nothing], origin: Point, opt: StringDictionary[js.Any]): this.type = js.native
  def rotate(deg: Double, absolute: Boolean): this.type = js.native
  def rotate(deg: Double, absolute: Boolean, origin: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): this.type = js.native
  def rotate(deg: Double, absolute: Boolean, origin: Point): this.type = js.native
  def rotate(deg: Double, absolute: Boolean, origin: Point, opt: StringDictionary[js.Any]): this.type = js.native
  
  def scale(scaleX: Double, scaleY: Double): this.type = js.native
  def scale(scaleX: Double, scaleY: Double, origin: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): this.type = js.native
  def scale(scaleX: Double, scaleY: Double, origin: Point): this.type = js.native
  def scale(scaleX: Double, scaleY: Double, origin: Point, opt: StringDictionary[js.Any]): this.type = js.native
  
  def size(): Size = js.native
  def size(width: Double): this.type = js.native
  def size(width: Double, height: js.UndefOr[scala.Nothing], opt: typings.jointjs.anon.Direction): this.type = js.native
  def size(width: Double, height: Double): this.type = js.native
  def size(width: Double, height: Double, opt: typings.jointjs.anon.Direction): this.type = js.native
  
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: js.UndefOr[scala.Nothing], opt: TranslateOptions): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: TranslateOptions): this.type = js.native
}
object Element {
  
  /* static member */
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(
    `type`: String,
    defaults: js.UndefOr[scala.Nothing],
    protoProps: js.UndefOr[scala.Nothing],
    staticProps: js.Any
  ): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any, staticProps: js.Any): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String, defaults: js.Any): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.UndefOr[scala.Nothing], staticProps: js.Any): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[Element] = js.native
  @JSImport("jointjs", "dia.Element.define")
  @js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[Element] = js.native
  
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
  trait GenericAttributes[T]
    extends typings.jointjs.mod.dia.Cell.GenericAttributes[T] {
    
    var angle: js.UndefOr[Double] = js.native
    
    var markup: js.UndefOr[String | MarkupJSON] = js.native
    
    var ports: js.UndefOr[Groups] = js.native
    
    var position: js.UndefOr[Point] = js.native
    
    var size: js.UndefOr[Size] = js.native
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
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setMarkup(value: String | MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setPorts(value: Groups): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Port extends StObject {
    
    var args: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var attrs: js.UndefOr[Selectors] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[Markup] = js.native
    
    var markup: js.UndefOr[String | MarkupJSON] = js.native
    
    var z: js.UndefOr[Double | auto] = js.native
  }
  object Port {
    
    @scala.inline
    def apply(): Port = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setAttrs(value: Selectors): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: Markup): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMarkup(value: String | MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setZ(value: Double | auto): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  @js.native
  trait PortGroup extends StObject {
    
    var attrs: js.UndefOr[Selectors] = js.native
    
    var label: js.UndefOr[Markup] = js.native
    
    var markup: js.UndefOr[String | MarkupJSON] = js.native
    
    var position: js.UndefOr[PositionType] = js.native
  }
  object PortGroup {
    
    @scala.inline
    def apply(): PortGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortGroup]
    }
    
    @scala.inline
    implicit class PortGroupMutableBuilder[Self <: PortGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Selectors): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setLabel(value: Markup): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMarkup(value: String | MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait PortPosition extends PlainPoint {
    
    var angle: Double = js.native
  }
  object PortPosition {
    
    @scala.inline
    def apply(angle: Double, x: Double, y: Double): PortPosition = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortPosition]
    }
    
    @scala.inline
    implicit class PortPositionMutableBuilder[Self <: PortPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    }
  }
  
  type PositionType = String | Args
  
  @js.native
  trait TranslateOptions extends StObject {
    
    var restrictedArea: js.UndefOr[BBox] = js.native
    
    var transition: js.UndefOr[TransitionOptions] = js.native
  }
  object TranslateOptions {
    
    @scala.inline
    def apply(): TranslateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateOptions]
    }
    
    @scala.inline
    implicit class TranslateOptionsMutableBuilder[Self <: TranslateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestrictedArea(value: BBox): Self = StObject.set(x, "restrictedArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictedAreaUndefined: Self = StObject.set(x, "restrictedArea", js.undefined)
      
      @scala.inline
      def setTransition(value: TransitionOptions): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
