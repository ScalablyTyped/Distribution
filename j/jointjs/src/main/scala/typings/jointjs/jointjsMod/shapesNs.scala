package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.Anon_KeyStyle
import typings.jointjs.jointjsMod.attributesNs.SVGAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGCircleAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGEllipseAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGImageAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGPathAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGPolygonAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGPolylineAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGRectAttributes
import typings.jointjs.jointjsMod.attributesNs.SVGTextAttributes
import typings.jointjs.jointjsMod.diaNs.CellNs.Selectors
import typings.jointjs.jointjsMod.diaNs.Element
import typings.jointjs.jointjsMod.diaNs.ElementNs.Attributes
import typings.jointjs.jointjsMod.diaNs.ElementNs.GenericAttributes
import typings.jointjs.jointjsMod.diaNs.ElementView
import typings.jointjs.jointjsMod.diaNs.GraphNs.Options
import typings.jointjs.jointjsMod.diaNs.Link
import typings.jointjs.jointjsMod.shapesNs.SVGCircleSelector
import typings.jointjs.jointjsMod.shapesNs.SVGEllipseSelector
import typings.jointjs.jointjsMod.shapesNs.SVGImageSelector
import typings.jointjs.jointjsMod.shapesNs.SVGPathSelector
import typings.jointjs.jointjsMod.shapesNs.SVGPolygonSelector
import typings.jointjs.jointjsMod.shapesNs.SVGPolylineSelector
import typings.jointjs.jointjsMod.shapesNs.SVGRectSelector
import typings.jointjs.jointjsMod.shapesNs.SVGTextSelector
import typings.jointjs.jointjsMod.shapesNs.basicNs.Circle
import typings.jointjs.jointjsMod.shapesNs.basicNs.CircleSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.EllipseSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.Generic
import typings.jointjs.jointjsMod.shapesNs.basicNs.ImageSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.PathSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.PolygonSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.PolylineSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.RectSelectors
import typings.jointjs.jointjsMod.shapesNs.basicNs.TextBlockSelectors
import typings.jointjs.jointjsMod.shapesNs.devsNs.Model
import typings.jointjs.jointjsMod.shapesNs.devsNs.ModelAttributes
import typings.jointjs.jointjsMod.shapesNs.devsNs.ModelSelectors
import typings.jointjs.jointjsMod.shapesNs.erdNs.Attribute
import typings.jointjs.jointjsMod.shapesNs.erdNs.EllipsoidSelectors
import typings.jointjs.jointjsMod.shapesNs.erdNs.Entity
import typings.jointjs.jointjsMod.shapesNs.erdNs.PolygonalSelectors
import typings.jointjs.jointjsMod.shapesNs.erdNs.Relationship
import typings.jointjs.jointjsMod.shapesNs.fsaNs.CirculoidSelectors
import typings.jointjs.jointjsMod.shapesNs.logicNs.Gate
import typings.jointjs.jointjsMod.shapesNs.logicNs.Gate11
import typings.jointjs.jointjsMod.shapesNs.logicNs.Gate11Selectors
import typings.jointjs.jointjsMod.shapesNs.logicNs.Gate21
import typings.jointjs.jointjsMod.shapesNs.logicNs.Gate21Selectors
import typings.jointjs.jointjsMod.shapesNs.logicNs.IO
import typings.jointjs.jointjsMod.shapesNs.orgNs.MemberSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.BorderedImageSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.CylinderBodyAttributes
import typings.jointjs.jointjsMod.shapesNs.standardNs.CylinderSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.DoubleLinkSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.EmbeddedImageSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.HeaderedRectangleSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.InscribedImageSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.LinkSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.RectangleSelectors
import typings.jointjs.jointjsMod.shapesNs.standardNs.ShadowLinkSelectors
import typings.jointjs.jointjsMod.shapesNs.umlNs.Class
import typings.jointjs.jointjsMod.shapesNs.umlNs.ClassAttributes
import typings.jointjs.jointjsMod.shapesNs.umlNs.ClassView
import typings.jointjs.jointjsMod.shapesNs.umlNs.EndStateSelectors
import typings.jointjs.jointjsMod.shapesNs.umlNs.StateSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "shapes")
@js.native
object shapesNs extends js.Object {
  trait SVGCircleSelector extends Selectors {
    var circle: js.UndefOr[SVGCircleAttributes] = js.undefined
  }
  
