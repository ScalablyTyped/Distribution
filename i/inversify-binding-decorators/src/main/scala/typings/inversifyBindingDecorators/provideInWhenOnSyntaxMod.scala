package typings.inversifyBindingDecorators

import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideInWhenOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_in_when_on_syntax", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends StObject
       with ProvideInWhenOnSyntax[T] {
    def this(
      provideInSyntax: ProvideInSyntax[T],
      provideWhenSyntax: ProvideWhenSyntax[T],
      provideOnSyntax: ProvideOnSyntax[T]
    ) = this()
  }
  
  @js.native
  trait ProvideInWhenOnSyntax[T]
    extends StObject
       with typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax[T] {
    
    /* private */ var _provideInSyntax: js.Any = js.native
    
    /* private */ var _provideOnSyntax: js.Any = js.native
    
    /* private */ var _provideWhenSyntax: js.Any = js.native
  }
}
