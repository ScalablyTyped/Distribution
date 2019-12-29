package typings.inversifyDashBindingDashDecorators

import typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.BindConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_done_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxProvideUnderscoreDoneUnderscoreSyntaxMod extends js.Object {
  @js.native
  trait ProvideDoneSyntax
    extends typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax {
    var _binding: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProvideDoneSyntax {
    def this(binding: BindConstraint) = this()
  }
  
}

