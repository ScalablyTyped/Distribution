package typings.jointjs.global.joint.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.SVGCircleSelector
import typings.jointjs.mod.shapes.basic.CircleSelectors
import typings.jointjs.mod.shapes.fsa.CirculoidSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsa {
  
  @JSGlobal("joint.shapes.fsa.Arrow")
  @js.native
  // default label props
  class Arrow ()
    extends typings.jointjs.mod.shapes.fsa.Arrow {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSGlobal("joint.shapes.fsa.EndState")
  @js.native
  class EndState ()
    extends typings.jointjs.mod.shapes.fsa.EndState {
    def this(attributes: GenericAttributes[CirculoidSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CirculoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("joint.shapes.fsa.StartState")
  @js.native
  class StartState ()
    extends typings.jointjs.mod.shapes.fsa.StartState {
    def this(attributes: GenericAttributes[SVGCircleSelector]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[SVGCircleSelector], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("joint.shapes.fsa.State")
  @js.native
  class State ()
    extends typings.jointjs.mod.shapes.fsa.State {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
}
