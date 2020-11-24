package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.BindingOnSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-binding-decorators/dts/syntax/provide_on_syntax", JSImport.Namespace)
@js.native
object provideOnSyntaxMod extends js.Object {
  
  @js.native
  trait ProvideOnSyntax[T]
    extends typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax[T] {
    
    var _bindingOnSyntax: js.Any = js.native
    
    var _provideDoneSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideOnSyntax[T] {
    def this(
      bindingOnSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingOnSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
}
