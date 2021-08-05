package typings.inversifyBindingDecorators

import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideWhenOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_when_on_syntax", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends StObject
       with ProvideWhenOnSyntax[T] {
    def this(provideWhenSyntax: ProvideWhenSyntax[T], provideOnSyntax: ProvideOnSyntax[T]) = this()
  }
  
  @js.native
  trait ProvideWhenOnSyntax[T]
    extends StObject
       with typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenOnSyntax[T] {
    
    /* private */ var _provideOnSyntax: js.Any = js.native
    
    /* private */ var _provideWhenSyntax: js.Any = js.native
  }
}
