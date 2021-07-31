package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.ElementView
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.basic.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pn {
  
  @JSImport("jointjs", "shapes.pn.Link")
  @js.native
  // default label props
  class Link ()
    extends typings.jointjs.mod.dia.Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.pn.Place")
  @js.native
  class Place () extends Generic {
    def this(attributes: typings.jointjs.mod.dia.Element.Attributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: typings.jointjs.mod.dia.Element.Attributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.pn.PlaceView")
  @js.native
  class PlaceView () extends ElementView {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[Element]) = this()
    
    def renderTokens(): Unit = js.native
  }
  
  @JSImport("jointjs", "shapes.pn.Transition")
  @js.native
  class Transition () extends Generic {
    def this(attributes: GenericAttributes[SVGRectSelector]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[SVGRectSelector], opt: StringDictionary[js.Any]) = this()
  }
}