  trait SVGEllipseSelector extends Selectors {
    var ellipse: js.UndefOr[SVGEllipseAttributes] = js.undefined
  }
  
  trait SVGImageSelector extends Selectors {
    var image: js.UndefOr[SVGImageAttributes] = js.undefined
  }
  
  trait SVGPathSelector extends Selectors {
    var path: js.UndefOr[SVGPathAttributes] = js.undefined
  }
  
  trait SVGPolygonSelector extends Selectors {
    var polygon: js.UndefOr[SVGPolygonAttributes] = js.undefined
  }
  
  trait SVGPolylineSelector extends Selectors {
    var polyline: js.UndefOr[SVGPolylineAttributes] = js.undefined
  }
  
  trait SVGRectSelector extends Selectors {
    var rect: js.UndefOr[SVGRectAttributes] = js.undefined
  }
  
  trait SVGTextSelector extends Selectors {
    var text: js.UndefOr[SVGTextAttributes] = js.undefined
  }
  
  @JSName("basic")
  @js.native
  object basicNs extends js.Object {
    @js.native
    class Circle () extends Generic {
      def this(attributes: GenericAttributes[CircleSelectors]) = this()
      def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait CircleSelectors
      extends SVGTextSelector
         with SVGCircleSelector
    
    @js.native
    class Ellipse () extends Generic {
      def this(attributes: GenericAttributes[EllipseSelectors]) = this()
      def this(attributes: GenericAttributes[EllipseSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait EllipseSelectors
      extends SVGTextSelector
         with SVGEllipseSelector
    
    @js.native
    class Generic () extends Element
    
    @js.native
    class Image () extends Generic {
      def this(attributes: GenericAttributes[ImageSelectors]) = this()
      def this(attributes: GenericAttributes[ImageSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait ImageSelectors
      extends SVGTextSelector
         with SVGImageSelector
    
    @js.native
    class Path () extends Generic {
      def this(attributes: GenericAttributes[PathSelectors]) = this()
      def this(attributes: GenericAttributes[PathSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait PathSelectors
      extends SVGTextSelector
         with SVGPathSelector
    
    @js.native
    class Polygon () extends Generic {
      def this(attributes: GenericAttributes[PolygonSelectors]) = this()
      def this(attributes: GenericAttributes[PolygonSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait PolygonSelectors
      extends SVGTextSelector
         with SVGPolygonSelector
    
    @js.native
    class Polyline () extends Generic {
      def this(attributes: GenericAttributes[PolylineSelectors]) = this()
      def this(attributes: GenericAttributes[PolylineSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait PolylineSelectors
      extends SVGTextSelector
         with SVGPolylineSelector
    
    @js.native
    class Rect () extends Generic {
      def this(attributes: GenericAttributes[RectSelectors]) = this()
      def this(attributes: GenericAttributes[RectSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait RectSelectors
      extends SVGTextSelector
         with SVGRectSelector
    
    @js.native
    class Rhombus () extends Generic {
      def this(attributes: GenericAttributes[PathSelectors]) = this()
      def this(attributes: GenericAttributes[PathSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Text () extends Generic {
      def this(attributes: GenericAttributes[SVGTextSelector]) = this()
      def this(attributes: GenericAttributes[SVGTextSelector], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class TextBlock () extends Generic {
      def this(attributes: GenericAttributes[TextBlockSelectors]) = this()
      def this(attributes: GenericAttributes[TextBlockSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait TextBlockSelectors
      extends SVGTextSelector
         with SVGRectSelector {
      var `.content`: js.UndefOr[SVGTextAttributes] = js.undefined
    }
    
  }
  
  @JSName("chess")
  @js.native
  object chessNs extends js.Object {
    @js.native
    class BishopBlack () extends Generic
    
    @js.native
    class BishopWhite () extends Generic
    
    @js.native
    class KingBlack () extends Generic
    
    @js.native
    class KingWhite () extends Generic
    
    @js.native
    class KnightBlack () extends Generic
    
    @js.native
    class KnightWhite () extends Generic
    
    @js.native
    class PawnBlack () extends Generic
    
    @js.native
    class PawnWhite () extends Generic
    
    @js.native
    class QueenBlack () extends Generic
    
    @js.native
    class QueenWhite () extends Generic
    
    @js.native
    class RookBlack () extends Generic
    
    @js.native
    class RookWhite () extends Generic
    
  }
  
  @JSName("devs")
  @js.native
  object devsNs extends js.Object {
    @js.native
    class Atomic () extends Model
    
    @js.native
    class Coupled () extends Model
    
    @js.native
    class Link ()
      extends typings.jointjs.jointjsMod.diaNs.Link
    
    @js.native
    class Model () extends Generic {
      def this(attributes: ModelAttributes) = this()
      def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
      def addInPort(port: String): this.type = js.native
      def addInPort(port: String, opt: js.Any): this.type = js.native
      def addOutPort(port: String): this.type = js.native
      def addOutPort(port: String, opt: js.Any): this.type = js.native
      def changeInGroup(properties: js.Any): Boolean = js.native
      def changeInGroup(properties: js.Any, opt: js.Any): Boolean = js.native
      def changeOutGroup(properties: js.Any): Boolean = js.native
      def changeOutGroup(properties: js.Any, opt: js.Any): Boolean = js.native
      def createPortItem(group: String, port: String): js.Any = js.native
      def createPortItems(group: String, ports: js.Array[String]): js.Array[_] = js.native
      def removeInPort(port: String): this.type = js.native
      def removeInPort(port: String, opt: js.Any): this.type = js.native
      def removeOutPort(port: String): this.type = js.native
      def removeOutPort(port: String, opt: js.Any): this.type = js.native
    }
    
    trait ModelAttributes extends GenericAttributes[ModelSelectors] {
      var inPorts: js.UndefOr[js.Array[String]] = js.undefined
      var outPorts: js.UndefOr[js.Array[String]] = js.undefined
    }
    
    trait ModelSelectors extends Selectors {
      var `.body`: js.UndefOr[SVGRectAttributes] = js.undefined
      var `.label`: js.UndefOr[SVGTextAttributes] = js.undefined
    }
    
  }
  
  @JSName("erd")
  @js.native
  object erdNs extends js.Object {
    @js.native
    class Attribute () extends Element {
      def this(attributes: GenericAttributes[EllipsoidSelectors]) = this()
      def this(attributes: GenericAttributes[EllipsoidSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Derived () extends Attribute
    
    trait EllipsoidSelectors extends Selectors {
      var `.body`: js.UndefOr[SVGEllipseAttributes] = js.undefined
      var `.label`: js.UndefOr[SVGEllipseAttributes] = js.undefined
      var text: js.UndefOr[SVGTextAttributes] = js.undefined
    }
    
    @js.native
    class Entity () extends Generic {
      def this(attributes: GenericAttributes[PolygonalSelectors]) = this()
      def this(attributes: GenericAttributes[PolygonalSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class ISA () extends Element {
      def this(attributes: GenericAttributes[PolygonSelectors]) = this()
      def this(attributes: GenericAttributes[PolygonSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class IdentifyingRelationship () extends Relationship
    
    @js.native
    class Key () extends Attribute
    
    @js.native
    class Line () extends Link {
      def cardinality(value: String): Unit = js.native
      def cardinality(value: Double): Unit = js.native
    }
    
    @js.native
    class Multivalued () extends Attribute
    
    @js.native
    class Normal () extends Attribute
    
    trait PolygonalSelectors extends Selectors {
      var `.body`: js.UndefOr[SVGPolygonAttributes] = js.undefined
      var `.label`: js.UndefOr[SVGPolygonAttributes] = js.undefined
      var text: js.UndefOr[SVGTextAttributes] = js.undefined
    }
    
    @js.native
    class Relationship () extends Element {
      def this(attributes: GenericAttributes[PolygonalSelectors]) = this()
      def this(attributes: GenericAttributes[PolygonalSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class WeakEntity () extends Entity
    
  }
  
  @JSName("fsa")
  @js.native
  object fsaNs extends js.Object {
    @js.native
    class Arrow () extends Link
    
    trait CirculoidSelectors extends Selectors {
      var `.inner`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var `.outer`: js.UndefOr[SVGCircleAttributes] = js.undefined
    }
    
    @js.native
    class EndState () extends Element {
      def this(attributes: GenericAttributes[CirculoidSelectors]) = this()
      def this(attributes: GenericAttributes[CirculoidSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class StartState () extends Element {
      def this(attributes: GenericAttributes[SVGCircleSelector]) = this()
      def this(attributes: GenericAttributes[SVGCircleSelector], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class State () extends Circle
    
  }
  
  @JSName("logic")
  @js.native
  object logicNs extends js.Object {
    @js.native
    class And () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): Boolean = js.native
    }
    
    @js.native
    abstract class Gate () extends Generic
    
    @js.native
    class Gate11 () extends Gate {
      def this(attributes: GenericAttributes[Gate11Selectors]) = this()
      def this(attributes: GenericAttributes[Gate11Selectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait Gate11Selectors extends Selectors {
      var `.body`: js.UndefOr[SVGImageAttributes] = js.undefined
      var `.input`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var `.output`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
    }
    
    @js.native
    class Gate21 () extends Gate {
      def this(attributes: GenericAttributes[Gate21Selectors]) = this()
      def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait Gate21Selectors extends Selectors {
      var `.body`: js.UndefOr[SVGImageAttributes] = js.undefined
      var `.input`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var `.input1`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var `.input2`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var `.output`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
    }
    
    trait GateSelectors extends Selectors {
      var `.body`: js.UndefOr[SVGRectAttributes] = js.undefined
      var `.wire`: js.UndefOr[SVGPathAttributes] = js.undefined
      var circle: js.UndefOr[SVGCircleAttributes] = js.undefined
      var text: js.UndefOr[SVGTextAttributes] = js.undefined
    }
    
    @js.native
    class IO () extends Gate {
      def this(attributes: GenericAttributes[CircleSelectors]) = this()
      def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Input () extends IO
    
    @js.native
    class Nand () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): Boolean = js.native
    }
    
    @js.native
    class Nor () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): Boolean = js.native
    }
    
    @js.native
    class Not () extends Gate11 {
      def operation(input: js.Any): Boolean = js.native
    }
    
    @js.native
    class Or () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): Boolean = js.native
    }
    
    @js.native
    class Output () extends IO
    
    @js.native
    class Repeater () extends Gate11 {
      def operation(input: js.Any): js.Any = js.native
    }
    
    @js.native
    class Wire () extends Link
    
    @js.native
    class Xnor () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): Boolean = js.native
    }
    
    @js.native
    class Xor () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): Boolean = js.native
    }
    
  }
  
  @JSName("org")
  @js.native
  object orgNs extends js.Object {
    @js.native
    class Arrow () extends Link
    
    @js.native
    class Member () extends Element {
      def this(attributes: GenericAttributes[MemberSelectors]) = this()
      def this(attributes: GenericAttributes[MemberSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait MemberSelectors extends Selectors {
      var `.card`: js.UndefOr[SVGRectAttributes] = js.undefined
      var `.name`: js.UndefOr[SVGTextAttributes] = js.undefined
      var `.rank`: js.UndefOr[SVGTextAttributes] = js.undefined
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
    }
    
  }
  
  @JSName("pn")
  @js.native
  object pnNs extends js.Object {
    @js.native
    class Link ()
      extends typings.jointjs.jointjsMod.diaNs.Link
    
    @js.native
    class Place () extends Generic {
      def this(attributes: Attributes) = this()
      def this(attributes: Attributes, opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class PlaceView () extends ElementView {
      def renderTokens(): Unit = js.native
    }
    
    @js.native
    class Transition () extends Generic {
      def this(attributes: GenericAttributes[SVGRectSelector]) = this()
      def this(attributes: GenericAttributes[SVGRectSelector], opt: StringDictionary[js.Any]) = this()
    }
    
  }
  
  @JSName("standard")
  @js.native
  object standardNs extends js.Object {
    @js.native
    class BorderedImage () extends Element {
      def this(attributes: GenericAttributes[BorderedImageSelectors]) = this()
      def this(attributes: GenericAttributes[BorderedImageSelectors], opt: Options) = this()
    }
    
    trait BorderedImageSelectors extends js.Object {
      var background: js.UndefOr[SVGRectAttributes] = js.undefined
      var border: js.UndefOr[SVGRectAttributes] = js.undefined
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Circle () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.CircleSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.CircleSelectors],
        opt: Options
      ) = this()
    }
    
    trait CircleSelectors extends js.Object {
      var body: js.UndefOr[SVGCircleAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Cylinder () extends Element {
      def this(attributes: GenericAttributes[CylinderSelectors]) = this()
      def this(attributes: GenericAttributes[CylinderSelectors], opt: Options) = this()
      def topRy(): String | Double = js.native
      def topRy(t: String): this.type = js.native
      def topRy(t: String, opt: typings.jointjs.jointjsMod.diaNs.CellNs.Options): this.type = js.native
      def topRy(t: Double): this.type = js.native
      def topRy(t: Double, opt: typings.jointjs.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    }
    
    trait CylinderBodyAttributes extends SVGPathAttributes {
      var lateralArea: js.UndefOr[String | Double] = js.undefined
    }
    
    trait CylinderSelectors extends js.Object {
      var body: js.UndefOr[CylinderBodyAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
      var top: js.UndefOr[SVGEllipseAttributes] = js.undefined
    }
    
    @js.native
    class DoubleLink ()
      extends typings.jointjs.jointjsMod.diaNs.Link {
      def this(attributes: typings.jointjs.jointjsMod.diaNs.LinkNs.GenericAttributes[DoubleLinkSelectors]) = this()
      def this(
        attributes: typings.jointjs.jointjsMod.diaNs.LinkNs.GenericAttributes[DoubleLinkSelectors],
        opt: Options
      ) = this()
    }
    
    trait DoubleLinkSelectors extends js.Object {
      var line: js.UndefOr[SVGPathAttributes] = js.undefined
      var outline: js.UndefOr[SVGPathAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Ellipse () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.EllipseSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.EllipseSelectors],
        opt: Options
      ) = this()
    }
    
    trait EllipseSelectors extends js.Object {
      var body: js.UndefOr[SVGCircleAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class EmbeddedImage () extends Element {
      def this(attributes: GenericAttributes[EmbeddedImageSelectors]) = this()
      def this(attributes: GenericAttributes[EmbeddedImageSelectors], opt: Options) = this()
    }
    
    trait EmbeddedImageSelectors extends js.Object {
      var body: js.UndefOr[SVGRectAttributes] = js.undefined
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class HeaderedRectangle () extends Element {
      def this(attributes: GenericAttributes[HeaderedRectangleSelectors]) = this()
      def this(attributes: GenericAttributes[HeaderedRectangleSelectors], opt: Options) = this()
    }
    
    trait HeaderedRectangleSelectors extends js.Object {
      var body: js.UndefOr[SVGRectAttributes] = js.undefined
      var bodyText: js.UndefOr[SVGTextAttributes] = js.undefined
      var header: js.UndefOr[SVGRectAttributes] = js.undefined
      var headerText: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Image () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.ImageSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.ImageSelectors],
        opt: Options
      ) = this()
    }
    
    trait ImageSelectors extends js.Object {
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class InscribedImage () extends Element {
      def this(attributes: GenericAttributes[InscribedImageSelectors]) = this()
      def this(attributes: GenericAttributes[InscribedImageSelectors], opt: Options) = this()
    }
    
    trait InscribedImageSelectors extends js.Object {
      var background: js.UndefOr[SVGEllipseAttributes] = js.undefined
      var border: js.UndefOr[SVGEllipseAttributes] = js.undefined
      var image: js.UndefOr[SVGImageAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Link ()
      extends typings.jointjs.jointjsMod.diaNs.Link {
      def this(attributes: typings.jointjs.jointjsMod.diaNs.LinkNs.GenericAttributes[LinkSelectors]) = this()
      def this(attributes: typings.jointjs.jointjsMod.diaNs.LinkNs.GenericAttributes[LinkSelectors], opt: Options) = this()
    }
    
    trait LinkSelectors extends js.Object {
      var line: js.UndefOr[SVGPathAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
      var wrapper: js.UndefOr[SVGPathAttributes] = js.undefined
    }
    
    @js.native
    class Path () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.PathSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.PathSelectors],
        opt: Options
      ) = this()
    }
    
    trait PathSelectors extends js.Object {
      var body: js.UndefOr[SVGPathAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Polygon () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.PolygonSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.PolygonSelectors],
        opt: Options
      ) = this()
    }
    
    trait PolygonSelectors extends js.Object {
      var body: js.UndefOr[SVGPolygonAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Polyline () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.PolylineSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.PolylineSelectors],
        opt: Options
      ) = this()
    }
    
    trait PolylineSelectors extends js.Object {
      var body: js.UndefOr[SVGPolylineAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class Rectangle () extends Element {
      def this(attributes: GenericAttributes[RectangleSelectors]) = this()
      def this(attributes: GenericAttributes[RectangleSelectors], opt: Options) = this()
    }
    
    trait RectangleSelectors extends js.Object {
      var body: js.UndefOr[SVGRectAttributes] = js.undefined
      var label: js.UndefOr[SVGTextAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
    @js.native
    class ShadowLink ()
      extends typings.jointjs.jointjsMod.diaNs.Link {
      def this(attributes: typings.jointjs.jointjsMod.diaNs.LinkNs.GenericAttributes[ShadowLinkSelectors]) = this()
      def this(
        attributes: typings.jointjs.jointjsMod.diaNs.LinkNs.GenericAttributes[ShadowLinkSelectors],
        opt: Options
      ) = this()
    }
    
    trait ShadowLinkSelectors extends js.Object {
      var line: js.UndefOr[SVGPathAttributes] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
      var shadow: js.UndefOr[SVGPathAttributes] = js.undefined
    }
    
    @js.native
    class TextBlock () extends Element {
      def this(attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.TextBlockSelectors]) = this()
      def this(
        attributes: GenericAttributes[typings.jointjs.jointjsMod.shapesNs.standardNs.TextBlockSelectors],
        opt: Options
      ) = this()
    }
    
    trait TextBlockSelectors extends js.Object {
      var body: js.UndefOr[SVGRectAttributes] = js.undefined
      var label: js.UndefOr[Anon_KeyStyle] = js.undefined
      var root: js.UndefOr[SVGAttributes] = js.undefined
    }
    
  }
  
  @JSName("uml")
  @js.native
  object umlNs extends js.Object {
    @js.native
    class Abstract () extends Class {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class AbstractView () extends ClassView {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Aggregation () extends Link
    
    @js.native
    class Association () extends Link
    
    @js.native
    class Class () extends Generic {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
      def getClassName(): js.Array[String] = js.native
      /* protected */ def updateRectangles(): Unit = js.native
    }
    
    trait ClassAttributes extends GenericAttributes[SVGRectSelector] {
      var attributes: js.Array[String]
      var methods: js.Array[String]
      var name: js.Array[String]
    }
    
    @js.native
    class ClassView () extends ElementView
    
    @js.native
    class Composition () extends Link
    
    @js.native
    class EndState () extends Generic {
      def this(attributes: GenericAttributes[EndStateSelectors]) = this()
      def this(attributes: GenericAttributes[EndStateSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    trait EndStateSelectors extends Selectors {
      var `circle.inner`: js.UndefOr[SVGCircleAttributes] = js.undefined
      var `circle.outer`: js.UndefOr[SVGCircleAttributes] = js.undefined
    }
    
    @js.native
    class Generalization () extends Link
    
    @js.native
    class Implementation () extends Link
    
    @js.native
    class Interface () extends Class {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class InterfaceView () extends ClassView {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class StartState () extends Circle {
      def this(attributes: GenericAttributes[CircleSelectors]) = this()
      def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class State () extends Generic {
      def this(attributes: GenericAttributes[StateSelectors]) = this()
      def this(attributes: GenericAttributes[StateSelectors], opt: StringDictionary[js.Any]) = this()
      /* protected */ def updateEvents(): Unit = js.native
      /* protected */ def updateName(): Unit = js.native
      /* protected */ def updatePath(): Unit = js.native
    }
    
    trait StateSelectors extends Selectors {
      var `.uml-state-body`: js.UndefOr[SVGRectAttributes] = js.undefined
      var `.uml-state-events`: js.UndefOr[SVGTextAttributes] = js.undefined
      var `.uml-state-name`: js.UndefOr[SVGTextAttributes] = js.undefined
      var `.uml-state-separator`: js.UndefOr[SVGPathAttributes] = js.undefined
    }
    
    @js.native
    class Transition () extends Link
    
  }
  
}

