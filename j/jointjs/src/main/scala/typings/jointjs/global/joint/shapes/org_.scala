package typings.jointjs.global.joint.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.org_.MemberSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object org_ {
  
  @JSGlobal("joint.shapes.org.Arrow")
  @js.native
  // default label props
  class Arrow ()
    extends typings.jointjs.mod.shapes.org_.Arrow {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSGlobal("joint.shapes.org.Member")
  @js.native
  class Member ()
    extends typings.jointjs.mod.shapes.org_.Member {
    def this(attributes: GenericAttributes[MemberSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[MemberSelectors], opt: StringDictionary[js.Any]) = this()
  }
}
