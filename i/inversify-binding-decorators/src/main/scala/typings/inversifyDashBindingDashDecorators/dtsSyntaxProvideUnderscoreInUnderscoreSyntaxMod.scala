package typings.inversifyDashBindingDashDecorators

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Bind
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingInSyntax
import typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax
import typings.inversifyDashBindingDashDecorators.dtsSyntaxProvideUnderscoreInUnderscoreSyntaxMod.ProvideInSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_in_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxProvideUnderscoreInUnderscoreSyntaxMod extends js.Object {
  @js.native
  trait ProvideInSyntax[T]
    extends typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInSyntax[T] {
    var _bindingInSyntax: js.Any = js.native
    var _provideDoneSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideInSyntax[T] {
    def this(
      bindingInSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingInSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
}

