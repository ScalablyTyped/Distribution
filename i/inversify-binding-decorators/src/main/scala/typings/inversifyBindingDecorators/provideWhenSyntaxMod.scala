package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideWhenSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_when_syntax", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ProvideWhenSyntax[T] {
    def this(
      bindingWhenSyntax: js.Function2[/* bind */ Bind, /* target */ Any, BindingWhenSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideWhenSyntax[T]
    extends StObject
       with typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax[T] {
    
    /* private */ var _bindingWhenSyntax: Any = js.native
    
    /* private */ var _provideDoneSyntax: Any = js.native
  }
}
