package typings.jointjs.global.joint.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.SVGRectSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pn {
  
  @JSGlobal("joint.shapes.pn.Link")
  @js.native
  // default label props
  class Link ()
    extends typings.jointjs.mod.shapes.pn.Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSGlobal("joint.shapes.pn.Place")
  @js.native
  class Place ()
    extends typings.jointjs.mod.shapes.pn.Place {
    def this(attributes: typings.jointjs.mod.dia.Element.Attributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: typings.jointjs.mod.dia.Element.Attributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("joint.shapes.pn.PlaceView")
  @js.native
  class PlaceView ()
    extends typings.jointjs.mod.shapes.pn.PlaceView {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[Element]) = this()
  }
  
  @JSGlobal("joint.shapes.pn.Transition")
  @js.native
  class Transition ()
    extends typings.jointjs.mod.shapes.pn.Transition {
    def this(attributes: GenericAttributes[SVGRectSelector]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[SVGRectSelector], opt: StringDictionary[js.Any]) = this()
  }
}
