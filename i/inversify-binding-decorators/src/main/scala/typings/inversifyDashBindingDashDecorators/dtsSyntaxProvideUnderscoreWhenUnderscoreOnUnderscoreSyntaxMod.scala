package typings.inversifyDashBindingDashDecorators

import typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideOnSyntax
import typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideWhenSyntax
import typings.inversifyDashBindingDashDecorators.dtsSyntaxProvideUnderscoreWhenUnderscoreOnUnderscoreSyntaxMod.ProvideWhenOnSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_when_on_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxProvideUnderscoreWhenUnderscoreOnUnderscoreSyntaxMod extends js.Object {
  @js.native
  trait ProvideWhenOnSyntax[T]
    extends ProvideWhenSyntax[T]
       with ProvideOnSyntax[T] {
    var _provideOnSyntax: js.Any = js.native
    var _provideWhenSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideWhenOnSyntax[T] {
    def this(provideWhenSyntax: ProvideWhenSyntax[T], provideOnSyntax: ProvideOnSyntax[T]) = this()
  }
  
}

