package typings.inversifyBindingDecorators

import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_when_on_syntax", JSImport.Namespace)
@js.native
object provideWhenOnSyntaxMod extends js.Object {
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

