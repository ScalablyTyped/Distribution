package typings.jointjs.global.joint.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.devs.ModelAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devs {
  
  @JSGlobal("joint.shapes.devs.Atomic")
  @js.native
  class Atomic ()
    extends typings.jointjs.mod.shapes.devs.Atomic {
    def this(attributes: ModelAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("joint.shapes.devs.Coupled")
  @js.native
  class Coupled ()
    extends typings.jointjs.mod.shapes.devs.Coupled {
    def this(attributes: ModelAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("joint.shapes.devs.Link")
  @js.native
  // default label props
  class Link ()
    extends typings.jointjs.mod.shapes.devs.Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSGlobal("joint.shapes.devs.Model")
  @js.native
  class Model ()
    extends typings.jointjs.mod.shapes.devs.Model {
    def this(attributes: ModelAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
  }
}
