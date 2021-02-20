package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideWhenSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_when_syntax", JSImport.Default)
  @js.native
  class default[T] protected () extends ProvideWhenSyntax[T] {
    def this(
      bindingWhenSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingWhenSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideWhenSyntax[T]
    extends typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax[T] {
    
    var _bindingWhenSyntax: js.Any = js.native
    
    var _provideDoneSyntax: js.Any = js.native
  }
}
