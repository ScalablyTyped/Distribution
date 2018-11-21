package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "shapes")
@js.native
object shapesNs extends js.Object {
  
  trait SVGCircleSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var circle: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
  }
  
  
  trait SVGEllipseSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var ellipse: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGEllipseAttributes] = js.undefined
  }
  
  
  trait SVGImageSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
  }
  
  
  trait SVGPathSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var path: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
  }
  
  
  trait SVGPolygonSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var polygon: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPolygonAttributes] = js.undefined
  }
  
  
  trait SVGPolylineSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var polyline: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPolylineAttributes] = js.undefined
  }
  
  
  trait SVGRectSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var rect: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
  }
  
  
  trait SVGTextSelector
    extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
    var text: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
  }
  
  @JSName("basic")
  @js.native
  object basicNs extends js.Object {
    @js.native
    class Circle () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CircleSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CircleSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGCircleSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait CircleSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Ellipse () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EllipseSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EllipseSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGEllipseSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait EllipseSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Generic ()
      extends jointjsLib.jointjsMod.diaNs.Element
    
    @js.native
    class Image () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[ImageSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[ImageSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGImageSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait ImageSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Path () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PathSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PathSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGPathSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait PathSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Polygon () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGPolygonSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait PolygonSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Polyline () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolylineSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolylineSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGPolylineSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait PolylineSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Rect () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[RectSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[RectSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGRectSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait RectSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector
    
    @js.native
    class Rhombus () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PathSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PathSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Text () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGTextSelector]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGTextSelector], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class TextBlock () extends Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[TextBlockSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[TextBlockSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /* RemoveMultipleInheritance: Dropped parents List(jointjsLib.jointjsMod.shapesNs.SVGRectSelector because Already inherited / * selector * / ScalablyTyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]])*/
    
    trait TextBlockSelectors
      extends jointjsLib.jointjsMod.shapesNs.SVGTextSelector {
      var `.content`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
    }
    
  }
  
  @JSName("chess")
  @js.native
  object chessNs extends js.Object {
    @js.native
    class BishopBlack ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class BishopWhite ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class KingBlack ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class KingWhite ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class KnightBlack ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class KnightWhite ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class PawnBlack ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class PawnWhite ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class QueenBlack ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class QueenWhite ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class RookBlack ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class RookWhite ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
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
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Model ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: ModelAttributes) = this()
      def this(attributes: ModelAttributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
      def addInPort(port: java.lang.String): this.type = js.native
      def addInPort(port: java.lang.String, opt: js.Any): this.type = js.native
      def addOutPort(port: java.lang.String): this.type = js.native
      def addOutPort(port: java.lang.String, opt: js.Any): this.type = js.native
      def changeInGroup(properties: js.Any): scala.Boolean = js.native
      def changeInGroup(properties: js.Any, opt: js.Any): scala.Boolean = js.native
      def changeOutGroup(properties: js.Any): scala.Boolean = js.native
      def changeOutGroup(properties: js.Any, opt: js.Any): scala.Boolean = js.native
      def createPortItem(group: java.lang.String, port: java.lang.String): js.Any = js.native
      def createPortItems(group: java.lang.String, ports: js.Array[java.lang.String]): js.Array[_] = js.native
      def removeInPort(port: java.lang.String): this.type = js.native
      def removeInPort(port: java.lang.String, opt: js.Any): this.type = js.native
      def removeOutPort(port: java.lang.String): this.type = js.native
      def removeOutPort(port: java.lang.String, opt: js.Any): this.type = js.native
    }
    
    
    trait ModelAttributes
      extends jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[ModelSelectors] {
      var inPorts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var outPorts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    }
    
    
    trait ModelSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var `.label`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
    }
    
  }
  
  @JSName("erd")
  @js.native
  object erdNs extends js.Object {
    @js.native
    class Attribute ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EllipsoidSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EllipsoidSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Derived () extends Attribute
    
    
    trait EllipsoidSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGEllipseAttributes] = js.undefined
      var `.label`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGEllipseAttributes] = js.undefined
      var text: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
    }
    
    @js.native
    class Entity ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonalSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonalSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class ISA ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.basicNs.PolygonSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.basicNs.PolygonSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class IdentifyingRelationship () extends Relationship
    
    @js.native
    class Key () extends Attribute
    
    @js.native
    class Line ()
      extends jointjsLib.jointjsMod.diaNs.Link {
      def cardinality(value: java.lang.String): scala.Unit = js.native
      def cardinality(value: scala.Double): scala.Unit = js.native
    }
    
    @js.native
    class Multivalued () extends Attribute
    
    @js.native
    class Normal () extends Attribute
    
    
    trait PolygonalSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPolygonAttributes] = js.undefined
      var `.label`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPolygonAttributes] = js.undefined
      var text: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
    }
    
    @js.native
    class Relationship ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonalSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonalSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class WeakEntity () extends Entity
    
  }
  
  @JSName("fsa")
  @js.native
  object fsaNs extends js.Object {
    @js.native
    class Arrow ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    
    trait CirculoidSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.inner`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var `.outer`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
    }
    
    @js.native
    class EndState ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CirculoidSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CirculoidSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class StartState ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGCircleSelector]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGCircleSelector], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class State ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Circle
    
  }
  
  @JSName("logic")
  @js.native
  object logicNs extends js.Object {
    @js.native
    class And () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): scala.Boolean = js.native
    }
    
    @js.native
    abstract class Gate ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic
    
    @js.native
    class Gate11 () extends Gate {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[Gate11Selectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[Gate11Selectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    
    trait Gate11Selectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
      var `.input`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var `.output`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
    }
    
    @js.native
    class Gate21 () extends Gate {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[Gate21Selectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[Gate21Selectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    
    trait Gate21Selectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
      var `.input`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var `.input1`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var `.input2`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var `.output`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
    }
    
    
    trait GateSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var `.wire`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var circle: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var text: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
    }
    
    @js.native
    class IO () extends Gate {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.basicNs.CircleSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.basicNs.CircleSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Input () extends IO
    
    @js.native
    class Nand () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): scala.Boolean = js.native
    }
    
    @js.native
    class Nor () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): scala.Boolean = js.native
    }
    
    @js.native
    class Not () extends Gate11 {
      def operation(input: js.Any): scala.Boolean = js.native
    }
    
    @js.native
    class Or () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): scala.Boolean = js.native
    }
    
    @js.native
    class Output () extends IO
    
    @js.native
    class Repeater () extends Gate11 {
      def operation(input: js.Any): js.Any = js.native
    }
    
    @js.native
    class Wire ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Xnor () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): scala.Boolean = js.native
    }
    
    @js.native
    class Xor () extends Gate21 {
      def operation(input1: js.Any, input2: js.Any): scala.Boolean = js.native
    }
    
  }
  
  @JSName("org")
  @js.native
  object orgNs extends js.Object {
    @js.native
    class Arrow ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Member ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[MemberSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[MemberSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    
    trait MemberSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.card`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var `.name`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var `.rank`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
    }
    
  }
  
  @JSName("pn")
  @js.native
  object pnNs extends js.Object {
    @js.native
    class Link ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Place ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.Attributes) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.Attributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class PlaceView ()
      extends jointjsLib.jointjsMod.diaNs.ElementView {
      def renderTokens(): scala.Unit = js.native
    }
    
    @js.native
    class Transition ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGRectSelector]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGRectSelector], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
  }
  
  @JSName("standard")
  @js.native
  object standardNs extends js.Object {
    @js.native
    class BorderedImage ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[BorderedImageSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[BorderedImageSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait BorderedImageSelectors extends js.Object {
      var border: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Circle ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CircleSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CircleSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait CircleSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Cylinder ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CylinderSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[CylinderSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
      def topRy(): java.lang.String | scala.Double = js.native
      def topRy(t: java.lang.String): this.type = js.native
      def topRy(t: java.lang.String, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
      def topRy(t: scala.Double): this.type = js.native
      def topRy(t: scala.Double, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    }
    
    
    trait CylinderBodyAttributes
      extends jointjsLib.jointjsMod.attributesNs.SVGPathAttributes {
      var lateralArea: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    }
    
    
    trait CylinderSelectors extends js.Object {
      var body: js.UndefOr[CylinderBodyAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
      var top: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGEllipseAttributes] = js.undefined
    }
    
    @js.native
    class DoubleLink ()
      extends jointjsLib.jointjsMod.diaNs.Link {
      def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.GenericAttributes[DoubleLinkSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.GenericAttributes[DoubleLinkSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait DoubleLinkSelectors extends js.Object {
      var line: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var outline: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Ellipse ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EllipseSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EllipseSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait EllipseSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class EmbeddedImage ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EmbeddedImageSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EmbeddedImageSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait EmbeddedImageSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class HeaderedRectangle ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[HeaderedRectangleSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[HeaderedRectangleSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait HeaderedRectangleSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var bodyText: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var header: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var headerText: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Image ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[ImageSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[ImageSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait ImageSelectors extends js.Object {
      var image: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGImageAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Link ()
      extends jointjsLib.jointjsMod.diaNs.Link {
      def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.GenericAttributes[LinkSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.GenericAttributes[LinkSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait LinkSelectors extends js.Object {
      var line: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
      var wrapper: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
    }
    
    @js.native
    class Path ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PathSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PathSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait PathSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Polygon ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolygonSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait PolygonSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPolygonAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Polyline ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolylineSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[PolylineSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait PolylineSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPolylineAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class Rectangle ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[RectangleSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[RectangleSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait RectangleSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    @js.native
    class ShadowLink ()
      extends jointjsLib.jointjsMod.diaNs.Link {
      def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.GenericAttributes[ShadowLinkSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.GenericAttributes[ShadowLinkSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait ShadowLinkSelectors extends js.Object {
      var line: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
      var shadow: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
    }
    
    @js.native
    class TextBlock ()
      extends jointjsLib.jointjsMod.diaNs.Element {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[TextBlockSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[TextBlockSelectors], opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    }
    
    
    trait TextBlockSelectors extends js.Object {
      var body: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var label: js.UndefOr[jointjsLib.Anon_Key] = js.undefined
      var root: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
  }
  
  @JSName("uml")
  @js.native
  object umlNs extends js.Object {
    @js.native
    class Abstract () extends Class {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class AbstractView () extends ClassView {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class Aggregation ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Association ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Class ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
      def getClassName(): js.Array[java.lang.String] = js.native
      /* protected */ def updateRectangles(): scala.Unit = js.native
    }
    
    
    trait ClassAttributes
      extends jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.SVGRectSelector] {
      var attributes: js.Array[java.lang.String]
      var methods: js.Array[java.lang.String]
      var name: js.Array[java.lang.String]
    }
    
    @js.native
    class ClassView ()
      extends jointjsLib.jointjsMod.diaNs.ElementView
    
    @js.native
    class Composition ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class EndState ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EndStateSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[EndStateSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    
    trait EndStateSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `circle.inner`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
      var `circle.outer`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGCircleAttributes] = js.undefined
    }
    
    @js.native
    class Generalization ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Implementation ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
    @js.native
    class Interface () extends Class {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class InterfaceView () extends ClassView {
      def this(attributes: ClassAttributes) = this()
      def this(attributes: ClassAttributes, opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class StartState ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Circle {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.basicNs.CircleSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[jointjsLib.jointjsMod.shapesNs.basicNs.CircleSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    @js.native
    class State ()
      extends jointjsLib.jointjsMod.shapesNs.basicNs.Generic {
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[StateSelectors]) = this()
      def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.GenericAttributes[StateSelectors], opt: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
      /* protected */ def updateEvents(): scala.Unit = js.native
      /* protected */ def updateName(): scala.Unit = js.native
      /* protected */ def updatePath(): scala.Unit = js.native
    }
    
    
    trait StateSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.uml-state-body`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGRectAttributes] = js.undefined
      var `.uml-state-events`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var `.uml-state-name`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGTextAttributes] = js.undefined
      var `.uml-state-separator`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
    }
    
    @js.native
    class Transition ()
      extends jointjsLib.jointjsMod.diaNs.Link
    
  }
  
}

