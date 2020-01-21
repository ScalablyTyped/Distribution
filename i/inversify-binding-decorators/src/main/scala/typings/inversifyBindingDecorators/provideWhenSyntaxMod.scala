package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_when_syntax", JSImport.Namespace)
@js.native
object provideWhenSyntaxMod extends js.Object {
  @js.native
  trait ProvideWhenSyntax[T]
    extends typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax[T] {
    var _bindingWhenSyntax: js.Any = js.native
    var _provideDoneSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideWhenSyntax[T] {
    def this(
      bindingWhenSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingWhenSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
}

