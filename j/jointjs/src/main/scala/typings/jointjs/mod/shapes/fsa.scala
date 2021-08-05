package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.basic.Circle
import typings.jointjs.mod.shapes.basic.CircleSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsa {
  
  @JSImport("jointjs", "shapes.fsa.Arrow")
  @js.native
  // default label props
  class Arrow () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.fsa.EndState")
  @js.native
  class EndState () extends Element {
    def this(attributes: GenericAttributes[CirculoidSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CirculoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.fsa.StartState")
  @js.native
  class StartState () extends Element {
    def this(attributes: GenericAttributes[SVGCircleSelector]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[SVGCircleSelector], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.fsa.State")
  @js.native
  class State () extends Circle {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  trait CirculoidSelectors
    extends StObject
       with Selectors {
    
    @JSName(".inner")
    var Dotinner: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    @JSName(".outer")
    var Dotouter: js.UndefOr[SVGCircleAttributes] = js.undefined
  }
  object CirculoidSelectors {
    
    inline def apply(): CirculoidSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CirculoidSelectors]
    }
    
    extension [Self <: CirculoidSelectors](x: Self) {
      
      inline def setDotinner(value: SVGCircleAttributes): Self = StObject.set(x, ".inner", value.asInstanceOf[js.Any])
      
      inline def setDotinnerUndefined: Self = StObject.set(x, ".inner", js.undefined)
      
      inline def setDotouter(value: SVGCircleAttributes): Self = StObject.set(x, ".outer", value.asInstanceOf[js.Any])
      
      inline def setDotouterUndefined: Self = StObject.set(x, ".outer", js.undefined)
    }
  }
}
